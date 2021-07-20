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
            <jsp:include page="/page/order/nav.jsp" /> 
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>SALES SLIP</h1>

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
                                                   href="/salescouponcontent/" ><b>Sales slip</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link active" id="custom-tabs-three-profile-tab" data-toggle="pill"
                                                   href="/salescoupon/" role="tab" aria-controls="custom-tabs-three-profile"
                                                   aria-selected="true"><b>View Sales slip</b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">

                                        <div class="tab-content" id="custom-tabs-three-tabContent">


                                            <div class="tab-pane fade show active" id="custom-tabs-three-profile" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-profile-tab">

                                                <div class="card">

                                                    <form action="/salescoupon/search" method="POST">
                                                        <div style="margin-top: 20px; margin-right: 50px;">
                                                            <div class="input-group input-group-sm" style="width: 270px;height: 35px; float: right;">
                                                                <input type="search" data-table="" name="Cname" style="height: 35px;font-size:16px; border: thin rgb(12, 208, 243) solid" class="form-control float-right light-table-filter" placeholder="Search by customer name ">
                                                                <button name="action" value="searchname" style="background-color: rgb(12, 208, 243);width: 60px;" type="submit" class="btn btn-default">
                                                                    <i style="color: rgb(248, 252, 255);" class="fas fa-search" ></i>
                                                                </button>
                                                            </div>
                                                            <div class="input-group input-group-sm" style="width: 200px;height: 35px; float: right; margin-right: 40px">
                                                                <input type="search" data-table="" name="CId" style="height:  35px;font-size:16px;border: thin green solid" class="form-control float-right light-table-filter" placeholder="Search by ID">
                                                                <button name="action" value="searchId" style="background-color:green" type="submit" class="btn btn-default">
                                                                    <i style="color: rgb(248, 252, 255);" class="fas fa-search" ></i>
                                                                </button>
                                                            </div>
                                                            <div class="input-group input-group-sm" style="width: 380px;height: 35px; float: right; margin-right:100px;">
                                                                <div class="input-group-append">
                                                                    <button readonly="true"  style="background-color:#336699;color: white;height: 35px; font-weight: bold;border:none;" type="button" class="">
                                                                        To date
                                                                    </button>
                                                                </div>
                                                                <input type="date" style="height:35px;font-size:16px" name="todate" class="form-control float-">
                                                                <button name="action" value="searchdate" style="background-color:#3366CC;width: 80px;color: white;height: 35px;" type="submit" class="btn ">
                                                                    <i style="color: rgb(248, 252, 255)" class="fas fa-search" ></i>
                                                                </button>
                                                            </div>
                                                            <div class="input-group input-group-sm" style="width: 300px;height: 35px; float: right; margin-right:20px;">
                                                                <div class="input-group-append">
                                                                    <button readonly="true" readonly="true" style="background-color:#336699;color: white;border:none;" type="button" class="">
                                                                        <b>From date</b>
                                                                    </button>
                                                                </div>
                                                                <input type="date" style="height:35px; font-size:16px" name="fromdate" class="form-control float-">
                                                            </div>
                                                        </div>
                                                        <div class="input-group input-group-sm" style="width: 200px;height: 35px; float: right; margin-right: 360px;margin-top: 20px;">
                                                            <select type="search" name="circumstance" style="height:35px;font-size:16px; text-align: center; border: thin #008080 solid;font-size:16px" class="form-control float-right">
                                                                <option value="0">-- Select by status --</option>
                                                                <option value="1">Waiting for processing</option>
                                                                <option value="2">Processing</option>
                                                                <option value="3">Completed</option>
                                                                <option value="4">Canceled</option>
                                                            </select>
                                                            <button name="action" value="searchstatus" style="background-color:#008080" type="submit" class="btn btn-default">
                                                                <i style="color:rgb(248, 252, 255)" class="fas fa-search" ></i>
                                                            </button>
                                                        </div>

                                                    </form>

                                                    <%!int i =0;%>
                                                    <!-- /.card-header -->
                                                    <%!int n =1;%>
                                                    <%!int m =2;%>
                                                    <div class="card-body" >

                                                        <table id="example2" class="table table-bordered">
                                                            <thead>


                                                                <tr>
                                                                    <th style="width: 30px;">View</th>
                                                                    <th style="width: 30px;">Action</th>
