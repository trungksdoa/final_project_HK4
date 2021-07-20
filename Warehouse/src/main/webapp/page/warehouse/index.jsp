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
        <title>Input Page</title>
        <style>

        </style>
    </head>
    <body>

        <div class="container">
            <div class="main" style="margin-top: 8rem;">
                <!--<input id="hidCidade" type="text" /><br>-->
                <!---->
                <form id='maiForm' method="POST" action="/web/warehouse/page">

                    <div class="row">
                        <div class="col-lg-8 col-md-8" >
                            <div class="form-group row">
                                <label class="col-lg-2 col-form-label">Action</label>
                                <div class="col-lg-10">
                                    <button  style="" type="submit" id="savaDataAll"  class="btn btn-primary" >Save</button>   
                                    <!--<button onclick="window.print()">Print this page</button>-->
                                    <div class="form-group row"  style="float:right;margin-right: 5px;">
                                        <button style="margin-right: 28px;" type="button" id="addDataTable"  class="btn btn-secondary" >Add row</button>
                                        <button onclick="emptyData();return false;"  class="btn btn-warning" onclick="">Reset row</button>
                                    </div>
                                </div>

                            </div>
                            <div class="form-group row">
                                <label for="id" class="col-lg-2 col-form-label">License</label>
                                <div class="col-lg-10">
                                    <div class="input-group mb-3">
                                        <input type="text" class="form-control" required="" name="id" id="id_liecene" value="" placeholder="System will generation License">
                                        <div class="input-group-prepend">
                                            <button onclick="CreateID();return false;" type="button" id="generatesid" class="btn btn-secondary" >Generates ID</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="Date" class="col-lg-2 col-form-label">Date</label>
                                <div class="col-lg-10">
                                    <input type="date" required="" class="form-control" name="Date" id="DateLicene" placeholder="Date">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="Date" class="col-lg-2 col-form-label">Service</label>
                                <div class="col-lg-10">
                                    <div class="input-group mb-3">
                                        <select name="service" required="" class="custom-select" id="service">
                                            <option value="0" selected>Choose</option>
                                            <option value="voucher">Nhập theo chứng từ mua hàng</option>
                                            <option value="production">Nhập theo sản xuất</option>
                                            <option value="other">Nhập khác</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="explain" class="col-lg-2 col-form-label">Explain</label>
                                <div class="col-lg-10">
                                    <input type="text"   class="form-control" name="explain" id="explain" placeholder="explain">
                                </div>
                                <div class="col-lg-10">
                                    <p>Hint: Click on field at Goods name to start finding your goods easy</p>
                                </div>
                            </div>

                        </div>
                        <div class="col-lg-4 col-md-4">  
                            <img src="<c:url value="/resources/img/warehouse.jpg" />" alt="Girl in a jacket" width="350" height="300">
                        </div>
                    </div>

                    <div class="table-responsive">
                        <table class="table table-bordered" style="z-index: 1000">
                            <thead>
                                <tr>
                                    <th>STT</th>
                                    <th>Goods name</th>
                                    <th>Unit</th>
                                    <th>Supplier</th>
                                    <th>Warehouse</th>
                                    <th>Quantity</th>
                                    <th>Input Price</th>
                                    <th>Group</th>
                                    <th>Weight</th>
                                    <th>Goods ID</th>

                                </tr>
                            </thead>
                            <tbody id="tableInput">

                            </tbody>
                        </table>
                    </div>
                    <!--                </form>-->
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
                                <!--                                <div class="col">
                                                                    <input type="text" class="form-control" name="ncc" placeholder="Supplier">
                                                                </div>-->
                                <div class="col">
                                    <input type="date" class="form-control" required="" name="from" placeholder="">
                                </div>
                                <div class="col">
                                    <input type="date" class="form-control" required name="to" placeholder="">
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
        <div id="modalSerchform2" class="modal fade" tabindex="-1" role="dialog">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Searching....</h5>

                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="saerchFrom2">
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
                                    <th scope="col">Expain</th>
                                </tr>
                            </thead>
                            <tbody class="myTable2" id="myTable2"> 

                            </tbody>

                        </table>
                    </div>
                    <div class="modal-footer">
                        <button onclick="getValue2();return false;"  id="btnServiceModalSave1" type="submit" class="btn btn-primary">Save changes</button>
                        <button  id="btnServiceModalClose1"  type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- End modal -->

        <script>
            var stt = 0;



            $("#btnServiceModalSave1").click(function () {
                //set default selected
//    $('#service').prop('selectedIndex', 0);
                //Hide modal
                $("#modalSerchform2").modal('hide');

                //Empty table
                $("#myTable2").empty();


            });
            $("#btnServiceModalClose1").click(function () {
                //set default selected
                $('#service').prop('selectedIndex', 0);
                //Hide modal
                $("#modalSerchform2").modal('hide');
                //Empty table
                $("#myTable2").empty();
            });

            function CreateID()
            {

                $.get("/warehouse/getID/", function (data, status) {
                    let idgener = data.id;
                    console.log(data.id);

                    idgener = idgener.substring(2);
                    var id = parseInt(idgener);
                    id++;
                    var str = "" + id
                    var pad = "NK0000"
                    var ans = pad.substring(0, pad.length - str.length) + str
//                console.log(ans)
                    $('#id_liecene').val(ans);
                });


            }


            $(document).ready(function () {

                $.ajaxSetup({
                    cache: false
                });
                addRow();
                $("#btnkho").click(function () {
                    $("#modalkho").modal('show');
                });


//                $("#maiForm").on("submit", function (event) {
//                    event.preventDefault();
//                    var data = $('#maiForm').serialize();
////    var serializedData = $('form').serialize();
//// serializedData = 'name=&age=99&blah=';
////                    data = data.replace(/&?[^=]+=&|&[^=]+=$/g, '');
//                    $.ajax({
//                        url: '',
//                        method: 'POST',
//                        traditional: true,
//                        data: {
//                            id: strs
//                        },
//                        success: function (res) {}
//                        console.log(res)
//                    });
//                })



            });
            $("#checkAll").click(function () {
                $('input:checkbox').not(this).prop('checked', this.checked);
            });
            function SaveMaindata()
            {
                $("#maiForm").on("submit", function (event) {
                    event.preventDefault();
                    var data = $('#maiForm').serialize();
                    console.log(data);
                })

            }

            //OnClick To AutoComplete
            function dasdsadsa(x) {
//                alert("Row index is: " + x.rowIndex);
                var index = 0;
                index += x.rowIndex;
                index--;
//                console.log(index);
                Autocomplete(index);
//                return x.rowIndex;
            }
            var today = new Date();
            var months = "";
            var date = "";
            if ((months = today.getMonth() + 1) > 10) {
                months = months = today.getMonth() + 1;
                date = today.getFullYear() + '-' + months + '-' + today.getDate();
//                document.getElementById("Date").value = date;
            } else {
                months = "0" + (months = today.getMonth() + 1);
                date = today.getFullYear() + '-' + months + '-' + today.getDate();

            }
            document.getElementById("DateLicene").value = date;
//            $("#Date").val(date);

        </script>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <!--<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>-->
        <script src="<c:url value="/resources/js/Addrow.js" />"></script>
        <script src="<c:url value="/resources/js/Autocomplete.js" />"></script>
        <script src="<c:url value="/resources/js/EmptyData.js" />"></script>
        <script src="<c:url value="/resources/js/getValue.js" />"></script>
        <script src="<c:url value="/resources/js/onChangeService.js" />"></script>

        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>

</html>