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

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <!--<script src="https://code.jquery.com/jquery-1.12.4.js"></script>-->

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
            #btnSelect {
                padding: 8px 21px;
                font-size: 10px;
                text-align: center;
                cursor: pointer;
                outline: none;
                color: #fff;
                background-color: #04AA6D;
                border: none;
                border-radius: 15px;
                box-shadow: 0 9px #999;
            }

            #btnSelect:hover {background-color: #3e8e41}

            #btnSelect:active {
                background-color: #3e8e41;
                box-shadow: 0 5px #666;
                transform: translateY(4px);
            }
            .ui-autocomplete-category {
                font-weight: bold;
                padding: .2em .4em;
                margin: .8em 0 .2em;
                line-height: 1.5;
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
            <div class="content-header">
                <div class="container-fluid">
                    <div class="row mb-2">
                        <div class="col-sm-6">
                            <h3>Inventory tranfer</h3>
                        </div><!-- /.col -->
                        <div class="col-sm-6">
                            <ol class="breadcrumb float-sm-right">
                                <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                                <li class="breadcrumb-item "><a href="#">Warehouse</a></li>
                                <li class="breadcrumb-item "><a href="/web/warehouse/ck">Tranfer</a></li>
                            </ol>
                        </div>
                    </div><!-- /.row -->
                </div><!-- /.container-fluid -->
                <h3 id="message" style="text-align: center;color: ${color}">
                    ${message} 
                </h3>
            </div>
            <!-- /.content-header -->

            <!-- Main content -->
            <section class="content">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12 col-sm-12">
                            <div class="card card-primary card-outline card-tabs">
                                <div class="card-header p-0 pt-1 border-bottom-0">
                                    <ul class="nav nav-tabs" id="custom-tabs-three-tab" role="tablist">
                                        <li class="nav-item " id="custom-tabs-three-home-tab" data-toggle="pill" aria-selected="true"  role="tab" aria-controls="custom-tabs-three-home">
                                            <a class="nav-link active"
                                               href="#custom-tabs-three-home"><b>Create tranfer</b></a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link"
                                               href="/web/warehouse/ck/slip"><b>Tranfer slip</b></a>
                                        </li>


                                    </ul>
                                </div>
                                <div class="card-body">
                                    <div class="tab-content" id="custom-tabs-three-tabContent">
                                        <div class="tab-pane fade show active" id="custom-tabs-three-home" role="tabpanel"
                                             aria-labelledby="custom-tabs-three-home-tab">
                                            <form id='maiForm' method="POST" action="/web/warehouse/ck" onsubmit="return Validate()">
                                                <input type="number" name="index" id="index" value="" hidden="true">
                                                <button type="submit" id="savaDataAll"
                                                        class="btn btn-block bg-gradient-primary"><i class="fas fa-save"></i> Save</button>
                                                <button  type="button" data-toggle="modal" id="saveandprint" data-target="#login-modal" class="btn btn-block bg-gradient-info "><i class="fas fa-print"></i> Save and
                                                    Print</button>
                                                <button  onclick="emptyData(); return false;" type="button"
                                                         id="resetbutton"
                                                         class="btn btn-block bg-gradient-danger"><i class="fas fa-delete"></i>Reset</button>
                                                <div class="card-body">
                                                    <div class="row">
                                                        <div class="col-lg-8 col-md-8" >
                                                            <div class="form-group row">
                                                                <label for="id" class="col-lg-2 col-form-label">License</label>
                                                                <div class="col-lg-10">
                                                                    <div class="input-group mb-3">
                                                                        <input type="text" class="form-control" readonly="" name="id" id="id_liecene"  value="" placeholder="System will generation License">
                                                                        <div class="input-group-prepend">
                                                                            <button onclick="CreateID(); return false;" type="button" id="generatesid" class="btn btn-secondary" >Generates ID</button>
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
                                                                <label for="explain" class="col-lg-2 col-form-label">Explain</label>
                                                                <div class="col-lg-10">
                                                                    <input type="text"   class="form-control" name="explain" id="explain" placeholder="explain">
                                                                </div>
                                                                <div class="col-lg-10 col-md-12 col-sm-12">
                                                                    <p>Hint: Click on field at Goods name to start finding your goods easy , max in field quantity is a maximum quantity in stock</p>
                                                                    <div class="btn-group">
                                                                        <button style="margin-right: 30px;height: 33px" type="button" id="addDataTable" 
                                                                                class="btn btn-block btn-success btn-sm add-row"><i style="color: white;" class="fa fa-plus" ></i> Add row</button>
                                                                        <button style="margin-right: 30px;height: 33px;margin-top: 0px;" type="button" id="removelastrow" class="btn btn-block btn-danger btn-sm" ><i class="fa fa-trash can "></i>Remove row</button>
                                                                    </div>
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
                                                                    <th>Delete</th>
                                                                    <th style="transform: translateY(-5px);">STT</th>
                                                                    <th style="transform: translateY(-5px)">ID</th>
                                                                    <th style="transform: translateY(-5px)">Unit</th>
                                                                    <th style="transform: translateY(-5px)">From</th>
                                                                    <th style="transform: translateY(-5px)">To</th>
                                                                    <th style="transform: translateY(-5px)">Quantity</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody id="tableInput">

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
                    <!-- /.row -->
                    <!-- Main row -->

                    <div id="modalkho" class="modal fade" data-backdrop="static" data-keyboard="false"  tabindex="-1" role="dialog">
                        <div class="modal-dialog " role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">Create warehouse</h5>
                                </div>
                                <div class="modal-body">
                                    <form action="">
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
                                    </form>
                                </div>
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
            function isValidKey(e) {
                var evt = e || window.event;
                if (evt) {
                    var keyCode = evt.charCode || evt.keyCode;
                    if (keyCode === 8 || keyCode === 46) {
                        if (evt.preventDefault) {
                            evt.preventDefault();
                        } else {
                            evt.returnValue = false;
                        }
                    }
                }
                return false;
            }
        </script>
        <script type="text/javascript">
            var stt = 0;
            var tangtudong = 1;
            var listIp = [];
            //Remove row button
            $('#removelastrow').on("click", function () {
                var valuedsa = $('#tableInput').find('tr').length;
                if (valuedsa == 1) {
                    //do nothing
                } else {

                    var valuedsa = $('#tableInput').find('tr').length;
                    if (valuedsa == 1) {
                        //do nothing
                    } else {
                        var productname = $('#tableInput tr:last td:nth-child(3) > input').val();
                        var search_term = productname;
                        // console.log(listIp);
                        for (var i = listIp.length - 1; i >= 0; i--) {
                            if (listIp[i] === search_term) {
                                listIp.splice(i, 1);
                            }
                            // console.log(listIp)
                        }
                        $('#tableInput tr:last').remove();
                        stt -= 1;
                        tangtudong -= 1;
                    }
                }
            });
            function CreateID()
            {

                $.get("/api/stock/ListOne/", function (data, status) {
                    if (data == null)
                    {
                        let idgener = "CK0000";
                        console.log(data.id);
                        idgener = idgener.substring(2);
                        var id = parseInt(idgener);
                        id++;
                        var str = "" + id
                        var pad = "CK0000"
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
                        var pad = "CK0000"
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
                    var searchings = document.forms["maiForm"]["search" + i].value;
                    if (searchings.trim() == null || searchings.trim() == "" || searchings === " ") {
                        alert("Goods name ust be filled out");
                        document.getElementById("search" + i).focus();
                        return false;
                    }
                }
            }
            function lookup(arg) {
                var id = arg.getAttribute('id');
                // var value = arg.value;
                var res = id.charAt(id.length - 1);
                var weighton1 = document.getElementById('weightOn1' + res);
                var result = arg.value * weighton1.value;
//                weightOn1

                document.getElementById('weight' + res).value = result;
                console.log('weight' + res)
            }
            $(document).ready(function () {
                ////
                $("#checkAll").click(function () {
                    $('input:checkbox').not(this).prop('checked', this.checked);
                });

                $('#message').delay(10000).fadeOut();
                ////////////

                $.ajaxSetup({
                    cache: false
                });
                addRow();
                //Insert stock
            });
            //Check all checkbox In service
            var today = new Date();
            var months = "";
            var date = "";
            if ((months = today.getMonth() + 1) > 10) {
                months = months = today.getMonth() + 1;
                date = today.getFullYear() + '-' + months + '-' + today.getDate();
                //                document.getElementById("Date").value = date;
            } else {
                months = "0" + (months = today.getMonth() + 1);
                date = today.getFullYear() + '-' + months + '-' + "0" + today.getDate();
            }
            document.getElementById("DateLicene").value = date;
            //            $("#Date").val(date);
            function myFunction(is) {
                var row_num = $('#tableInput').find('tr').length;
                if (row_num == 1) {
                    stt = 0;
                    tangtudong = 1;
                    var result = confirm("Danger !!. Last row will be reset , you want reset?");
                    if (result) {
                        var productname = $(is).closest("tr").find("td:nth-child(3) > input").val();
                        var search_term = productname;
                        // console.log(listIp);
                        for (var i = listIp.length - 1; i >= 0; i--) {
                            if (listIp[i] === search_term) {
                                listIp.splice(i, 1);
                            } else {
                                //do nothing
                            }
                            // console.log(listIp);
                            // console.log(listIp)
                        }
                        $('#tableInput').empty();
                        for (var i = 0; i < 1; i++) {
                            var rowsds = $('<tr>');
                            rowsds.append('<td><button type="button" id="btnSelect" onclick="myFunction(this)" class="btnSelect">Delete</button></td>')
                            rowsds.append('<td>' + tangtudong + '</td>');
                            rowsds.append('<td>' + "<input onkeydown='Autocomplete(this.id)' type='text' id='ID" + stt + "' name='ID' value=''/>" + '</td>');
                            rowsds.append('<td>' + "<input readonly  require type='text'  id='Unit" + stt + "' name='Unit' value=''/>" + '</td>');
                            rowsds.append('<td>' + "<input readonly require type='text' id='From" + stt + "' min='1' name='From' value=''/>" + '</td>');
                            rowsds.append('<td>' + "<input type='text' id='To" + stt + "' name='To' value=''/>" + '</td>');
                            rowsds.append('<td>' + "<input type='number' id='Quantity" + stt + "' min='1' name='Quantity' value=''/>" + '</td>');
                            rowsds.append('</tr>');
                            $('#tableInput').append(rowsds);
                            stt++;
                            tangtudong++;
                        }
                    } else {
                        tangtudong++;
                        stt++;
                    }
                } else {
                    var result = confirm("Danger !!. This row will be delete !, you want delete?");
                    if (result) {
                        var search_term = $(is).closest("tr").find("td:nth-child(3) > input").val();
                        // console.log(listIp);
                        for (var i = listIp.length - 1; i >= 0; i--) {
                            if (listIp[i] === search_term) {
                                listIp.splice(i, 1);
                            } else {
                                //do nothing
                            }
                            // console.log(listIp);
                            // console.log(listIp)
                        }

                        var currentRow = $(is).closest('tr').remove();
                        tangtudong = tangtudong;
                        stt = stt;
                    }
                }
            }
        </script>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <!--<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>-->
        <script src="<c:url value="/resources/js/ck/Addrow.js" />"></script>
        <script src="<c:url value="/resources/js/ck/EmptyData.js" />"></script>
        <script src="<c:url value="/resources/js/ck/Autocomplete.js" />"></script>
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
        <!--<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>-->
    </div>
    <!-- ./wrapper -->

</html>
