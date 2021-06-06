<%-- 
    Document   : thongke
    Created on : Jun 3, 2021, 6:11:02 PM
    Author     : trung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AdminLTE 3 | Dashboard</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <!-- Google Font: Source Sans Pro -->
        <script src="https://kit.fontawesome.com/cca0c56933.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <style>
            .my-custom-scrollbar {
                height: 200px;
                overflow: auto;
            }

            .table-wrapper-scroll-y {
                display: block;
            }
        </style>
        <script>

            function owed() {
                var total = document.getElementById("total").value;
                var hasPayment = document.getElementById("hasPayment").value;
                var message = document.getElementById("message");
                var owed = document.getElementById("owed");
                if (total - hasPayment >= 0) {
                    message.style.display = "none";
                    console.log(owed.value = total - hasPayment);
                    console.log(owed.value);
                } else {
                    message.style.display = "block";
                    owed.value = 0;
                }
            }
        </script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row" style="margin-top: 4%;">
                <div class="col-lg-9">
                    <form action="#">
                        <div style="text-align: right;">
                            <a href="#" type="button" class="btn btn-success">Lưu trữ</a>
                        </div>
                        <div class="row g-3">
                            <div class="col-md-6">
                                <label for="txtCodeShipper" class="form-label">Mã người giao</label>
                                <div class="input-group">
                                    <input type="text" class="form-control" id="txtCodeShipper">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <label for="txtNhaCungCap" class="form-label">Nhà cung cấp</label>
                                <div class="input-group">
                                    <input type="text"  class="form-control" id="txtNhaCungCap" name="txtExpain" placeholder="Nhà cung cấp">
                                    <div id="suggesstion-box"></div>
                                    <div class="input-group-append">
                                        <button class="btn btn-outline-secondary" id="btnNCC" type="button"><i class="fas fa-plus"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <label for="txtExplain" class="form-label">Diễn giải</label>
                                <input type="text" class="form-control" id="txtExplain" name="txtExplain" placeholder="Diễn giải">
                            </div>
                            <div class="col-12">
                                <label for="thamchieu" class="form-label">Tham chiếu:</label>
                                <small><a href="#?id=DDH0000001">DDH0000001</a></small>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-lg-3">
                    <form>
                        <table class="table table-striped table-bordered">
                            <thead>
                            <h4>Thông tin chứng từ</h4>
                            </thead>
                            <tbody>
                                <tr>
                                    <th scope="row">Ngày</th>
                                    <td><input type="datetime-local" id="txtDate" /></td>
                                </tr>
                                <tr>
                                    <th scope="row">Mã</th>
                                    <td><input type="text" id="txtCode" placeholder="NKxxxxxxxx" /> </tr>
                                </td>
                                <tr>
                                    <th scope="row">Kho</th>
                                    <td class="form-inline">
                                        <select class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref">
                                            <option selected>Choose...</option>
                                            <option value="1">One</option>
                                            <option value="2">Two</option>
                                            <option value="3">Three</option>
                                        </select>
                                    </td>
                                </tr>
                                </td>
                            </tbody>
                        </table>
                    </form>
                </div>
                <div class="col-lg-12">
                    <div class="table-wrapper-scroll-y my-custom-scrollbar">
                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th scope="col">STT</th>
                                    <th scope="col">Hàng hóa xuất bán</th>
                                    <th scope="col">Đơn vị tính</th>
                                    <th scope="col">Số lượng</th>
                                    <th scope="col">Đơn giá xuất</th>
                                    <th scope="col">Chiết khấu(%)</th>
                                    <th scope="col">Thành tiền</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td scope="row">1</td>
                                    <td>
                                        <input type="text" class="form-control" value="giay adidas">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="Hộp">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="5">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="300.000">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="0">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="1.500.000">
                                    </td>
                                </tr>
                                <tr>
                                    <td scope="row">1</td>
                                    <td>
                                        <input type="text" class="form-control" value="giay adidas">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="Hộp">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="5">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="300.000">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="0">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="1.500.000">
                                    </td>
                                </tr>
                                <tr>
                                    <td scope="row">1</td>
                                    <td>
                                        <input type="text" class="form-control" value="giay adidas">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="Hộp">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="5">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="300.000">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="0">
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" value="1.500.000">
                                    </td>
                                </tr>
                            </tbody>
                        </table>                 
                    </div>
                    <table class="table table-bordered ">   
                        <tr>
                            <td scope="row"></td>
                            <td colspan="2" style="text-align: center;">TỔNG CỘNG</td>
                            <td>
                                <input type="text" class="form-control" value="15">
                            </td>

                            <td colspan="2" style="text-align: center;color: royalblue  ;">
                                TIỀN HÀNG
                            </td>
                            <td>
                                <input type="text" class="form-control" value="4.500.000">
                            </td>
                        </tr>
                        <tr style="text-align: right; color: orangered;">
                            <td colspan="5">
                                <b>GIẢM GIÁ TỔNG</b>
                            </td>
                            <td>
                                <input class="form-control">
                            </td>
                            <td>
                                <input class="form-control">
                            </td>
                        </tr>
                        <tr>
                            <th colspan="2">
                                HÌNH THỨC THANH TOÁN
                            </th>
                            <td>
                                <div class="form-check-inline">
                                    <label class="form-check-label">
                                        <input type="radio" class="form-check-input" value="">tiền mặt
                                        <input type="radio" class="form-check-input" value="">Visa Card ATM
                                    </label>
                                </div>
                            </td>
                            <th colspan="3" style="text-align: right;color: royalblue  ;">Tổng Cộng</th>
                            <td>
                                <input id="total" class="form-control">
                            </td>
                        </tr>
                        <tr>
                            <th colspan="6" style="text-align: right; color: royalblue  ;">Đã thanh toán</th>
                            <td>
                                <input onkeyup="owed()" id="hasPayment" class="form-control">
                                <div style="display: none;" id="message" class="alert alert-warning alert-dismissible">
                                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a> Giá trị không hợp lệ
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <th colspan="6" style="text-align: right; color: red;">CÒN NỢ</th>
                            <td>
                                <input id="owed" class="form-control">
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <div class="modal fade" id="addNCC" role="dialog">
            <div class="modal-dialog ">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Thêm mới nhà cung cấp</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="form-group row">
                                <label for="txtmodalCode" class="col-sm-4 col-form-label">Mã nhà cung cấp:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="txtmodalCode" placeholder="Ví dụ:VHTrung">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="txtmodalName" class="col-sm-4 col-form-label">Tên nhà cung cấp:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="txtmodalName" placeholder="Ví dụ:Võ Hoàng Trung">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="txtmodalPhone" class="col-sm-4 col-form-label">Số điện thoại:</label>
                                <div class="col-sm-10 ">
                                    <input type="number" class="form-control" id="txtmodalPhone" placeholder="ví dụ:0335857133">
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-primary">Thêm mới</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>

        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js " integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1 " crossorigin="anonymous "></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js " integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM " crossorigin="anonymous "></script>
    </body>
</html>
