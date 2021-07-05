function addRow() {

    var lenght = 0;
    var countsda = 0;
    if (lenght == 0)
    {

        lenght = 1;

        for (var i = 0; i < lenght; i++) {

            var rowsds = $('<tr>');
            rowsds.append('<td>' + tangtudong + '</td>');
            rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text' id='search" + stt + "' name='name' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='number' id='quantity" + stt + "' min='1' onkeydown='lookup(this);' name='quantity' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='number' id='importprice" + stt + "' min='1' name='importprice' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text' id='weightOn1" + stt + "' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text' id='codeid" + stt + "' name='codeid' value=''/>" + '</td>');
            rowsds.append('</tr>');
            $('#tableInput').append(rowsds);
            countsda++;
            stt++;
            tangtudong++;
            console.log(tangtudong)
        }

        if (countsda == 1)
        {
            var tablerow = 1;
//            console.log(stt);
            $("#addDataTable").click(function () {
                for (var i = 0; i < tablerow; i++) {
                    var rowsds = $('<tr>');
                    rowsds.append('<td>' + tangtudong + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text' id='search" + stt + "' name='name' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='quantity" + stt + "' min='1' onkeydown='lookup(this);' name='quantity' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='importprice" + stt + "' min='1' name='importprice' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='dasdsadsa(this.id)' type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text' id='weightOn1" + stt + "' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text' id='codeid" + stt + "' name='codeid' value=''/>" + '</td>');
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