<%-- 
    Document   : index
    Created on : Jun 16, 2021, 12:44:44 AM
    Author     : trung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AdminLTE 3 | DataTables</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet"
              href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="/page/static/plugins/fontawesome-free/css/all.min.css">
        <!-- DataTables -->
        <link rel="stylesheet" href="/page/static/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="/page/static/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
        <link rel="stylesheet" href="/page/static/plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="/page/static/dist/css/adminlte.min.css">

        <style>
            .my-custom-scrollbar {
                position: relative;
                height: 200px;
                overflow: auto;
            }
            .table-wrapper-scroll-y {
                display: block;
            }
        </style>
    </head>

    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
            <!-- Navbar -->
            <!-- Navbar -->
            <nav class="main-header navbar navbar-expand navbar-white navbar-light">
                <!-- Left navbar links -->
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
                    </li>
                </ul>

                <!-- Right navbar links -->
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" data-widget="fullscreen" href="#" role="button">
                            <i class="fas fa-expand-arrows-alt"></i>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#" role="button">
                            <i class="fas fa-th-large"></i>
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- /.navbar -->

            <!-- Main Sidebar Container -->
            <aside class="main-sidebar sidebar-dark-primary elevation-4">
                <!-- Brand Logo -->
                <a href="index3.html" class="brand-link">
                    <img src="/page/static/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                         style="opacity: .8">
                    <span class="brand-text font-weight-light">Quản Lý Kho Hàng</span>
                </a>

                <!-- Sidebar -->
                <div class="sidebar">
                    <!-- Sidebar user panel (optional) -->
                    <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                        <div class="image">
                            <img src="/page/static/dist/img/4.jpg" class="img-circle elevation-2" alt="User Image">
                        </div>
                        <div class="info">
                            <a href="#" class="d-block">Admin</a>
                        </div>
                    </div>

                    <!-- SidebarSearch Form -->
                    <div class="form-inline">
                        <div class="input-group" data-widget="sidebar-search">
                            <input class="form-control form-control-sidebar" type="search" placeholder="Search" aria-label="Search">
                            <div class="input-group-append">
                                <button class="btn btn-sidebar">
                                    <i class="fas fa-search fa-fw"></i>
                                </button>
                            </div>
                        </div>
                    </div>

                    <!-- Sidebar Menu -->
                    <nav class="mt-2">
                        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                            <!-- Add icons to the links using the .nav-icon class
                               with font-awesome or any other icon font library -->
                            <li class="nav-item menu-open">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-tachometer-alt"></i>
                                    <p>
                                        Tổng Quan

                                    </p>
                                </a>

                            </li>

                            <li class="nav-item menu-open">
                                <a href="/quotescontent/" class="nav-link">
                                    <i class="nav-icon fas fa-comment"></i>
                                    <p>
                                        Báo giá
                                    </p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-cart-arrow-down"></i>
                                    <p>
                                        Đặt hàng
                                        <i class="right fas fa-angle-left"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Đặt hàng mua</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="/salescouponcontent/" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Đặt hàng bán</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-procedures"></i>
                                    <p>
                                        QL Hàng hoá
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Nhập hàng</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Xuất bán</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="#" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>
                                                Kho hàng
                                                <i class="fas fa-angle-left right"></i>
                                            </p>
                                        </a>
                                        <ul style="margin-left: 30px;" class="nav nav-treeview">
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <p>Thẻ kho</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <p>Phiếu quy đổi ĐVT</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <p>BC-Nhập-Xuất-Tồn</p>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Sổ chi tiết</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Sổ tổng hợp</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-dollar-sign"></i>
                                    <p>
                                        Thu chi
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="pages/forms/general.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Phiếu thu</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="pages/forms/advanced.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Phiếu chi</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="pages/forms/editors.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Sổ quỷ tiền mặt</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-user"></i>
                                    <p>
                                        Công nợ
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="pages/tables/simple.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Phiếu thu nợ KH</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Phiếu chi trả nợ NCU</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Công nợ phải trả</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Công nợ phải thu</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>

                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-chart-pie"></i>
                                    <p>
                                        Báo cáo - Thống kê
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Lịch sử giao dịch</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>thống kê chi phí</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Báo cáo doanh số</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Báo cáo lợi nhuận</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-list-alt"></i>
                                    <p>
                                        Danh mục
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Hàng hoá</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Nhà cung ứng</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Khách hàng</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Nghiệp vụ</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-cog"></i>
                                    <p>
                                        Cài đặt
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>

                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-assistive-listening-systems"></i>
                                    <p>
                                        Hệ thống
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>
                                                Khai báo số dư đầu kỳ
                                                <i class="fas fa-angle-left right"></i>
                                            </p>
                                        </a>
                                        <ul class="nav nav-treeview">
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <i class="far fa-circle nav-icon"></i>
                                                    <p>Đầu kỳ hàng hoá</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <i class="far fa-circle nav-icon"></i>
                                                    <p>Đầu kì nợ phải thu</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <i class="far fa-circle nav-icon"></i>
                                                    <p>Đầu kì nợ phải trả</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <i class="far fa-circle nav-icon"></i>
                                                    <p>Đầu kì điểm tích luỹ</p>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>
                                                TK sử dụng phần mềm
                                                <i class="fas fa-angle-left right"></i>
                                            </p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                    <!-- /.sidebar-menu -->
                </div>
                <!-- /.sidebar -->
            </aside>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>Phiếu báo giá</h1>
                            </div>
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active">DataTables</li>
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
                                                <a class="nav-link "
                                                   href="/quotescontent/" ><b>Quotes</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link active" id="custom-tabs-three-profile-tab" data-toggle="pill"
                                                   href="#custom-tabs-three-profile" role="tab" aria-controls="custom-tabs-three-profile"
                                                   aria-selected="true"><b>View quotes</b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">

                                        <div class="tab-content" id="custom-tabs-three-tabContent">


                                            <div class="tab-pane fade show active" id="custom-tabs-three-profile" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-profile-tab">

                                                <div class="card">

                                                    <form action="/quotes/search" method="POST">
                                                        <div style="margin-top: 20px; margin-right: 50px;">
                                                            <div class="input-group input-group-sm" style="width: 270px;height: 35px; float: right;">
                                                                <input type="search" data-table="" name="Cname" style="height:  35px;font-size:16px" class="form-control float-right light-table-filter" placeholder="Search by customer name ">
                                                                <button name="action" value="searchname" style="background-color: rgb(12, 208, 243);width: 60px;" type="submit" class="btn btn-default">
                                                                    <i style="color: rgb(248, 252, 255);" class="fas fa-search" ></i>
                                                                </button>
                                                            </div>
                                                           <div class="input-group input-group-sm" style="width: 240px;height: 35px; float: right; margin-right: 40px">
                                                                <input type="search" data-table="" name="CId" style="height:  35px;font-size:16px" class="form-control float-right light-table-filter" placeholder="Search by ID">
                                                                <button name="action" value="searchId" style="background-color:green" type="submit" class="btn btn-default">
                                                                    <i style="color: rgb(248, 252, 255);" class="fas fa-search" ></i>
                                                                </button>
                                                            </div>
                                                            <div class="input-group input-group-sm" style="width: 380px;height: 35px; float: right; margin-right:100px;">
                                                                <div class="input-group-append">
                                                                      <button readonly="true"  style="background-color:#CC9933;color: white;height: 35px; font-weight: bold;border:none;" type="button" class="">
                                                                        To date
                                                                    </button>
                                                                </div>
                                                                <input type="date" style="height:35px;font-size:16px" name="todate" class="form-control float-">
                                                                <button name="action" value="searchdate" style="background-color:#FF9900;width: 80px;color: white;height: 35px;" type="submit" class="btn ">
                                                                     <i style="color: rgb(248, 252, 255)" class="fas fa-search" ></i>
                                                                </button>
                                                            </div>
                                                            <div class="input-group input-group-sm" style="width: 300px;height: 35px; float: right; margin-right:20px;">
                                                                <div class="input-group-append">
                                                                    <button readonly="true" readonly="true" style="background-color:#CC9933;color: white;border:none;" type="button" class="">
                                                                        <b>From date</b>
                                                                    </button>
                                                                </div>
                                                                <input type="date" style="height:35px; font-size:16px" name="fromdate" class="form-control float-">
                                                            </div>
                                                        </div>

                                                    </form>

                                                    <%!int i =0;%>
                                                    <!-- /.card-header -->

                                                    <div class="card-body" >

                                                        <table id="example2" class="table table-bordered">
                                                            <thead>
                                                                <tr>

                                                                    <th style="width: 40px;">View</th>
                                                                    <th style="width: 35px;">print</th>
                                                                    <th style="width: 100px;">Import Excel</th>
                                                                    <th style="width: 40px;">Edit</th>
                                                                    <th style="width: 40px;">STT</th>
                                                                    <th style="width: 100px;">Code</th>
                                                                    <th>Date</th>
                                                                    <th>Customer</th>
                                                                    <th >Last price</th>
                                                                    <th>Creator</th>

                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <tr>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;font-weight: bold;">Total</td>
                                                                    <td></td>
                                                                    <td ><input readonly style="font-weight: bold;border: none;outline: none; width: 120px" id="totalprice" value=""/></td>
                                                                    <td></td>
                                                                </tr>
                                                                <c:forEach items="${listQuotes}" var="item">
                                                                    <tr>   
                                                                        <td><center><a href="#" data-toggle="modal" data-target=".a<%=++i%>"><i style="color: rgb(6, 55, 104);" class="fas fa-eye"></i></a></center> </td>
                                                                        <td><center><a  href="javascript: w=window.open('/quotes/details?id=${item.getId()}'); w.print();"><i style="color: rgb(10, 44, 30);" class="fas fa-print"></i></a></center></td>
                                                                        <td><center><a href="/export/download/quotesConten.xlsx?id=${item.getId()}"><i style="color: rgb(21, 180, 114);" class="fas fa-file"></i></a> </center></td>
                                                                        <td><center><a href="/quotes/doedit?id=${item.getId()}"><i style="color: rgb(15, 202, 235);" class="fas fa-edit"></i></a></center></td>
                                                                        <td style="text-align: center"><%=i%></td>
                                                                        <td style="color: blue">${item.getId()}</td>
                                                                        <td>${item.getDate()}</td>
                                                                        <c:forEach items="${listCustomer}" var="ctm">
                                                                            <c:if test = "${ctm.getId() == item.getCustomerId()}">
                                                                                <td>${ctm.getName()} - ${ctm.getPhone()} - ${ctm.getAddress()}  <i style="color: #00CCFF" class="nav-icon fas fa-pen"></i></td>  
                                                                            </c:if>
                                                                        </c:forEach>

                                                                        <td><input readonly style="border: none;outline: none;width: 120px" id="price<%=i%>" value=""/></td>
                                                                        <td>${item.getCreator()}</td>

                                                                    </tr>
                                                                </c:forEach>
                                                                <%i=0;%>
                                                            </tbody>
                                                            <tfoot>
                                                                <tr>
                                                                 <th style="width: 40px;">View</th>
                                                                    <th style="width: 35px;">print</th>
                                                                    <th style="width: 100px;">Import Excel</th>
                                                                    <th style="width: 40px;">Edit</th>
                                                                    <th style="width: 40px;">STT</th>
                                                                    <th style="width: 100px;">Code</th>
                                                                    <th>Date</th>
                                                                    <th>Customer</th>
                                                                    <th >Last price</th>
                                                                    <th>Creator</th>
                                                                </tr>
                                                            </tfoot>
                                                        </table>
