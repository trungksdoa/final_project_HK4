function Autocomplete(index)
{
    var goodsArray = [];
    var stockcard = [];
    $.get("/warehouse/goodsCatagory/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].id;
            tempArray["label"] = data[i].goodsName;
            tempArray["value"] = data[i].goodsName;
            tempArray["lastedPurchasePrice"] = data[i].lastedPurchasePrice;
            tempArray["weight"] = data[i].weight;
            tempArray["unit"] = data[i].unit;
            tempArray["unitPrice"] = data[i].unitPrice;
            tempArray["group"] = data[i].groupid;
            goodsArray.push(tempArray);
        }
//        console.log(goodsArray);
    });
    $.get("/warehouse/groupWarehouse/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].id;
            tempArray["name"] = data[i].id;
            tempArray["value"] = data[i].name;
            stockcard.push(tempArray);
        }
//        console.log(stockcard);
    });
    for (var i = 0; i < stt; i++) {
        $("#search" + i).autocomplete({
            source: goodsArray,
            select: function (e, ui) {
                var e = ui.item;
//                            console.log(lastChar);
                            console.log(e.id);
                $("#id" + index).val(e.id);
                $("#unit" + index).val(e.unit);
                $('#importprice' + index).val(e.unitPrice);
                $('#weight' + index).val(e.weight);
                $('#group' + index).val(e.group);

            },

            change: function (e, ui) {
            }
        });

        $("#warehouse" + i).autocomplete({
            source: stockcard,
            select: function (e, ui) {

            },

            change: function (e, ui) {
            }
        });
    }

}