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
                                                                <input readonly  type="text" name="id" class="form-control" value="${quotes.getId()}">
                                                                <input hidden=true" type="text" name="check" class="form-control" value="${check}">
                                                            </div>
                                                            <div class="col-2">
                                                                <label>Date</label>
                                                                <input  name="date" class="form-control" type="date" value="${quotes.getDate()}">
                                                            </div>
                                                            <!-- Date and time -->
                                                            <div class="col-3">
                                                                <label>Customer / Company</label>
                                                                <div class="input-group date"  id="reservationdatetime" data-target-input="nearest">
                                                                    <input type="text" name="customername" id="customername" value="${customer.getName()}" class="form-control datetimepicker-input"
                                                                           placeholder="Enter Customer/ Company" data-target="#reservationdatetime">
                                                                    <input hidden="true" text="text" name="customerId" value="${customer.getId()}" id="customerId"/> 
                                                                    <input hidden="true" text="text" name="namecs" value="${customer.getName()}" id="namecs"/> 
                                                                    <div class="input-group-append" data-target="#reservationdatetime" data-toggle="datetimepicker">
                                                                        <div class="input-group-text bg-gradient-info"><a href="#"><i style="color: white;"class="fa fa-plus"></i></a></div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col-2 ">
                                                                <label>Address</label>
                                                                <input readonly type="text" name="address" id="address" value="${quotes.getAddress()}" class="form-control" placeholder="Fill Address">
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div class="col-2 ">
                                                                <label>Phone</label>
                                                                <div class="input-group">
                                                                    <input readonly type="text" name="phone" id="phone" value="${quotes.getPhone()}" class="form-control" placeholder="Fill phone number">
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
                                                                <input type="text" name="receiver" id="receiver" value="${quotes.getReceiver()}" class="form-control" placeholder="Enter receiver">
                                                                <!-- /.input group -->
                                                            </div>
                                                            <div class="col-2">
                                                                <label>Creator</label>
                                                                <input type="text" name="creator" id="creator" value="${quotes.getCreator()}" class="form-control" placeholder="Enter Creator">
                                                                <input hidden="true" text="text" value="${quotes.getCreator()}" name="checkcrt" value="" id="checkcrt"/> 
                                                            </div>

                                                            <div class="col-4">
                                                                <label>Explain</label>
                                                                <input type="text" name="explain" id="explain" value="${quotes.getExplain()}" class="form-control" placeholder="Enter explain">
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
                                                                            <%!int i =0;%>
                                                                            <tbody id="result">

                                                                                <c:forEach items="${list}" var="item">    
                                                                                    <tr onclick="dasdsadsa(this)">

                                                                                        <td><span style='width: 25px;border:none;color: dodgerblue;' name="id[<%=++i%>]"><%=i%></span></td>
                                                                                        <td><input  style="height: 35px;" name="goods_name[]" value="${item.getGoodsName()}" id="goods_name<%=i%>" class="form-control"
                                                                                                    type="text" onkeyup='updateTotalPrice()' onclick='updateTotalPrice()' placeholder="Enter Goods name" />
                                                                                            <input hidden="true" text="text" value="${item.getGoodsName()}" id="product<%=i%>"/> 
                                                                                            <input hidden="true"style="height: 35px;" name="goods_id[]" value="${item.getGoodsId()}" id="goods_id<%=i%>" class="form-control"
                                                                                                   type="text" /></td>
                                                                                        <td><input style="height: 35px;" readonly name="unit[]" value="${item.getUnit()}" id="unit<%=i%>" class="form-control"
                                                                                                   type="text" /></td>
                                                                                        <td><input style="height: 35px;" value="${item.getQuantity()}"  onclick="updateTotalPrice()" onkeyup="updateTotalPrice()" name="quantity[]"
                                                                                                   id="quantity<%=i%>"  class="form-control"  type="number" /></td>
                                                                                        <td><input hidden="true" style="height: 35px;" readonly value="${item.getGoodsPrice()}" onclick="updateTotalPrice()" onkeyup="updateTotalPrice()" name="gprice[]"
                                                                                                   id="goods_price<%=i%>" class="form-control" type="number" />
                                                                                            <input style="height: 35px;" value="${item.getGoodsPrice()}"  readonly onclick="updateTotalPrice()" onkeyup="updateTotalPrice()"
                                                                                                   type="text"  id="agoods_price<%=i%>" class="form-control"/>
                                                                                        </td>
                                                                                        <td><input style="height: 35px;" value="${item.getDiscount()}" onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' min="0" name="discount[]" id="discount<%=i%>" class="form-control"
                                                                                                   value="0" type="number" /></td>


                                                                                        <td> <input hidden="true" style="height: 35px;" value="${item.getAfterpirce()}" onkeyup="updateTotalPrice()" name="afterpirce[]" id="afterpirce<%=i%>"
                                                                                                    class="form-control" value="0" readonly type="number" pattern="[0-9]*" />
                                                                                            <input style="height: 35px;" value="${item.getAfterpirce()}" onkeyup="updateTotalPrice()"  id="aafterpirce<%=i%>"
                                                                                                   class="form-control"  readonly type="text" pattern="[0-9]*" />
                                                                                        </td> 

                                                                                    </tr>
                                                                                </c:forEach>

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
                                                                                    <td><input style="height: 35px; border: 2px solid green;" value="${quotes.getTotalquantity()}" name="total_SL"
                                                                                               id="total_SL" class="form-control" value="0" readonly type="number"/></td>
                                                                                    <td colspan="2"><input
                                                                                            style="height: 35px; border: none; text-align: center;font-weight: bold; color: darkslategray;"
                                                                                            class="form-control" value="Last price" type="text" /></td>
                                                                            <input hidden="true" readonly style="height: 35px;border: 2px solid green;" value="${quotes.getTatolPrice()}" name="lasted_price"
                                                                                   id="total_TT" class="form-control" type="text" />
                                                                            <td><input readonly style="height: 35px;border: 2px solid green;" value="${quotes.getTatolPrice()}" name="lasted_price"
                                                                                       id="atotal_TT" class="form-control" type="text" /></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td colspan="5">
                                                                                    <input style="height: 35px; border: none;font-weight: bold; color:orange;padding-left: 1000px;"class="form-control" value="Total discount" type="text" />
                                                                                </td>
                                                                                 <input hidden="true" readonly style="height: 35px;border: 2px solid orange;" value="${quotes.getTotalDiscount()}" onkeyup="updateTotalPrice()"  name="GG" id="GG"
                                                                                   class="form-control" value="0" type="text" />
                                                                                 <td><input readonly style="height: 35px;border: 2px solid orange;" value="${quotes.getTotalDiscount()}" onkeyup="updateTotalPrice()"   id="aGG"
                                                                                       class="form-control" value="0" type="text" /></td>

                                                                            <input hidden="true" readonly style="height: 35px;border: 2px solid orange;" value="${quotes.getLastedPrice()}" name="TGG" id="TGG"
                                                                                   class="form-control" type="text" />
                                                                            <td><input readonly style="height: 35px;border: 2px solid orange;" value="${quotes.getLastedPrice()}"  id="aTGG"
                                                                                       class="form-control" type="text" /></td>

                                                                            </tr>
                                                                            </tfoot>
                                                                        </table>
                                                                    </div>
                                                                    <input style="height: 10px;"  name="cnt" id="cnt" value="<%=i%>"
                                                                           class="form-control"  readonly  />

                                                                </div>
                                                                <%i=0;%>
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
        <script>
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

        <script type="text/javascript">

            var stockcard = [];
            $.get("/quotescontent/customer/", function (data, status) {
                for (var i = 0; i < data.length; i++) {
                    var tempArray = new Array();
                    tempArray["id"] = data[i].id;
                    tempArray["name"] = data[i].name;
                    tempArray["value"] = data[i].name;
                    tempArray["phone"] = data[i].phone;
                    tempArray["address"] = data[i].address;
                    stockcard.push(tempArray);
                }
            });
            $("#customername").autocomplete({
                source: stockcard,
                select: function (e, ui) {
                    var e = ui.item;
                    $("#customerId").val(e.id);
                    $("#phone").val(e.phone);
                    $('#address').val(e.address);
                    $('#aa').val(e.address);
                    $('#namecs').val(e.name);
                    console.log(e.name);
                    console.log(e.address);
                },
                change: function (e, ui) {
                }
            });
            var employeecard = [];
            $.get("/quotescontent/account/", function (data, status) {
                for (var i = 0; i < data.length; i++) {
                    var tempArray = new Array();
                    tempArray["id"] = data[i].id;
                    tempArray["name"] = data[i].name;
                    tempArray["value"] = data[i].name;
                    employeecard.push(tempArray);
                }
            });
            $("#creator").autocomplete({
                source: employeecard,
                select: function (e, ui) {
                    var e = ui.item;

                    $("#creator").val(e.value);
                    $("#checkcrt").val(e.name);
                },
                change: function (e, ui) {
                }
            });
            var count = parseInt(document.getElementById('cnt').value);
            console.log(count);
            $(document).ready(function () {
                $(".add-row").click(function () {
                    count++;

                    var markup = "<tr onclick='dasdsadsa(this)'>\n\
               <td><span style='width: 25px;border:none;color: dodgerblue;' name='id[" + count + "]'>" + count + "</span></td>\n\
            <td><input  style='height: 35px;' onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' name='goods_name[]' id='goods_name" + count + "' class='form-control'  type='text' placeholder='Nhập mã hoặc tên hàng hoá'/>\n\
\n\          <input hidden='true' text='text' value='' id='product" + count + "'/> \n\
             <input hidden='true' name='goods_id[]' onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' id='goods_id" + count + "' type='text' /></td>\n\
            <td><input style='height: 35px;' readonly name='unit[]' id='unit" + count + "' class='form-control'  type='text'/></td>  \n\
            <td><input style='height: 35px;' onclick='updateTotalPrice()' onkeyup='updateTotalPrice()'  name='quantity[]' id='quantity" + count + "' value='0' class='form-control'  type='number'/></td> \n\
             <td><input hidden='true' style='height: 35px;' readonly onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' min='0' name='gprice[]' id='goods_price" + count + "'  class='form-control' value='0'  type='number'/>\n\
            <input style='height: 35px;' readonly onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' type='text'  id='agoods_price" + count + "' class='form-control'/></td>\n\
            <td><input style='height: 35px;' onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' name='discount[]' id='discount" + count + "'  class='form-control' value='0'  type='number'/></td>\n\
           <td> <input hidden='true' style='height: 35px;' onkeyup='updateTotalPrice()' name='afterpirce[]'  id='afterpirce" + count + "' class='form-control' value='0' readonly type='number' pattern='[0-9]*' /><input  style='height: 35px;'  onkeyup='updateTotalPrice()' type='text'  id='aafterpirce" + count + "' class='form-control'  readonly  /></td>\n\
             </tr>";
                    $("table tbody").append(markup);
                });
            });
            $(".delete-row").click(function () {
                if(count>1){
                             $("table tbody").find('span[name="id[' + count + ']"]').each(function () {
                    $(this).parents("tr").remove();
                    count--;
                    updateTotalPrice()
                });
                }
            });
            function minuscount() {
                if (count > 1) {
                    document.getElementById('cnt').value = count - 1;
                }
            }
            function pluscount() {
                document.getElementById('cnt').value = count + 1;
            }
            function updateTotalPrice() {
                if (count > 0) {
                    var idsl = "quantity";
                    var iddgb = "goods_price";
                    var iaddgb = "agoods_price";
                    var idtt = "afterpirce";
                    var iadtt = "aafterpirce";
                    var ick = "discount";
                    var tale = 0;
                    var total_TT = 0;
                    var total_isck = 0;
                    var nf = Intl.NumberFormat();
                    for (var i = 1; i <= count; i++) {
                        var sl = document.getElementById(idsl + i).value;
                        var dgb = document.getElementById(iddgb + i).value;
                        var ck = document.getElementById(ick + i).value;
                        if (sl == '') {
                            document.getElementById(idtt + i).value = 0;
                            sl = 0;
                        } else {
                            document.getElementById(idtt + i).value = parseInt(sl) * parseInt(dgb);
                            document.getElementById(iadtt + i).value = nf.format(parseInt(parseInt(sl) * parseInt(dgb)));
                        }
                        total_isck = parseInt(total_isck) + (((parseInt(sl) * parseInt(dgb)) / 100) * parseInt(ck));
                        tale = parseInt(tale) + parseInt(sl);
                        total_TT = parseInt(total_TT) + (parseInt(sl) * parseInt(dgb));

                        document.getElementById(iaddgb + i).value = nf.format(parseInt(dgb));
                        document.getElementById('total_SL').value = tale;
                        document.getElementById('total_TT').value = total_TT;
                        document.getElementById('atotal_TT').value = nf.format(parseInt(total_TT));
                        document.getElementById('GG').value = total_isck;
                        document.getElementById('aGG').value = nf.format(parseInt(total_isck));
                    }
                    var GG = document.getElementById('GG').value;
                    if (GG != '') {
                        document.getElementById('TGG').value = parseInt(total_TT) - parseInt(GG);
                        document.getElementById('aTGG').value = nf.format(parseInt(total_TT) - parseInt(GG));
                    }
                }
            }
            var productcard = [];
            $.get("/quotescontent/product/", function (data, status) {
                for (var i = 0; i < data.length; i++) {
                    var tempArray = new Array();
                    tempArray["id"] = data[i].id;
                    tempArray["name"] = data[i].goodsName;
                    tempArray["value"] = data[i].goodsName;
                    tempArray["unit"] = data[i].unit;
                    tempArray["unitPrice"] = data[i].unitPrice;

                    productcard.push(tempArray);
                }
            });
            function dasdsadsa(x) {
                var nf = Intl.NumberFormat();
                var GN = "product";
                for (var i = 1; i <= count; i++) {
                    $("#goods_name" + i).autocomplete({
                        source: productcard,
                        select: function (e, ui) {
                            var e = ui.item;
                            $("#product" + x.rowIndex).val(e.name);
                            for (var k = 1; k < x.rowIndex; k++) {
                                if (document.getElementById(GN + k).value == document.getElementById(GN + x.rowIndex).value) {
                                    alert("Sản phẩm này đã chọn trươc đó!!!");
                                    document.getElementById(GN + x.rowIndex).focus();
                                    console.log(document.getElementById(GN + x.rowIndex).value);
                                    return false;
                                }
                            }
                            $("#unit" + x.rowIndex).val(e.unit);
                            $("#goods_price" + x.rowIndex).val(e.unitPrice);
                            $("#agoods_price" + x.rowIndex).val(nf.format(parseInt(e.unitPrice)));
                            $("#goods_id" + x.rowIndex).val(e.id);
                            $("#quantity" + x.rowIndex).val(1);
                            $('#afterpirce' + x.rowIndex).val(e.unitPrice);
                            $('#aafterpirce' + x.rowIndex).val(nf.format(parseInt(e.unitPrice)));
                            $('#total_SL').val(parseInt(document.getElementById('total_SL').value) + 1);
                            $('#total_TT').val(parseInt(document.getElementById('total_TT').value) + e.unitPrice);
                            $('#atotal_TT').val(nf.format(parseInt(document.getElementById('total_TT').value)));
                            $('#TGG').val(parseInt(document.getElementById('TGG').value) + e.unitPrice - parseInt(document.getElementById('GG').value));
                            $('#aTGG').val(nf.format(parseInt(document.getElementById('TGG').value) - parseInt(document.getElementById('GG').value)));
                        },
                        change: function (e, ui) {
                        }
                    });
                }
            }
            function validation() {
                var checkreceiver = document.myform.receiver.value;
                var checkcustomername = document.myform.customername.value;
                var checkcreator = document.myform.creator.value;
                var checkname = document.myform.namecs.value;
                var checkcrt = document.myform.checkcrt.value;
                var igoods_name = "goods_name";
                var idsl = "quantity";
                var idc = "discount";
                var ipr = "product";
                var check = false;
                if (checkcustomername == null || checkcustomername == "") {
                    alert("Khách hàng/Công ty không được để trống!!!");
                    document.getElementById('customername').focus();
                    return false;
                } else if (checkcustomername != checkname) {
                    alert("Khách hàng/Công ty không tồn tại!!!");
                    document.getElementById('customername').focus();
                    return false;
                } else if (checkreceiver == null || checkreceiver == "") {
                    alert("Người Nhận hàng không được để trống!!!");
                    document.getElementById('receiver').focus();
                    return false;
                } else if (checkcreator == null || checkcreator == "") {
                    alert("Người bán hàng không được để trống!!!");
                    document.getElementById('creator').focus();
                    return false;
                } else if (checkcreator != checkcrt) {
                    alert("Tên người bán hàng không tồn tại trong danh sách!!!");
                    document.getElementById('creator').focus();
                    return false;
                }
                for (var i = 1; i <= count; i++) {
                    var goods_name = document.getElementById(igoods_name + i).value;
                    var sl = document.getElementById(idsl + i).value;
                    var dc = document.getElementById(idc + i).value;
                    var pr = document.getElementById(ipr + i).value;
                    if (goods_name == null || goods_name == "") {
                        alert("Hàng hoá không được để trống!!!");
                        document.getElementById(igoods_name + i).focus();
                        return false;
                    } else if (goods_name != pr) {
                        alert("Hàng hoá không tồi tại!!!");
                        document.getElementById(igoods_name + i).focus();
                        return false;
                    } else if (sl == null || sl == "") {
                        alert("Số lượng không được để trống!!!");
                        document.getElementById(idsl + i).focus();
                        return false;
                    } else if (sl <= 0) {
                        alert("Số lượng phải >0!!!");
                        document.getElementById(idsl + i).focus();
                        return false;
                    } else if (dc == null || dc == "") {
                        alert("Chiết khấu không được để trống!!!");
                        document.getElementById(idc + i).focus();
                        return false;
                    } else if (dc < 0) {
                        alert("chiết khấu phải lớn hơn hoặc bằng 0!!!");
                        document.getElementById(idc + i).focus();
                        return false;
                    }
                }
                return  true;
            }
        </script>



        // count -=count;

    </body>

</html>
