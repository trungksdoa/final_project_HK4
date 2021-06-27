$('#service').change(function () {
    var selectedOption = $('#service option:selected');
    var valuesitem = selectedOption.val();
    var arraylist = [];
    if (valuesitem == "voucher") {
        $("#modalSerchform").modal('show');
        var row = $('<tr>');
        row.append('<td>' + "No Data" + '</td>');
        $('#myTable').append(row);
    }
});
//Submit remove modal and empty table
$("#btnServiceModalSave").click(function () {
    //set default selected
//    $('#service').prop('selectedIndex', 0);
    //Hide modal
    console.log("Hello word")
    $("#modalSerchform").modal('hide');
    //Empty table
    $("#myTable").empty();
});
$("#btnServiceModalClose").click(function () {
    //set default selected
//    $('#service').prop('selectedIndex', 0);
    //Hide modal
    $("#modalSerchform").modal('hide');
    //Empty table
    $("#myTable").empty();
});
//Submit for data
$("#saerchFrom").on("submit", function (event) {
    event.preventDefault();
    $("#myTable").empty();
    var data = $('#saerchFrom').serialize();
    var url = "warehouse/voucher/" + data;
    $.get("/warehouse/voucher/" + data)
            .done(function (response) {
                var table = document.getElementById("myTable");
                var row = null;
                var lengt = response;
                if (lengt != null)
                {
                    for (var i = 0; i < response.length; i++) {
                        if (response[i].status == true)
                        {
                            var checkid = response[i].id;
                            var row = $('<tr>');
                            row.append("<td >" + '<input type="checkbox" class="checks" value="' + response[i].id + '"/>' + "</td>");
                            row.append('<td>' + response[i].id + '</td>');
                            row.append('<td>' + response[i].address + '</td>');
                            row.append('<td>' + response[i].expain + '</td>');
                            $('#myTable').append(row);
                        } else
                        {
                            var row = $('<tr>');
                            row.append('<td>' + "No Data Found" + '</td>');
                            $('#myTable').append(row);
                        }
                    }
                } else
                {
                    var row = $('<tr>');
                    row.append('<td>' + "No Data" + '</td>');
                    $('#myTable').append(row);
                }
            });
});