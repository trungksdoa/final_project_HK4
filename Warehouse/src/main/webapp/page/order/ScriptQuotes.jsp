<%-- 
    Document   : index
    Created on : Jun 16, 2021, 12:44:44 AM
    Author     : trung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


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
        <!-- Page specific script -->
        <script>
                                                                                $(function () {
                                                                                    $("#example1").DataTable({
                                                                                        "responsive": true, "lengthChange": false, "autoWidth": false,
                                                                                        "buttons": ["copy", "csv", "excel", "pdf", "print", "colvis"]
                                                                                    }).buttons().container().appendTo('#example1_wrapper .col-md-6:eq(0)');
                                                                                    $('#example2').DataTable({
                                                                                        "paging": true,
                                                                                        "lengthChange": false,
                                                                                        "searching": false,
                                                                                        "ordering": true,
                                                                                        "info": true,
                                                                                        "autoWidth": false,
                                                                                        "responsive": true,
                                                                                    });
                                                                                });
        </script>

        <script type="text/javascript">

            var today = new Date();
            var day = today.getDate();
            var month = (today.getMonth() + 1);
            if (day < 10) {
                day = '0' + today.getDate();
            }
            if (month < 10) {
                month = '0' + (today.getMonth() + 1);
            }
            var date = today.getFullYear() + '-' + month + '-' + day;
            document.getElementById("date").value = date;
            var stockcard = [];
            $.get("/quotescontent/customer/", function (data, status) {
                for (var i = 0; i < data.length; i++) {
                    var tempArray = new Array();
                    tempArray["id"] = data[i].id;
                    tempArray["name"] = data[i].name;
                    tempArray["value"] = data[i].name;
                    tempArray["phone"] = data[i].phone;
                    tempArray["address"] = data[i].address;
                    stockcard.push(tempArray);
                }
            });
            $("#customername").autocomplete({
                source: stockcard,
                select: function (e, ui) {
                    var e = ui.item;
                    $("#customerId").val(e.id);
                    $("#phone").val(e.phone);
                    $('#address').val(e.address);
                    $('#aa').val(e.address);
                    $('#namecs').val(e.name);
                    console.log(e.name);
                    console.log(e.address);
                },
                change: function (e, ui) {
                }
            });
            var employeecard = [];
            $.get("/quotescontent/account/", function (data, status) {
                for (var i = 0; i < data.length; i++) {
                    var tempArray = new Array();
                    tempArray["id"] = data[i].id;
                    tempArray["name"] = data[i].name;
                    tempArray["value"] = data[i].name;
                    employeecard.push(tempArray);
                }
            });
            $("#creator").autocomplete({
                source: employeecard,
                select: function (e, ui) {
                    var e = ui.item;

                    $("#creator").val(e.value);
                    $("#checkcrt").val(e.name);
                },
                change: function (e, ui) {
                }
            });
            var count = 1;
            $(document).ready(function () {
                $(".add-row").click(function () {
                    count++;

                    var markup = "<tr onclick='dasdsadsa(this)'>\n\
               <td><span style='width: 25px;border:none;color: dodgerblue;' name='id[" + count + "]'>" + count + "</span></td>\n\
            <td><input  style='height: 35px;' onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' name='goods_name[]' id='goods_name" + count + "' class='form-control'  type='text' placeholder='Nhập mã hoặc tên hàng hoá'/>\n\
\n\          <input hidden='true' text='text' value='' id='product" + count + "'/> \n\
             <input hidden='true' name='goods_id[]' onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' id='goods_id" + count + "' type='text' /></td>\n\
            <td><input style='height: 35px;' readonly name='unit[]' id='unit" + count + "' class='form-control'  type='text'/></td>  \n\
            <td><input style='height: 35px;' onclick='updateTotalPrice()' onkeyup='updateTotalPrice()'  name='quantity[]' id='quantity" + count + "' value='0' class='form-control'  type='number'/></td> \n\
             <td><input hidden='true' style='height: 35px;' readonly onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' min='0' name='gprice[]' id='goods_price" + count + "'  class='form-control' value='0'  type='number'/>\n\
            <input style='height: 35px;' readonly onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' type='text'  id='agoods_price" + count + "' class='form-control'/></td>\n\
            <td><input style='height: 35px;' onclick='updateTotalPrice()' onkeyup='updateTotalPrice()' name='discount[]' id='discount" + count + "'  class='form-control' value='0'  type='number'/></td>\n\
           <td> <input hidden='true' style='height: 35px;' onkeyup='updateTotalPrice()' name='afterpirce[]'  id='afterpirce" + count + "' class='form-control' value='0' readonly type='number' pattern='[0-9]*' /><input  style='height: 35px;'  onkeyup='updateTotalPrice()' type='text'  id='aafterpirce" + count + "' class='form-control'  readonly  /></td>\n\
             </tr>";
                    $("table tbody").append(markup);
                });
            });
            $(".delete-row").click(function () {
                $("table tbody").find('span[name="id[' + count + ']"]').each(function () {
                    $(this).parents("tr").remove();
                    count--;
                    updateTotalPrice()
                });
            });
            function minuscount() {
                if (count > 1) {
                    document.getElementById('cnt').value = count - 1;
                }
            }
            function pluscount() {
                document.getElementById('cnt').value = count + 1;
            }
            function updateTotalPrice() {
                if (count > 0) {
                    var idsl = "quantity";
                    var iddgb = "goods_price";
                    var idtt = "afterpirce";
                    var iadtt = "aafterpirce";
                    var ick = "discount";
                    var tale = 0;
                    var total_TT = 0;
                    var total_isck = 0;
                    var nf = Intl.NumberFormat();
                    for (var i = 1; i <= count; i++) {
                        var sl = document.getElementById(idsl + i).value;
                        var dgb = document.getElementById(iddgb + i).value;
                        var ck = document.getElementById(ick + i).value;
                        if (sl == '') {
                            document.getElementById(idtt + i).value = 0;
                            sl = 0;
                        } else {
                            document.getElementById(idtt + i).value = parseInt(sl) * parseInt(dgb);
                            document.getElementById(iadtt + i).value = nf.format(parseInt(parseInt(sl) * parseInt(dgb)));
                        }
                        total_isck = parseInt(total_isck) + (((parseInt(sl) * parseInt(dgb)) / 100) * parseInt(ck));
                        tale = parseInt(tale) + parseInt(sl);
                        total_TT = parseInt(total_TT) + (parseInt(sl) * parseInt(dgb));

                        document.getElementById('total_SL').value = tale;
                        document.getElementById('total_TT').value = total_TT;
                        document.getElementById('atotal_TT').value = nf.format(parseInt(total_TT));
                        document.getElementById('GG').value = total_isck;
                        document.getElementById('aGG').value = nf.format(parseInt(total_isck));
                    }
                    var GG = document.getElementById('GG').value;
                    if (GG != '') {
                        document.getElementById('TGG').value = parseInt(total_TT) - parseInt(GG);
                        document.getElementById('aTGG').value = nf.format(parseInt(total_TT) - parseInt(GG));
                    }
                }
            }
            var productcard = [];
            $.get("/quotescontent/product/", function (data, status) {
                for (var i = 0; i < data.length; i++) {
                    var tempArray = new Array();
                    tempArray["id"] = data[i].id;
                    tempArray["name"] = data[i].goodsName;
                    tempArray["value"] = data[i].goodsName;
                    tempArray["unit"] = data[i].unit;
                    tempArray["unitPrice"] = data[i].unitPrice;

                    productcard.push(tempArray);
                }
            });
            function dasdsadsa(x) {
                var nf = Intl.NumberFormat();
                var GN = "product";
                for (var i = 1; i <= count; i++) {
                    $("#goods_name" + i).autocomplete({
                        source: productcard,
                        select: function (e, ui) {
                            var e = ui.item;
                            $("#product" + x.rowIndex).val(e.name);
                            for (var k = 1; k < x.rowIndex; k++) {
                                if (document.getElementById(GN + k).value == document.getElementById(GN + x.rowIndex).value) {
                                    alert("Sản phẩm này đã chọn trươc đó!!!");
                                    document.getElementById(GN + x.rowIndex).focus();
                                    console.log(document.getElementById(GN + x.rowIndex).value);
                                    return false;
                                }
                            }
                            $("#unit" + x.rowIndex).val(e.unit);
                            $("#goods_price" + x.rowIndex).val(e.unitPrice);
                            $("#agoods_price" + x.rowIndex).val(nf.format(parseInt(e.unitPrice)));
                            $("#goods_id" + x.rowIndex).val(e.id);
                            $("#quantity" + x.rowIndex).val(1);
                            $('#afterpirce' + x.rowIndex).val(e.unitPrice);
                            $('#aafterpirce' + x.rowIndex).val(nf.format(parseInt(e.unitPrice)));
                            $('#total_SL').val(parseInt(document.getElementById('total_SL').value) + 1);
                            $('#total_TT').val(parseInt(document.getElementById('total_TT').value) + e.unitPrice);
                            $('#atotal_TT').val(nf.format(parseInt(document.getElementById('total_TT').value)));
                            $('#TGG').val(parseInt(document.getElementById('TGG').value) + e.unitPrice - parseInt(document.getElementById('GG').value));
                            $('#aTGG').val(nf.format(parseInt(document.getElementById('TGG').value) - parseInt(document.getElementById('GG').value)));
                        },
                        change: function (e, ui) {
                        }
                    });
                }
            }
            function validation() {
                var checkreceiver = document.myform.receiver.value;
                var checkcustomername = document.myform.customername.value;
                var checkcreator = document.myform.creator.value;
                var checkname = document.myform.namecs.value;
                var checkcrt = document.myform.checkcrt.value;
                var igoods_name = "goods_name";
                var idsl = "quantity";
                var idc = "discount";
                var ipr = "product";
                var check = false;
                if (checkcustomername == null || checkcustomername == "") {
                    alert("Khách hàng/Công ty không được để trống!!!");
                    document.getElementById('customername').focus();
                    return false;
                } else if (checkcustomername != checkname) {
                    alert("Khách hàng/Công ty không tồn tại!!!");
                    document.getElementById('customername').focus();
                    return false;
                } else if (checkreceiver == null || checkreceiver == "") {
                    alert("Người Nhận hàng không được để trống!!!");
                    document.getElementById('receiver').focus();
                    return false;
                } else if (checkcreator == null || checkcreator == "") {
                    alert("Người bán hàng không được để trống!!!");
                    document.getElementById('creator').focus();
                    return false;
                } else if (checkcreator != checkcrt) {
                    alert("Tên người bán hàng không tồn tại trong danh sách!!!");
                    document.getElementById('creator').focus();
                    return false;
                }
                for (var i = 1; i <= count; i++) {
                    var goods_name = document.getElementById(igoods_name + i).value;
                    var sl = document.getElementById(idsl + i).value;
                    var dc = document.getElementById(idc + i).value;
                    var pr = document.getElementById(ipr + i).value;
                    if (goods_name == null || goods_name == "") {
                        alert("Hàng hoá không được để trống!!!");
                        document.getElementById(igoods_name + i).focus();
                        return false;
                    } else if (goods_name != pr) {
                        alert("Hàng hoá không tồi tại!!!");
                        document.getElementById(igoods_name + i).focus();
                        return false;
                    } else if (sl == null || sl == "") {
                        alert("Số lượng không được để trống!!!");
                        document.getElementById(idsl + i).focus();
                        return false;
                    } else if (sl <= 0) {
                        alert("Số lượng phải >0!!!");
                        document.getElementById(idsl + i).focus();
                        return false;
                    } else if (dc == null || dc == "") {
                        alert("Chiết khấu không được để trống!!!");
                        document.getElementById(idc + i).focus();
                        return false;
                    } else if (dc < 0) {
                        alert("chiết khấu phải lớn hơn hoặc bằng 0!!!");
                        document.getElementById(idc + i).focus();
                        return false;
                    }
                }
                return  true;
            }
        </script>
