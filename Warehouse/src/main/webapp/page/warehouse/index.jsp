<%-- 
    Document   : index
    Created on : Jun 23, 2021, 9:15:48 AM
    Author     : trung
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <!--<link rel="stylesheet" href="style.css">-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css" integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous">
        <!--<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

        <style>
            /*                tbody {
                                display:block;
                                max-height:500px;
                                overflow-y:auto;
                            }
                            thead, tbody tr {
                                display:table;
                                width: var(--table-width);
                                table-layout:fixed;
                            }*/
        </style>
    </head>
    <body>

        <div class="container">
            <div class="main" style="margin-top: 8rem;">
                <!--<input id="hidCidade" type="text" /><br>-->
                <form>
                    <div class="row">
                        <div class="col-lg-8 col-md-8" >
                            <div class="form-group row">
                                <label for="object" class="col-lg-2 col-form-label">Object</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" name="object" id="object" placeholder="object">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="shipper" class="col-lg-2 col-form-label">Shipper</label>
                                <div class="col-lg-10">
                                    <div class="input-group">
                                        <input type="text" class="form-control" name="shipper" id="shipper" placeholder="Shipper">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="explain" class="col-lg-2 col-form-label">Explain</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" name="explain" id="explain" placeholder="explain">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="explain" class="col-lg-2 col-form-label">Warehouse</label>
                                <div class="col-lg-10">
                                    <div class="input-group mb-3">
                                        <select class="custom-select" id="inputGroupSelect02">
                                            <option selected>Choose...</option>
                                            <option value="1">Warehouse A</option>
                                            <option value="2">Warehouse B</option>
                                            <option value="3">Warehouse C</option>
                                        </select>
                                        <div class="input-group-append">
                                            <button class="btn btn-outline-secondary" id="btnkho" type="button"><i class="fas fa-plus"></i></button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-4">
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group row">
                                        <label for="id" class="col-lg-2 col-form-label">License</label>
                                        <div class="col-lg-10">
                                            <input type="text" class="form-control" name="id" id="id" placeholder="System will generation License">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="Date" class="col-lg-2 col-form-label">Date</label>
                                        <div class="col-lg-10">
                                            <input type="date" class="form-control" name="Date" id="Date" placeholder="Date">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-group row">
                                        <label for="Date" class="col-lg-2 col-form-label">Service</label>
                                        <div class="col-lg-10">
                                            <div class="input-group mb-3">
                                                <select class="custom-select" id="service">
                                                    <option value="0" selected>Choose</option>
                                                    <option value="voucher">Nhập theo chứng từ mua hàng</option>
                                                    <option value="2">Nhập theo sản xuất</option>
                                                    <option value="3">Nhập khác</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-group row">
                                        <label class="col-lg-2 col-form-label">Action</label>
                                        <div class="col-lg-10">
                                            <button style="margin-right:20px;" type="button" id="addDataTable"  class="btn btn-primary" >Add row</button>
                                            <button onclick="emptyData();return false;" class="btn btn-warning" onclick="">Reset</button>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="table-responsive">
                        <table class="table table-bordered" style="z-index: 1000">
                            <thead>
                                <tr>
                                    <th>Goods name</th>
                                    <th>Unit</th>
                                    <th>Quantity</th>
                                    <th>Input Price</th>
                                    <th>Price</th>
                                    <th>VoucherID</th>
                                    <th>Group</th>
                                    <th>Weight</th>

                                </tr>
                            </thead>
                            <tbody id="tableInput" contenteditable="true">

                            </tbody>
                        </table>
                    </div>
                </form>
            </div>
        </div>

        <!-- Modal flatform -->
        <form action="">
            <div id="modalkho" class="modal" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Create warehouse</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">

                            <div class="form-group row">
                                <label for="object" class="col-lg-2 col-form-label">ID</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" name="object" id="object1" placeholder="object">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="object" class="col-lg-2 col-form-label">Name</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" name="object" id="object2" placeholder="object">
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="submit" class="btn btn-primary">Save changes</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>

        <div id="modalSerchform" class="modal fade" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Searching....</h5>

                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="saerchFrom">
                            <div class="row">
                                <div class="col">
                                    <input type="date" class="form-control" name="from" placeholder="">
                                </div>
                                <div class="col">
                                    <input type="date" class="form-control" name="to" placeholder="">
                                </div>
                                <div class="col">
                                    <input type="submit" class="form-control" value="Filter">
                                </div>
                            </div>
                        </form>
                        <br>
                        <table class="table">
                            <thead class="thead-dark">
                                <tr>
                                    <th style="width:-40%;"><input type="checkbox" id="checkAll"/></th>
                                    <th scope="col">Id</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Expain</th>
                                </tr>
                            </thead>
                            <tbody class="myTable" id="myTable"> 

                            </tbody>

                        </table>
                    </div>
                    <div class="modal-footer">
                        <button onclick="getValue();return false;"  id="btnServiceModalSave" type="submit" class="btn btn-primary">Save changes</button>
                        <button  id="btnServiceModalClose"  type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- End modal -->

        <script>

            $("#checkAll").click(function () {
                $('input:checkbox').not(this).prop('checked', this.checked);
            });
            var ID = 0;
