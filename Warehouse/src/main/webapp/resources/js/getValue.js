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
    var url = "/api/input/findGoods/";
    $.ajax({
        url: '/api/input/findGoods/',
        method: 'POST',
        traditional: true,
        data: {
            id: strs
        },
        success: function (data) {
            $("#tableInput").empty();
            if (data != null) {

                for (var i = 0; i < data.length; i++) {
                    console.log(data[i].id)
                    var checkid = data[i].id;

                    var row = $('<tr>');
                    row.append('<td>' + stt + '</td>');
                    row.append('<td>' + "<input id='search" + stt + "' type='text' name='name[]' value='" + data[i].goodsName + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='unit" + stt + "' name='unit[]' value='" + data[i].unit + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text'  id='warehouse" + stt + "' name='warehouse[]' value=''/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='quantity" + stt + "' name='quantity[]' value='" + data[i].quantity + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='importprice" + stt + "'  name='importprice[]' value=''/>" + '</td>');
//                    row.append('<td>' + "<input type='text' id='afterprice" + stt + "' name='afterprice' value='" + data[i].goodsPrice * data[i].quantity + "'/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='group" + stt + "' name='group[]' value=''/>" + '</td>');
                    row.append('<td>' + "<input type='text' id='weight" + stt + "' name='weight[]' value=''/>" + '</td>');
                    row.append('' + "<input type='hidden' id='id" + stt + "' name='id[]' value='" + data[i].id + "'/>" + '');
                    row.append('</tr>');
                    $('#tableInput').append(row);
                    stt++;
                }
//                            Autocomplete();
            }
        },
        error: function (request, status, error) {
            alert("Fail to submit please choose cancle if you want to getout");
            $('#service').prop('selectedIndex', 0);
        }
    });
}

