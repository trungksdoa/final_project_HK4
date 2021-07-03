<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>window.jQuery || document.write(decodeURIComponent('%3Cscript src="js/jquery.min.js"%3E%3C/script%3E'))</script>
        <link rel="stylesheet" type="text/css" href="https://cdn3.devexpress.com/jslib/21.1.4/css/dx.common.css" />
        <link rel="stylesheet" type="text/css" href="https://cdn3.devexpress.com/jslib/21.1.4/css/dx.light.css" />
        <script src="https://cdn3.devexpress.com/jslib/21.1.4/js/dx.all.js"></script>
        <script src="https://kit.fontawesome.com/cca0c56933.js" crossorigin="anonymous"></script>
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
        </style>
    </head>
    <body>
        <script>
            $(function () {
                var today = new Date();
                var dd = String(today.getDate()).padStart(2, '0');
                var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
                var yyyy = today.getFullYear();

                today = mm + '/' + dd + '/' + yyyy;
//                document.write(today);
                var array = new Array();
                var quantity = [];
                const person = null;
                var toSum = new Array();
            <c:forEach items="${Namelist}" var="x">
                var temparray = new Array();
                var object = new Object();
                object = {y: ${x.quantityInStock}, label: "${x.goodsName}", warehouse: "${x.stockCard}"};
                toSum.push(${x.quantityInStock})
                array.push(object);
            </c:forEach>
                let sumquantity = 0;
                let sumPrice = 0;
            <c:forEach items="${ListQuantity}" var="x">
                sumquantity += ${x.quantityInStock};
                sumPrice += ${x.priceInStock};
            </c:forEach>
                console.log(sumquantity);
                function formatNumber(num) {
                    return num.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1,')
                }

                document.getElementById("priceStock").innerHTML = formatNumber(sumPrice);
                document.getElementById("quantity").innerHTML = formatNumber(sumquantity);
//                function myFunc(total, num) {
//
//                    return (total + num);
//                }

                window.onload = function () {
                    var options = {
                        exportEnabled: true,
                        animationEnabled: true,
                        title: {
                            text: "Top 5 most stocked goods"
                        },
                        subtitles: [{
                                text: "As  " + today + ""
                            }],
                        animationEnabled: true,
                        data: [{
                                type: "pie",
                                startAngle: 40,
                                toolTipContent: "<b>{label}</b>: {y} exist in {warehouse} ",
                                showInLegend: "true",
                                legendText: "{label} : {warehouse}",
                                indexLabelFontSize: 16,
                                indexLabel: "{label} - {y} exist",
                                dataPoints: array
                            }]
                    };
                    $("#chartContainer").CanvasJSChart(options);

                }
            });
        </script>
        <div id="chartContainer" style="height: 370px; width: 100%;"></div>

        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <div class="card-counter success">
                        <i class="far fa-money-bill-alt"></i>
                        <span class="count-numbers" id="priceStock">0</span>
                        <span class="count-name">Price in stock</span>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card-counter info">
                        <i class="fas fa-cubes"></i>
                        <span class="count-numbers" id="quantity">0</span>
                        <span class="count-name">All stock exits </span>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
        <script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
    </body>
</html>