function addRow() {

    var lenght = 0;
    var countsda = 0;
    if (lenght == 0)
    {
        lenght = 1;

        for (var i = 0; i < lenght; i++) {

            var rowsds = $('<tr>');
            rowsds.append('<td><button type="button" id="btnSelect" onclick="myFunction(this)" class="btnSelect">Delete</button></td>')
            rowsds.append('<td>' + tangtudong + '</td>');
            rowsds.append('<td>' + "<input onkeydown='Autocomplete(this.id)' type='text' id='ID" + stt + "' name='ID' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly  require type='text'  id='Unit" + stt + "' name='Unit' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly require type='text' id='From" + stt + "' min='1' name='From' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='To" + stt + "' name='To' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='number' id='Quantity" + stt + "' min='1' name='Quantity' value=''/>" + '</td>');
            rowsds.append('</tr>');
            $('#tableInput').append(rowsds);
            countsda++;
            stt++;
            tangtudong++;
        }

        if (countsda == 1)
        {
            var tablerow = 1;
//            console.log(stt);
            $("#addDataTable").click(function () {
                for (var i = 0; i < tablerow; i++) {
                    var rowsds = $('<tr>');
                    rowsds.append('<td><button type="button" id="btnSelect" onclick="myFunction(this)" class="btnSelect">Delete</button></td>')
                    rowsds.append('<td>' + tangtudong + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='Autocomplete(this.id)' type='text' id='ID" + stt + "' name='ID' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly  require type='text'  id='Unit" + stt + "' name='Unit' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly require type='text' id='From" + stt + "' min='1' name='From' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='text' id='To" + stt + "' name='To' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='Quantity" + stt + "' min='1' name='Quantity' value=''/>" + '</td>');
                    rowsds.append('</tr>');
                    $('#tableInput').append(rowsds);
                    document.getElementById('ID' + stt).focus();
                }
                stt += 1;
                tangtudong++;
//                            Autocomplete();
            });
        }
    }

}