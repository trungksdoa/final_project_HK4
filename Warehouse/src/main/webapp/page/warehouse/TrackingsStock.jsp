<%-- 
    Document   : index
    Created on : Jun 16, 2021, 12:44:44 AM
    Author     : trung
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Layout</title>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
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

        <script src="https://kit.fontawesome.com/cca0c56933.js" crossorigin="anonymous"></script>
        <script src="//cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <link href="//cdn.datatables.net/1.10.25/css/jquery.dataTables.min.css" ref="stylesheet"/>
        <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/buttons/1.7.1/js/dataTables.buttons.min.js" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js" crossorigin="anonymous"></script>
        <script src=" https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.html5.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.print.min.js" crossorigin="anonymous"></script>
        <!-- Google Font: Source Sans Pro -->

        <style>

        </style>
    </head>
    <body class="hold-transition sidebar-mini layout-fixed">
        <div class="wrapper">


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
                #exTab2 h3 {
                    color: white;
                    background-color: #428bca;
                    padding: 5px 15px;
                }
                /* remove border radius for the tab */

                #exTab1 .nav-pills>li>a {
                    border-radius: 0;
                }
                /* change border radius for the tab , apply corners on top*/

                #exTab3 .nav-pills>li>a {
                    border-radius: 4px 4px 0 0;
                }

                #exTab3 .tab-content {
                    color: white;
                    background-color: #428bca;
                    padding: 5px 15px;
                }
                #myTable_filter{
                    float:right;
                    margin-bottom: 10px;
                }
                #savaDataAll{
                    width: 80px; 
                    height:37px;
                    position: absolute;
                    right: 320px;
                    top:4px;
                }
                /*                #saveandprint{
                                    width: 150px; 
                                    height:37px; 
                                    position: absolute;
                                    right: 160px;
                                    top:-5px;
                                }*/


                @media only screen and (max-width: 768px) {

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
                    /*                    #saveandprint{
                                            margin-top: 54px;
                                            width: 150px;
                                            height: 37px;
                                            position: absolute;
                                            right: 160px;
                                            top: -5px;
                                        }*/
                }

                .minus{
                    color:red;
                }
                .plus{
                    color:green;
                }
            </style>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>Check inventory ${kho}</h1>
                            </div>
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Dashboard</a></li>
                                    <li class="breadcrumb-item "><a href="#">Warehouse</a></li>
                                    <li class="breadcrumb-item "><a href="/web/warehouse/page1">Inventory</a></li>
                                    <li class="breadcrumb-item "><a href="/web/warehouse/page2">Tracking</a></li>
                                    <li class="breadcrumb-item active">Tracking stock</li>
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
                                                <a class="nav-link"  href="/web/warehouse/page1" ><b>Inventory</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link"  href="/web/warehouse/page2" ><b>Tracking</b></a>
                                            </li>
                                            <li class="nav-item " id="custom-tabs-three-home-tab" data-toggle="pill" aria-selected="true"  role="tab" aria-controls="custom-tabs-three-home">
                                                <a class="nav-link active"
                                                   href="#custom-tabs-three-home"><b>Tracking Stock</b></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link"  href="/web/warehouse/page4" ><b>Tracking Stock List</b></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">
                                        <div class="tab-content" id="custom-tabs-three-tabContent">
                                            <div class="tab-pane fade show active" id="custom-tabs-three-home" role="tabpanel"
                                                 aria-labelledby="custom-tabs-three-home-tab">
                                                <form action='/web/warehouse/stock/saveData' method='post'>
                                                    <button type="submit" id="savaDataAll"
                                                            class="btn btn-block bg-gradient-primary"><i class="fas fa-save"></i> Save</button>
                                                    <div style="margin-top: 20px; margin-right: 50px;">
                                                        <div class="ui-widget">
                                                            <label for="tags">Tags: </label>
                                                            <input id="result">
                                                            <button style='' type='button' class="btn btn-info" id='addRow'>Search</button>
                                                            <input type='hidden' name='kho' value="${kho}"/>
                                                        </div>
                                                    </div>

                                                    <!-- /.card-header -->
                                                    <div class="card-body">
                                                        <table id="example2" class="table table-bordered table-hover">
                                                            <thead>
                                                                <tr>
                                                                <tr>
                                                                    <th style="width: 40px;">#</th>
                                                                    <th style="width: 100px;">ID</th>
                                                                    <th>Total inventory</th>
                                                                    <th>Actual inventory</th>
                                                                    <th>Difference</th>
                                                                    <th>Explain</th>
                                                                </tr>

                                                                </tr>
                                                            </thead>
                                                            <tbody id='tables'>

                                                            </tbody>
                                                        </table>
                                                    </div>

                                                </form>
                                                <div id="buttonhere">

                                                </div>

                                                <!-- /.card-body -->
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
            <script>