// Refernce the parent of all of the target nodes
            var parent = document.getElementById('tableInput');
// Register the click event to #parent
            parent.addEventListener('click', idNode);

// This is the callback that is invoked on each click
            function idNode(e) {
                /* If the node clicked (e.target) is not the 
                 || the registered event listener 
                 || (e.currentTarget = #parent)
                 */
                if (e.target !== e.currentTarget) {
                    // Get the #id of clicked node
                    ID = e.target.id;
                    // Reference e.target by its #id
                    var child = document.getElementById(ID);

                }
                // Log the #id of each e.target at every click
                console.log('The caret is located at ' + ID);

                // Return the e.target as a DOM node when needed
                return child;

            }



            var stt = 0;
            function addRow() {

                var lenght = 0;
                var countsda = 0;

                if (lenght == 0)
                {
                    lenght = 3;
                    for (var i = 0; i < lenght; i++) {
                        var rowsds = $('<tr>');
                        rowsds.append('<td>' + "<input id='search" + stt + "' type='text' name='name' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' name='unit' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' name='quantity' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' name='importprice' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' name='afterprice' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' name='group' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' name='weight' value=''/>" + '</td>');
                        rowsds.append('</tr>');
                        $('#tableInput').append(rowsds);
                        countsda++;
                        stt++;
                    }
                    if (countsda == 3)
                    {
                        var tablerow = 1;
                        console.log(stt);
                        $("#addDataTable").click(function () {
                            for (var i = 0; i < tablerow; i++) {
                                var rowsds = $('<tr>');
                                rowsds.append('<td>' + "<input id='search" + stt + "' type='text' name='name' value=''/>" + '</td>');
                                rowsds.append('<td>' + "<input type='text' name='unit' value=''/>" + '</td>');
                                rowsds.append('<td>' + "<input type='text' name='quantity' value=''/>" + '</td>');
                                rowsds.append('<td>' + "<input type='text' name='importprice' value=''/>" + '</td>');
                                rowsds.append('<td>' + "<input type='text' name='afterprice' value=''/>" + '</td>');
                                rowsds.append('<td>' + "<input type='text' value=''/>" + '</td>');
                                rowsds.append('<td>' + "<input type='text' name='group' value=''/>" + '</td>');
                                rowsds.append('<td>' + "<input type='text' name='weight' value=''/>" + '</td>');
                                rowsds.append('</tr>');
                                $('#tableInput').append(rowsds);
                            }
                            stt += 1;
                            Autocomplete();
                        });
                    }
                }

            }
            //Remove row Table
            function deleteRow(rowid)
            {
                document.getElementById("tableInput").removeChild(document.getElementById(rowid));
            }
            //end
            //
            //Function Clear data
            function emptyData() {
                var result = confirm("Want to reset?");
                if (result) {
                    $("#tableInput").empty();
                    stt = 0;
                    for (var i = 0; i < 3; i++) {
                        var rowsds = $('<tr>');
                        rowsds.append('<td>' + "<input type='text' id='search" + stt + "' name='name' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' id='quantity" + stt + "' name='quantity' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' id='importprice" + stt + "' name='importprice' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' id='afterprice" + stt + "' name='afterprice' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' id='voucherid" + stt + "' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
                        rowsds.append('<td>' + "<input type='text' id='weight" + stt + "' name='weight' value=''/>" + '</td>');
                        rowsds.append('</tr>');
                        $('#tableInput').append(rowsds);
                        stt++;
                    }
                    Autocomplete();
                }
            }

            function Autocomplete()
            {
                for (var i = 0; i < stt; i++) {
                    console.log(i);
                    $("#search" + i).autocomplete({
                        source: function (request, response) {

                            var friendsArray = [];
                            friendsArray = [{
                                    "id": 1,
                                    "name": "hulk",
                                    "value": "hulk"
                                }, {
                                    "id": 2,
                                    "name": "ironman",
                                    "value": "ironman"
                                }, {
                                    "id": 3,
                                    "name": "Foobar",
                                    "value": "Foobar"
                                }];

                            response(friendsArray);
                            return;


                        },

                        select: function (e, ui) {
                            console.log(ID);
                            var lastChar = ID[ID.length - 1];
                            console.log(lastChar);
                            $("#unit" + lastChar).val(ui.item.name);
                        },

                        change: function (e, ui) {

//                            alert("changed!");
                        }
                    });
                }

            }

            function getCurrentId()
            {
                alert(this.id);
            }


            //Function SaveGetData
            //
            //End
            //Start
            function getValue() {
                stt = 0;
                var checks = document.getElementsByClassName('checks');
                var strs = [];
                var str = "";
                for (i = 0; i < checks.length; i++) {
                    if (checks[i].checked === true) {
                        str = [checks[i].value];
                        strs.push(str);
                    }
                }
                var url = "/warehouse/findGoods/";
                $.ajax({
                    url: '/warehouse/findGoods/',
                    method: 'POST',
                    traditional: true,
                    data: {
                        id: strs
                    },
                    success: function (data) {
                        $("#tableInput").empty();
                        if (data != null) {
                            for (var i = 0; i < data.length; i++) {
                                var checkid = data[i].id;
                                var row = $('<tr>');
                                row.append('<td>' + "<input id='search" + stt + "' type='text' name='name' value='" + data[i].goodsName + "'/>" + '</td>');
                                row.append('<td>' + "<input type='text' name='unit' value='" + data[i].unit + "'/>" + '</td>');
                                row.append('<td>' + "<input type='text' name='quantity' value='" + data[i].quantity + "'/>" + '</td>');
                                row.append('<td>' + "<input type='text' name='importprice' value='" + data[i].goodsPrice + "'/>" + '</td>');
                                row.append('<td>' + "<input type='text' name='afterprice' value='" + data[i].goodsPrice * data[i].quantity + "'/>" + '</td>');
                                row.append('<td>' + "<input type='text' value='" + data[i].voucherId + "'/>" + '</td>');
                                row.append('<td>' + "<input type='text' name='group' value=''/>" + '</td>');
                                row.append('<td>' + "<input type='text' name='weight' value=''/>" + '</td>');
                                row.append('</tr>');
                                $('#tableInput').append(row);
                                stt++;
                            }
                            Autocomplete();
                        }
                    },
                    error: function (request, status, error) {
                        alert("The request failed: " + request.responseText);
                    }
                });
            }
            //ModalService submit
//            $("#btnServiceModalSave").click(function () {
//                $.post(url, {arrayData: arrayData}, function (data, status) {
//                    //do something
//                });
//            });





            //Function for web
            $(document).ready(function () {
                $.ajaxSetup({
                    cache: false
                });

                addRow();
                Autocomplete();
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
                    $('#service').prop('selectedIndex', 0);
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
                //ModalKho
                // author Trung
                //End
                $("#btnkho").click(function () {
                    $("#modalkho").modal('show');
                });

            });
            //Date
            //
            //Date
            var today = new Date();
            var months = null;
            var date = null;
            if ((months = today.getMonth() + 1) > 10) {
                months = months = today.getMonth() + 1;
                date = today.getFullYear() + '-' + months + '-' + today.getDate();
            } else {
                months = "0" + (months = today.getMonth() + 1);
                date = today.getFullYear() + '-' + months + '-' + today.getDate();
            }
            document.getElementById("Date").value = date;
        </script>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <!--<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>-->
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>

</html>