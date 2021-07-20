<%-- 
    Document   : InputPageDetail
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
        <!--bootrap-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
        <!-- Fontanswome -->
        <link rel="stylesheet" href="<c:url value='/resources/plugins/fontawesome-free/css/all.min.css'/>">
        <!-- Theme style -->
        <link rel="stylesheet" href="<c:url value='/resources/dist/css/adminlte.min.css'/>"/>
        <!-- overlayScrollbars -->
        <link rel="stylesheet" href="<c:url value='/resources/plugins/overlayScrollbars/css/OverlayScrollbars.min.css'/>"/>
        <!-- Daterange picker -->
        <link rel="stylesheet" href="<c:url value='/resources/plugins/daterangepicker/daterangepicker.css'/>"/>
        <!-- summernote -->
        <link rel="stylesheet" href="<c:url value='/resources/plugins/summernote/summernote-bs4.min.css' /> "/>
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
                .ui-autocomplete {
                    max-height: 200px;
                    overflow-y: auto;
                    /* prevent horizontal scrollbar */
                    overflow-x: hidden;
                    /* add padding to account for vertical scrollbar */
                    padding-right: 20px;
                } 
                .my-custom-scrollbar {
                    position: relative;
                    height: 245px;
                    overflow: auto;
                }
                .table-wrapper-scroll-y {
                    display: block;
                }

                #savaDataAll{
                    width: 80px; 
                    height:37px;
                    position: absolute;
                    right: 320px;
                    top:4px;
                }
                #saveandprint{
                    width: 150px; 
                    height:37px; 
                    position: absolute;
                    right: 160px;
                    top:-5px;
                }

                #resetbutton{
                    width: 100px;
                    height:37px; 
                    position: absolute;
                    right: 50px;
                    top:-5px;
                }
                img {
                    width: 100%;
                    height: auto;
                }
                @media only screen and (max-width: 900px) {
                    img {
                        margin-top: 50px;
                    }
                }

                @media only screen and (max-width: 768px) {
                    img {
                        display:none;
                    }
                    #resetbutton{
                        margin-top: 54px;
                        width: 100px;
                        height: 37px;
                        position: absolute;
                        right: 50px;
                        top: -5px;
                    }
                    #savaDataAll{
                        margin-top: 45px;
                        width: 80px;
                        height: 37px;
                        position: absolute;
                        right: 320px;
                        top: 4px;
                    }
                    #saveandprint{
                        margin-top: 54px;
                        width: 150px;
                        height: 37px;
                        position: absolute;
                        right: 160px;
                        top: -5px;
                    }
                }
            </style>
            <!-- Content Wrapper. Contains page content -->

            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>Input</h1>
                            </div>
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                                    <li class="breadcrumb-item"><a href="#">Warehouse</a></li>
                                    <li class="breadcrumb-item active">Input</li>
                                </ol>
                            </div>
                        </div>
                    </div><!-- /.container-fluid -->
                    <h3 id="message" style="text-align: center;color: ${color}">
                        ${message}
                    </h3>
                </section>
                <!-- /.content-header -->

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
                                                   aria-selected="true"><b>Input</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link"
                                                   href="/web/warehouse/InputsipData"><b>View input</b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">
                                        <div class="tab-content" id="custom-tabs-three-tabContent">
                                            <div class="tab-pane fade show active" id="custom-tabs-three-home" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-home-tab">
                                                <form id='maiForm' method="POST" action="/web/warehouse/page" onsubmit="return Validate()">
                                                    <input type="number" name="index" id="index" value="" hidden="true">
                                                    <button type="submit" id="savaDataAll"
                                                            onclick="document.getElementById("maiForm").reset();"   class="btn btn-block bg-gradient-primary"><i class="fas fa-save"></i> Save</button>
                                                    <button  type="button" data-toggle="modal" id="saveandprint" data-target="#login-modal" class="btn btn-block bg-gradient-info "><i class="fas fa-print"></i> Save and
                                                        Print</button>
                                                    <button  onclick="emptyData();return false;" type="button"
                                                             id="resetbutton"
                                                             class="btn btn-block bg-gradient-danger"><i class="fas fa-delete"></i>Reset</button>
                                                    <div class="card-body">
                                                        <div class="row">
                                                            <div class="col-lg-8 col-md-8" >
                                                                <div class="form-group row">
                                                                    <label for="id" class="col-lg-2 col-form-label">License</label>
                                                                    <div class="col-lg-10 col-md-12 col-sm-12">
                                                                        <div class="input-group mb-3">
                                                                            <input type="text" class="form-control" readonly="" name="id" id="id_liecene"  value="" placeholder="">
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="form-group row">
                                                                    <label for="Date" class="col-lg-2 col-form-label">Date</label>
                                                                    <div class="col-lg-10 col-md-12 col-sm-12">
                                                                        <input type="date" required="" class="form-control" name="Date" id="DateLicene" placeholder="Date">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row">
                                                                    <label for="Date" class="col-lg-2 col-form-label">Service</label>
                                                                    <div class="col-lg-10 col-md-12 col-sm-12">
                                                                        <div class="input-group mb-3">
                                                                            <p></p>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row">
                                                                    <label for="explain" class="col-lg-2 col-form-label">Explain</label>
                                                                    <div class="col-lg-10 col-md-12 col-sm-12">
                                                                        <input type="text"   class="form-control" name="explain" id="explain" placeholder="explain">
                                                                    </div>
                                                                    <div class="col-lg-10 col-md-12 col-sm-12">
                                                                        <p>Tham chiếu: <span id="reference"></span></p>
                                                                        <span id="ibputfiedl">
                                                                            <table id="Reference" class="table">

                                                                            </table>
                                                                        </span>
                                                                        <div class="btn-group">
                                                                            <button style="margin-right: 30px;height: 33px" type="button" id="addDataTable" 
                                                                                    class="btn btn-block btn-success btn-sm add-row"><i style="color: white;" class="fa fa-plus" ></i> Add row</button>
                                                                            <button style="margin-right: 30px;height: 33px;margin-top: 0px;" type="button" id="removelastrow" class="btn btn-block btn-danger btn-sm" ><i class="fa fa-trash can "></i>Remove row</button>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                            </div>
                                                            <div class="col-lg-4 col-md-4 col-sm-4" id="imgs">  
                                                                <img src="<c:url value="/resources/img/warehouse.jpg" />" alt="Girl in a jacket" >
                                                            </div>
                                                        </div>

                                                        <div class="table-responsive table-wrapper-scroll-y my-custom-scrollbar">
                                                            <table id="table" class="table table-bordered table-fixed" style="z-index: 1000">
                                                                <thead>
                                                                    <tr>
                                                                        <th style="transform: translateY(-5px);">STT</th>
                                                                        <th style="transform: translateY(-5px)">Goods ID</th>
                                                                        <th>Goods name</th>
                                                                        <th style="transform: translateY(-5px)">Unit</th>
                                                                        <th>Supplier 
                                                                            <a style="float:right" href="#"><i class="fas fa-plus"></i></a>
                                                                        </th>
                                                                        <th>Warehouse 
                                                                            <a style="float:right" href="#"><i class="fas fa-plus"></i></a>
                                                                        </th>
                                                                        <th style="transform: translateY(-5px)">Quantity</th>
                                                                        <th style="transform: translateY(-5px)">Input Price </th>
                                                                        <th>Group 
                                                                            <a style="float:right" href="#"><i class="fas fa-plus"></i></a>
                                                                        </th>
                                                                        <th style="transform: translateY(-5px)">Weight</th>


                                                                    </tr>
                                                                </thead>
                                                                <tbody id="tableInput">
                                                                    <tr>
                                                                        <td>1</td>
                                                                        <td><input type='text'  name='codeid' value='Trung'/></td>
                                                                        <td><input type='text'  name='codeid' value='Dep'/></td>
                                                                        <td><input type='text'  name='codeid' value='trai'/></td>
                                                                        <td><input type='text'  name='codeid' value='nhat'/></td>
                                                                        <td><input type='text'  name='codeid' value='thegioi'/></td>
                                                                        <td><input type='text'  name='codeid' value='ok'/></td>
                                                                        <td><input type='text'  name='codeid' value='ahhhi'/></td>
                                                                        <td><input type='text'  name='codeid' value='231'/></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td>2</td>
                                                                        <td><input type='text'  name='codeid' value='Trung'/></td>
                                                                        <td><input type='text'  name='codeid' value='Dep'/></td>
                                                                        <td><input type='text'  name='codeid' value='trai'/></td>
                                                                        <td><input type='text'  name='codeid' value='nhat'/></td>
                                                                        <td><input type='text'  name='codeid' value='thegioi'/></td>
                                                                        <td><input type='text'  name='codeid' value='ok'/></td>
                                                                        <td><input type='text'  name='codeid' value='ahhhi'/></td>
                                                                        <td><input type='text'  name='codeid' value='231'/></td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                    <!--                </form>-->
                                                </form>

                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.card -->
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
            <script>
                var tangtudong = 3;
                var stto = 2;
                var stt = 3;
                $('#removelastrow').on("click", function () {
                    if (stto == 2)
                    {
                        tangtudong = 3;
                        stt = 3;
                    } else
                    {
                        $('#tableInput tr:last').remove();
                        stt -= 1;
                        stto -= 1;
                        tangtudong -= 1;
                    }
                });

                $("#addDataTable").click(function () {
                    var rowsds = $('<tr>');
                    rowsds.append('<td>' + tangtudong + '</td>');
                    rowsds.append('<td>' + "<input type='text' onkeydown='Autocomplete(this.id)' id='codeid" + stt + "' name='codeid' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly  type='text' id='name" + stt + "' name='name' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input readonly type='text'  id='unit" + stt + "' name='unit' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='Autocomplete(this.id)' type='text'  id='suplier" + stt + "' name='suplier' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='Autocomplete(this.id)' type='text'  id='warehouse" + stt + "' name='warehouse' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='quantity" + stt + "' min='1' name='quantity' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input type='number' id='importprice" + stt + "' min='1' name='importprice' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input onkeydown='Autocomplete(this.id)' type='text' id='group" + stt + "' name='group' value=''/>" + '</td>');
                    rowsds.append('<td>' + "<input  type='number' id='weight" + stt + "' min=1 name='weight' value=''/>" + '</td>');
                    rowsds.append('</tr>');
                    $('#tableInput').append(rowsds);
                    document.getElementById('codeid' + stt).focus();
                    stt += 1;
                    stto+=1;
                    tangtudong++;
                    sdadadas = $('#tableInput tr:last').find("td").find("input").attr('id');
//                console.log(sdadadas);
//                            Autocomplete();
                });
            </script>
            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <%--<jsp:include page="/fragment/RootJs.jsp" />--%>  
            <script>
                $.widget.bridge('uibutton', $.ui.button)
            </script>
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
            <script src="<c:url value='/resources/dist/js/pages/dashboard.js'/>"></script>
            <!-- /.control-sidebar -->
        </div>
        <!-- ./wrapper -->

</html>
