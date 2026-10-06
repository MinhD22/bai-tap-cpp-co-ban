# Quản lý sản phẩm — Java Web MVC2

Dự án mẫu gồm Product, ProductService, ProductServiceImpl, ProductServlet và JSP cho danh sách, thêm, sửa, xóa, chi tiết, tìm kiếm.

## Chạy
- Cần JDK 11+, Maven và Apache Tomcat 10+.
- Mở thư mục này bằng IntelliJ IDEA/Eclipse dưới dạng Maven project.
- Chạy `mvn clean package`.
- Chép `target/quan-ly-san-pham-mvc2.war` vào `webapps` của Tomcat.
- Mở `http://localhost:8080/quan-ly-san-pham-mvc2/products`.

Dữ liệu mẫu được lưu trong bộ nhớ, không cần database; khi restart server dữ liệu sẽ trở về ban đầu.

## Nộp GitHub
Tạo repository mới, giải nén ZIP rồi chạy trong thư mục dự án:
```
git init
git add .
git commit -m "Hoan thanh bai tap Java Web MVC2"
git branch -M main
git remote add origin https://github.com/TEN_TAI_KHOAN/quan-ly-san-pham-mvc2.git
git push -u origin main
```
Thay `TEN_TAI_KHOAN` bằng tài khoản GitHub của bạn và nộp link repository thật.
