<%-- 
    Document   : thongke
    Created on : Jun 3, 2021, 6:11:02 PM
    Author     : trung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="include/layout/link.jsp"/>
    <body class="hold-transition sidebar-mini layout-fixed">
        <div class="wrapper">
            <jsp:include page="include/layout/navbar.jsp"/>
            <jsp:include page="include/layout/sidebar.jsp" />

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0">Tổng quan</h1>
                            </div>
                            <!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
                                    <li class="breadcrumb-item active"><a href="#">kho Hàng</a></li>
                                    <li class="breadcrumb-item active"><a href="#">Nhập kho</a></li>
                                </ol>
                            </div>
                            <!-- /.col -->
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

                <!-- Main content -->
                <section class="content">
                    <div class="container-fluid">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">STT</th>
                                    <th scope="col">Mã</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${phieu}" var="x">
                                <tr>
                                    <th scope="row">0</th>
                                    <td>${x.ma}</td>
                                </tr>
                            </c:forEach> 
                            </tbody>
                        </table>
                    </div>
                    <!-- /.container-fluid -->
                </section>
                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->
            <jsp:include page="include/layout/footer.jsp" />
            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
        </div>
        <!-- ./wrapper -->
        <jsp:include page="include/layout/js.jsp" />
    </body>
</html>
