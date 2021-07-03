<%-- 
    Document   : index
    Created on : Jun 16, 2021, 12:44:44 AM
    Author     : trung
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Layout</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
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

        <script>window.jQuery || document.write(decodeURIComponent('%3Cscript src="js/jquery.min.js"%3E%3C/script%3E'))</script>
        <link rel="stylesheet" type="text/css" href="https://cdn3.devexpress.com/jslib/21.1.4/css/dx.common.css" />
        <link rel="stylesheet" type="text/css" href="https://cdn3.devexpress.com/jslib/21.1.4/css/dx.light.css" />
        <script src="https://cdn3.devexpress.com/jslib/21.1.4/js/dx.all.js"></script>
        <script src="https://kit.fontawesome.com/cca0c56933.js" crossorigin="anonymous"></script>
        <script src="//cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <link href="//cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css" ref="stylesheet"/>
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
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h3>View goods inventory</h3>
                            </div><!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                                    <li class="breadcrumb-item active"><a href="#">Warehouse</a></li>
                                    <li class="breadcrumb-item active"><a href="#">Check Stock</a></li>
                                </ol>
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

                <!-- Main content -->
                <section class="content">
                    <div class="container">
                        <!-- Small boxes (Stat box) -->
                        <div id="exTab1" class="container">
                            <div class="row">
                                <div class="col-lg-12 col-md-3">
                                    <ul class="nav nav-pills" style="margin-bottom: 10px;">
                                        <li class="active " style="margin-right: 15px;">
                                            <a href="#1a" class="btn btn-info" data-toggle="tab">Inventory</a>
                                        </li>
                                        <li style="margin-right: 15px;"><a href="#2a" class="btn btn-secondary" data-toggle="tab">Chart</a>
                                        </li>
                                        <li style="margin-right: 15px;"><a href="#3a" class="btn btn-secondary" data-toggle="tab">Applying clearfix</a>
                                        </li>
                                    </ul>
                                    <div class="tab-content clearfix">
                                        <div class="tab-pane active" id="1a">
                                            <table id="myTable" class="table">
                                                <thead class="thead-light" id="tableheade">
                                                    <tr>
                                                        <th scope="col">#</th>
                                                        <th scope="col">ID</th>
                                                        <th scope="col">Name</th>
                                                        <th scope="col">Quantity</th>
                                                        <th scope="col">Price</th>
