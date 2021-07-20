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
                .selected{
                    background-color: gray;
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

                #example_length{
                    transform: translateY(36px) !important;
                }
                #example2_filter{
                    float:right !important;
                }
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
                                                            <button type="button" class="btn btn-success" id="sadsadsadsa">Delete row seleted</button>
                                                        </div>
                                                    </div>

                                                    <!-- /.card-header -->
                                                    <div class="card-body">
                                                        <table id="tabletwo"></table>
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
                let tempnumber = 0;
                var tempArrays = [];
                function lookup(arg) {
                    var id = arg;
                    var mateches = id.trim().match(/(\d+)/);
                    var index2 = mateches[0];
//                let tet = $('#quantity' + index).val();
                    let testnumber = parseInt($("#quantityls" + index2).text());
                    let tet2 = $('#realQuantity' + index2).val();
                    let result = tet2 - testnumber;
                    //
                    let resulttsest = tet2 - testnumber;
                    console.log(resulttsest);
                    document.getElementById('BetweenRealAndStockls' + index2).innerHTML = result;
                    document.getElementById('BetweenRealAndStock' + index2).value = result;
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
                    tempArray["value"] = "<c:out value = "${x.getId()}"/>";
                    tempArray["quantity"] =<c:out value = "${x.getQuantity()}"/>;
                    goods.push(tempArray);
                    mahanghoa2.push("<c:out value = "${x.getId()}"/>");
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
                    var table = $('#example2').DataTable({
                        "paging": true,
                        "lengthChange": false,
                        "info": true,
                        "autoWidth": true,
                        "columnDefs": [{
                                "searchable": true,
                                "orderable": true,
                                "targets": 0,
                                "responsive": true
                            }],
                        "order": [[1, 'asc']]
                    });
                    $('#example2 tbody').on('click', 'tr', function () {
                        if ($(this).hasClass('selected')) {
                            $(this).removeClass('selected');
                        } else {
                            table.$('tr.selected').removeClass('selected');
                            $(this).addClass('selected');
                        }

                    });
                    table.on('order.dt search.dt', function () {
                        table.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
                            cell.innerHTML = i + 1;
                            table.cell(cell).invalidate('dom');
                        });
                    }).draw();
                    $('#addRow').on('click', function () {
                        //Mục tiêu là tìm số row lớn nhất trong bảng
                        // sau khi ấn thì gán stt = 0 cho tempnumer;
                        //Sau khi gán thì mới gán cho nó row hiện tại của bảng hiện tại là 0 vì vậy bậy giờ stt = 0 với temp = 0
                        //tiếp theo
                        if (stt == tempnumber)
                        {
                            stt += 1;
                        }
                        console.log(stt);
//                        toCheck = 1;
                        var valueinput = $('#result').val();
                        if (mahanghoa2.indexOf(valueinput) === -1) {
                            alert("element doesn't exist");
                        } else {
                            if (tempArrays.indexOf(valueinput) === -1) {
                                table.row.add([
//                                    1/
                                    '<td></td>',
//                                    2
                                    '<td  id="idcodels' + stt + '">' + idcode + '</td>',
//                                    3
                                    '<td>' + "<span id='quantityls" + stt + "'> " + tempquantity + " </span>" + '</td>',
//                                    4
                                    '<td>' + "<input require type='number' min=0 onkeyup='lookup(this.id);' id='realQuantity" + stt + "' name='realQuantity' value='' placeholder=''/>" + '</td>',
//                                    5
                                    '<td>' + "<span id='BetweenRealAndStockls" + stt + "'></span>" + '</td>',
                                    '<td>' + "<textarea id='explain " + stt + "'  name='explain' rows='2' cols='20'></textarea>" + '</td>'
                                ]).draw(false);
                                var rowsds = $('<tr>');
                                rowsds.append('<td>' + "<input readonly type='hidden' id='idcode" + stt + "' name='nameCode' value='" + idcode + "'/>" + '</td>');
                                rowsds.append('<td>' + "<input readonly type='hidden' id='quantity" + stt + "' name='quantity' value='" + tempquantity + "'/>" + '</td>');
                                //line  5
                                rowsds.append('<td>' + "<input readonly type='hidden' id='BetweenRealAndStock" + stt + "' name='BetweenRealAndStock' value=''/>" + '</td>');

                                rowsds.append('</tr>');
                                $('#tabletwo').append(rowsds);
                                counter++;
                                tempArrays.push(valueinput);
                                $('#result').val("");
                                stt++;
                            } else {
                                alert("Your goods already have");
                                $('#result').val("");
                            }
                        }
                    });
                    $('#sadsadsadsa').click(function () {

                        var oData = table.rows('.selected').data();

                        for (var i = 0; i < oData.length; i++) {
                            var sdsaew = oData[i][1];
                            var idx = table.cell('.selected', 0).index();
                            var data = table.row(idx.row).data();

                            var availableTags = [
                                "SP00006_NCC2",
                                "SP00002_NCC2",
                                "SP00003_NCC2",
                                "SP00001_NCC2"
                            ];
                            for (var i = 0; i < mahanghoa2.length; i++) {

                                if (data[1].includes(mahanghoa2[i]) == true)
                                {
                                    tempArrays = tempArrays.filter(e => e !== mahanghoa2[i]);
                                }
                            }
                            var availableTags2 = [];
                            for (var i = 0; i < 100; i++) {
                                availableTags2.push("idcodels" + i + "")
                            }
                            for (var i = 0; i < availableTags.length; i++) {
                                if (data[1].includes(availableTags2[i]) == true)
                                {
                                    var mateches = availableTags2[i].trim().match(/(\d+)/);
                                    var index = mateches[0];
                                    $('#idcode' + index).remove();
                                    $('#quantity' + index).remove();
                                }
                            }

                        }

                        $('#idcode').remove();
                        $('#quantity').remove();
                        table.row('.selected').remove().draw(false);
//                        stt = table.rows( ).count();
                        stt -= 1;
                        tempnumber = stt;
                        console.log(stt);
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
