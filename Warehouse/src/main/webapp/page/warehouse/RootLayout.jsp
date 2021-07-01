<%-- 
    Document   : index
    Created on : Jun 16, 2021, 12:44:44 AM
    Author     : trung
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en>
      <head>
      <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Layout</title>
    <script src="https://code.highcharts.com/highcharts.js"></script>
    <script src="https://code.highcharts.com/modules/exporting.js"></script>
    <script src="https://code.highcharts.com/modules/export-data.js"></script>
    <script src="https://code.highcharts.com/modules/accessibility.js"></script>
    <!-- Google Font: Source Sans Pro -->
    <style>
        .highcharts-figure, .highcharts-data-table table {
            min-width: 320px; 
            max-width: 800px;
            margin: 1em auto;
        }

        .highcharts-data-table table {
            font-family: Verdana, sans-serif;
            border-collapse: collapse;
            border: 1px solid #EBEBEB;
            margin: 10px auto;
            text-align: center;
            width: 100%;
            max-width: 500px;
        }
        .highcharts-data-table caption {
            padding: 1em 0;
            font-size: 1.2em;
            color: #555;
        }
        .highcharts-data-table th {
            font-weight: 600;
            padding: 0.5em;
        }
        .highcharts-data-table td, .highcharts-data-table th, .highcharts-data-table caption {
            padding: 0.5em;
        }
        .highcharts-data-table thead tr, .highcharts-data-table tr:nth-child(even) {
            background: #f8f8f8;
        }
        .highcharts-data-table tr:hover {
            background: #f1f7ff;
        }


        input[type="number"] {
            min-width: 50px;
        }
    </style>
    <%--<jsp:include page="/fragment/RootCss.jsp" />--%>  
    <%@ include file="/page/fragment/RootCss.jsp" %>
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
                       <figure class="highcharts-figure">
                            <div id="container"></div>
                            <p class="highcharts-description">
                                Pie charts are very popular for showing a compact overview of a
                                composition or comparison. While they can be harder to read than
                                column charts, they remain a popular choice for small datasets.
                            </p>
                        </figure>
                        <!-- ./col -->
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
        <script>
            Highcharts.chart('container', {
                chart: {
                    plotBackgroundColor: null,
                    plotBorderWidth: null,
                    plotShadow: false,
                    type: 'pie'
                },
                title: {
                    text: 'Browser market shares in January, 2018'
                },
                tooltip: {
                    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                },
                accessibility: {
                    point: {
                        valueSuffix: '%'
                    }
                },
                plotOptions: {
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        dataLabels: {
                            enabled: true,
                            format: '<b>{point.name}</b>: {point.percentage:.1f} %'
                        }
                    }
                },
                series: [{
                        name: 'Brands',
                        colorByPoint: true,
                        data: [{
                                name: 'Chrome',
                                y: 61.41,
                                sliced: true,
                                selected: true
                            }, {
                                name: 'Internet Explorer',
                                y: 11.84
                            }, {
                                name: 'Firefox',
                                y: 10.85
                            }, {
                                name: 'Edge',
                                y: 4.67
                            }, {
                                name: 'Safari',
                                y: 4.18
                            }, {
                                name: 'Sogou Explorer',
                                y: 1.64
                            }, {
                                name: 'Opera',
                                y: 1.6
                            }, {
                                name: 'QQ',
                                y: 1.2
                            }, {
                                name: 'Other',
                                y: 2.61
                            }]
                    }]
            });
        </script>
        <!-- Control Sidebar -->
        <aside class="control-sidebar control-sidebar-dark">
            <!-- Control sidebar content goes here -->
        </aside>
        <%--<jsp:include page="/fragment/RootJs.jsp" />--%>  
        <%@ include file="/page/fragment/RootJs.jsp" %>
        <!-- /.control-sidebar -->
    </div>
    <!-- ./wrapper -->

</html>