<!--                                                        <th scope="col">Supplier</th>-->
                                                        <th scope="col">Group</th>
                                                        <th scope="col">Weight</th>
                                                        <th scope="col">Warehouse</th>
                                                        <th scope="col">Action</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <% int stt = 1; %>
                                                    <c:forEach items="${datalist}" var="x">
                                                        <tr>
                                                            <th scope="row"><%= stt %></th>
                                                            <td>${x.goodsId}</td>
                                                            <td>${x.goodsName}</td>
                                                            <td>${x.quantityInStock}</td>
                                                            <td>${x.priceInStock}</td>
                                                            <!--<td>${x.supplier}</td>-->
                                                            <td>${x.groupGoods}</td>
                                                            <td>${x.weight}</td>
                                                            <td>${x.stockCard}</td>
                                                            <!--data-toggle="modal" data-target="#modalkho"-->
                                                            <td><button id="${x.goodsId}" class="${x.stockCard} GetId"  >    
                                                                    Looking
                                                                </button></td>
                                                        </tr>
                                                        <% stt++; %>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="tab-pane" id="2a">
                                            <div id="chartContainer" style="height: 370px; width: 100%;"></div>
                                            <br>
                                            <div class="container" style="margin-top: 15px;">
                                                <div class="row">
                                                    <div class="col-md-3 col-lg-4">
                                                        <div class="card-counter success">
                                                            <i class="far fa-money-bill-alt"></i>
                                                            <span class="count-numbers" id="priceStock">0</span>
                                                            <span class="count-name">Price in stock</span>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-3 col-lg-4">
                                                        <div class="card-counter info">
                                                            <i class="fas fa-cubes"></i>
                                                            <span class="count-numbers" id="quantity">0</span>
                                                            <span class="count-name">All stock exits </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane" id="3a">
                                            <h3>We applied clearfix to the tab-content to rid of the gap between the tab and the content</h3>
                                        </div>
                                        <div class="tab-pane" id="4a">
                                            <h3>We use css to change the background color of the content to be equal to the tab</h3>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="modalkho" class="modal fade" data-backdrop="static" data-keyboard="false" tabindex="-1" role="dialog">
                            <div class="modal-dialog modal-xl " role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title">Check the import and export status of goods</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        <table id="myTable" class="table">
                                            <thead class="thead-light">
                                                <tr>
                                                    <th scope="col">#</th>
                                                    <th scope="col">Name</th>
                                                    <th scope="col">Quantity</th>
                                                    <th scope="col">Date</th>
                                                    <th scope="col">Major</th>
                                                    <th scope="col">warehouse</th>
                                                    <th scope="col">Price</th>
                                                </tr>
                                            </thead>
                                            <tbody id="historyId">

                                            </tbody>
                                        </table>
                                        <div class="modal-footer">
                                            <button type="button" onclick="preventClicl()" class="btn btn-secondary" >Close</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.row -->
                        <!-- Main row -->

                        <!-- /.row (main row) -->
                    </div><!-- /.container-fluid -->
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
                $(document).ready(function () {
                    $('#myTable').DataTable();
                    var today = new Date();
                    var dd = String(today.getDate()).padStart(2, '0');
                    var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
                    var yyyy = today.getFullYear();

                    today = mm + '/' + dd + '/' + yyyy;
                    //                document.write(today);
                    var array = new Array();
                    var quantity = [];
                    const person = null;
                    var toSum = new Array();
                <c:forEach items="${Namelist}" var="x">
                    var temparray = new Array();
                    var object = new Object();
                    object = {y: ${x.quantity}, label: "${x.goodsName}"};
                    array.push(object);
                </c:forEach>
                    let sumquantity = 0;
                    let sumPrice = 0;
                <c:forEach items="${ListQuantity}" var="x">
                    sumquantity += ${x.quantityInStock};
                    sumPrice += ${x.priceInStock};
                </c:forEach>
                    console.log(sumquantity);
                    function formatNumber(num) {
                        return num.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1,')
                    }

                    document.getElementById("priceStock").innerHTML = formatNumber(sumPrice);
                    document.getElementById("quantity").innerHTML = formatNumber(sumquantity);
                    //                function myFunc(total, num) {
                    //
                    //                    return (total + num);
                    //                }

                    window.onload = function () {
                        var options = {
                            exportEnabled: true,
                            animationEnabled: true,
                            title: {
                                text: "Top 10 most stocked in all warehouse"
                            },
                            subtitles: [{
                                    text: "As  " + today + ""
                                }],
                            animationEnabled: true,
                            data: [{
                                    type: "pie",
                                    startAngle: 40,
                                    toolTipContent: "<b>{label}</b>: {y} exist",
                                    showInLegend: "true",
                                    legendText: "{label}",
                                    indexLabelFontSize: 16,
                                    indexLabel: "{label} - {y} exist",
                                    dataPoints: array
                                }]
                        };
                        $("#chartContainer").CanvasJSChart(options);

                    }
                });
                $(".GetId").click(function () {
                    var warehouse = $(this).attr("class");
                    var id = $(this).attr("id");
                    var newString = warehouse.replace('GetId', '');
                    $('#modalkho').modal('show')
                    var groupList = [];
                    var stt = 1;
                    console.log("/api/stock/getId/" + id + "&" + newString + "")
                    $.get("/api/stock/getId/" + id + "&" + newString + "", function (data, status) {
                        for (var i = 0; i < data.length; i++) {
                            var rowsds = $('<tr>');
                            rowsds.append('<td>' + stt + '</td>');
                            rowsds.append('<td>' + data[i].goodsName + '</td>');
                            rowsds.append('<td>' + data[i].quantity + '</td>');
                            rowsds.append('<td>' + data[i].date + '</td>');
                            rowsds.append('<td>' + data[i].major + '</td>');
                            rowsds.append('<td>' + data[i].warehouse + ' </td>');
                            rowsds.append('<td>' + data[i].price + ' </td>');
                            rowsds.append('</tr>');
                            $('#historyId').append(rowsds);
                            stt++;
                        }
//                    console.log(SupplierIDS);

                    });
                });
                function preventClicl()
                {
                    $("#historyId").empty();
                    $('#modalkho').modal('hide')
                }
            </script>
            <script src="https://code.jquery.com/jquery-3.5.1.js" crossorigin="anonymous"></script>
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
