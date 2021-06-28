<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%> 
<aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="index3.html" class="brand-link">
        <img src="<c:url value='/resources/dist/img/AdminLTELogo.png'/>" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
        <span class="brand-text font-weight-light">Qu?n Lý Kho Hàng</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
        <!-- Sidebar user panel (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
                <img src="<c:url value='/resources/dist/img/4.jpg'/>" class="img-circle elevation-2" alt="User Image">
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
                            T?ng Quan

                        </p>
                    </a>

                </li>

                <li class="nav-item">
                    <a href="data.html" class="nav-link">
                        <i class="nav-icon fas fa-copy"></i>
                        <p>
                            Báo giá
                        </p>
                    </a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-chart-pie"></i>
                        <p>
                            ??t hàng
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>??t hàng mua</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>??t hàng bán</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-chart-pie"></i>
                        <p>
                            QL Hàng hoá
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Nh?p hàng</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Xu?t bán</p>
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
                                <li style="" class="nav-item">
                                    <a href="data.html" class="nav-link">
                                        <p>Th? kho</p>
                                    </a>
                                </li>
                                <li style="" class="nav-item">
                                    <a href="data.html" class="nav-link">
                                        <p>Phi?u quy ??i ?VT</p>
                                    </a>
                                </li>
                                <li style="" class="nav-item">
                                    <a href="data.html" class="nav-link">
                                        <p>BC-Nh?p-Xu?t-T?n</p>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>S? chi ti?t</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>S? t?ng h?p</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-edit"></i>
                        <p>
                            Thu chi
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/forms/general.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Phi?u thu</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/forms/advanced.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Phi?u chi</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/forms/editors.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>S? qu? ti?n m?t</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="pages/forms/validation.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Validation</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-chart-pie"></i>
                        <p>
                            Công n?
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="pages/tables/simple.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Phi?u thu n? KH</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Phi?u chi tr? n? NCU</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Công n? ph?i tr?</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Công n? ph?i thu</p>
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-chart-pie"></i>
                        <p>
                            Báo cáo - Th?ng kê
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>L?ch s? giao d?ch</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>th?ng kê chi phí</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Báo cáo doanh s?</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Báo cáo l?i nhu?n</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-chart-pie"></i>
                        <p>
                            Danh m?c
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
                                <p>Nhà cung ?ng</p>
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
                                <p>Nghi?p v?</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-chart-pie"></i>
                        <p>
                            Cài ??t
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>

                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-chart-pie"></i>
                        <p>
                            H? th?ng
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>
                                    Khai báo s? d? ??u k?
                                    <i class="fas fa-angle-left right"></i>
                                </p>
                            </a>
                            <ul class="nav nav-treeview">
                                <li class="nav-item">
                                    <a href="data.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>??u k? hàng hoá</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="data.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>??u kì n? ph?i thu</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="data.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>??u kì n? ph?i tr?</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="data.html" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>??u kì ?i?m tích lu?</p>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a href="data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>
                                    Tài kho?n s? d?ng ph?n m?m
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