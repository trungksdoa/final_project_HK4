
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<html>
    <head>
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
                height: 450px;
                overflow: auto;
            }
            .table-wrapper-scroll-y {
                display: block;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">

            <jsp:include page="/page/order/nav.jsp" /> 


            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper" style="height: 1000px">
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>SALES SLIP</h1>
                            </div>
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
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
                                                   href="/salescouponcontent/" role="tab" aria-controls="custom-tabs-three-home"
                                                   aria-selected="true"><b> Sales slip</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/salescoupon/"><b> View Sales slip</b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">
                                        <div class="tab-content" id="custom-tabs-three-tabContent">
                                            <div class="tab-pane fade show active" id="custom-tabs-three-home" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-home-tab">
                                                <form name="myform" action="/salescouponcontent/create" method="POST" onsubmit="return validation()">
                                                    <input type="number" name="index" id="index" value="" hidden="true">
                                                    <button onkeyup='updateTotalPrice()' onclick='updateTotalPrice()'  name="action" id="luu" value="luu" style="width: 80px; height:37px;position: absolute;right: 320px;top:4px;" type="submit"
                                                            class="btn btn-block bg-gradient-primary"><i class="fas fa-save"></i> Save</button>
                                                    <button onkeyup='updateTotalPrice()' onclick='updateTotalPrice()' name="action" style="width: 150px; height:37px; position: absolute;right: 160px;top:-5px;"
                                                            type="submit" class="btn btn-block bg-gradient-info "><i class="fas fa-print"></i> Save and print</button>
                                                    <button  style="width: 100px; height:37px;  position: absolute;right: 50px;top:-5px;" type="reset"
                                                             class="btn btn-block bg-gradient-danger"><i class="fas fa-remove"></i> Reset</button>
                                                    <div class="card-body">
                                                        <div class="row">
                                                            <div class="col-1"></div>
                                                            <div class="col-1 ">
                                                                <label>Follow Quotes</label>
                                                                <div class="input-group">
                                                                    No: <input onclick="checkfalse()" type="radio" id="quotes" checked="true" name="quotes"  value="2">
                                                                    &nbsp;&nbsp;   Yes: <input onclick="checktrue()" type="radio" id="quotes" name="quotes" value="1" >
                                                                  
                                                                </div>
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div  class="col-2 ">
                                                                <label>QuotesID</label>
                                                                <div  class="input-group">
                                                                    <input type="text" name="salescouponId" id="salescouponId" class="form-control" placeholder="Enter quotes">
                                                                    <input hidden="true" type="text" name="asalescouponId" id="asalescouponId" class="form-control" placeholder="Enter quotes">
                                                                </div>
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div class="col-1">
                                                                <label>Code</label>
                                                                <input readonly  type="text" name="id" class="form-control" placeholder="Auto">
                                                            </div>
                                                            <div class="col-2">
                                                                <label>Date</label>
                                                                <input readonly  name="date" id="date" class="form-control " placeholder="Auto">
                                                            </div>
                                                            <!-- Date and time -->
                                                            <div class="col-3">
                                                                <label>Customer / Company </label>
                                                                <div class="input-group date"  id="reservationdatetime" data-target-input="nearest">
                                                                    <input style="background-color:#FFFAE3" type="text" name="customername" id="customername" onkeyup="checkkeyup()" class="form-control datetimepicker-input"
                                                                           placeholder="Nhập khách hàng/ Công ty" data-target="#reservationdatetime">
                                                                    <input hidden="true"  type="text"  id="acustomername"  class="form-control datetimepicker-input"
                                                                           placeholder="Nhập khách hàng/ Công ty" data-target="#reservationdatetime">
                                                                    <input hidden="true" text="text" name="customerId" id="customerId"/> 
                                                                    <input hidden="true" text="text" name="namecs" value="" id="namecs"/> 
                                                                    <div class="input-group-append" data-target="#reservationdatetime"
                                                                         data-toggle="datetimepicker">
                                                                        <div class="input-group-text bg-gradient-info"><a href="#"><i style="color: white;"
                                                                                                                                      class="fa fa-plus"></i></a></div>
                                                                    </div>

                                                                </div>

                                                            </div>
                                                            <div class="col-2">
                                                                <label>Phone number</label>
                                                                <div style="width: 150px" class="input-group">
                                                                    <input readonly type="text" name="phone" id="phone" class="form-control" placeholder="Fill phone number">
                                                                </div>
                                                                <!-- /.input group -->
                                                            </div>

                                                            <!--                                                            <div class="col-1 "></div>-->
                                                        </div>
                                                        </br>
                                                        <div class="row">
                                                            <div class="col-1 "></div>

                                                            <div class="col-2 ">
                                                                <label>Address</label>
                                                                <input readonly type="text" name="address" id="address" class="form-control" placeholder="Fill address">
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div class="col-2">
                                                                <label>Receiver</label>
                                                                <input type="text" name="receiver" id="receiver" class="form-control" placeholder="Enter recever">
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div class="col-2">
                                                                <label>Seller</label>
                                                                <input type="text" name="creator" id="creator"  id="receiver" class="form-control" placeholder="Enter seller">
                                                                <input hidden="true" text="text" name="checkcrt" value="" id="checkcrt"/> 
                                                            </div>

                                                            <div class="col-3">
                                                                <label>Explain</label>
                                                                <input type="text" name="explain" id="explain" class="form-control" placeholder="Explain contnet">
                                                                <!-- /.input group -->
                                                            </div>


                                                        </div>
                                                        </br>
                                                        <div>
                                                            <button type="button" style="width: 110px;" onclick="minuscount()"
                                                                    class="delete-row btn  btn-danger btn-sm" ><i style="padding: 5px 0px" class="fa fa-trash can">&nbsp; Del collum</i></button>
                                                            <button type="button" style="width: 110px;"  onclick="pluscount()"
                                                                    class="btn  btn-success btn-sm add-row"><i style="color: white; padding: 5px 0px"  class="fa fa-plus" >&nbsp; Add collum</i></button> 
                                                            <button type="button" style="width: 200px;"  onclick="Import()"
                                                                    class="btn  btn-primary btn-sm"><i style="color: white; padding: 5px 0px"  class="fa fa-database" > &nbsp; Import data from quotes</i>  </button> 
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
                                                                                    <th style="width: 220px;">Unit price </th>
                                                                                    <th style="width: 250px;">Discount(%)</th>
                                                                                    <th style="width: 250px;">After price</th>
                                                                                </tr>
                                                                            </thead>
                                                                            <tbody id="result">
                                                                                <tr onclick="dasdsadsa(this)">
                                                                                    <td style="color: dodgerblue;">1</td>
                                                                                    <td><input  style="height: 35px;"  name="goods_name[]" id="goods_name1" class="form-control"
                                                                                                type="text" onkeyup='updateTotalPrice(),checkgood()' onclick='updateTotalPrice()' placeholder="Enter Goods Name" />
                                                                                     
                                                                                        <input hidden="true" text="text" value="" id="product1"/> 
                                                                                        <input hidden="true"style="height: 35px;" name="goods_id[]" id="goods_id1" class="form-control"
                                                                                               type="text" /></td>
                                                                                    <td><input style="height: 35px;" readonly name="unit[]" id="unit1" class="form-control"
                                                                                               type="text" /></td>
                                                                                    <td><input style="height: 35px;"  onclick="updateTotalPrice(), checkQT()" onkeyup="updateTotalPrice(), checkQT()" name="quantity[]"
                                                                                               id="quantity1"  class="form-control" value="0" type="number" />
                                                                                        <input hidden="true"  id="aquantity1" type="number" />
                                                                                               
                                                                                    </td>
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
                                                                                    <th style="width: 450px;">Goods name<a style="float: right;" href="#"><i class="fa fa-plus" ></i>Add new</a></th>
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
                                                                                <td  colspan="4">
                                                                                </td>
                                                                                <td style="font-weight: bold; color:orange;">Total discount</td>
                                                                            <input hidden="true" readonly style="height: 35px;border: 2px solid orange;" onkeyup="updateTotalPrice()"  name="GG" id="GG"
                                                                                   class="form-control" value="0" type="text" />
                                                                            <td><input readonly style="height: 35px;border: 2px solid orange;" onkeyup="updateTotalPrice()"   id="aGG"
                                                                                       class="form-control" value="0" type="text" /></td>

                                                                            <input hidden="true" readonly style="height: 35px;border: 2px solid orange;" value="0.000" name="TGG" id="TGG"
                                                                                   class="form-control" type="text" />
                                                                            <td><input readonly style="height: 35px;border: 2px solid orange;" value="0.000"  id="aTGG"
                                                                                       class="form-control" type="text" /></td>

                                                                            </tr>
                                                                            <tr>
                                                                                <td  colspan="3">

                                                                                </td>
                                                                                <td colspan="2" >
                                                                                    &nbsp;  &nbsp;
                                                                                    <b>Payments:</b>
                                                                                    &nbsp;Cash: <input  type="radio" checked="true" name="payments" value="Cash" /> 
                                                                                    &nbsp;Transfer: <input  type="radio" name="payments" value="Transfer" /> 
                                                                                    &nbsp; Card: <input type="radio" name="payments" value="Card"/> 
                                                                                </td>
                                                                                <td style="font-weight: bold; color:#00CD00;">Paid</td>


<!--                                                                            <input hidden="true" style="height: 35px;border: 2px solid #00CD00" value="0" name="TT" id="TT"
                                                                                   class="form-control" type="text" />-->
                                                                            
                                                                            <td><input onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' style="height: 35px;border: 2px solid #00CD00;" value="0" name="paid"  id="paid"
                                                                                        class="form-control" type="text" /></td>

                                                                            </tr>
                                                                            <tr>
                                                                                <td colspan="5">

                                                                                </td>

                                                                                <td style="font-weight: bold; color:red;">Owed</td>
                                                                                <td><input readonly style="height: 35px;border: 2px solid red;" value="0" name="aowed"  id="aowed"
                                                                                       class="form-control" type="text" /></td>
                                                                                <td><input hidden="true" readonly style="height: 35px;border: 2px solid red;" value="0" name="owed"  id="owed"
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
            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
        </div>
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
        <jsp:include page="/page/order/ScriptSalesCoupon.jsp" />  
    </body>

</html>
