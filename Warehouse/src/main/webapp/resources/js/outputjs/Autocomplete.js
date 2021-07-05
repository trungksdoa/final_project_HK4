function Autocomplete(index)
{
    var goodsArray = [];
    $.get("/api/output/goodsCatagory/", function (data, status) {
        for (var i = 0; i < data.length; i++) {
            var tempArray = new Array();
            tempArray["id"] = data[i].id;
            tempArray["label"] = data[i].id;
            tempArray["value"] = data[i].goodsName;
            tempArray["weight"] = data[i].weight;
            tempArray["unit"] = data[i].unit;
            tempArray["quantityInStock"] = data[i].quantityInStock;
            tempArray["group_goods"] = data[i].groupGoods;
            tempArray["warehouse"] = data[i].warehouse;
            tempArray['supplier'] = data[i].supplier;
            goodsArray.push(tempArray);
        }
//        console.log(goodsArray);
    });
    for (var i = 0; i < stt; i++) {
        $("#search" + i).autocomplete({
            source: goodsArray,
            select: function (e, ui) {
                var e = ui.item;
//                console.log(e.suplier);
                $("#codeid" + index).val(e.id);
                $("#unit" + index).val(e.unit);
                $('#weightOn1' + index).val(e.weight);
                $('#groupid' + index).val(e.group_goods);
                $('#warehouse' + index).val(e.warehouse);
                $('#suplier' + index).val(e.supplier);
                $('#weight' + index).val(e.weight * 1);
                $('#quantity' + index).val(1)
                $('#Exportprice' + index).val(1);
                $("#quantity" + index).attr({
                    "max": e.quantityInStock,
                });

            },

            change: function (e, ui) {
            }
        }).autocomplete("instance")._renderItem = function (ul, item) {
            return $("<li>")
                    .append("<div>" + item.warehouse + "<br>" + item.label + "</div>")
                    .appendTo(ul);
        };
    }

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

    var SupplierIDS = [];
    $.get("/api/output/supplierList/", function (data, status) {
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
    $.get("/api/output/GroupsgoodsList/", function (data, status) {
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
        $("#groupid" + i).autocomplete({
            source: groupList,
            select: function (e, ui) {

            },

            change: function (e, ui) {
            }
        });
    }
}


