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
                                    <li class="breadcrumb-item "><a href="/web/warehouse/InputsipData">Input</a></li>
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
                                                   href="/web/warehouse/input"><b>Create Input</b></a>
                                            </li>
                                            <li class="nav-item " id="custom-tabs-three-home-tab" data-toggle="pill" aria-selected="true"  role="tab" aria-controls="custom-tabs-three-home">
                                                <a class="nav-link active"
                                                   href="#custom-tabs-three-home"><b>Input</b></a>
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
                                                            <th scope="col">Expaln</th>
                                                            <th scope="col">Service</th>
                                                            <th scope="col">Status</th>
                                                            <th scope="col">Action</th>

                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% int stt2 = 1; %>
                                                        <c:forEach items="${InputsipData}" var="x">
                                                            <tr>
                                                                <th scope="row"><%= stt2 %></th>
                                                                <td>${x.id}</td>
                                                                <td>${x.date}</td>
                                                                <td>${x.explain}</td>
                                                                <td>${x.service}</td>
                                                                <td><a href="/web/warehouse/Updates/${x.id}" id="Completed" class="btn  ${x.status}">${x.status}</a></td>
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

                                        </ul>
                                        <div id="tabs-1">
                                            <form action='/web/warehouse/Updates/' method="POST">
                                                <div class="form-group row">
                                                    <label for="idcode" class="col-sm-2 col-form-label">ID</label>
                                                    <div class="col-sm-10">
                                                        <input readonly="" type="text" class="form-control" name="idcode" id="idcode" placeholder="Id">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="Date" class="col-sm-2 col-form-label">Date</label>
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
                                                    <label for="Explain" class="col-sm-2 col-form-label">service</label>
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
                                            <form action="#" method="POST">
                                                <table class="table" style="overflow-y: hidden">
                                                    <thead>
                                                        <tr>
                                                            <th style="width: 40px;">#</th>
                                                            <th>Name</th>
                                                            <th>Unit</th>
                                                            <th>Imports Prices</th>
                                                            <th>Quantity</th>
                                                            <th>Supplier</th>
                                                            <th>Warehouse</th>
                                                            <th>Weight</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody id="tbodys">

                                                    </tbody>
                                                </table>
                                            </form>
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
                function reply_click(id) {
                    $('#tbodys').empty();
                    $.get("/api/input/findInputData/" + id, function (data, status) {
                        $('#idcode').val("" + data.id + "");
                        $('#Dates').val("" + data.date + "");
                        $('#Explain').val("" + data.explain + "");
                        $('#service').val("" + data.service + "");
//                        console.log(data);
                        if (data.status == "Completed")
                        {
                            $('#deletebtn').text("Completed");
                            $("#deletebtn").prop("disabled", true);
//                            $("#Completed").prop("disabled", true);
                        } else
                        {
                            $('#deletebtn').text("Cancle");
                        }
                    });

                    var stt23 = 1;

                    $.get("/api/input/GetItemInput/" + id, function (data2, status) {
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
                            rowsds.append('<td>' + data2[i].importsPrices + '</td>');
                            rowsds.append('<td>' + data2[i].quantity + '</td>');
                            rowsds.append('<td>' + data2[i].supplier + '</td>');
                            rowsds.append('<td>' + data2[i].warehouse + '</td>');
                            rowsds.append('<td>' + data2[i].weight + '</td>');
                            rowsds.append('</tr>');
                            $('#tbodys').append(rowsds);
                            stt23++;
                        }

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
