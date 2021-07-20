$('#service').change(function () {
    var selectedOption = $('#service option:selected');
    var valuesitem = selectedOption.val();
    var arraylist = [];
    if (valuesitem == "voucher") {
        $("#modalSerchform").modal('show');
        var row = $('<tr>');
        row.append('<td>' + "No Data" + '</td>');
        $('#myTable').append(row);
    } else if (valuesitem == "production")
    {
        $("#modalSerchform2").modal('show');
        var row = $('<tr>');
        row.append('<td>' + "No Data" + '</td>');
        $('#myTable2').append(row);
    } else
    {
        //
    }
});
//Submit remove modal and empty table
$("#btnServiceModalSave").click(function () {
    //set default selected
//    $('#service').prop('selectedIndex', 0);
    //Hide modal
    $("#modalSerchform").modal('hide');

    //Empty table
    $("#myTable").empty();


});
$("#btnServiceModalClose").click(function () {
    //set default selected
    $('#service').prop('selectedIndex', 0);
    //Hide modal
    $("#modalSerchform").modal('hide');
    //Empty table
    $("#myTable").empty();
});




$("#btnServiceModalClose1").click(function () {
    //set default selected
    $('#service').prop('selectedIndex', 0);
    //Hide modal
    $("#modalSerchform2").modal('hide');
    //Empty table
    $("#myTable2").empty();
});

//Submit for data
//Submit remove modal and empty table

//Submit for data

//Service1
$("#saerchFrom").on("submit", function (event) {
    event.preventDefault();
    $("#myTable").empty();
    var data = $('#saerchFrom').serialize();
//    var serializedData = $('form').serialize();
// serializedData = 'name=&age=99&blah=';
    data = data.replace(/&?[^=]+=&|&[^=]+=$/g, '');
//    console.log(data)
    var url = "warehouse/voucher/" + data;
    $.get("/api/output/voucher/" + data)
            .done(function (response) {
                var table = document.getElementById("myTable");
                var row = null;
                var lengt = response;
                if (lengt != null)
                {
                    for (var i = 0; i < response.length; i++) {
                        if (response[i].status == false)
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
//                            var row = $('<tr>');
//                            row.append('<td>' + "No Data Found" + '</td>');
//                            $('#myTable').append(row);
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




//Service2
$("#saerchFrom2").on("submit", function (event) {
    event.preventDefault();
    $("#myTable2").empty();
    var data = $('#saerchFrom2').serialize();
    var url = "/warehouse/findProduction/" + data;
//    console.log(data)
    $.get("/api/output/findProduction/" + data)
            .done(function (response) {
                var table = document.getElementById("myTable2");
                var row = null;
                var lengt = response;
                if (lengt != null)
                {
                    for (var i = 0; i < response.length; i++) {
                        if (response[i].status == "Chua hoàn thành")
                        {
                            var checkid = response[i].id;
                            var row = $('<tr>');
                            row.append("<td >" + '<input type="checkbox" class="checks1" value="' + response[i].id + '"/>' + "</td>");
                            row.append('<td>' + response[i].id + '</td>');
                            row.append('<td>' + response[i].goodsName + '</td>');
                            row.append('<td>' + response[i].unit + '</td>');
                            row.append('<td>' + response[i].quantity + '</td>');
                            $('#myTable2').append(row);
                        } else
                        {
                            var row = $('<tr>');
                            row.append('<td>' + "No Data Found" + '</td>');
                            $('#myTable2').append(row);
                        }
                    }
                } else
                {
                    var row = $('<tr>');
                    row.append('<td>' + "No Data Found" + '</td>');
                    $('#myTable2').append(row);
                }
            });
});