<!--                                                               <th style="width: 30px;">STT</th>-->
                                                                    <th style="width: 90px;">SalesCouponID</th>
                                                                    <th style="width: 90px;">Date created</th>
                                                                    <th>Customer information</th>
                                                                    <th style="font-weight: bold; color: blue; width: 110px">Status
                                                                    </th>
                                                                    <th>Last price</th>
                                                                    <th>Paid</th>
                                                                    <th>Owed</th>
                                                                    <th>Seller</th>
                                                                </tr>


                                                            </thead>
                                                            <tbody>
                                                                <tr>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none;"></td>
                                                                    <td style="border: none; font-weight: bold">Total</td>
                                                                    <td ></td>
                                                                    <td ><input readonly style="font-weight: bold;border: none;outline: none; width: 110px" id="totalprice" value=""/></td>
                                                                    <td ></td>
                                                                    <td ></td>
                                                                    <td></td>
                                                                </tr>


                                                                <c:forEach items="${listSalesCoupon}" var="item">
                                                                    <tr>   
                                                                        <td><center><a href="#" data-toggle="modal" data-target=".a<%=++i%>"><i style="color: rgb(6, 55, 104);" class="fas fa-eye"></i></a></center> </td>
                                                                        <td hidden="true"><center><a  href="javascript: w=window.open('/salescoupon/details?id=${item.getId()}'); w.print();"><i style="color: rgb(10, 44, 30);" class="fas fa-print"></i></a></center></td>
                                                                        <td><center>
                                                                                    <div class="dropdown material-icons">
                                                                                        <i style="color: #444444" type="button" class="material-icons" data-toggle="dropdown"><img src="/page/static/dist/img/baseline_more_vert_black_24dp.png"/>
                                                                                    </i>
                                                                                    <div class="dropdown-menu">
                                                                                        <a class="dropdown-item" href="javascript: w=window.open('/salescoupon/details?id=${item.getId()}'); w.print();">Print</a>
                                                                                        <a class="dropdown-item " href="/salescouponcontent/doedit?id=${item.getId()}">Edit</a>
                                                                                        <a class="dropdown-item " href="#">Export Excel</a>
                                                                                    </div>
                                                                                </div>
                                                                            </center></td>
