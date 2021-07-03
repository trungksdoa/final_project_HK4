//end
//
//Function Clear data
function emptyData() {
    var result = confirm("Want to reset?");
    if (result) {
        $("#tableInput").empty();
        stt = 0;
        for (var i = 0; i < 1; i++) {
            var rowsds = $('<tr onclick="dasdsadsa(this)">');
            rowsds.append('<td>' + stt + '</td>');
            rowsds.append('<td>' + "<input type='text' id='search" + stt + "' name='name' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input  type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='number' id='quantity" + stt + "' min='1' onkeyup='lookup(this);' name='quantity' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='number' id='importprice" + stt + "' min='1' name='importprice' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text' id='weightOn1" + stt + "' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input readonly type='text' id='codeid" + stt + "' name='codeid' value=''/>" + '</td>');
            rowsds.append('</tr>');
            rowsds.append('</tr>');
            $('#tableInput').append(rowsds);
            stt++;
        }
//                    Autocomplete();
    }
}
