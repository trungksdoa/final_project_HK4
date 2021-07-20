function Autocomplete(index)
{
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
            tempArray['sellPrice'] = data[i].sellPrice;

            goodsArray.push(tempArray);
        }
//        console.log(goodsArray);
    });
    for (var i = 0; i < stt; i++) {
        $("#search" + i).autocomplete({
            source: goodsArray,
            select: function (e, ui) {
                var e = ui.item;
                if (listIp.indexOf(e.value) > -1) {
                    //In the array!
                    alert("Cant not enter a goods already have !!")
                    return false;
                } else {
                    if (e.quantityInStock <= 0)
                    {
                        alert("This goods have quantity is 0, Please input before you do output")
                    } else
                    {
                        $("#name" + index).val(e.id);
                        $("#unit" + index).val(e.unit);
                        $('#groupid' + index).val(e.group_goods);
                        $('#warehouse' + index).val(e.warehouse);
                        $('#suplier' + index).val(e.supplier);
                        $('#weight' + index).val(e.weight);
                        $('#quantity' + index).val(1)
                        if (e.sellPrice == null)
                        {
                            $('#Exportprice' + index).val(1);
                        } else
                        {
                            $('#Exportprice' + index).val(e.sellPrice);
                        }
                        listIp.push(e.value);
                        $("#quantity" + index).attr({
                            "max": e.quantityInStock,
                        });
                        $('#search' + index).removeAttr("onkeydown");
                        //
                        //
                        $("#search" + index).attr("onkeydown", "return isValidKey(event)");
                    }
                }

            }, create: function () {
                $(this).data('ui-autocomplete')._renderItem = function (ul, item) {
                    return $("<li>")
                            .append("<div>" + "Name: " + item.id + " " + "WH:" + item.warehouse + "" + " - " + item.quantityInStock + "<br>" + "ID: " + item.value + "</div>")
                            .appendTo(ul);
                };
            },
            change: function (e, ui) {
                var e = ui.item;
                if (e.quantityInStock <= 0)
                {
                    $('#search' + index).val("");
                }
            }
        })
    }
}


