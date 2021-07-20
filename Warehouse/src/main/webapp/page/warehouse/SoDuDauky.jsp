<%-- 
    Document   : index
    Created on : Jun 16, 2021, 12:44:44 AM
    Author     : trung
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Layout</title>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

        <!--        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css">
                <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>-->

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <!-- Fontanswome -->
        <link rel="stylesheet" href="<c:url value='/resources/plugins/fontawesome-free/css/all.min.css'/>">
        <!-- Theme style -->
        <link rel="stylesheet" href="<c:url value='/resources/dist/css/adminlte.min.css'/>"/>
        <!-- overlayScrollbars -->
        <link rel="stylesheet" href="<c:url value='/resources/plugins/overlayScrollbars/css/OverlayScrollbars.min.css'/>"/>
        <!-- Daterange picker -->
        <link rel="stylesheet" href="<c:url value='/resources/plugins/daterangepicker/daterangepicker.css'/>"/>
        <!-- summernote -->
        <link rel="stylesheet" href="<c:url value='/resources/plugins/summernote/summernote-bs4.min.css' />"/>

        <script src="https://kit.fontawesome.com/cca0c56933.js" crossorigin="anonymous"></script>
        <script src="//cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <link href="//cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css" ref="stylesheet"/>
        <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/buttons/1.7.1/js/dataTables.buttons.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js" crossorigin="anonymous"></script>
        <script src=" https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.html5.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.print.min.js" crossorigin="anonymous"></script>
        <!-- Google Font: Source Sans Pro -->

        <style>

        </style>
    </head>
    <body class="hold-transition sidebar-mini layout-fixed">
        <div class="wrapper">


            <!-- Navbar -->
            <!--header nav-->

            <%--<jsp:include page="/fragment/navbar.jsp" />--%>  
            <%@ include file="/page/fragment/navbar.jsp" %>
            <!--Include here-->


            <!-- /.navbar -->

            <!-- Main Sidebar Container -->
            <%@ include file="/page/fragment/sidebar.jsp" %>
            <%--<jsp:include page="/fragment/sidebar.jsp" />--%>  

            <!--//Incldue here-->
            <style>
                .selected{
                    background-color: #ccc;
                }
                .ui-autocomplete-input {
                    border: none; 
                    font-size: 14px;
                    width: 467px;
                    height: 37px;
                    margin-bottom: 5px;
                    padding-top: 2px;
                    border: 1px solid #DDD !important;
                    padding-top: 0px !important;
                    z-index: 1511;
                    position: relative;
                }
                .ui-menu .ui-menu-item a {
                    font-size: 12px;
                }
                .ui-autocomplete {
                    max-height: 200px;
                    overflow-y: auto;
                    /* prevent horizontal scrollbar */
                    overflow-x: hidden;
                    /* add padding to account for vertical scrollbar */
                    position: absolute;
                    top: 0;
                    left: 0;
                    z-index: 1510 !important;
                    float: left;
                    display: none;
                    min-width: 250px;
                    width: 250px;
                    padding: 4px 0;
                    margin: 2px 0 0 0;
                    list-style: none;
                    background-color: #ffffff;
                    border-color: #ccc;
                    border-color: rgba(0, 0, 0, 0.2);
                    border-style: solid;
                    border-width: 1px;
                    -webkit-border-radius: 2px;
                    -moz-border-radius: 2px;
                    border-radius: 2px;
                    -webkit-box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
                    -moz-box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
                    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
                    -webkit-background-clip: padding-box;
                    -moz-background-clip: padding;
                    background-clip: padding-box;
                    *border-right-width: 2px;
                    *border-bottom-width: 2px;
                }
                .ui-menu-item > a.ui-corner-all {
                    display: block;
                    padding: 3px 15px;
                    clear: both;
                    font-weight: normal;
                    line-height: 18px;
                    color: #555555;
                    white-space: nowrap;
                    text-decoration: none;
                }
                .ui-state-hover, .ui-state-active {
                    color: #ffffff;
                    text-decoration: none;
                    background-color: #0088cc;
                    border-radius: 0px;
                    -webkit-border-radius: 0px;
                    -moz-border-radius: 0px;
                    background-image: none;
                }
                #example_length{
                    transform: translateY(36px) !important;
                }
                #example_filter{
                    float:right !important;
                }
            </style>
            <script>
   
            </script>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>Inventory</h1>
                            </div>
                        </div>
                    </div><!-- /.container-fluid -->
                </section>

                <!-- Main content -->
                <section class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-12 col-sm-12">
                                <div class="card card-primary card-outline card-tabs">
                                    <div class="card-header p-0 pt-1 border-bottom-0">
                                        <ul class="nav nav-tabs" id="custom-tabs-three-tab" role="tablist">
                                            <li class="nav-item">
                                                <a class="nav-link"
                                                   href="/web/warehouse/ck"><b>Create tranfer</b></a>
                                            </li>
                                            <li class="nav-item " id="custom-tabs-three-home-tab" data-toggle="pill" aria-selected="true"  role="tab" aria-controls="custom-tabs-three-home">
                                                <a class="nav-link active"
                                                   href="#custom-tabs-three-home"><b>Tranfer slip</b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">
                                        <div class="tab-content" id="custom-tabs-three-tabContent">
                                            <div class="tab-pane fade show active" id="custom-tabs-three-home" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-home-tab">
                                                <a id="showmodal" style="color:white" class="btn btn-success">Show Modal</a>
                                                <button class="btn btn-success" id="sadsadsadsa">Delete row seleted</button>
                                                <div class="table-responsive-">

                                                    <table id="example" class="table table-bordered">
                                                        <thead class="thead-light" id="tableheade">
                                                            <tr>
                                                                <th scope="col">#</th>
                                                                <th scope="col">ID</th>
                                                                <th scope="col">Name</th>
                                                                <th scope="col">Unit</th>
                                                                <th scope="col">Quantity</th>
                                                                <th scope="col">Input price</th>
                                                                <th scope="col">Supplier</th>
                                                                <th scope="col">Price</th>
                                                                <th scope="col">Group</th>
                                                                <th scope="col">Weight</th>
                                                                <th scope="col">Stockcard</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody id="tablueinput">

                                                        </tbody>
                                                    </table>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.card -->
                                </div>
                            </div>

                        </div>
                        <!-- /.row -->
                    </div>

                    <!-- /.container-fluid -->
                    <div class="modal hide fade" id='mymodal'  tabindex="-1" role="dialog" >
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">Add</h5>
                                </div>
                                <div class="modal-body">
                                    <div class="form-group">
                                        <label for="text">Id</label> 
                                        <input name="IDs" id="IDs" type="text" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="text2">Name</label> 
                                        <input name="Name" id="Name" type="text" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="text1">Unit</label> 
                                        <input  name="Unit" id="Unit" type="text" class="form-control">
                                    </div> 
                                    <div class="form-group">
                                        <label for="text">Quantity</label> 
                                        <input  name="Quantity" id="Quantity" type="number" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="text2">Input price</label> 
                                        <input name="Inputprice" id="Inputprice" type="number" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="text1">Supplier</label> 
                                        <input  name="Supplier" id="Supplier" type="text" class="form-control">
                                    </div> 
                                    <div class="form-group">
                                        <label for="text">Price</label> 
                                        <input  name="Price" id="Price" type="number" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="text2">Group</label> 
                                        <input "name="Group" id="Group" type="text" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="text1">Weight</label> 
                                        <input  name="Weight" id="Weight" type="number" class="form-control">
                                    </div> 
                                    <div class="form-group">
                                        <label for="text1">Stockcard</label> 
                                        <input  name="Stockcard" id="Stockcard" type="text" class="form-control">
                                    </div> 
                                    <div class="form-group">
                                        <button id="addRow" name="submit" type="submit" class="btn btn-primary">Submit</button>
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button  type="button"  class="btn btn-secondary" data-dismiss="modal">Close</button>
                                </div>
                            </div>


                        </div>  
                    </div>

                </section>
                <!-- /.content -->
            </div>

            <!-- /.content-wrapper -->
            <footer class="main-footer">
                <strong>Copyright &copy; 2014-2021 <a href="https://adminlte.io">AdminLTE.io</a>.</strong>
                All rights reserved.
                <div class="float-right d-none d-sm-inline-block">
                    <b>Version</b> 3.1.0
                </div>
            </footer>

            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <%--<jsp:include page="/fragment/RootJs.jsp" />--%>  
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <%--<jsp:include page="/fragment/RootJs.jsp" />--%>  
            <!-- Bootstrap 4 -->
            <script>

                var stt = 0;
                var tangtudong = 1;
                function Autocomplete()
                {
                    var goodsArray = [];
                    $.get("/api/input/goodsCatagory/", function (data, status) {
                        for (var i = 0; i < data.length; i++) {
                            var tempArray = new Array();
                            tempArray["id"] = data[i].goodsName;
                            tempArray["label"] = data[i].id;
                            tempArray["value"] = data[i].id;
                            tempArray["lastedPurchasePrice"] = data[i].lastedPurchasePrice;
                            tempArray["weight"] = data[i].weight;
                            tempArray["unit"] = data[i].unit;
                            tempArray["unitPrice"] = data[i].unitPrice;
                            tempArray["group"] = data[i].groupid;
                            goodsArray.push(tempArray);
                        }
                    });
                    $("#IDs").autocomplete({
                        source: goodsArray,
                        select: function (e, ui) {
                            var e = ui.item;
                            $("#Name").val(e.id);
                            $("#Unit").val(e.unit);
                            $('#Group').val(e.group);
                            $('#Quantity').val(1);
                            $('#Inputprice').val(1)
                            $('#Weight').val(e.weight)
                        },

                        change: function (e, ui) {
                        }
                    }).autocomplete("instance")._renderItem = function (ul, item) {
                        return $("<li>")
                                .append("<div>" + item.value + "<br>" + item.id + "</div>")
                                .appendTo(ul);
                    };

                    var stockcard = [];
                    $.get("/api/input/groupWarehouse/", function (data, status) {
                        for (var i = 0; i < data.length; i++) {
                            var tempArray = new Array();
                            tempArray["id"] = data[i].id;
                            tempArray["name"] = data[i].id;
                            tempArray["value"] = data[i].id;
                            stockcard.push(tempArray);
                        }
//        console.log(stockcard);
                    });

                    var SupplierIDS = [];
                    $.get("/api/input/supplierList/", function (data, status) {
                        for (var i = 0; i < data.length; i++) {
                            var tempArray = new Array();
                            tempArray["id"] = data[i].id;
                            tempArray["label"] = data[i].name;
                            tempArray["value"] = data[i].id;
                            SupplierIDS.push(tempArray);
                        }
//                    console.log(SupplierIDS);
                    });
                    var groupList = [];
                    $.get("/api/input/GroupsgoodsList/", function (data, status) {
                        for (var i = 0; i < data.length; i++) {
                            var tempArray = new Array();
                            tempArray["id"] = data[i].id;
                            tempArray["label"] = data[i].name;
                            tempArray["value"] = data[i].id;
                            groupList.push(tempArray);
                        }
//                    console.log(SupplierIDS);
                    });
                    $("#Stockcard").autocomplete({
                        source: stockcard,
                        select: function (e, ui) {

                        },

                        change: function (e, ui) {
                        }
                    });
                    $("#Supplier").autocomplete({
                        source: SupplierIDS,
                        select: function (e, ui) {

                        },

                        change: function (e, ui) {
                        }
                    });
                    $("#Group").autocomplete({
                        source: groupList,
                        select: function (e, ui) {

                        },

                        change: function (e, ui) {
                        }
                    });
                }
                $(document).ready(function () {
                    Autocomplete();
                    var table = $('#example').DataTable({
                        "columnDefs": [{
                                "searchable": true,
                                "orderable": true,
                                "targets": 0,
                                "responsive": true
                            }],
                        "order": [[1, 'asc']]
                    });

                    $('#example tbody').on('click', 'tr', function () {
                        if ($(this).hasClass('selected')) {
                            $(this).removeClass('selected');
                        } else {
                            table.$('tr.selected').removeClass('selected');
                            $(this).addClass('selected');
                        }
                    });
                    table.on('order.dt search.dt', function () {
                        table.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
                            cell.innerHTML = i + 1;
                            table.cell(cell).invalidate('dom');
                        });
                    }).draw();
                    $('#addRow').on('click', function () {
                        console.log(stt);
                        var IDs = $('#IDs').val();
                        var Name = $('#Name').val();
                        var Unit = $('#Unit').val();
                        var Quantity = $('#Quantity').val();
                        var Inputprice = $('#Inputprice').val();
                        var Supplier = $('#Supplier').val();
                        var Price = $('#Price').val();
                        var Group = $('#Group').val();
                        var Weight = $('#Weight').val();
                        var Stockcard = $('#Stockcard').val();
                        table.row.add([
                            '<td></td>',
                            '<td>' + IDs + '</td>',
                            '<td>' + Name + '</td>',
                            '<td>' + Unit + '</td>',
                            '<td>' + Quantity + '</td>',
                            '<td>' + Inputprice + '</td>',
                            '<td>' + Supplier + '</td>',
                            '<td>' + Price + '</td>',
                            '<td>' + Group + '</td>',
                            '<td>' + Weight + '</td>',
                            '<td>' + Stockcard + '</td>',
                        ]).draw(false);
                        tangtudong++;
                        var rowsds = $('<tr>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='fieldId" + stt + "' name='fieldId' value='" + +"'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='fiedName" + stt + "' name='fiedName' value='" + Name + "'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='fieldUnit" + stt + "' name='fieldUnit' value='" + Unit + "'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='fieldQuantity" + stt + "' name='fieldQuantity' value='" + Quantity + "'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='fieldInputprice" + stt + "' name='fieldInputprice' value='" + Inputprice + "'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='FieldSuppplier" + stt + "' name='FieldSuppplier' value='" + Supplier + "'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='FieldPrices" + stt + "' name='FieldPrices' value='" + Quantity * Inputprice + "'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='fieldGroup" + stt + "' name='fieldGroup' value='" + Group + "'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='fieldWeight" + stt + "' name='fieldWeight' value='" + Weight + "'/>" + '</td>');
                        rowsds.append('<td style="display:none">' + "<input readonly type='hidden' id='fieldStockcard" + stt + "' name='fieldStockcard' value='" + Stockcard + "'/>" + '</td>');
                        rowsds.append('</tr>');
                        $('#tablueinput').append(rowsds);
                        stt++;
                    });
                    $('#sadsadsadsa').click(function () {
                        table.row('.selected').remove().draw(false);
                    
                    });

                });

                $('#showmodal').on('click', function () {
                    $('#mymodal').modal('show');
                });
            </script>
            <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js" crossorigin="anonymous"></script>
            <script src="https://cdn.datatables.net/buttons/1.7.1/js/dataTables.buttons.min.js" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js" crossorigin="anonymous"></script>
            <script src=" https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js" crossorigin="anonymous"></script>
            <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.html5.min.js" crossorigin="anonymous"></script>
            <!-- Bootstrap 4 -->
            <script src="<c:url value='/resources/plugins/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
            <!-- daterangepicker -->
            <script src="<c:url value='/resources/plugins/moment/moment.min.js'/>"></script>
            <script src="<c:url value='/resources/plugins/daterangepicker/daterangepicker.js'/>"></script>
            <!-- Summernote -->
            <script src="<c:url value='/resources/plugins/summernote/summernote-bs4.min.js'/>"></script>
            <!-- overlayScrollbars -->
            <script src="<c:url value='/resources/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js'/>"></script>
            <!-- AdminLTE App -->
            <script src="<c:url value='/resources/dist/js/adminlte.js'/>"></script>
            <!-- AdminLTE for demo purposes -->
            <script src="<c:url value='/resources/dist/js/demo.js'/>"></script>
            <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
            <script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
    <!--<script src="<c:url value='/resources/dist/js/pages/dashboard.js'/>"></script>-->
            <!-- /.control-sidebar -->
        </div>
        <!-- ./wrapper -->

</html>
