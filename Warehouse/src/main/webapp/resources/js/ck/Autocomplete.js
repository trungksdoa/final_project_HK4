function Autocomplete(values)
{
    var mateches = values.trim().match(/(\d+)/);
    var index = mateches[0];
    var goodsArray = [];
    $.get("/api/output/goodsCatagory/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].goodsName;
            tempArray["label"] = data[i].goodsId;
            tempArray["value"] = data[i].goodsId;
            tempArray["weight"] = data[i].weight;
            tempArray["unit"] = data[i].unit;
            tempArray["quantityInStock"] = data[i].quantityInStock;
            tempArray["group_goods"] = data[i].groupGoods;
            tempArray["warehouse"] = data[i].warehouse;
            tempArray['supplier'] = data[i].supplier;
            goodsArray.push(tempArray);
        }
        console.log(goodsArray);
    });
    var stockcard = [];
    $.get("/api/output/groupWarehouse/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].id;
            tempArray["label"] = data[i].id;
            tempArray["value"] = data[i].id;
            stockcard.push(tempArray);
        }
//        console.log(stockcard);
    });
    for (var i = 0; i < stt; i++) {
        $("#ID" + i).autocomplete({
            source: goodsArray,
            select: function (e, ui) {
                var e = ui.item;
//                console.log(e.warehouse);
                if (listIp.indexOf(e.value) > -1) {
                    //In the array!
                    alert("Cant not enter a goods already have !!")
                    return false;
                } else {
                    if (e.quantityInStock == 0)
                    {
                        alert("This goods have quantity is 0, Please input before you do output")
                    } else
                    {
                        $("#Unit" + index).val(e.unit);
                        $('#From' + index).val(e.warehouse);
                        $('#Quantity' + index).val(e.quantityInStock);
                        $("#Quantity" + index).attr({
                            "max": e.quantityInStock,
                        });
                        listIp.push(e.value);
                        $('#ID' + index).removeAttr("onkeydown");
                        //
                        //
                        $("#ID" + index).attr("onkeydown", "return isValidKey(event)");
                        listIp.push(e.value);
                    }
                }
            }, create: function () {
                $(this).data('ui-autocomplete')._renderItem = function (ul, item) {
                    return $("<li>")
                            .append("<div>" + "Name: " + item.id + " " + "WH:" + item.warehouse + " -" + "SP: " + item.supplier + "<br>" + "ID: " + item.value + "</div>")
                            .appendTo(ul);
                };
            },

            change: function (e, ui) {

            }
        });
        $("#To" + i).autocomplete({
            source: stockcard,
            select: function (e, ui) {
                var e = ui.item;
                var checkstockname = $('#From' + index).val();
                if (e.value == checkstockname)
                {
                    alert("Wrong")
                }
            },

            change: function (e, ui) {
                var e = ui.item;
                var checkstockname = $('#From' + index).val();
                if (e.value == checkstockname)
                {
                    $('#To' + index).val("");
                }

            }
        });
    }
}


