function Autocomplete(index)
{
    var goodsArray = [];
    $.get("/api/input/goodsCatagory/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].id;
            tempArray["label"] = data[i].id;
            tempArray["value"] = data[i].goodsName;
            tempArray["lastedPurchasePrice"] = data[i].lastedPurchasePrice;
            tempArray["weight"] = data[i].weight;
            tempArray["unit"] = data[i].unit;
            tempArray["unitPrice"] = data[i].unitPrice;
            tempArray["group"] = data[i].groupid;
            goodsArray.push(tempArray);
        }
    });
    for (var i = 0; i < stt; i++) {
        $("#search" + i).autocomplete({
            source: goodsArray,
            select: function (e, ui) {
                var e = ui.item;
                $("#codeid" + index).val(e.id);
                $("#unit" + index).val(e.unit);
                $('#group' + index).val(e.group);
                $('#quantity' + index).val(1);
                $('#importprice' + index).val(1)
                $('#weightOn1' + index).val(e.weight);
                $('#weight' + index).val(e.weight * 1)
            },

            change: function (e, ui) {
            }
        }).autocomplete("instance")._renderItem = function (ul, item) {
            return $("<li>")
                    .append("<div>" + item.value + "<br>" + item.label + "</div>")
                    .appendTo(ul);
        };
    }

    var stockcard = [];
    $.get("/api/input/groupWarehouse/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].id;
            tempArray["name"] = data[i].id;
            tempArray["value"] = data[i].id;
            stockcard.push(tempArray);
        }
//        console.log(stockcard);
    });

    var SupplierIDS = [];
    $.get("/api/input/supplierList/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].id;
            tempArray["label"] = data[i].name;
            tempArray["value"] = data[i].id;
            SupplierIDS.push(tempArray);
        }
//                    console.log(SupplierIDS);
    });
    var groupList = [];
    $.get("/api/input/GroupsgoodsList/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].id;
            tempArray["label"] = data[i].name;
            tempArray["value"] = data[i].id;
            groupList.push(tempArray);
        }
//                    console.log(SupplierIDS);
    });
    for (var i = 0; i < stt; i++) {
        $("#warehouse" + i).autocomplete({
            source: stockcard,
            select: function (e, ui) {

            },

            change: function (e, ui) {
            }
        });
        $("#suplier" + i).autocomplete({
            source: SupplierIDS,
            select: function (e, ui) {

            },

            change: function (e, ui) {
            }
        });
        $("#group" + i).autocomplete({
            source: groupList,
            select: function (e, ui) {

            },

            change: function (e, ui) {
            }
        });
    }
}


