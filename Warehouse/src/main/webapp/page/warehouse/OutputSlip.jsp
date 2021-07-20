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
                .ui-autocomplete-input {
                    border: none; 
                    font-size: 14px;
                    width: 250px;
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
                    position: absolute;
                    top: 0;
                    left: 0;
                    z-index: 1510 !important;
                    float: left;
                    display: none;
                    min-width: 160px;
                    width: 160px;
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
                #chart {
                    height: 440px;
                }
                .card-counter{
                    box-shadow: 2px 2px 10px #DADADA;
                    margin: 5px;
                    padding: 20px 10px;
                    background-color: #fff;
                    height: 100px;
                    border-radius: 5px;
                    transition: .3s linear all;
                }

                .card-counter:hover{
                    box-shadow: 4px 4px 20px #DADADA;
                    transition: .3s linear all;
                }

                .card-counter.primary{
                    background-color: #007bff;
                    color: #FFF;
                }

                .card-counter.danger{
                    background-color: #ef5350;
                    color: #FFF;
                }  

                .card-counter.success{
                    background-color: #66bb6a;
                    color: #FFF;
                }  

                .card-counter.info{
                    background-color: #26c6da;
                    color: #FFF;
                }  

                .card-counter i{
                    font-size: 4em;
                    opacity: 0.2;
                }

                .card-counter .count-numbers{
                    position: absolute;
                    right: 35px;
                    top: 20px;
                    font-size: 32px;
                    display: block;
                }

                .card-counter .count-name{
                    position: absolute;
                    right: 35px;
                    top: 65px;
                    font-style: italic;
                    text-transform: capitalize;
                    opacity: 0.5;
                    display: block;
                    font-size: 18px;
                }
                #exTab2 h3 {
                    color: white;
                    background-color: #428bca;
                    padding: 5px 15px;
                }
                /* remove border radius for the tab */

                #exTab1 .nav-pills>li>a {
                    border-radius: 0;
                }
                /* change border radius for the tab , apply corners on top*/

                #exTab3 .nav-pills>li>a {
                    border-radius: 4px 4px 0 0;
                }

                #exTab3 .tab-content {
                    color: white;
                    background-color: #428bca;
                    padding: 5px 15px;
                }
                #myTable_filter{
                    float:right;
                    margin-bottom: 10px;
                }
                .Completed{
                    pointer-events:none;
                    cursor: not-allowed;
                    background-color: #4CAF50;
                    color:white;
                }
                .NotComplete{
                    background-color: red;
                    color:white;
                }
                .disable-click{

                }
            </style>
            <script>
                $(function () {
                    $('#myTable').DataTable({
                        fixedColumns: true,
                        responsive: true,
                        dom: 'Bfrtip',
                        buttons: [
                            'copy', 'excel', 'pdf', 'print'
                        ],
                        scrollY: 200,
                        deferRender: true,
                        scroller: true,
                        select: true
                    });
//                href = "/web/warehouse/checkstock/${x.id}"

                });
            </script>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>Inventory check</h1>
                            </div>
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                                    <li class="breadcrumb-item "><a href="#">Warehouse</a></li>
                                    <li class="breadcrumb-item "><a href="/web/warehouse/OutputSlip">Output</a></li>
                                </ol>
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
                                                   href="/web/warehouse/output"><b>Create output</b></a>
                                            </li>
                                            <li class="nav-item " id="custom-tabs-three-home-tab" data-toggle="pill" aria-selected="true"  role="tab" aria-controls="custom-tabs-three-home">
                                                <a class="nav-link active"
                                                   href="#custom-tabs-three-home"><b>Output</b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">
                                        <div class="tab-content" id="custom-tabs-three-tabContent">
                                            <div class="tab-pane fade show active" id="custom-tabs-three-home" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-home-tab">
                                                <table id="myTable" class="table table-bordered">
                                                    <thead class="thead-light" id="tableheade">
                                                        <tr>
                                                            <th scope="col">#</th>
                                                            <th scope="col">ID</th>
                                                            <th scope="col">Date</th>
                                                            <th scope="col">Date Complete</th>
                                                            <th scope="col">Expaln</th>
                                                            <th scope="col">Service</th>
                                                            <th scope="col">Status</th>
                                                            <th scope="col">Action</th>

                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% int stt2 = 1; %>
                                                        <c:forEach items="${outputData}" var="x">
                                                            <tr>
                                                                <th scope="row"><%= stt2 %></th>
                                                                <td>${x.id}</td>
                                                                <td>${x.date}</td>
                                                                <td>${x.date2}</td>
                                                                <td>${x.explain}</td>
                                                                <td>${x.serivce}</td>
                                                                <c:choose>
                                                                    <c:when test='${x.status == 2}'>
                                                                        <td><a class="btn btn-success">Completed</a></td>
                                                                    </c:when>
                                                                    <c:when test='${x.status == 1}'>
                                                                        <td><a class="btn btn-secondary">In progress</a></td>
                                                                    </c:when>
                                                                </c:choose>
                                                                <td><button onClick="reply_click(this.id)" id="<c:out value = "${x.getId()}"/>"><i class="fas fa-edit"></i></button></td>
                                                            </tr>
                                                            <% stt2++; %>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
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
                    <div class="modal fade" id='mymodal'  tabindex="-1" role="dialog"  data-backdrop=="static" data-bs-keyboard="true">
                        <div class="modal-dialog modal-xl" role="document">
                            <div class="modal-content">

                                <div class="modal-header">
                                    <h5 class="modal-title">Detail</h5>
                                </div>
                                <div class="modal-body">
                                    <div id="tabs">
                                        <ul>
                                            <li><a href="#tabs-1">Info</a></li>
                                            <li><a href="#tabs-2">Goods info</a></li>       
                                            <li><a href="#tabs-3" id="addmore">Additional</a></li>     
                                        </ul>
                                        <div id="tabs-1">
                                            <form action='/web/warehouse/DeleteOustput/' method="POST">
                                                <div class="form-group row">
                                                    <label for="idcode" class="col-sm-2 col-form-label">ID</label>
                                                    <div class="col-sm-10">
                                                        <input readonly="" type="text" class="form-control" name="idcode" id="idcode" placeholder="Id">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="Dates" class="col-sm-2 col-form-label">Date</label>
                                                    <div class="col-sm-10">
                                                        <input readonly type="text" class="form-control" name="Dates" id="Dates" placeholder="Date">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="Explain" class="col-sm-2 col-form-label">Explain</label>
                                                    <div class="col-sm-10">
                                                        <input readonly type="text" class="form-control" name="Explain" id="Explain" placeholder="Explain">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="service" class="col-sm-2 col-form-label">service</label>
                                                    <div class="col-sm-10">
                                                        <input readonly type="text" class="form-control" name="service" id="service" placeholder="service">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <div class="col-sm-6">
                                                        <button type="submit" id="deletebtn" class="btn btn-primary">Delete</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                        <div id="tabs-2">
                                            <form action="/web/warehouse/UpdateOutputWarehouse" method="POST">
                                                <table  id="hiddenId">

                                                </table>
                                                <table  id="hiddenId2">

                                                </table>
                                                <span id="slipId"></span>
                                                <span style="color:green;text-align: center" id="message"></span>
                                                <span id="explaintcanbeupdate"></span>
                                                <table class="table" style="overflow-y: hidden">
                                                    <thead>
                                                        <tr>
                                                            <th style="width: 40px;">#</th>
                                                            <th>Name</th>
                                                            <th>Unit</th>
                                                            <th>Export Prices</th>
                                                            <th>Quantity</th>
                                                            <th>Supplier</th>
                                                            <th>Warehouse</th>
                                                            <th>Weight</th>
                                                           <th id="actionmethod">Action</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody id="tbodys">

                                                    </tbody>
                                                </table>
                                                <div class="form-group row">
                                                    <label for="Explain23s" class="col-sm-2 col-form-label">Explain</label>
                                                    <div class="col-sm-10">
                                                        <input type="text" class="form-control" name="Explain23s" id="Explain23s" placeholder="Explain">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <div class="col-sm-10">
                                                        <button type="submit" id="Balances" class="btn btn-primary">Save</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                        <div id="tabs-3">
                                            <span id="slipId2"></span>
                                            <div class="form-row">
                                                <div class="form-group col-md-3">
                                                    <label for="UpGoodssId">Id</label>
                                                    <input onkeydown="Autocomplete()" type="text" class="form-control" id="UpGoodssId" placeholder="Search">
                                                </div>
                                                <div class="form-group col-md-3">
                                                    <label for="UpGoodsName">Name</label>
                                                    <input type="text" class="form-control" readonly="" id="UpGoodsName" placeholder="Good_names">
                                                </div>
                                                <div class="form-group col-md-3">
                                                    <label for="UpUnit">Unit</label>
                                                    <input type="text" class="form-control" id="UpUnit" placeholder="" readonly="">
                                                </div>
                                                <div class="form-group col-md-3">
                                                    <label for="UpQuantity">Quantity</label>
                                                    <input type="number" class="form-control" min="1" id="UpQuantity" placeholder="UpQuantity">
                                                </div>
                                            </div>
                                            <div class="form-row">
                                                <div class="form-group col-md-3">
                                                    <label for="UpWarehouse">Warehouse</label>
                                                    <input readonly  type="text" class="form-control" id="UpWarehouse">
                                                </div>


                                                <div class="form-group col-md-3">
                                                    <label for="UpExportprice">Input price</label>
                                                    <input type="number" class="form-control" id="UpExportprice">
                                                </div>      
                                                <div class="form-group col-md-3">
                                                    <label for="UpGroup">Group</label>
                                                    <input readonly  type="text" class="form-control" id="UpGroup">
                                                </div>
                                                <div class="form-group col-md-3">
                                                    <label for="UpWeight">Weight</label>
                                                    <input type="text" class="form-control" id="UpWeight">
                                                </div>
                                                <div class="form-group col-md-3">
                                                    <label for="UpSupplier">Supplier</label>
                                                    <input readonly type="text" class="form-control" id="UpSupplier">
                                                </div>
                                                <div class="form-group col-md-3">
                                                    <label for="UpWeight"></label>
                                                    <button type="button" onclick="saveNewTranContent()" id="submitbuton" style='margin-top: 32px;' class="btn btn-primary">Add</button>
                                                </div>

                                            </div>
                                        </div>
                                    </div>

                                </div>
                                <div class="modal-footer">
                                    <button type="button"  class="btn btn-secondary" data-dismiss="modal">Close</button>
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
                $(function () {
                    $("#tabs").tabs();
                    $('#message').delay(10000).fadeOut();
                });



                function Autocomplete()
                {
                    var goodsArray = [];
                    $.get("/api/output/goodsCatagory/", function (data, status) {
                        for (var i = 0; i < data.length; i++) {
                            var tempArray = new Array();
                            tempArray["id"] = data[i].goodsName;
                            tempArray["label"] = data[i].goodsId;
                            tempArray["value"] = data[i].goodsId;
                            tempArray["weight"] = data[i].weight;
                            tempArray["unit"] = data[i].unit;
                            tempArray["quantityInStock"] = data[i].quantityInStock;
                            tempArray["group_goods"] = data[i].groupGoods;
                            tempArray["warehouse"] = data[i].warehouse;
                            tempArray['supplier'] = data[i].supplier;
                            tempArray['sellPrice'] = data[i].sellPrice;

                            goodsArray.push(tempArray);
                        }
                        console.log(goodsArray);
                    });
                    $("#UpGoodssId").autocomplete({
                        source: goodsArray,
                        select: function (e, ui) {
                            var e = ui.item;
//                console.log(e.suplier);
                            if (e.quantityInStock <= 0)
                            {
                                alert("This goods have quantity is 0, Please input before you do output")
                                $("#UpGoodsName").val("");
                                $("#UpUnit").val("");
                                $('#UpGroup').val("");
                                $('#UpWarehouse').val("");
                                $('#UpSupplier').val("");
                                $('#UpWeight').val("");
                                $('#UpQuantity').val("")
                            } else
                            {
                                $("#UpGoodsName").val(e.id);
                                $("#UpUnit").val(e.unit);
                                $('#UpGroup').val(e.group_goods);
                                $('#UpWarehouse').val(e.warehouse);
                                $('#UpSupplier').val(e.supplier);
                                $('#UpWeight').val(e.weight);
                                $('#UpQuantity').val(e.quantityInStock)
                                if (e.sellPrice == null)
                                {
                                    $('#UpExportprice').val(1);
                                } else
                                {
                                    $('#UpExportprice').val(e.sellPrice);
                                }

                                $("#UpQuantity").attr({
                                    "max": e.quantityInStock,
                                });
                            }

                        },

                        change: function (e, ui) {
                        }
                    }).autocomplete("instance")._renderItem = function (ul, item) {
                        return $("<li>")
                                .append("<div>" + "Name: " + item.id + " " + "WH:" + item.warehouse + "" + " - " + item.quantityInStock + "<br>" + "ID: " + item.value + "</div>")
                                .appendTo(ul);
                    };
                }
                function addNewcontent(id)
                {
                    stt = 0;
                    $('#tbodys').empty();
                    var stt23 = 1;

                    $.get("/api/output/GetItemOut/" + id, function (data2, status) {
                        console.log(data2)
                        for (var i = 0; i < data2.length; i++) {
                            if (data2[i].status == true)
                            {
                                $("#Balances").prop("disabled", true);
                                $("#Balances").text("Changed");
                            }
                            var rowsds = $('<tr>');
                            rowsds.append('<td>' + stt23 + '</td>');
                            rowsds.append('<td>' + data2[i].goodsName + '</td>');
                            rowsds.append('<td>' + data2[i].unit + '</td>');
                            rowsds.append('<td>' + data2[i].exportsPrices + '</td>');
                            rowsds.append('<td style="text-align: center;width: 30%;">' + "<a onClick='UpdateQuantity(this.id)' style='cursor:pointer;' id='" + data2[i].id + "' class='btn click" + stt + "'><i class='fas fa-plus'></i></a>" + "<input style='width: 30%;' min=1 type='number' id='quantity" + data2[i].id + "' class='quanttoys'  name='quantity' value='" + data2[i].quantity + "'/>" + "<a onClick='UpdateMinusQuantity(this.id)' style='cursor:pointer;' id='" + data2[i].id + "' class='btn click1" + stt + "'><i class='fas fa-minus'></i></a>" + '</td>');
                            rowsds.append('<td>' + data2[i].quantity + '</td>');
                            rowsds.append('<td>' + data2[i].supplier + '</td>');
                            rowsds.append('<td>' + data2[i].warehouse + '</td>');
                            rowsds.append('<td>' + data2[i].weight + '</td>');
                            rowsds.append('<td id="actionmethod2' + stt + '">' + "<span onClick='UpdateToData(this.id)' id='" + data2[i].id + "' ><i style='cursor:pointer' class='fas fa-edit'></i></span>" + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<span  class='" + data2[i].id + "' id='remove" + stt + "' onClick='RemoveData(this)' ><i  style='cursor:pointer' class='fas fa-trash'></i></span>" + '</td>');
                            rowsds.append('</tr>');
                            $('#tbodys').append(rowsds);
                            stt23++;
                            stt++;
                            var rowsds2 = $('<tr>');
                            rowsds2.append('<td>' + "<input type='hidden' id='idenentity'  name='idenentity' value='" + data2[i].id + "'/>" + '</td>');
                            rowsds2.append('<td>' + "<input type='hidden' id='reference'  name='reference' value='" + data2[i].reference + "'/>" + '</td>');
                            rowsds2.append('</tr>');
                            $('#hiddenId').append(rowsds2);

                        }

                    });
                    //
                    //Object[i]
                    //
                    $.get("/api/output/findOutptData/" + id, function (data, status) {
                        $('#idcode').val("" + data.id + "");
                        $('#Dates').val("" + data.date + "");
                        $('#Explain').val("" + data.explain + "");
                        $('#service').val("" + data.serivce + "");
//                        console.log(data);
                        if (data.status == 2)
                        {
                            $('#addmore').remove();
                            $('#actionmethod').remove();
                            $('#deletebtn').text("Completed");
                            $('#Balances').text("Changed");
                            $('#Balances').prop("disabled", true);
                            $("#deletebtn").prop("disabled", true);
                            $(".quanttoys").prop("disabled", true);
                            for (var i = 0; i < stt; i++) {
                                $('#actionmethod2' + i).remove();
                                $('.click' + i).remove();
                                $('.click1' + i).remove();
                            }
//                            $("#Completed").prop("disabled", true);
                        } else
                        {
                            $('#deletebtn').text("Cancle");
                        }
                        var datainput = "<input type='hidden' name='slipI232d' id='slipI232d' value='" + data.id + "'/>"

//                        console.log(datainput);
                        $('#slipId').append(datainput);
                    });

                }


                function saveNewTranContent() {
                    var UpGoodssId = $('#UpGoodssId').val();
                    var UpGoodsName = $('#UpGoodsName').val();
                    var UpQuantity = $('#UpQuantity').val();
                    var UpUnit = $('#UpUnit').val();
                    var UpWarehouse = $('#UpWarehouse').val();
                    var UpExportprice = $('#UpExportprice').val();
                    var UpGroup = $('#UpGroup').val();
                    var UpWeight = $('#UpWeight').val();
                    var UpSupplier = $('#UpSupplier').val();
                    var codeis22 = $('#slipI232d').val();
                    console.log(codeis22);
                    if (UpGoodsName == "" || UpUnit == "")
                    {
                        alert("Please field correct value");
                        var UpGoodssId = $('#UpGoodssId').val("");
                        var UpGoodsName = $('#UpGoodsName').val("");
                        var UpQuantity = $('#UpQuantity').val("");
                        var UpUnit = $('#UpUnit').val("");
                        var UpWarehouse = $('#UpWarehouse').val("");
                        var UpExportprice = $('#UpExportprice').val("");
                        var UpGroup = $('#UpGroup').val("");
                        var UpWeight = $('#UpWeight').val("");
                        var UpSupplier = $('#UpSupplier').val("");
                    } else
                    {
                        $.post("/api/output/SaveNewoutputContent/", {
                            UpGoodssId: UpGoodssId,
                            UpGoodsName: UpGoodsName,
                            UpQuantity: UpQuantity,
                            UpUnit: UpUnit,
                            UpWarehouse: UpWarehouse,
                            UpExportprice: UpExportprice,
                            UpGroup: UpGroup,
                            UpWeight: UpWeight,
                            UpSupplier: UpSupplier,
                            codeis22: codeis22
                        }, function (data2) {
                            if (data2 == null)
                            {
                                alert("your goods is already have in table, Please enter other");
                                var UpGoodssId = $('#UpGoodssId').val("");
                                var UpGoodsName = $('#UpGoodsName').val("");
                                var UpQuantity = $('#UpQuantity').val("");
                                var UpUnit = $('#UpUnit').val("");
                                var UpWarehouse = $('#UpWarehouse').val("");
                                var UpExportprice = $('#UpExportprice').val("");
                                var UpGroup = $('#UpGroup').val("");
                                var UpWeight = $('#UpWeight').val("");
                                var UpSupplier = $('#UpSupplier').val("");
                                addNewcontent(codeis22);
                            } else
                            {
                                var UpGoodssId = $('#UpGoodssId').val("");
                                var UpGoodsName = $('#UpGoodsName').val("");
                                var UpQuantity = $('#UpQuantity').val("");
                                var UpUnit = $('#UpUnit').val("");
                                var UpWarehouse = $('#UpWarehouse').val("");
                                var UpExportprice = $('#UpExportprice').val("");
                                var UpGroup = $('#UpGroup').val("");
                                var UpWeight = $('#UpWeight').val("");
                                var UpSupplier = $('#UpSupplier').val("");
                                addNewcontent(codeis22);
                            }
                        });
                    }
                    ;

                }
                ;
                function UpdateQuantity(id)
                {

                    counter = 0;
                    var quanttity = 0;
                    let defaultquantity = $("#quantity" + id + "").val();
                    let index = ++defaultquantity;
                    $("#quantity" + id + "").val("" + index + "");
                }

                function UpdateMinusQuantity(id)
                {

                    counter = 0;
                    var quanttity = 0;
                    let defaultquantity = $("#quantity" + id + "").val();
                    let index = --defaultquantity;
                    $("#quantity" + id + "").val("" + index + "");
                }

                function UpdateToData(id)
                {
                    let defaultquantity = $("#quantity" + id + "").val();
                    $.post("/api/output/UpdatePlusQuantity/", {id: id, qty: defaultquantity}, function (result) {
                        $("#message").css("color", "green");
                        $('#message').text("Update Sucess");
                        $('#message').fadeIn();
                        $('#message').delay(900).fadeOut();
                    }).fail(function () {
                        $("#message").css("color", "red");
                        $('#message').text("Errorr");
                        $('#message').fadeIn();
                        $('#message').delay(900).fadeOut();
                    });
                }
//                onClick='RemoveData(this.class)'
                function RemoveData(dataclass)
                {
                    var colClass = dataclass.className
                    var colId = dataclass.getAttribute('id');
//                    console.log(colClass);
//                    console.log(colId);
                    var mateches = colId.trim().match(/(\d+)/);
                    if (mateches[0] == 0)
                    {
                        alert("Cannot delete last goods");
                    } else
                    {
                        document.getElementById("tbodys").deleteRow(mateches[0]);

                        $.post("/api/output/DeleteBy/", {id: colClass}, function (result) {
                            $("#message").css("color", "green");
                            $('#message').text("Delete Sucess");
                            $('#message').fadeIn();
                            $('#message').delay(900).fadeOut();
                        }).fail(function () {
                            $("#message").css("color", "red");
                            $('#message').text("Errorr");
                            $('#message').fadeIn();
                            $('#message').delay(900).fadeOut();
                        });
                    }
                }





                function reply_click(id) {
                    stt = 0;
                    $('#tbodys').empty();
                    var stt23 = 1;

                    $.get("/api/output/GetItemOut/" + id, function (data2, status) {
                        console.log(data2)
                        for (var i = 0; i < data2.length; i++) {
                            if (data2[i].status == true)
                            {
                                $("#Balances").prop("disabled", true);
                                $("#Balances").text("Changed");
                            }
                            var rowsds = $('<tr>');
                            rowsds.append('<td>' + stt23 + '</td>');
                            rowsds.append('<td>' + data2[i].goodsName + '</td>');
                            rowsds.append('<td>' + data2[i].unit + '</td>');
                            rowsds.append('<td>' + data2[i].exportsPrices + '</td>');
                            rowsds.append('<td style="text-align: center;width: 30%;">' + "<a onClick='UpdateQuantity(this.id)' style='cursor:pointer;' id='" + data2[i].id + "' class='btn click" + stt + "'><i class='fas fa-plus'></i></a>" + "<input style='width: 30%;' type='number' min=1 id='quantity" + data2[i].id + "' class='quanttoys'  name='quantity' value='" + data2[i].quantity + "'/>" + "<a onClick='UpdateMinusQuantity(this.id)' style='cursor:pointer;' id='" + data2[i].id + "' class='btn click1" + stt + "'><i class='fas fa-minus'></i></a>" + '</td>');
                            rowsds.append('<td>' + data2[i].supplier + '</td>');
                            rowsds.append('<td>' + data2[i].warehouse + '</td>');
                            rowsds.append('<td>' + data2[i].weight + '</td>');
                            rowsds.append('<td id="actionmethod2' + stt + '">' + "<span onClick='UpdateToData(this.id)' id='" + data2[i].id + "' ><i style='cursor:pointer' class='fas fa-edit'></i></span>" + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<span  class='" + data2[i].id + "' id='remove" + stt + "' onClick='RemoveData(this)' ><i  style='cursor:pointer' class='fas fa-trash'></i></span>" + '</td>');
                            rowsds.append('</tr>');
                            $('#tbodys').append(rowsds);
                            stt23++;
                            stt++;
                            var rowsds2 = $('<tr>');
                            rowsds2.append('<td>' + "<input type='hidden' id='idenentity'  name='idenentity' value='" + data2[i].id + "'/>" + '</td>');
                            rowsds2.append('<td>' + "<input type='hidden' id='reference'  name='reference' value='" + data2[i].reference + "'/>" + '</td>');
                            rowsds2.append('</tr>');
                            $('#hiddenId').append(rowsds2);

                        }

                    });
                    //
                    //Object[i]
                    //
                    $.get("/api/output/findOutptData/" + id, function (data, status) {
                        $('#idcode').val("" + data.id + "");
                        $('#Dates').val("" + data.date + "");
                        $('#Explain').val("" + data.explain + "");
                        $('#service').val("" + data.serivce + "");
//                        console.log(data);
                        if (data.status == 2)
                        {
                            $('#addmore').remove();
                            $('#actionmethod').remove();
                            $('#deletebtn').text("Completed");
                            $('#Balances').text("Changed");
                            $('#Balances').prop("disabled", true);
                            $("#deletebtn").prop("disabled", true);
                            $(".quanttoys").prop("disabled", true);
                            for (var i = 0; i < stt; i++) {
                                $('#actionmethod2' + i).remove();
                                $('.click' + i).remove();
                                $('.click1' + i).remove();
                            }
//                            $("#Completed").prop("disabled", true);
                        } else
                        {
                            $('#deletebtn').text("Cancle");
                        }
                        var datainput = "<input id='slipI232d' type='hidden' name='slipI232d' value='" + data.id + "'/>"
//                        console.log(datainput);
                        $('#slipId').append(datainput);
                    });


                    $('#mymodal').modal('show');
                }
            </script>

            <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js" crossorigin="anonymous"></script>
            <script src="https://cdn.datatables.net/buttons/1.7.1/js/dataTables.buttons.min.js" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js" crossorigin="anonymous"></script>
            <script src=" https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js" crossorigin="anonymous"></script>
            <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.html5.min.js" crossorigin="anonymous"></script>
            <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.print.min.js" crossorigin="anonymous"></script>
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