</div>
                                                        <%!int j =0;%>
                                                        <c:forEach items="${listQuotes}" var="itemsquotes">
                                                            <div  class="modal fa-user a<%=++j%>" tabindex="-1" aria-labelledby="myLargeModalLabel">
                                                                <div class="modal-dialog modal-lg" role="document">
                                                                    <div class="modal-content">
                                                                        <div  class="modal-body">

                                                                            <div style="padding: 35px;" >
                                                                                <h3 style="text-align: center; margin-top: 30px;"><b>QUOTES DETAILS</b></h3>
                                                                                <h6 style="margin-top: 20px;">Code: <span

                                                                                        style="color: brown; font-size: 20px;">${itemsquotes.getId()}</span></h6>
                                                                                <h6>Date: <span style="color: rgb(106, 179, 106); font-size: 18px;">${itemsquotes.getDate()}</span></h6>
                                                                                    <c:forEach items="${listCustomer}" var="ctm">
                                                                                        <c:if test = "${ctm.getId() == itemsquotes.getCustomerId()}">

                                                                                        <h6>Customer: <span style="font-size: 18px;"><b>${ctm.getName()}</b>
                                                                                                <i></i></span></h6>
                                                                                        <h6>Phone: <span style="font-size: 18px;">${ctm.getPhone()}</span></h6>
                                                                                        <h6>Address: <span style="font-size: 18px;">${ctm.getAddress()}</span></h6>
                                                                                        </c:if>
                                                                                    </c:forEach>
                                                                                <div class="table-responsive table-wrapper-scroll-y my-custom-scrollbar" >
                                                                                    <table class="table  collapsed table-fixed" border="1" style="width: 100%;text-align: center">
                                                                                        <tr>
                                                                                            <th style="width: 50px;">STT</th>
                                                                                            <th >Goods name</th>
                                                                                            <th>Unit</th>
                                                                                            <th>QTT</th>
                                                                                            <th >Unit price</th>
                                                                                            <th>DC(%)</th>
                                                                                            <th>Discount price</th>
                                                                                            <th>After price</th>
                                                                                        </tr>
                                                                                        <%!int k =0;%>
                                                                                        <c:forEach items="${list}" var="item">
                                                                                            <c:if test = "${item.getQuotesid() == itemsquotes.getId()}">
                                                                                                <tr>
                                                                                                    <td><%=++k%></td>
                                                                                                    <td>${item.getGoodsName()}</td>
                                                                                                    <td>${item.getUnit()}</td>
                                                                                                    <td>${item.getQuantity()}</td>
                                                                                                    <td><input readonly style="border: none;outline: none;width: 75px" id="GoodsPrice<%=j%><%=k%>" value=""/></td>
                                                                                                    <td hidden="true"><input readonly style="border: none;outline: none;width: 60px" id="GP<%=j%><%=k%>" value="${item.getGoodsPrice()}"/></td>
                                                                                                    <td>${item.getDiscount()}</td>
                                                                                                    <td><input readonly style="border: none;outline: none;width: 70px" id="LastedPrice<%=j%><%=k%>" value=""/></td>
                                                                                                    <td hidden="true"><input readonly style="border: none;outline: none;width: 60px" id="LP<%=j%><%=k%>" value="${item.getLastedPrice()}"/></td>
                                                                                                    <td><input readonly style="border: none;outline: none;width: 90px" id="Afterpirce<%=j%><%=k%>" value=""/></td>
                                                                                                    <td hidden="true"><input readonly style="border: none;outline: none;width: 60px" id="AP<%=j%><%=k%>" value="${item.getAfterpirce()}"/></td>
                                                                                                </tr>
                                                                                            </c:if>
                                                                                        </c:forEach>
                                                                                        <%k=0;%>
                                                                                        <tr>
                                                                                            <th></th>
                                                                                            <th>Total price</th>
                                                                                            <th></th>
                                                                                            <th>${itemsquotes.getTotalquantity()}</th>
                                                                                            <th></th>
                                                                                            <th></th>
                                                                                            <th><input readonly style="border: none;outline: none;width: 70px;font-weight: bold" id="TotalDiscount<%=j%>" value=""/></th>
                                                                                            <th hidden="true"><input  style="border: none;outline: none;width: 60px" id="TD<%=j%>" value="${itemsquotes.getTotalDiscount()}"/></th>
                                                                                            <th><input readonly style="border: none;outline: none;width: 90px;font-weight: bold" id="TatolPrice<%=j%>" value=""/></th>
                                                                                            <th hidden="true"><input  style="border: none;outline: none;width: 60px;" id="TP<%=j%>" value="${itemsquotes.getTatolPrice()}"/></th>
                                                                                        </tr>
                                                                                    </table>
                                                                                </div>
                                                                                <div style="margin-top: 20px">
                                                                                    <h6>Total price: 
                                                                                        <i><input  readonly style="border: none;outline: none; font-weight: bold;color:blue;" id="ATP<%=j%>" value=""/></i>  

                                                                                    </h6>
                                                                                    <h6>Distcount:<u><i><input  readonly style="border: none;outline: none; font-weight: bold;color:blue;" id="ATD<%=j%>" value=""/></i> </u></h6>
                                                                                    <h6>Last price:

                                                                                        <i>
                                                                                            <input  readonly style="border: none;outline: none; font-weight: bold;color:blue;" id="ALP<%=j%>" value=""/>
                                                                                            <input hidden="true" readonly  id="alp<%=j%>" value="${itemsquotes.getLastedPrice()}"/>
                                                                                        </i>  
                                                                                    </h6>
                                                                                    <br>
                                                                                    <h6>Creator: <span style="font-size: 18px;"><b>${itemsquotes.getCreator()}</b> </span> </h6>
                                                                                </div>
                                                                            </div>

                                                                        </div>



                                                                    </div>

                                                                </div>

                                                            </div>
                                                        </c:forEach>
                                                        <%j=0;%>
                                                    
                                                    <!-- /.card-body -->
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
            </div>
            <!-- /.content-wrapper -->
            <footer class="main-footer">
                <div class="float-right d-none d-sm-block">
                    <b>Version</b> 3.1.0
                </div>
                <strong>Copyright &copy; 2014-2021 <a href="https://adminlte.io">AdminLTE.io</a>.</strong> All rights reserved.
            </footer>

            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
        </div>
        <!-- ./wrapper -->

        <!-- jQuery -->
        <script src="/page/static/plugins/jquery/jquery.min.js"></script>
        <!-- Bootstrap 4 -->
        <script src="/page/static/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- DataTables  & Plugins -->
        <script src="/page/static/plugins/datatables/jquery.dataTables.min.js"></script>
        <script src="/page/static/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
        <script src="/page/static/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
        <script src="/page/static/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
        <script src="/page/static/plugins/datatables-buttons/js/dataTables.buttons.min.js"></script>
        <script src="/page/static/plugins/datatables-buttons/js/buttons.bootstrap4.min.js"></script>
        <script src="/page/static/plugins/jszip/jszip.min.js"></script>
        <script src="/page/static/plugins/pdfmake/pdfmake.min.js"></script>
        <script src="/page/static/plugins/pdfmake/vfs_fonts.js"></script>
        <script src="/page/static/plugins/datatables-buttons/js/buttons.html5.min.js"></script>
        <script src="/page/static/plugins/datatables-buttons/js/buttons.print.min.js"></script>
        <script src="/page/static/plugins/datatables-buttons/js/buttons.colVis.min.js"></script>
        <!-- AdminLTE App -->
        <script src="/page/static/dist/js/adminlte.min.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="/page/static/dist/js/demo.js"></script>
        <!-- Page specific script -->
        <script type="text/javascript">

            var nf = Intl.NumberFormat();
            document.getElementById('totalprice').value = nf.format(${totalprice});

            var count = 0;

            var price = "price";
            var GoodsPrice = "GoodsPrice";
            var LastedPrice = "LastedPrice";
            var Afterpirce = "Afterpirce";
            var GP = "GP";
            var LP = "LP";
            var AP = "AP";
            var TotalDiscount = "TotalDiscount";
            var TD = "TD";
            var TatolPrice = "TatolPrice";
            var TP = "TP";
            var ALP = "ALP";
            var alp = "alp";
            var ATP = "ATP";
            var ATD = "ATD";
            var k = 0;
            <c:forEach items="${listQuotes}" var="item">
            ++count;
            document.getElementById(price + count).value = nf.format(${item.getLastedPrice()});
            document.getElementById(TotalDiscount + count).value = nf.format(document.getElementById(TD + count).value);
            document.getElementById(TatolPrice + count).value = nf.format(document.getElementById(TP + count).value);
            document.getElementById(ATD + count).value = nf.format(document.getElementById(TD + count).value);
            document.getElementById(ATP + count).value = nf.format(document.getElementById(TP + count).value);
            document.getElementById(ALP + count).value = nf.format(document.getElementById(alp + count).value);
                <c:forEach items="${list}" var="items">
                    <c:if test = "${items.getQuotesid() == item.getId()}">
            ++k;
            document.getElementById(GoodsPrice + count + k).value = nf.format(document.getElementById(GP + count + k).value);
            document.getElementById(LastedPrice + count + k).value = nf.format(document.getElementById(LP + count + k).value);
            document.getElementById(Afterpirce + count + k).value = nf.format(document.getElementById(AP + count + k).value);
                    </c:if>
                </c:forEach>
            k = 0;
            </c:forEach>
            count = 0;




    $(function () {
      $("#example1").DataTable({
        "responsive": true, "lengthChange": false, "autoWidth": false,
        "buttons": ["copy", "csv", "excel", "pdf", "print", "colvis"]
      }).buttons().container().appendTo('#example1_wrapper .col-md-6:eq(0)');
      $('#example2').DataTable({
        "paging": true,
        "lengthChange": false,
        "searching": false,
        "ordering": true,
        "info": true,
        "autoWidth": false,
        "responsive": true,
      });
    });
  </script>


        </script>

    </body>

</html>

