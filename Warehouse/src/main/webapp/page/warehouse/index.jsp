<%-- 
    Document   : index
    Created on : Jun 23, 2021, 9:15:48 AM
    Author     : trung
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css" integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous">
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


</head>

<body>

    <div class="container">
        <div class="main" style="margin-top: 8rem; border:2px solid black">
            <form>
                <div class="row">
                    <div class="col-lg-8">
                        <h5>Information</h5>
                        <div class="form-group row">
                            <label for="object" class="col-lg-2 col-form-label">Object</label>
                            <div class="col-lg-10">
                                <input type="text" class="form-control" name="object" id="object" placeholder="object">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="shipper" class="col-lg-2 col-form-label">Shipper</label>
                            <div class="col-lg-10">
                                <div class="input-group">
                                    <input type="text" class="form-control" name="shipper" id="shipper" placeholder="Shipper">
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="explain" class="col-lg-2 col-form-label">Explain</label>
                            <div class="col-lg-10">
                                <input type="text" class="form-control" name="explain" id="explain" placeholder="explain">
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="row">
                            <div class="col-lg-12">
                                <h5>License</h5>
                                <div class="form-group row">
                                    <label for="id" class="col-lg-2 col-form-label">License</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="id" id="id" placeholder="System will generation License">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="Date" class="col-lg-2 col-form-label">Date</label>
                                    <div class="col-sm-10">
                                        <input type="date" class="form-control" name="Date" id="Date" placeholder="Date">
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-12">
                                <h5>Warehouse</h5>
                                <div class="form-group row">
                                    <div class="col-lg-10">
                                        <div class="input-group mb-3">
                                            <select class="custom-select" id="inputGroupSelect02">
                                                <option selected>Choose...</option>
                                                <option value="1">Warehouse A</option>
                                                <option value="2">Warehouse B</option>
                                                <option value="3">Warehouse C</option>
                                                </select>
                                            <div class="input-group-append">
                                                <button class="btn btn-outline-secondary" id="btnkho" type="button"><i class="fas fa-plus"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <h5>Goods</h5>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First</th>
                            <th scope="col">Last</th>
                            <th scope="col">Handle</th>
                            <th scope="col">Handle</th>
                            <th scope="col">Handle</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td>
                                <p id="text1">Mark</p>
                                <input style="display: none;" id="input1" type="text" value="Enter" />
                            </td>
                            <td>
                                <p id="text2">Trung</p>
                                <input style="display: none;" id="input2" type="text" value="Enter" />
                            </td>
                            <td>
                                <p id="text3">Boss</p>
                                <input style="display: none;" id="input3" type="text" value="Enter" />
                            </td>
                            <td>
                                <p id="text4">Mark</p>
                                <input style="display: none;" id="input1" type="text" value="Enter" />
                            </td>
                            <td>
                                <p id="text5">Mark</p>
                                <input style="display: none;" id="input1" type="text" value="Enter" />
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>

    <!-- Modal flatform -->
    <form action="">
        <div id="modalkho" class="modal" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Create warehouse</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                    </div>
                    <div class="modal-body">
                        <div class="form-group row">
                            <label for="object" class="col-lg-2 col-form-label">ID</label>
                            <div class="col-lg-10">
                                <input type="text" class="form-control" name="object" id="object" placeholder="object">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="object" class="col-lg-2 col-form-label">Name</label>
                            <div class="col-lg-10">
                                <input type="text" class="form-control" name="object" id="object" placeholder="object">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">Save changes</button>
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
    <!-- End modal -->

    <script>
        $(document).ready(function() {
            $("#btnkho").click(function() {
                $("#modalkho").modal('show');
            });
            $("#text1").click(function() {
                document.getElementById('input1').style.display = "block"
                document.getElementById('text1').style.display = "none"
                var Testvalue = document.getElementById('text1').innerText;
                document.getElementById('input1').value = Testvalue;
                console.log("Label" + ":" + Testvalue);
                console.log(document.getElementById('input1').value)
            });

            $("#input1").on('keyup', function(e) {
                if (e.key === 'Enter' || e.keyCode === 13) {
                    document.getElementById('input1').style.display = "none"
                    document.getElementById('text1').style.display = "block"
                    var Testvalue = document.getElementById('input1').value;
                    document.getElementById('text1').innerHTML = Testvalue;
                    console.log("Input" + ":" + Testvalue);
                    console.log(document.getElementById('input1').value)
                }
            });
            $("#text2").click(function() {
                document.getElementById('input2').style.display = "block"
                document.getElementById('text2').style.display = "none"
                var Testvalue = document.getElementById('text2').innerText;
                document.getElementById('input2').value = Testvalue;
                console.log("Label" + ":" + Testvalue);
                console.log(document.getElementById('input2').value)
            });

            $("#input2").on('keyup', function(e) {
                if (e.key === 'Enter' || e.keyCode === 13) {
                    document.getElementById('input2').style.display = "none"
                    document.getElementById('text2').style.display = "block"
                    var Testvalue = document.getElementById('input2').value;
                    document.getElementById('text2').innerHTML = Testvalue;
                    console.log("Input" + ":" + Testvalue);
                    console.log(document.getElementById('input2').value)
                }
            });
        });
        var today = new Date();
        var months = null;
        var date = null;
        if ((months = today.getMonth() + 1) > 10) {
            months = months = today.getMonth() + 1;
            date = today.getFullYear() + '-' + months + '-' + today.getDate();
        } else {
            months = "0" + (months = today.getMonth() + 1);
            date = today.getFullYear() + '-' + months + '-' + today.getDate();
        }
        document.getElementById("Date").value = date;
    </script>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>

</html>