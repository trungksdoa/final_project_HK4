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
                    row.append('<td>' + tangtudong + '</td>');
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
                    tangtudong++;
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
function getValue2() {
    stt = 0;
    //    var tangtudong = 1;
    var checks = document.getElementsByClassName('checks1');
    var strs = [];
    var str = "";
    for (i = 0; i < checks.length; i++) {
        if (checks[i].checked === true) {
            str = [checks[i].value];
            strs.push(str);
        }
    }
    //Find Reference
    $.ajax({
        url: '/api/input/findreference/',
        method: 'POST',
        traditional: true,
        data: {
            id: strs
        },
        success: function (data) {
            for (var i = 0; i < data.length; i++) {
//                                var data = data[data.length - 1];//get last item in the array
                var refercnce = '' + "<a href='#'>" + data[i].lsx + "</a>" + ',';


                $('#reference').append(refercnce);
//                                $("#").text(data[i].lsx);
            }
            console.log(data);
        },
        error: function (request, status, error) {
        }
    });

    //    var url = "/warehouse/findGoods/";
    $.ajax({
        url: '/api/input/findMaterial/',
        method: 'POST',
        traditional: true,
        data: {
            id: strs
        },
        success: function (data) {
            $("#tableInput").empty();
            //            alert("SDasdsadas");
            console.log(data);
            if (data != null) {
                for (var i = 0; i < data.length; i++) {
                    var checkid = data[i].id;
                    var rowsds = $('<tr>');
                    rowsds.append('<td>' + tangtudong + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text' id='search" + stt + "' name='name' value='" + data[i].goodsName + "'/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text'  id='unit" + stt + "' name='unit' value='" + data[i].unit + "'/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='quantity" + stt + "' min='1' onkeydown='lookup(this);' name='quantity' value='" + data[i].quantity + "'/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='importprice" + stt + "' min='1' name='importprice' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text' id='group" + stt + "' name='group' value='SX'/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text' id='weightOn1" + stt + "' value='1000'/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text' id='weight" + stt + "' name='weight' value='1000'/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text' id='codeid" + stt + "' name='codeid' value='" + data[i].id + "'/>" + '</td>');
                    rowsds.append('</tr>');
                    $('#tableInput').append(rowsds);

                    var rowsds2 = $('<tr>');
                    rowsds2.append('<td>' + "<input style='display:block' type='text' name='refercne' value ='" + data[i].productionorderid + "'/>" + '</td>');
                    rowsds2.append('</tr>');
                    $('#Reference').append(rowsds2);
                    stt++;
                    tangtudong++;
                    //                    tangtudong++;
                }
                //                            Autocomplete();
            }
        },
        error: function (request, status, error) {
            alert("Fail to submit please choose cancle if you want to getout");
            $('#service').prop('selectedIndex', 0);
        }
    });
    $("#modalSerchform2").modal('hide');
    //Empty table
    $("#myTable2").empty();
}
