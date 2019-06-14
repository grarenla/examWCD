<%@ page import="entity.Phone" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: s2rai
  Date: 14-Jun-19
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Phone> phones = (ArrayList<Phone>) request.getAttribute("list");
    if (phones == null) phones = new ArrayList<>();
%>
<html>
<head>
    <title>List Phone</title>
</head>
<body>
<section class="content">
    <div class="card">
        <div class="header">
            <h2>List Feedback</h2>
        </div>
        <div class="body">
            <div class="table-responsive">
                <%--<div class="row">--%>
                <%--<div class="col-sm-12">--%>
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr class="text-center">
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Brand</th>
                        <th scope="col">Price</th>
                        <th scope="col">Description</th>
                    </tr>
                    </thead>
                    <tbody class="text-center">
                    <%
                        for (Phone phone :
                                phones) {
                    %>
                    <tr>
                        <th scope="row"><%= phone.getID()%>
                        </th>
                        <td><%= phone.getName()%>
                        </td>
                        <td><%= phone.getBrand()%>
                        </td>
                        <td><%= phone.getPrice()%>
                        </td>
                        <td><%= phone.getDescription()%>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                    </tbody>
                </table>
            </div>
        </div>

    </div>
</section>
</body>
</html>
