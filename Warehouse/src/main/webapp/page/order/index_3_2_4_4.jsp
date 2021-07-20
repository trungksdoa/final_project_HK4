<%-- 
    Document   : index
    Created on : Jun 16, 2021, 12:44:44 AM
    Author     : trung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Le THanh AN</h1>    
        <c:forEach items="${listCustomer}" var="ctm">
          <button  data-toggle="modal"  data-target=".${ctm.getId()} "  type="reset"><i class="fas fa-delete"></i>Làm mới</button>
                                                           
        <div class="modal fade ${ctm.getId()} " tabindex="-1"  aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <div class="row">
                            <div  class="col-md-12 col-lg-12 block-image">
                                <input type="text" id="aa" value="${ctm.getPhone()}" />
                            </div>
                
                    </div>
                </div>
            </div>
        </div>
    </div> 
     </c:forEach>
</body>
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
</html>
