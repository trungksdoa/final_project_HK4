function addRow() {

    var lenght = 0;
    var countsda = 0;
    if (lenght == 0)
    {
        lenght = 3;

        for (var i = 0; i < lenght; i++) {

            var rowsds = $('<tr onclick="dasdsadsa(this)">');
            rowsds.append('<td>' + stt + '</td>');
            rowsds.append('<td>' + "<input type='text' id='search" + stt + "' name='name' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='quantity" + stt + "' name='quantity' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='importprice" + stt + "' name='importprice' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='codeid" + stt + "' name='codeid' value=''/>" + '</td>');
            rowsds.append('</tr>');
            $('#tableInput').append(rowsds);
            countsda++;
            stt++;
        }

        if (countsda == 3)
        {
            var tablerow = 1;
//            console.log(stt);
            $("#addDataTable").click(function () {
                for (var i = 0; i < tablerow; i++) {
                    var rowsds = $('<tr onclick="dasdsadsa(this)">');
                    rowsds.append('<td>' + stt + '</td>');
                    rowsds.append('<td>' + "<input type='text' id='search" + stt + "' name='name' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text' id='quantity" + stt + "' name='quantity' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text' id='importprice" + stt + "' name='importprice' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text' id='codeid" + stt + "' name='codeid' value=''/>" + '</td>');
                    rowsds.append('</tr>');
                    $('#tableInput').append(rowsds);
                }
                stt += 1;
//                            Autocomplete();
            });
        }
    }

}