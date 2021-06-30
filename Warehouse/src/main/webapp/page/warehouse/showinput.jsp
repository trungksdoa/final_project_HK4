<%-- 
    Document   : newjsp
    Created on : Jun 23, 2021, 6:27:23 PM
    Author     : trung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="description" content="jquery-autocomplete-ajax-php, jquery-autocomplete-ajax-json, jquery-autocomplete-from-database, jquery-autocomplete-json-example, jqueryui-autocomplete-select">
        <meta name="keywords" content="jquery-autocomplete-ajax-php, jquery-autocomplete-ajax-json, jquery-autocomplete-from-database, jquery-autocomplete-json-example, jqueryui-autocomplete-select">

        <title>jQuery Autocomplete using ajax,php, mysql</title>
        <link href="https://fonts.googleapis.com/css?family=Ubuntu:300,500,700" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.css">

        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.js"></script>
    </head>
    <style>
        div.dataTables_wrapper {
            width: 800px;
            margin: 0 auto;
        }
    </style>

    <body>
        <div class="container">
            <div class="row">
                <table id="example" class="display nowrap" style="width:100%">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Date created</th>
                            <th>Explain</th>
                            <th>Service</th>
                            <th>Status</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listdata}" var="x">
                            <tr>      
                                <td><c:out value="${x.getId()}"></c:out></td>
                                <td><c:out value="${x.getDate()}"></c:out></td>
                                <td><c:out value="${x.getExplain()}"></c:out></td>
                                <td><c:out value="${x.getService()}"></c:out></td>
                                <td><c:out value="${x.getStatus()}"></c:out></td>
                                <td><a href="#">Details</a></td>
                                </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

    </body>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#example').DataTable({
                "scrollY": 200,
                "scrollX": true
            });
        });
    </script>

</html>