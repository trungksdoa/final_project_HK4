<%-- 
    Document   : index
    Created on : Jun 16, 2021, 12:44:44 AM
    Author     : trung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Phiếu Báo Giá/Q00001
        </title>

        <!-- Google Font: Source Sans Pro -->
        <!-- CSS only -->
        <link
            href="https://fonts.googleapis.com/css?family=Anton|Fascinate+Inline|Nunito+Sans|Oswald:300,400,500,600,700|Roboto&display=swap"
            rel="stylesheet">
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

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <style>
            table, th, td {
                border: 1px solid black;
                font-size: 20px;
            }
            @media print {
                button{
                    display: none;
                }
            }
        </style>
    </head>
    <body class="container" >
        <form action="/salescoupon/">
            <button onclick="window.close()"  style="float: right; outline: none; border: none; margin-top: 20px;margin-right:20px;" type="submit"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x-square" viewBox="0 0 16 16">
                <path d="M14 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h12zM2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z"/>
                <path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"/>
                </svg></button>
        </form>
        <div class="container" style="background-color: white; padding: 30px 30px;">
            <h3 style="padding-top: 10px;">Demo online Sell</h3>
            <span><i style="font-size: 25px;">Address: 590 Cách Mạng Tháng Tám, quận 3, HCM</i></span><br>
            <span><i>Phone:0354072542</i></span>
            <h1 style="text-align: center; margin-top: 50px;margin-bottom: 20px;">SALES SLIP</h1>
            <span style="font-size: 20px;"><b>Code: ${salesCoupon.getId()}</b></span>
            <span style="float: right;font-size: 20px"><b>Ngày:${salesCoupon.getDate()}</b></span><br>
            <span style="font-size: 20px"><b>Customer:  <b>${customer.getName()}</b></b><i></i></span><br>
            <span style="font-size: 20px;"><b>Phone: ${salesCoupon.getPhone()} - Address: ${salesCoupon.getAddress()}</b></span>
            <%!int i=0;%>
            <table style="width: 100%;margin-bottom: 30px;text-align: center" border="1px">
                <tr>
                    <th>STT</th>
                    <th >Goods name</th>
                    <th>Unit</th>
                    <th>Quantity</th>
                    <th>Unit price</th>
                    <th>Discount(%)</th>
                    <th>Discount price</th>
                    <th>After price</th>
                </tr>
                <c:forEach items="${list}" var="item">               
              <tr>   
                        <td style="text-align: center"><%=++i%></td>
                        <td>${item.getGoodsName()}</td>
                        
                        <td>${item.getUnit()}</td>
                        <td>${item.getQuantity()}</td>
                        <td><input readonly style="border: none;outline: none;width: 80px;" id="GoodsPrice<%=i%>" value=""/></td>
                        <td hidden="true"><input readonly style="border: none;outline: none;font-weight: bold" id="GP<%=i%>" value="${item.getUnitPrice()}"/></td>
                        <td>${item.getDiscount()}</td>
                        <td><input readonly style="border: none;outline: none;width: 80px;" id="LastedPrice<%=i%>" value="${item.getDiscoutPrice()}"/></td>
                        <td hidden="true"><input readonly style="border: none;outline: none;" id="LP<%=i%>" value=""/></td>
                        <td><input readonly style="border: none;outline: none;width: 80px;" id="Afterpirce<%=i%>" value=""/></td>
                        <td hidden="true"><input readonly style="border: none;outline: none;font-weight: bold" id="AP<%=i%>" value="${item.getAfterpirce()} "/></td>
                    </tr>
                </c:forEach>
                <tr style="height: 45px">
                    <th> <%i=0;%></th>
                    <th>Total</th>
                    <th></th>
                    <th>${salesCoupon.getTotalquantity()}</th>
                    <th></th>
                    <th></th>
                    <th><input readonly style="border: none;outline: none;width: 70px;font-weight: bold" id="TotalDiscount" value=""/></th>
                    <th><input readonly style="border: none;outline: none;width: 70px;font-weight: bold" id="TatolPrice" value=""/></th>
                 
                </tr>
            </table>
            <span style="font-size: 20px"><b>Payments:</b> ${salesCoupon.getPayments()}</span><br>
            <span style="font-size: 20px"><b>Total price:<input readonly style="border: none;outline: none;width: 70px;font-weight: bold" id="ATP" value=""/></b></span><br>
            <span style="font-size: 20px"><b>Discount: <u><input readonly style="border: none;outline: none;width: 70px;font-weight: bold" id="ATD" value=""/></u></b></span><br>
            
            <span style="font-size: 20px"><b>Total:<input readonly style="border: none;outline: none;width: 70px;font-weight: bold" id="ALastedPrice" value=""/></b></span><br>
            <span style="font-size: 20px"><b>paid:<input readonly style="border: none;outline: none;width: 70px;font-weight: bold" id="paid" value=""/></b></span><br>
            <span style="font-size: 20px"><b>owed:<input readonly style="border: none;outline: none;width: 70px;font-weight: bold" id="owed" value=""/>
                    <span style="float:right;font-size: 25px;margin-right: 95px;"><b>Seller</b></span>
                </b></span><br><br>
            <span style="float:right;font-size: 20px;margin-right: 65px;"><i>(sign, full name)</i></span><br><br><br><br>
            <span style="float:right;font-size: 22px;margin-right: 95px;"><b>Admin</b></span>

            <button style="width: 120px;height: 40px;background-color: #31cc54;color:white; border: none;border-radius: 5px " type="button" onclick="window.print()"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-printer" viewBox="0 0 16 16">
                <path d="M2.5 8a.5.5 0 1 0 0-1 .5.5 0 0 0 0 1z"/>
                <path d="M5 1a2 2 0 0 0-2 2v2H2a2 2 0 0 0-2 2v3a2 2 0 0 0 2 2h1v1a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2v-1h1a2 2 0 0 0 2-2V7a2 2 0 0 0-2-2h-1V3a2 2 0 0 0-2-2H5zM4 3a1 1 0 0 1 1-1h6a1 1 0 0 1 1 1v2H4V3zm1 5a2 2 0 0 0-2 2v1H2a1 1 0 0 1-1-1V7a1 1 0 0 1 1-1h12a1 1 0 0 1 1 1v3a1 1 0 0 1-1 1h-1v-1a2 2 0 0 0-2-2H5zm7 2v3a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1v-3a1 1 0 0 1 1-1h6a1 1 0 0 1 1 1z"/>
                </svg> Print </button>
            <script type="text/javascript">
            var nf = Intl.NumberFormat();
            document.getElementById('TotalDiscount').value = nf.format(${salesCoupon.getTotalDiscount()});
            document.getElementById('TatolPrice').value = nf.format(${salesCoupon.getTatolPrice()});
            document.getElementById('ATD').value = nf.format(${salesCoupon.getTotalDiscount()});
            document.getElementById('ATP').value = nf.format(${salesCoupon.getTatolPrice()});
            document.getElementById('ALastedPrice').value = nf.format(${salesCoupon.getLastedPrice()});
            document.getElementById('paid').value = nf.format(${salesCoupon.getPaid()});
            document.getElementById('owed').value = nf.format(${salesCoupon.getOwed()});
          
            var GoodsPrice = "GoodsPrice";
            var GP = "GP";
            var LastedPrice = "LastedPrice";
            var LP = "LP";
            var Afterpirce = "Afterpirce";
            var AP = "AP";
             var count = 0;
             
            <c:forEach items="${list}" var="item">  
            ++count;
            document.getElementById(GoodsPrice +count).value = nf.format(document.getElementById(GP + count).value);
            document.getElementById(LastedPrice +count).value = nf.format(document.getElementById(LP + count).value);
            document.getElementById(Afterpirce +count).value = nf.format(document.getElementById(AP + count).value);
        
            </c:forEach>
            count = 0;
            </script>
    </body>

</html>

