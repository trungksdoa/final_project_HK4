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
                    $("#inputmyidsearch").on("keyup", function () {
                        var value = $(this).val().toLowerCase();
                        $("#mybodys tr").filter(function () {
                            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                        });
                    });
                    $("#searhbox").on("keyup", function () {
                        var value312512 = $(this).val().toLowerCase();
                        $("#mysdsa tr").filter(function () {
                            $(this).toggle($(this).text().toLowerCase().indexOf(value312512) > -1)
                        });
                    });

                });
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
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                                    <li class="breadcrumb-item "><a href="/web/warehouse/page1">Warehouse</a></li>
                                    <li class="breadcrumb-item active" >Inventory</li>
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
                                                <a class="nav-link active" id="custom-tabs-three-home-tab" data-toggle="pill"
                                                   href="#custom-tabs-three-home" role="tab" aria-controls="custom-tabs-three-home"
                                                   aria-selected="true"><b>Inventory</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link"
                                                   href="/web/warehouse/page2"><b>Tracking</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link"
                                                   href="/web/warehouse/welcome"><b>Tracking stock</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link"  href="/web/warehouse/page4" ><b>Tracking Stock List</b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">
                                        <div class="tab-content" id="custom-tabs-three-tabContent">
                                            <div class="tab-pane fade show active" id="custom-tabs-three-home" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-home-tab">
                                                <div id="tabs">
                                                    <ul>
                                                        <li><a href="#tabs-1">1</a></li>
                                                        <li><a href="#tabs-2">2</a></li>
                                                    </ul>
                                                    <div id="tabs-1">
                                                        <input id="inputmyidsearch" type="text" placeholder="Search..">
                                                        <table id="myTable"  class="table table-bordered">
                                                            <thead class="thead-light" id="tableheade">
                                                                <tr>
                                                                    <th scope="col">#</th>
                                                                    <th scope="col">ID</th>
                                                                    <th scope="col">Name</th>
                                                                    <th scope="col">Quantity</th>
                                                                    <th scope="col">Input price</th>
                                                                    <th scope="col">Price</th>
                                                                    <th scope="col">Sell Price</th>
                                                                    <th scope="col">Group</th>
                                                                    <th scope="col">Weight</th>
                                                                    <th scope="col">Warehouse</th>
                                                                    <!--<th scope="col">Action</th>-->
                                                                </tr>
                                                            </thead>
                                                            <tbody id='mybodys'>
                                                                <tr>
                                                                    <th style="text-align: center;" colspan="3">Total</th>
                                                                    <th>${sumquantity}</th>
                                                                    <th></th>
                                                                    <th>
                                                                        ${SumPrice}
                                                                    </th>
                                                                </tr>
                                                                <% int stt = 1; %>
                                                                <c:forEach items="${datalist}" var="x">
                                                                    <tr>
                                                                        <th scope="row"><%= stt %></th>
                                                                        <td>${x.goodsId}</td>
                                                                        <td>${x.goodsName}</td>
                                                                        <td>${x.quantityInStock}</td>
                                                                        <td>${x.importPrice}</td>
                                                                        <td>
                                                                            ${x.priceInStock}
                                                                        </td>
                                                                        <td>${x.sellPrice}</td>
                                                                        <td>${x.groupGoods}</td>
                                                                        <td>${x.weight}</td>
                                                                        <td>${x.stockCard}</td>
                                                                    </tr>
                                                                    <% stt++; %>
                                                                </c:forEach>
                                                            </tbody>
                                                        </table>                                              
                                                    </div>
                                                    <div id="tabs-2">
                                                        <input id="searhbox" type="text" placeholder="Search..">
                                                        <button style='float: right;
                                                                width: 20%;'  type="button" id="prisdnthis" class="btn btn-block bg-gradient-info "><i class="fas fa-print"></i>Print</button>
                                                        <table id='printthis'   class="table table-bordered">
                                                            <thead class="thead-light" id="tableheade">
                                                                <tr>
                                                                    <th scope="col">#</th>
                                                                    <th scope="col">Name</th>
                                                                    <th scope="col">Unit</th>
                                                                    <th scope="col">Quantity</th>
                                                                    <th scope="col">Price</th>
                                                                    <!--<th scope="col">Action</th>-->
                                                                </tr>
                                                            </thead>
                                                            <tbody id='mysdsa'>
                                                                <% int stt421 = 1; %>
                                                                <c:forEach items="${grdataList}" var="xx">
                                                                    <tr>
                                                                        <th scope="row"><%= stt421 %></th>
                                                                        <td><c:out value = "${xx.getName()}"/></td>
                                                                        <td><c:out value = "${xx.getUnit()}"/></td>
                                                                        <td><c:out value = "${xx.getQuantity()}"/></td>
                                                                        <td>
                                                                            <c:out value = "${xx.getPrice()}"/>
                                                                        </td>
                                                                    </tr>
                                                                    <% stt421++; %>
                                                                </c:forEach>
                                                            </tbody>
                                                        </table>                                                         
                                                    </div>
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
                </section>
                <!-- /.content -->
                <div id="modalkho" class="modal fade" data-backdrop="static" data-keyboard="false" tabindex="-1" role="dialog">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="NameGoods"></h5>
                            </div>
                            <div class="modal-body">
                                <div id="chartContainer" style="height: 370px; width: 100%;"></div>
                                <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
                                <div class="modal-footer">
                                    <button type="button" onclick="preventClicl()" class="btn btn-secondary" >Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            /.content 
        </div>-->
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
            $("#tabs").tabs({

            });
            $("#prisdnthis").click(function () {
                $('#printModa').modal('show')
            })
            function preventClicl()
            {
                $("#historyId").empty();
                $('#modalkho').modal('hide')
            }
            $("#prisdnthis").click(function () {
                var d = new Date();

                var month = d.getMonth() + 1;
                var day = d.getDate();

                var output = d.getFullYear() + '/' +
                        (month < 10 ? '0' : '') + month + '/' +
                        (day < 10 ? '0' : '') + day;
                $('#printthis').printThis({
                    importCSS: false,
                    loadCSS: "https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css",
                    header: "Report date:" + output
                });
            });
        </script>
        <script src="<c:url value="/resources/js/input/printThis.js" />"></script>  
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
