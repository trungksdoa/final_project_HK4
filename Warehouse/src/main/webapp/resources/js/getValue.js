//Function SaveGetData
//
//End
//Start
function getValue() {
    stt = 0;
    var checks = document.getElementsByClassName('checks');
    var strs = [];
    var str = "";
    for (i = 0; i < checks.length; i++) {
        if (checks[i].checked === true) {
            str = [checks[i].value];
            strs.push(str);
        }
    }
    var url = "/warehouse/findGoods/";
    $.ajax({
        url: '/warehouse/findGoods/',
        method: 'POST',
        traditional: true,
        data: {
            id: strs
        },
        success: function (data) {
            $("#tableInput").empty();
            if (data != null) {
                for (var i = 0; i < data.length; i++) {
                    var checkid = data[i].id;
                    var row = $('<tr>');
                    row.append('<td>' + "<input id='search" + stt + "' type='text' name='name' value='" + data[i].goodsName + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='unit" + stt + "' name='unit' value='" + data[i].unit + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='quantity" + stt + "' name='quantity' value='" + data[i].quantity + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='importprice" + stt + "'  name='importprice' value='" + data[i].goodsPrice + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='afterprice" + stt + "' name='afterprice' value='" + data[i].goodsPrice * data[i].quantity + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='voucherid" + stt + "'  value='" + data[i].voucherId + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
                    row.append('</tr>');
                    $('#tableInput').append(row);
                    stt++;
                }
//                            Autocomplete();
            }
        },
        error: function (request, status, error) {
            alert("The request failed: " + request.responseText);
        }
    });
}




function getValue2() {
    stt = 0;
    var checks = document.getElementsByClassName('checks1');
    var strs = [];
    var str = "";
    for (i = 0; i < checks.length; i++) {
        if (checks[i].checked === true) {
            str = [checks[i].value];
            strs.push(str);
        }
    }
//    var url = "/warehouse/findGoods/";
    $.ajax({
        url: '/warehouse/production/',
        method: 'POST',
        traditional: true,
        data: {
            id: strs
        },
        success: function (data) {
            $("#tableInput").empty();
            alert("SDasdsadas");
//            if (data != null) {
//                for (var i = 0; i < data.length; i++) {
//                    var checkid = data[i].id;
//                    var row = $('<tr>');
//                    row.append('<td>' + "<input id='search" + stt + "' type='text' name='name' value='" + data[i].goodsName + "'/>" + '</td>');
//                    row.append('<td>' + "<input type='text' id='unit" + stt + "' name='unit' value='" + data[i].unit + "'/>" + '</td>');
//                    row.append('<td>' + "<input type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
//                    row.append('<td>' + "<input type='text' id='quantity" + stt + "' name='quantity' value='" + data[i].quantity + "'/>" + '</td>');
//                    row.append('<td>' + "<input type='text' id='importprice" + stt + "'  name='importprice' value='" + data[i].goodsPrice + "'/>" + '</td>');
//                    row.append('<td>' + "<input type='text' id='afterprice" + stt + "' name='afterprice' value='" + data[i].goodsPrice * data[i].quantity + "'/>" + '</td>');
//                    row.append('<td>' + "<input type='text' id='voucherid" + stt + "'  value='" + data[i].voucherId + "'/>" + '</td>');
//                    row.append('<td>' + "<input type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
//                    row.append('<td>' + "<input type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
//                    row.append('</tr>');
//                    $('#tableInput').append(row);
//                    stt++;
//                }
////                            Autocomplete();
//            }
        },
        error: function (request, status, error) {
            alert("The request failed: " + request.responseText);
        }
    });
}