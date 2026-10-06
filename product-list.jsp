<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quản lý sản phẩm</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        table { width: 100%; border-collapse: collapse; margin-top: 20px; }
        th, td { border: 1px solid #ddd; padding: 10px; text-align: center; }
        th { background-color: #f2f2f2; }
        a { text-decoration: none; padding: 5px 10px; color: white; background: #007bff; border-radius: 3px; }
        a.delete { background: #dc3545; }
        .btn-add { margin-bottom: 15px; display: inline-block; }
    </style>
    <script>
        function confirmDelete(id) {
            if (confirm("Bạn có chắc chắn muốn xóa sản phẩm này không?")) {
                window.location.href = 'delete?id=' + id;
            }
        }
    </script>
</head>
<body>
    <h2>Danh sách sản phẩm</h2>
    <a href="new" class="btn-add">Thêm sản phẩm mới</a>
    <table>
        <tr>
            <th>ID</th>
            <th>Tên sản phẩm</th>
            <th>Giá</th>
            <th>Số lượng</th>
            <th>Hành động</th>
        </tr>
        <c:forEach var="product" items="${listProduct}">
            <tr>
                <td><c:out value="${product.id}" /></td>
                <td><c:out value="${product.name}" /></td>
                <td><c:out value="${product.price}" /></td>
                <td><c:out value="${product.quantity}" /></td>
                <td>
                    <a href="edit?id=<c:out value='${product.id}' />">Sửa</a>
                    <a href="javascript:void(0);" class="delete" onclick="confirmDelete(<c:out value='${product.id}' />)">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
