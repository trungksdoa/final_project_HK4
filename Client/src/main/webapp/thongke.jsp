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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!--<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>-->
        <Style>
            .my-custom-scrollbar {
                height: 200px;
                overflow: auto;
            }

            .table-wrapper-scroll-y {
                display: block;
            }
        </Style>
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
                            <!-- <div class="col-md-6">
                                <label for="inputPassword4" class="form-label">Tên người giao</label>
                                <input type="text" readonly class="form-control" id="txtShiperName" name="txtShiperName" placeholder="">
                            </div> -->
                            <div class="col-md-6">
                                <label for="txtNhaCungCap" class="form-label">Nhà cung cấp</label>
                                <div id="somediv"></div>
                                <div class="input-group">
                                    <input type="text" class="form-control" id="txtNhaCungCap" name="txtExpain" placeholder="Nhà cung cấp">

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


            function autocomplete(inp, arr) {
                /*the autocomplete function takes two arguments,
                 the text field element and an array of possible autocompleted values:*/
                var currentFocus;
                /*execute a function when someone writes in the text field:*/
                inp.addEventListener("input", function (e) {
                    var a, b, i, val = this.value;
                    /*close any already open lists of autocompleted values*/
                    closeAllLists();
                    if (!val) {
                        return false;
                    }
                    currentFocus = -1;
                    /*create a DIV element that will contain the items (values):*/
                    a = document.createElement("DIV");
                    a.setAttribute("id", this.id + "autocomplete-list");
                    a.setAttribute("class", "autocomplete-items");
                    /*append the DIV element as a child of the autocomplete container:*/
                    this.parentNode.appendChild(a);
                    /*for each item in the array...*/
                    for (i = 0; i < arr.length; i++) {
                        /*check if the item starts with the same letters as the text field value:*/
                        if (arr[i].substr(0, val.length).toUpperCase() == val.toUpperCase()) {
                            /*create a DIV element for each matching element:*/
                            b = document.createElement("DIV");
                            /*make the matching letters bold:*/
                            b.innerHTML = "<strong>" + arr[i].substr(0, val.length) + "</strong>";
                            b.innerHTML += arr[i].substr(val.length);
                            /*insert a input field that will hold the current array item's value:*/
                            b.innerHTML += "<input type='hidden' value='" + arr[i] + "'>" + " " + "<label>Trung</label";
                            /*execute a function when someone clicks on the item value (DIV element):*/
                            b.addEventListener("click", function (e) {
                                /*insert the value for the autocomplete text field:*/
                                inp.value = this.getElementsByTagName("input")[0].value;
                                /*close the list of autocompleted values,
                                 (or any other open lists of autocompleted values:*/
                                closeAllLists();
                            });
                            a.appendChild(b);
                        }
                    }
                });
                /*execute a function presses a key on the keyboard:*/
                inp.addEventListener("keydown", function (e) {
                    var x = document.getElementById(this.id + "autocomplete-list");
                    if (x)
                        x = x.getElementsByTagName("div");
                    if (e.keyCode == 40) {
                        /*If the arrow DOWN key is pressed,
                         increase the currentFocus variable:*/
                        currentFocus++;
                        /*and and make the current item more visible:*/
                        addActive(x);
                    } else if (e.keyCode == 38) { //up
                        /*If the arrow UP key is pressed,
                         decrease the currentFocus variable:*/
                        currentFocus--;
                        /*and and make the current item more visible:*/
                        addActive(x);
                    } else if (e.keyCode == 13) {
                        /*If the ENTER key is pressed, prevent the form from being submitted,*/
                        e.preventDefault();
                        if (currentFocus > -1) {
                            /*and simulate a click on the "active" item:*/
                            if (x)
                                x[currentFocus].click();
                        }
                    }
                });
                function addActive(x) {
                    /*a function to classify an item as "active":*/
                    if (!x)
                        return false;
                    /*start by removing the "active" class on all items:*/
                    removeActive(x);
                    if (currentFocus >= x.length)
                        currentFocus = 0;
                    if (currentFocus < 0)
                        currentFocus = (x.length - 1);
                    /*add class "autocomplete-active":*/
                    x[currentFocus].classList.add("autocomplete-active");
                }
                function removeActive(x) {
                    /*a function to remove the "active" class from all autocomplete items:*/
                    for (var i = 0; i < x.length; i++) {
                        x[i].classList.remove("autocomplete-active");
                    }
                }
                function closeAllLists(elmnt) {
                    /*close all autocomplete lists in the document,
                     except the one passed as an argument:*/
                    var x = document.getElementsByClassName("autocomplete-items");
                    for (var i = 0; i < x.length; i++) {
                        if (elmnt != x[i] && elmnt != inp) {
                            x[i].parentNode.removeChild(x[i]);
                        }
                    }
                }
                /*execute a function when someone clicks in the document:*/
                document.addEventListener("click", function (e) {
                    closeAllLists(e.target);
                });
            }


            $(document).ready(function () {
                $("#txtNhaCungCap").keypress(function () {
                    $.get("someservlet", function (responseJson) {    // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response JSON...
                        var $ul = $("<ul>").appendTo($("#somediv")); // Create HTML <ul> element and append it to HTML DOM element with ID "somediv".
                        $.each(responseJson, function (index, item) { // Iterate over the JSON array.
                            $("<li>").text(item).appendTo($ul);      // Create HTML <li> element, set its text content with currently iterated item and append it to the <ul>.
                        });
                    });
                });
            });
        </script>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js " integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1 " crossorigin="anonymous "></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js " integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM " crossorigin="anonymous "></script>
    </body>
</html>
