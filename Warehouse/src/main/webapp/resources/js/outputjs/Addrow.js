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
            rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)'  type='text' id='search" + stt + "' name='codeid' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text' id='name" + stt + "' name='name' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly  type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='number' id='quantity" + stt + "' min='1' oninvalid='Stock not Engght' name='quantity' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='number' id='Exportprice" + stt + "' min='1' name='Exportprice' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text' id='groupid" + stt + "' name='group' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='number' min=1 id='weight" + stt + "' name='weight' value=''/>" + '</td>');
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
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)'  type='text' id='search" + stt + "' name='codeid' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text' id='name" + stt + "' name='name' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly  type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='quantity" + stt + "' min='1' oninvalid='Stock not Engght' name='quantity' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='Exportprice" + stt + "' min='1' name='Exportprice' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text' id='groupid" + stt + "' name='group' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' min=1 id='weight" + stt + "' name='weight' value=''/>" + '</td>');
                    rowsds.append('</tr>');
                    $('#tableInput').append(rowsds);
                    document.getElementById('search' + stt).focus();
                }
                stt += 1;
                tangtudong++;
//                            Autocomplete();
            });
        }
    }

}