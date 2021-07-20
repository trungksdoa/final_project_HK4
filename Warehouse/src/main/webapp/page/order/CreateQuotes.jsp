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

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
        <style>
            .my-custom-scrollbar {
                position: relative;
                height: 400px;
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
        <jsp:include page="/page/order/nav.jsp" /> 
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>QUOTES SLIP</h1>
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
                                                <a class="nav-link active" id="custom-tabs-three-home-tab" data-toggle="pill"
                                                   href="#custom-tabs-three-home" role="tab" aria-controls="custom-tabs-three-home"
                                                   aria-selected="true"><b>Quotes</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link"
                                                   href="/quotes/"><b>View quotes </b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">
                                        <div class="tab-content" id="custom-tabs-three-tabContent">
                                            <div class="tab-pane fade show active" id="custom-tabs-three-home" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-home-tab">
                                                <form name="myform" action="/quotescontent/create" method="POST" onsubmit="return validation()">
                                                    <input type="number" name="index" id="index" value="" hidden="true">
                                                    <button onkeyup='updateTotalPrice()' onclick='updateTotalPrice()'  name="action" id="luu" value="luu" style="width: 80px; height:37px;position: absolute;right: 320px;top:4px;" type="submit"
                                                            class="btn btn-block bg-gradient-primary"><i class="fas fa-save"></i> Save</button>
                                                    <button onkeyup='updateTotalPrice()' onclick='updateTotalPrice()' name="action" style="width: 150px; height:37px; position: absolute;right: 160px;top:-5px;"
                                                            type="submit" class="btn btn-block bg-gradient-info "><i class="fas fa-print"></i>Save and Print</button>
                                                    <button  style="width: 100px; height:37px;  position: absolute;right: 50px;top:-5px;" type="reset"
                                                             class="btn btn-block bg-gradient-danger"><i class="fas fa-delete"></i>Rest</button>

                                                    <div class="card-body">
                                                        <div class="row">
                                                            <div class="col-1"></div>
                                                            <div class="col-1">
                                                                <label>Code</label>
                                                                <input readonly type="text" name="id" class="form-control" placeholder="Auto">
                                                                 <input hidden=true"  type="text" name="check" class="form-control" value="${check}">
                                                            </div>
                                                            <div class="col-2">
                                                                <label>Date</label>
                                                                <input  type="date"  name="date" id="date" class="form-control ">
                                                            </div>
                                                            <!-- Date and time -->
                                                            <div class="col-3">
                                                                <label>Customer / Company</label>
                                                                <div class="input-group date"  id="reservationdatetime" data-target-input="nearest">
                                                                    <input type="text" name="customername" id="customername" class="form-control datetimepicker-input"
                                                                           placeholder="Enter Customer/ Company" data-target="#reservationdatetime">
                                                                    <input hidden="true" text="text" name="customerId" id="customerId"/> 
                                                                    <input hidden="true" text="text" name="namecs" value="" id="namecs"/> 
                                                                    <div class="input-group-append" data-target="#reservationdatetime"
                                                                         data-toggle="datetimepicker">
                                                                        <div class="input-group-text bg-gradient-info"><a href="#"><i style="color: white;"
                                                                                                                                      class="fa fa-plus"></i></a></div>
                                                                    </div>

                                                                </div>

                                                            </div>
                                                            <div class="col-2 ">
                                                                <label>Address</label>
                                                                <input readonly type="text" name="address" id="address" class="form-control" placeholder="Fill Address">
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div class="col-2 ">
                                                                <label>Phone</label>
                                                                <div class="input-group">
                                                                    <input readonly type="text" name="phone" id="phone" class="form-control" placeholder="Fill phone number">
                                                                </div>
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div class="col-1 "></div>
                                                        </div>
                                                        </br>
                                                        <div class="row">
                                                            <div class="col-1 "></div>
                                                            <div class="col-2">
                                                                <label>Receiver</label>
                                                                <input type="text" name="receiver" id="receiver" class="form-control" placeholder="Enter receiver">
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div class="col-2">
                                                                <label>Creator</label>
                                                                <input type="text" name="creator" id="creator"  id="receiver" class="form-control" placeholder="Enter Creator">
                                                                <input hidden="true" text="text" name="checkcrt" value="" id="checkcrt"/> 
                                                            </div>

                                                            <div class="col-4">
                                                                <label>Explain</label>
                                                                <input type="text" name="explain" id="explain" class="form-control" placeholder="Enter explain">
                                                                <!-- /.input group -->
                                                            </div>
                                                        </div>
                                                        </br>
                                                        <div>
                                                            <button type="button" style="width: 120px;" onclick="minuscount()"
                                                                    class="delete-row btn  btn-danger btn-sm" ><i class="fa fa-trash can " style="padding: 5px 0px"> Del column</i></button>
                                                            <button type="button" style="width: 120px;"  onclick="pluscount()"
                                                                    class="btn  btn-success btn-sm add-row"><i style="color: white;padding: 5px 0px" class="fa fa-plus">Add column</i></button> 
                                                        </div>





                                                        <div style="margin-top: 5px;" class="card">
                                                            <!-- /.card-header -->
                                                            <div class="card-body table-responsive p-0">
                                                                <div class="panel-body">



                                                                    <div class="table-responsive table-wrapper-scroll-y my-custom-scrollbar">

                                                                        <table class="table table-bordered table-hover dataTable dtr-inline collapsed table-fixed"
                                                                               id="POITable">
                                                                            <thead>
                                                                                <tr>
                                                                                    <th style="width: 40px;">#</th>
                                                                                    <th style="width: 450px;">Goods name <a style="float: right;" href="#"><i class="fa fa-plus" ></i> Add new</a></th>
                                                                                    <th style="width: 150px;">Unit</th>
                                                                                    <th style="width: 200px;">Quantity</th>
                                                                                    <th style="width: 220px;">Unit price</th>
                                                                                    <th style="width: 250px;">Discount(%)</th>
                                                                                    <th style="width: 250px;">After price</th>
                                                                                </tr>
                                                                            </thead>
                                                                            <tbody id="result">
                                                                                <tr onclick="dasdsadsa(this)">
                                                                                    <td style="color: dodgerblue;">1</td>
                                                                                    <td><input  style="height: 35px;" name="goods_name[]" id="goods_name1" class="form-control"
                                                                                                type="text" onkeyup='updateTotalPrice()' onclick='updateTotalPrice()' placeholder="Enter Goods name" />
                                                                                        <input hidden="true" text="text" value="" id="product1"/> 
                                                                                        <input hidden="true"style="height: 35px;" name="goods_id[]" id="goods_id1" class="form-control"
                                                                                               type="text" /></td>
                                                                                    <td><input style="height: 35px;" readonly name="unit[]" id="unit1" class="form-control"
                                                                                               type="text" /></td>
                                                                                    <td><input style="height: 35px;"  onclick="updateTotalPrice()" onkeyup="updateTotalPrice()" name="quantity[]"
                                                                                               id="quantity1"  class="form-control" value="0" type="number" /></td>
                                                                                    <td><input hidden="true" style="height: 35px;" readonly onclick="updateTotalPrice()" onkeyup="updateTotalPrice()" name="gprice[]"
                                                                                               id="goods_price1" class="form-control"  value="0" type="number" />
                                                                                        <input style="height: 35px;" readonly onclick="updateTotalPrice()" onkeyup="updateTotalPrice()"
                                                                                               type="text"  id="agoods_price1" class="form-control"/>
                                                                                    </td>
                                                                                    <td><input style="height: 35px;" onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' min="0" name="discount[]" id="discount1" class="form-control"
                                                                                               value="0" type="number" /></td>


                                                                                    <td> <input hidden="true" style="height: 35px;" onkeyup="updateTotalPrice()" name="afterpirce[]" id="afterpirce1"
                                                                                                class="form-control" value="0" readonly type="number" pattern="[0-9]*" />
                                                                                        <input style="height: 35px;" onkeyup="updateTotalPrice()"  id="aafterpirce1"
                                                                                               class="form-control"  readonly type="text" pattern="[0-9]*" />
                                                                                    </td> 

                                                                                </tr>

                                                                            </tbody>
                                                                            <tfoot>
                                                                                 <tr>
                                                                                    <th style="width: 40px;">#</th>
                                                                                    <th style="width: 450px;">Goods name <a style="float: right;" href="#"><i class="fa fa-plus" ></i> Add new</a></th>
                                                                                    <th style="width: 150px;">Unit</th>
                                                                                    <th style="width: 200px;">Quantity</th>
                                                                                    <th style="width: 220px;">Unit price</th>
                                                                                    <th style="width: 250px;">Discount(%)</th>
                                                                                    <th style="width: 250px;">After price</th>
                                                                                </tr>
                                                                                <tr>

                                                                                    <td colspan="3"><input
                                                                                            style="height: 35px; border: none; text-align: center;font-weight: bold; color:darkslategray"
                                                                                            class="form-control" value="Total quantity" type="text" /></td>
                                                                                    <td><input style="height: 35px; border: 2px solid green;" name="total_SL"
                                                                                               id="total_SL" class="form-control" value="0" readonly type="number"/></td>
                                                                                    <td colspan="2"><input
                                                                                            style="height: 35px; border: none; text-align: center;font-weight: bold; color: darkslategray;"
                                                                                            class="form-control" value="Last price" type="text" /></td>
                                                                            <input hidden="true" readonly style="height: 35px;border: 2px solid green;" value="0" name="lasted_price"
                                                                                   id="total_TT" class="form-control" type="text" />
                                                                            <td><input readonly style="height: 35px;border: 2px solid green;" value="0" name="lasted_price"
                                                                                       id="atotal_TT" class="form-control" type="text" /></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td colspan="5"><input
                                                                                        style="height: 35px; border: none;font-weight: bold; color:orange;padding-left: 1000px;"
                                                                                        class="form-control" value="Total discount" type="text" /></td>
                                                                            <input hidden="true" readonly style="height: 35px;border: 2px solid orange;" onkeyup="updateTotalPrice()"  name="GG" id="GG"
                                                                                   class="form-control" value="0" type="text" />
                                                                            <td><input readonly style="height: 35px;border: 2px solid orange;" onkeyup="updateTotalPrice()"   id="aGG"
                                                                                       class="form-control" value="0" type="text" /></td>

                                                                            <input hidden="true" readonly style="height: 35px;border: 2px solid orange;" value="0.000" name="TGG" id="TGG"
                                                                                   class="form-control" type="text" />
                                                                            <td><input readonly style="height: 35px;border: 2px solid orange;" value="0.000"  id="aTGG"
                                                                                       class="form-control" type="text" /></td>

                                                                            </tr>
                                                                            </tfoot>
                                                                        </table>
                                                                    </div>
                                                                    <input style="height: 10px;"  name="cnt" id="cnt" value="1"
                                                                           class="form-control"  readonly  />

                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </form>

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
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
        </div>
  <jsp:include page="/page/order/ScriptQuotes.jsp"/> 
    </body>

</html>
