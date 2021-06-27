//end
//
//Function Clear data
function emptyData() {
    var result = confirm("Want to reset?");
    if (result) {
        $("#tableInput").empty();
        stt = 0;
        for (var i = 0; i < 3; i++) {
            var rowsds = $('<tr onclick="dasdsadsa(this)">');
            rowsds.append('<td>' + "<input type='text' id='search" + stt + "' name='name' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='quantity" + stt + "' name='quantity' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='importprice" + stt + "' name='importprice' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='afterprice" + stt + "' name='afterprice' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
            rowsds.append('<td>' + "<input type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
            rowsds.append('</tr>');
            $('#tableInput').append(rowsds);
            stt++;
        }
//                    Autocomplete();
    }
}
