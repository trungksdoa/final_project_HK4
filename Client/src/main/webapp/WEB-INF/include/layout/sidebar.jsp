<%-- 
    Document   : sidebar
    Created on : Jun 5, 2021, 3:05:26 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
      

            <!-- Main Sidebar Container -->
            <aside class="main-sidebar sidebar-dark-primary elevation-4">
                <!-- Brand Logo -->
                <a href="index3.html" class="brand-link">
                    <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
                    <span class="brand-text font-weight-light">Quản Lý Kho Hàng</span>
                </a>

                <!-- Sidebar -->
                <div class="sidebar">
                    <!-- Sidebar user panel (optional) -->
                    <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                        <div class="image">
                            <img src="dist/img/4.jpg" class="img-circle elevation-2" alt="User Image">
                        </div>
                        <div class="info">
                            <a href="#" class="d-block">Admin</a>
                        </div>
                    </div>

                    <!-- SidebarSearch Form -->
                    <div class="form-inline">
                        <div class="input-group" data-widget="sidebar-search">
                            <input class="form-control form-control-sidebar" type="search" placeholder="Search" aria-label="Search">
                            <div class="input-group-append">
                                <button class="btn btn-sidebar">
                                    <i class="fas fa-search fa-fw"></i>
                                </button>
                            </div>
                        </div>
                    </div>

                    <!-- Sidebar Menu -->
                    <nav class="mt-2">
                        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                            <!-- Add icons to the links using the .nav-icon class
                   with font-awesome or any other icon font library -->
                            <li class="nav-item menu-open">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-tachometer-alt"></i>
                                    <p>
                                        Tổng Quan

                                    </p>
                                </a>

                            </li>

                            <li class="nav-item">
                                <a href="baogia.html" class="nav-link">
                                    <i class="nav-icon fas fa-comment"></i>
                                    <p>
                                        Báo giá
                                    </p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-cart-arrow-down"></i>
                                    <p>
                                        Đặt hàng
                                        <i class="right fas fa-angle-left"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Đặt hàng mua</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Đặt hàng bán</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-procedures"></i>
                                    <p>
                                        QL Hàng hoá
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Nhập hàng</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Xuất bán</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="#" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>
                                                Kho hàng
                                                <i class="fas fa-angle-left right"></i>
                                            </p>
                                        </a>
                                        <ul style="margin-left: 30px;" class="nav nav-treeview">
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <p>Thẻ kho</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <p>Phiếu quy đổi ĐVT</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <p>BC-Nhập-Xuất-Tồn</p>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Sổ chi tiết</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Sổ tổng hợp</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-dollar-sign"></i>
                                    <p>
                                        Thu chi
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="pages/forms/general.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Phiếu thu</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="pages/forms/advanced.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Phiếu chi</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="pages/forms/editors.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Sổ quỷ tiền mặt</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-user"></i>
                                    <p>
                                        Công nợ
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="pages/tables/simple.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Phiếu thu nợ KH</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Phiếu chi trả nợ NCU</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Công nợ phải trả</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Công nợ phải thu</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>

                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-chart-pie"></i>
                                    <p>
                                        Báo cáo - Thống kê
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Lịch sử giao dịch</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>thống kê chi phí</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Báo cáo doanh số</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Báo cáo lợi nhuận</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-list-alt"></i>
                                    <p>
                                        Danh mục
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Hàng hoá</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Nhà cung ứng</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Khách hàng</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Nghiệp vụ</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-cog"></i>
                                    <p>
                                        Cài đặt
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>

                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-assistive-listening-systems"></i>
                                    <p>
                                        Hệ thống
                                        <i class="fas fa-angle-left right"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>
                                                Khai báo số dư đầu kỳ
                                                <i class="fas fa-angle-left right"></i>
                                            </p>
                                        </a>
                                        <ul class="nav nav-treeview">
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <i class="far fa-circle nav-icon"></i>
                                                    <p>Đầu kỳ hàng hoá</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <i class="far fa-circle nav-icon"></i>
                                                    <p>Đầu kì nợ phải thu</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <i class="far fa-circle nav-icon"></i>
                                                    <p>Đầu kì nợ phải trả</p>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="data.html" class="nav-link">
                                                    <i class="far fa-circle nav-icon"></i>
                                                    <p>Đầu kì điểm tích luỹ</p>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="nav-item">
                                        <a href="data.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>
                                                TK sử dụng phần mềm
                                                <i class="fas fa-angle-left right"></i>
                                            </p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                    <!-- /.sidebar-menu -->
                </div>
                <!-- /.sidebar -->
            </aside>

    </body>
</html>
