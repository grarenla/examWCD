<%--
  Created by IntelliJ IDEA.
  User: s2rai
  Date: 14-Jun-19
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Phone</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <div class="row">
        <form method="POST">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" id="name"
                       placeholder="Enter name" name="name" required>
            </div>
            <select class="form-control" name="brand" required>
                <option>Apple</option>
                <option>Samsung</option>
                <option>Nokia</option>
                <option>Others</option>
            </select>
            <div class="form-group">
                <label for="price">Password</label>
                <input type="text" class="form-control" id="price" placeholder="Price" name="price" required>
            </div>
            <div class="form-group">
                <label for="description">Password</label>
                <input type="text" class="form-control" id="description" placeholder="Description" name="description" required>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="reset" class="btn btn-warning">Reset</button>
        </form>
    </div>
</div>
>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