//            
                var stt = 1;

                var tempArray = [];
                function lookup(arg) {
                    var id = arg;
                    var res = id.charAt(id.length - 1);
                    var index = 0;

//                    index += arg.rowIndex;
//                        index--;
//                    console.log(res)
                    // var value = arg.value;
                    let tet = $('#quantity' + res).val();
                    let tet2 = $('#realQuantity' + res).val();
                    let result = tet2 - tet;
                    document.getElementById('BetweenRealAndStock' + res).value = result;
                }

                $(function () {
                    var counter = 1;
                    var goods = [];
                    var mahanghoa2 = [];
                    var tempquantity = 0;
                    var idcode = "";

                <c:forEach items="${listItemStock}" var="x">
                    var tempArray = new Array();
                    tempArray["id"] = "<c:out value = "${x.getId()}"/>";
                    tempArray["label"] = "<c:out value = "${x.getId()}"/>";
                    tempArray["value"] = "<c:out value = "${x.getName()}"/>";
                    tempArray["quantity"] =<c:out value = "${x.getQuantity()}"/>;
                    goods.push(tempArray);
                    mahanghoa2.push("<c:out value = "${x.getName()}"/>");
                </c:forEach>
//                    $.get("/api/stock/Warehousegoods", function (data, status) {
//             
////                        console.log(data)
//                    });
//                    console.log(mahanghoa2);
                    var toCheck = 0;
                    //
                    //
                    //
                    $("#result").autocomplete({
                        source: goods,
                        select: function (e, ui) {
                            var e = ui.item;
                            tempquantity = e.quantity
                            idcode = e.id;
                        },
                    });
                    // console.log(availableTags)
                    var t = $('#example2').DataTable({
                        "paging": true,
                        "lengthChange": false,
                        "searching": false,
                        "ordering": true,
                        "info": true,
                        "autoWidth": false,
                        "responsive": true,
                    });
                    $('#addRow').on('click', function () {
                        toCheck = 1;
                        var valueinput = $('#result').val();
                        if (mahanghoa2.indexOf(valueinput) === -1) {
                            alert("element doesn't exist");
                        } else {
                            if (tempArray.indexOf(valueinput) === -1) {
                                t.row.add([
                                    '<td>' + stt + '</td>',
                                    '<td>' + "<input readonly type='text' id='idcode" + stt + "' name='idcode' value='" + idcode + "'/>" + '</td>',
                                    '<td>' + "<input readonly type='text' id='quantity" + stt + "' name='quantity' value='" + tempquantity + "'/>" + '</td>',
                                    '<td>' + "<input require type='number' min=0 onkeyup='lookup(this.id);' id='realQuantity" + stt + "' name='realQuantity' value='' placeholder=''/>" + '</td>',
                                    '<td>' + "<input readonly type='number' id='BetweenRealAndStock" + stt + "' name='BetweenRealAndStock' value='' placeholder=''/>" + '</td>',
                                    '<td>' + "<textarea id='explain " + stt + "'  name='explain' rows='2' cols='20'></textarea>" + '</td>'
                                ]).draw(false);

                                stt++;
                                counter++;
                                tempArray.push(valueinput);
                                $('#result').val("");
                            } else {
                                alert("Your goods already have");
                                $('#result').val("");
                            }
                        }
                    });
//                    console.log(tempArray);
                }
                );

            </script>
            <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js" crossorigin="anonymous"></script>
            <script src="https://cdn.datatables.net/buttons/1.7.1/js/dataTables.buttons.min.js" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js" crossorigin="anonymous"></script>
            <script src=" https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js" crossorigin="anonymous"></script>
            <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.html5.min.js" crossorigin="anonymous"></script>
            <script src="https://cdn.datatables.net/buttons/1.7.1/js/buttons.print.min.js" crossorigin="anonymous"></script>
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
