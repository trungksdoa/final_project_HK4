//end
//
//Function Clear data
function emptyData() {
    var result = confirm("Want to reset?");
    if (result) {
        var today = new Date();
        var months = "";
        var date = "";
        if ((months = today.getMonth() + 1) > 10) {
            months = months = today.getMonth() + 1;
            date = today.getFullYear() + '-' + months + '-' + today.getDate();
            //                document.getElementById("Date").value = date;
        } else {
            months = "0" + (months = today.getMonth() + 1);
            date = today.getFullYear() + '-' + months + '-' + "0" + today.getDate();

        }
        document.getElementById("maiForm").reset();
        document.getElementById("DateLicene").value = date;
        $("#tableInput").empty();
        stt = 0;
        tangtudong = 1;
        for (var i = 0; i < 1; i++) {
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
            stt++;
            tangtudong++;
        }
    }
}
