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

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>window.jQuery || document.write(decodeURIComponent('%3Cscript src="js/jquery.min.js"%3E%3C/script%3E'))</script>
        <link rel="stylesheet" type="text/css" href="https://cdn3.devexpress.com/jslib/21.1.4/css/dx.common.css" />
        <link rel="stylesheet" type="text/css" href="https://cdn3.devexpress.com/jslib/21.1.4/css/dx.light.css" />
        <script src="https://cdn3.devexpress.com/jslib/21.1.4/js/dx.all.js"></script>
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
        <!-- Google Font: Source Sans Pro -->
        <style>

        </style>
    </head>
    <body class="hold-transition sidebar-mini layout-fixed">
        <div class="wrapper">

            <!-- Preloader -->
            <div class="preloader flex-column justify-content-center align-items-center">
                <img class="animation__shake" src="<c:url value='/resources/dist/img/AdminLTELogo.pn'/>" alt="AdminLTELogo" height="60" width="60">
            </div>

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
            </style>
            <script>
            $(function () {
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
                object = {y: ${x.quantityInStock}, label: "${x.goodsName}", warehouse: "${x.stockCard}"};
                toSum.push(${x.quantityInStock})
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
                            text: "Top 5 most stocked goods"
                        },
                        subtitles: [{
                                text: "As  " + today + ""
                            }],
                        animationEnabled: true,
                        data: [{
                                type: "pie",
                                startAngle: 40,
                                toolTipContent: "<b>{label}</b>: {y} exist in {warehouse} ",
                                showInLegend: "true",
                                legendText: "{label} : {warehouse}",
                                indexLabelFontSize: 16,
                                indexLabel: "{label} - {y} exist",
                                dataPoints: array
                            }]
                    };
                    $("#chartContainer").CanvasJSChart(options);

                }
            });
            </script>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0">Tổng quan</h1>
                            </div><!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
                                    <li class="breadcrumb-item active"><a href="#">kho Hàng</a></li>
                                    <li class="breadcrumb-item active"><a href="#">Nhập kho</a></li>
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
                        <div class="row">
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
