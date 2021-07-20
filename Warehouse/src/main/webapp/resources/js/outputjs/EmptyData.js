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
            stt++;
            tangtudong++;
        }
//                    Autocomplete();
    }
}