<!--                                                                        <td style="text-align: center"></td>-->
                                                                        <td style="color: blue">${item.getId()}</td>
                                                                        <td>${item.getDate()}</td>
                                                                        <c:forEach items="${listCustomer}" var="ctm">
                                                                            <c:if test = "${ctm.getId() == item.getCustomerId()}">
                                                                                <td>${ctm.getName()} - ${ctm.getPhone()} - ${ctm.getAddress()}  <i style="color: #00CCFF" class="nav-icon fas fa-pen"></i></td>  
                                                                            </c:if>
                                                                        </c:forEach>
                                                                        <c:if test="${item.getCircumstance()=='1'}">
                                                                            <td style="color: dodgerblue;"><span style="font-size:18px">Wf progressing</span> 
                                                                                <div class="dropdown material-icons">
                                                                                    <i style="float: right;" type="button" class=" dropdown-toggle" data-toggle="dropdown">
                                                                                    </i>
                                                                                    <div class="dropdown-menu">
                                                                                        <a class="dropdown-item" href="/salescoupon/updatecircumstance?id=${item.getId()}&title=xacnhan">Confirm</a>
                                                                                        <a class="dropdown-item " href="/salescoupon/updatecircumstance?id=${item.getId()}&title=hoantat">Completed</a>
                                                                                        <a class="dropdown-item " href="/salescoupon/updatecircumstance?id=${item.getId()}&title=huy">Cancel </a>
                                                                                    </div>
                                                                                </div>
                                                                            </td>
                                                                        </c:if>
                                                                        <c:if test="${item.getCircumstance()=='2'}">
                                                                            <td style="color: #FFE000;"> <span style="font-size:18px">Processing</span>
                                                                                <div class="dropdown material-icons">
                                                                                    <i style="float: right;" type="button" class=" dropdown-toggle" data-toggle="dropdown">
                                                                                    </i>
                                                                                    <div class="dropdown-menu">

                                                                                        <a class="dropdown-item " href="/salescoupon/updatecircumstance?id=${item.getId()}&title=hoantat">Completed</a>
                                                                                        <a class="dropdown-item " href="/salescoupon/updatecircumstance?id=${item.getId()}&title=huy">Cancel </a>
                                                                                    </div>
                                                                                </div>
                                                                            </td>
                                                                        </c:if>
                                                                        <c:if test="${item.getCircumstance()=='3'}">
                                                                            <td style="color: green;"><span style="font-size:18px">Completed</span>

                                                                            </td>
                                                                        </c:if>
                                                                        <c:if test="${item.getCircumstance()=='4'}">
                                                                            <td style="color: red;"><span style="font-size:18px">Canceled</span>
                                                                            </td>
                                                                        </c:if>
                                                                        <td><input readonly style="border: none;outline: none;width: 80px" id="price<%=i%>" value=""/></td>
                                                                        <td><input readonly style="border: none;outline: none;width: 80px" id="paid<%=i%>" value=""/></td>
                                                                        <td><input readonly style="border: none;outline: none;width: 80px" id="owed<%=i%>" value=""/></td>
                                                                        <td>${item.getSeller()}</td>
                                                                    </tr>
                                                                </c:forEach>
                                                                <%i=0;%>
                                                            </tbody>
                                                            <tfoot>
                                                                <tr>
                                                                    <th style="width: 30px;">View</th>
                                                                    <th style="width: 30px;">Action</th>
