<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quản lý sản phẩm</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        form { width: 300px; display: flex; flex-direction: column; }
        label { margin-top: 10px; }
        input { padding: 8px; margin-top: 5px; }
        button { margin-top: 15px; padding: 10px; background: #28a745; color: white; border: none; border-radius: 3px; cursor: pointer; }
    </style>
</head>
<body>
    <h2>
        <c:if test="${product != null}">Cập nhật sản phẩm</c:if>
        <c:if test="${product == null}">Thêm sản phẩm mới</c:if>
    </h2>

    <form action="<c:out value='${product != null ? "update" : "insert"}' />" method="post">
        <c:if test="${product != null}">
            <input type="hidden" name="id" value="<c:out value='${product.id}' />" />
        </c:if>

        <label>Tên sản phẩm:</label>
        <input type="text" name="name" value="<c:out value='${product.name}' />" required="required" />

        <label>Giá:</label>
        <input type="number" step="0.01" name="price" value="<c:out value='${product.price}' />" required="required" />

        <label>Số lượng:</label>
        <input type="number" name="quantity" value="<c:out value='${product.quantity}' />" required="required" />

        <button type="submit">Lưu</button>
    </form>
    <br>
    <a href="list">Trở về danh sách</a>
</body>
</html>
