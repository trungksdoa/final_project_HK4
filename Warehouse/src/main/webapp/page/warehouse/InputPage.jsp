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
    <!--bootrap-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!-- Jquery -->
    <script src="<c:url value='/resources/plugins/jquery/jquery.min.js'/>"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="<c:url value='/resources/plugins/jquery-ui/jquery-ui.min.js'/>"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css">
    <!--    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>-->
    <!-- Fontanswome -->
    <link rel="stylesheet" href="<c:url value='/resources/plugins/fontawesome-free/css/all.min.css'/>">
    <!-- JQVMap -->
<!--    <link rel="stylesheet" href="<c:url value='/resources/plugins/jqvmap/jqvmap.min.css'/>"/>-->
    <!-- Theme style -->
    <link rel="stylesheet" href="<c:url value='/resources/dist/css/adminlte.min.css'/>"/>
    <!-- overlayScrollbars -->
    <link rel="stylesheet" href="<c:url value='/resources/plugins/overlayScrollbars/css/OverlayScrollbars.min.css'/>"/>
    <!-- Daterange picker -->
    <link rel="stylesheet" href="<c:url value='/resources/plugins/daterangepicker/daterangepicker.css'/>"/>
    <!-- summernote -->
    <link rel="stylesheet" href="<c:url value='/resources/plugins/summernote/summernote-bs4.min.css' />  




          //End

          <!-- Google Font: Source Sans Pro -->
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
            .my-custom-scrollbar {
                position: relative;
                height: 245px;
                overflow: auto;
            }
            .table-wrapper-scroll-y {
                display: block;
            }

        </style>
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
                    <div class="main" style="margin-top: 8rem;">
                        <!--<input id="hidCidade" type="text" /><br>-->
                        <!---->
                        <form id='maiForm' method="POST" action="/web/warehouse/page" onsubmit="return Validate()">

                            <div class="row">
                                <div class="col-lg-8 col-md-8" >
                                    <div class="form-group row">
                                        <label class="col-lg-2 col-form-label">Action</label>
                                        <div class="col-lg-10">
                                            <button onclick="document.getElementById("maiForm").reset();" style="" type="submit" id="savaDataAll"  class="btn btn-primary" >Save</button>   
                                            <!--<button onclick="window.print()">Print this page</button>-->
                                        </div>

                                    </div>
                                    <div class="form-group row">
                                        <label for="id" class="col-lg-2 col-form-label">License</label>
                                        <div class="col-lg-10">
                                            <div class="input-group mb-3">
                                                <input type="text" class="form-control" readonly="" name="id" id="id_liecene"  value="" placeholder="System will generation License">
                                                <div class="input-group-prepend">
                                                    <button onclick="CreateID();return false;" type="button" id="generatesid" class="btn btn-secondary" >Generates ID</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="Date" class="col-lg-2 col-form-label">Date</label>
                                        <div class="col-lg-10">
                                            <input type="date" required="" class="form-control" name="Date" id="DateLicene" placeholder="Date">
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="Date" class="col-lg-2 col-form-label">Service</label>
                                        <div class="col-lg-10">
                                            <div class="input-group mb-3">
                                                <select name="service" required class="custom-select required" id="service">
                                                    <option selected="" value="" selected>Choose</option>
                                                    <option value="voucher">Nhập theo chứng từ mua hàng</option>
                                                    <option value="production">Nhập theo sản xuất</option>
                                                    <option value="other">Nhập khác</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="explain" class="col-lg-2 col-form-label">Explain</label>
                                        <div class="col-lg-10">
                                            <input type="text"   class="form-control" name="explain" id="explain" placeholder="explain">
                                        </div>
                                        <div class="col-lg-10">
                                            <p>Hint: Click on field at Goods name to start finding your goods easy</p>
                                            <button style="margin-right: 28px;" type="button" id="addDataTable"  class="btn btn-secondary" >Add row</button>
                                            <button style="margin-right: 28px;" type="button" id="removelastrow"  class="btn btn-secondary" >Remove last row</button>
                                            <button onclick="emptyData();return false;"  class="btn btn-warning" onclick="">Reset row</button>
                                        </div>
                                    </div>

                                </div>
                                <div class="col-lg-4 col-md-4">  
                                    <img src="<c:url value="/resources/img/warehouse.jpg" />" alt="Girl in a jacket" width="350" height="300">
                                </div>
                            </div>

                            <div class="table-responsive table-wrapper-scroll-y my-custom-scrollbar">
                                <table class="table table-bordered table-fixed" style="z-index: 1000">
                                    <thead>
                                        <tr>
                                            <th>STT</th>
                                            <th>Goods name (Searhing...)</th>
                                            <th>Unit</th>
                                            <th>Supplier</th>
                                            <th>Warehouse</th>
                                            <th>Quantity</th>
                                            <th>Input Price</th>
                                            <th>Group</th>
                                            <th>Weight</th>
                                            <th>Goods ID</th>

                                        </tr>
                                    </thead>
                                    <tbody id="tableInput">

                                    </tbody>
                                </table>
                            </div>
                            <!--                </form>-->
                        </form>
                    </div>
                    <!-- /.row -->
                    <!-- Main row -->

                    <!--Open Modal-->
                    <!-- Modal flatform -->
                    <form action="">
                        <div id="modalkho" class="modal" tabindex="-1" role="dialog">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title">Create warehouse</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">

                                        <div class="form-group row">
                                            <label for="object" class="col-lg-2 col-form-label">ID</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="object" id="object1" placeholder="object">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="object" class="col-lg-2 col-form-label">Name</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="object" id="object2" placeholder="object">
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="submit" class="btn btn-primary">Save changes</button>
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>

                    <div id="modalSerchform" class="modal fade" tabindex="-1" role="dialog">
                        <div class="modal-dialog modal-xl" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">Searching....</h5>

                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <form id="saerchFrom">
                                        <div class="row">
                                            <!--                                <div class="col">
                                                                                <input type="text" class="form-control" name="ncc" placeholder="Supplier">
                                                                            </div>-->
                                            <div class="col">
                                                <input type="date" class="form-control" required="" name="from" placeholder="">
                                            </div>
                                            <div class="col">
                                                <input type="date" class="form-control" required name="to" placeholder="">
                                            </div>
                                            <div class="col">
                                                <input type="submit" class="form-control" value="Filter">
                                            </div>
                                        </div>
                                    </form>
                                    <br>
                                    <table class="table">
                                        <thead class="thead-dark">
                                            <tr>
                                                <th style="width:-40%;"><input type="checkbox" id="checkAll"/></th>
                                                <th scope="col">Id</th>
                                                <th scope="col">Address</th>
                                                <th scope="col">Expain</th>
                                            </tr>
                                        </thead>
                                        <tbody class="myTable" id="myTable"> 

                                        </tbody>

                                    </table>
                                </div>
                                <div class="modal-footer">
                                    <button onclick="getValue();return false;"  id="btnServiceModalSave" type="submit" class="btn btn-primary">Save changes</button>
                                    <button  id="btnServiceModalClose"  type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="modalSerchform2" class="modal fade" tabindex="-1" role="dialog">
                        <div class="modal-dialog modal-xl" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">Searching....</h5>

                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <form id="saerchFrom2">
                                        <div class="row">
                                            <div class="col">
                                                <input type="date" class="form-control" name="from" placeholder="">
                                            </div>
                                            <div class="col">
                                                <input type="date" class="form-control" name="to" placeholder="">
                                            </div>
                                            <div class="col">
                                                <input type="submit" class="form-control" value="Filter">
                                            </div>
                                        </div>
                                    </form>
                                    <br>
                                    <table class="table">
                                        <thead class="thead-dark">
                                            <tr>
                                                <th style="width:-40%;"><input type="checkbox" id="checkAll"/></th>
                                                <th scope="col">Id</th>
                                                <th scope="col">Expain</th>
                                            </tr>
                                        </thead>
                                        <tbody class="myTable2" id="myTable2"> 

                                        </tbody>

                                    </table>
                                </div>
                                <div class="modal-footer">
                                    <button onclick="getValue2();return false;"  id="btnServiceModalSave1" type="submit" class="btn btn-primary">Save changes</button>
                                    <button  id="btnServiceModalClose1"  type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- End modal -->
                    <!--End modal-->

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
        <script type="text/javascript">
            var stt = 0;


            $("#btnServiceModalSave1").click(function () {
                //set default selected
                //    $('#service').prop('selectedIndex', 0);
                //Hide modal
                $("#modalSerchform2").modal('hide');

                //Empty table
                $("#myTable2").empty();


            });
            $("#btnServiceModalClose1").click(function () {
                //set default selected
                $('#service').prop('selectedIndex', 0);
                //Hide modal
                $("#modalSerchform2").modal('hide');
                //Empty table
                $("#myTable2").empty();
            });

            //Remove row button
            $('#removelastrow').on("click", function () {


                if (stt == 3)
                {
                    stt = 3;
                } else
                {
                    $('#tableInput tr:last').remove();
                    stt -= 1;
                }

            });
            function CreateID()
            {

                $.get("/warehouse/getID/", function (data, status) {
                    if (data == null)
                    {
                        let idgener = "NK0000";
                        console.log(data.id);

                        idgener = idgener.substring(2);
                        var id = parseInt(idgener);
                        id++;
                        var str = "" + id
                        var pad = "NK0000"
                        var ans = pad.substring(0, pad.length - str.length) + str
                        //                console.log(ans)
                        $('#id_liecene').val(ans);
                    } else
                    {
                        let idgener = data.id;
                        console.log(data.id);

                        idgener = idgener.substring(2);
                        var id = parseInt(idgener);
                        id++;
                        var str = "" + id
                        var pad = "NK0000"
                        var ans = pad.substring(0, pad.length - str.length) + str
                        //                console.log(ans)
                        $('#id_liecene').val(ans);
                    }

                });


            }
            function Validate()
            {
                for (var i = 0; i < stt; i++) {
                    var searchings = document.forms["maiForm"]["search" + i].value;
                    if (searchings.trim() == null || searchings.trim() == "" || searchings === " ") {
                        alert("Goods name ust be filled out");
                        document.getElementById("search" + i).focus();
                        return false;
                    }
                }
            }



            $(document).ready(function () {
                ////

                ////////////

                $.ajaxSetup({
                    cache: false
                });
                addRow();
                //Insert stock
                $("#btnkho").click(function () {
                    $("#modalkho").modal('show');
                });


            });
            //Check all checkbox In service
            $("#checkAll").click(function () {
                $('input:checkbox').not(this).prop('checked', this.checked);
            });
            //OnClick To AutoComplete
            function dasdsadsa(x) {
                //                alert("Row index is: " + x.rowIndex);
                var index = 0;
                index += x.rowIndex;
                index--;
                //                console.log(index);
                Autocomplete(index);
                //                return x.rowIndex;
            }
            var today = new Date();
            var months = "";
            var date = "";
            if ((months = today.getMonth() + 1) > 10) {
                months = months = today.getMonth() + 1;
                date = today.getFullYear() + '-' + months + '-' + today.getDate();
                //                document.getElementById("Date").value = date;
            } else {
                months = "0" + (months = today.getMonth() + 1);
                date = today.getFullYear() + '-' + months + '-' + today.getDate();

            }
            document.getElementById("DateLicene").value = date;
            //            $("#Date").val(date);

        </script>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <!--<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>-->
        <script src="<c:url value="/resources/js/Addrow.js" />"></script>
        <script src="<c:url value="/resources/js/Autocomplete.js" />"></script>
        <script src="<c:url value="/resources/js/EmptyData.js" />"></script>
        <script src="<c:url value="/resources/js/getValue.js" />"></script>
        <script src="<c:url value="/resources/js/onChangeService.js" />"></script>
        <!-- Control Sidebar -->
        <aside class="control-sidebar control-sidebar-dark">
            <!-- Control sidebar content goes here -->
        </aside>
        <%--<jsp:include page="/fragment/RootJs.jsp" />--%>  
        <script>
            $.widget.bridge('uibutton', $.ui.button)
        </script>
        <!-- Bootstrap 4 -->
        <!-- Bootstrap 4 -->
        <script src="<c:url value='/resources/plugins/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
        <!-- ChartJS -->
        <script src="<c:url value='/resources/plugins/chart.js/Chart.min.js'/>"></script>
        <!-- Sparkline -->
        <script src="<c:url value='/resources/plugins/sparklines/sparkline.js'/>"></script>
        <!-- JQVMap -->
        <script src="<c:url value='/resources/plugins/jqvmap/jquery.vmap.min.js'/>"></script>
        <script src="<c:url value='/resources/plugins/jqvmap/maps/jquery.vmap.usa.js'/>"></script>
        <!-- jQuery Knob Chart -->
        <script src="<c:url value='/resources/plugins/jquery-knob/jquery.knob.min.js'/>"></script>
        <!-- daterangepicker -->
        <script src="<c:url value='/resources/plugins/moment/moment.min.js'/>"></script>
        <script src="<c:url value='/resources/plugins/daterangepicker/daterangepicker.js'/>"></script>
        <!-- Tempusdominus Bootstrap 4 -->
        <script src="<c:url value='/resources/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js'/>"></script>
        <!-- Summernote -->
        <script src="<c:url value='/resources/plugins/summernote/summernote-bs4.min.js'/>"></script>
        <!-- overlayScrollbars -->
        <script src="<c:url value='/resources/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js'/>"></script>
        <!-- AdminLTE App -->
        <script src="<c:url value='/resources/dist/js/adminlte.js'/>"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="<c:url value='/resources/dist/js/demo.js'/>"></script>
        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="<c:url value='/resources/dist/js/pages/dashboard.js'/>"></script>
        <!-- /.control-sidebar -->
    </div>
    <!-- ./wrapper -->

</html>