<!--                                                                    <th style="width: 30px;">STT</th>-->
                                                                    <th style="width: 90px;">SalesCouponID</th>
                                                                    <th style="width: 90px;">Date created</th>
                                                                    <th>Customer information</th>
                                                                    <th style="font-weight: bold; color: blue;">Status
                                                                    </th>
                                                                    <th>Last price</th>
                                                                    <th>Paid</th>
                                                                    <th>Owed</th>
                                                                    <th>Seller</th>
                                                                </tr>
                                                            </tfoot>
                                                        </table>
                                                    </div>
                                                    <%!int j =0;%>
                                                    <c:forEach items="${listSalesCoupon}" var="itemsquotes">
                                                        <div  class="modal fa-user a<%=++j%>" tabindex="-1" aria-labelledby="myLargeModalLabel">
                                                            <div class="modal-dialog modal-lg" role="document">
                                                                <div class="modal-content">
                                                                    <div  class="modal-body">

                                                                        <div style="padding: 35px;" >
                                                                            <h3 style="text-align: center; margin-top: 30px;"><b>SALES COUPON DETAIL</b></h3>
                                                                            <h6 style="margin-top: 20px;">ID: <span

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
                                                                                        <th >DC(%)</th>
                                                                                        <th>Discount price </th>
                                                                                        <th>After price</th>
                                                                                    </tr>
                                                                                    <%!int k =0;%>
                                                                                    <c:forEach items="${list}" var="item">
                                                                                        <c:if test = "${item.getSalesCouponId() == itemsquotes.getId()}">
                                                                                            <tr>
                                                                                                <td><%=++k%></td>
                                                                                                <td>${item.getGoodsName()}</td>
                                                                                                <td>${item.getUnit()}</td>
                                                                                                <td>${item.getQuantity()}</td>
                                                                                                <td><input readonly style="border: none;outline: none;width: 75px" id="GoodsPrice<%=j%><%=k%>" value=""/></td>
                                                                                                <td hidden="true"><input readonly style="border: none;outline: none;width: 60px" id="GP<%=j%><%=k%>" value="${item.getUnitPrice()}"/></td>
                                                                                                <td>${item.getDiscount()}</td>
                                                                                                <td><input readonly style="border: none;outline: none;width: 70px" id="LastedPrice<%=j%><%=k%>" value=""/></td>
                                                                                                <td hidden="true"><input readonly style="border: none;outline: none;width: 60px" id="LP<%=j%><%=k%>" value="${item.getDiscoutPrice()}"/></td>
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
                                                                                        <th><input readonly style="border: none;outline: none;width: 60px;font-weight: bold" id="TotalDiscount<%=j%>" value=""/></th>
                                                                                        <th hidden="true"><input  style="border: none;outline: none;width: 60px" id="TD<%=j%>" value="${itemsquotes.getTotalDiscount()}"/></th>
                                                                                        <th><input readonly style="border: none;outline: none;width: 90px;font-weight: bold" id="TatolPrice<%=j%>" value=""/></th>
                                                                                        <th hidden="true"><input  style="border: none;outline: none;width: 60px;" id="TP<%=j%>" value="${itemsquotes.getTatolPrice()}"/></th>
                                                                                    </tr>
                                                                                </table>
                                                                            </div>
                                                                            <div style="margin-top: 10px">
                                                                                <h6> Payments: 
                                                                                    <i><input  readonly style="border: none;outline: none;color:#990099"  value="${itemsquotes.getPayments()}"/></i>  
                                                                                </h6>
                                                                                <h6>Total price: 
                                                                                    <i><input  readonly style="border: none;outline: none; font-weight: bold;color:blue;" id="ATP<%=j%>" value=""/></i>  
                                                                                </h6>
                                                                                <h6>Discount:<u><i><input  readonly style="border: none;outline: none; font-weight: bold;color:blue;" id="ATD<%=j%>" value=""/></i> </u></h6>
                                                                                <h6>Total:
                                                                                    <i>
                                                                                        <input  readonly style="border: none;outline: none; font-weight: bold;color:blue;" id="ALP<%=j%>" value=""/>
                                                                                        <input hidden="true" readonly  id="alp<%=j%>" value="${itemsquotes.getLastedPrice()}"/>
                                                                                    </i>  
                                                                                </h6>
                                                                                <h6>Paid:
                                                                                    <input  readonly style="border: none;outline: none; font-weight: bold;color:#00CC66;" id="PAID<%=j%>" value=""/>
                                                                                    <input hidden="true" readonly  id="apaid<%=j%>" value="${itemsquotes.getPaid()}"/>
                                                                                    </i>  
                                                                                </h6>
                                                                                <h6>Owed:
                                                                                    <i>
                                                                                        <input  readonly style="border: none;outline: none; font-weight: bold;color:red;" id="OWED<%=j%>" value=""/>
                                                                                        <input hidden="true" readonly  id="aowed<%=j%>" value="${itemsquotes.getOwed()}"/>
                                                                                    </i>  
                                                                                </h6>
                                                                                <br>
                                                                                <h6>Seller: <span style="font-size: 18px;"><b>${itemsquotes.getSeller()}</b> </span> </h6>
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
            var paid = "paid";
            var owed = "owed";
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
            var PAID = "PAID";
            var apaid = "apaid";
            var OWED = "OWED";
            var aowed = "aowed";
            var k = 0;
            <c:forEach items="${listSalesCoupon}" var="item">
            ++count;
            document.getElementById(price + count).value = nf.format(${item.getLastedPrice()});
            document.getElementById(paid + count).value = nf.format(${item.getPaid()});
            document.getElementById(owed + count).value = nf.format(${item.getOwed()});
            document.getElementById(TotalDiscount + count).value = nf.format(document.getElementById(TD + count).value);
            document.getElementById(TatolPrice + count).value = nf.format(document.getElementById(TP + count).value);
            document.getElementById(ATD + count).value = nf.format(document.getElementById(TD + count).value);
            document.getElementById(ATP + count).value = nf.format(document.getElementById(TP + count).value);
            document.getElementById(ALP + count).value = nf.format(document.getElementById(alp + count).value);
            document.getElementById(PAID + count).value = nf.format(document.getElementById(apaid + count).value);
            document.getElementById(OWED + count).value = nf.format(document.getElementById(aowed + count).value);
                <c:forEach items="${list}" var="items">
                    <c:if test = "${items.getSalesCouponId() == item.getId()}">
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




</body>

</html>

