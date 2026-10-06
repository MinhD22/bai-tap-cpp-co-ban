# JSP/Servlet Currency Converter

Bài tập Java Web dùng Maven, JSP, Servlet và Jakarta Servlet API, tương thích Apache Tomcat 10.1+.

## Yêu cầu
- JDK 17+
- Maven
- Apache Tomcat 10.1+

## Cấu trúc
- `pom.xml`: cấu hình Maven
- `src/main/java/com/codegym/ConverterServlet.java`: xử lý POST `/convert`
- `src/main/webapp/index.jsp`: form nhập tỉ giá và lượng USD
- `src/main/webapp/WEB-INF/web.xml`: cấu hình ứng dụng

## Chạy
1. Mở terminal tại thư mục có `pom.xml`.
2. Chạy `mvn clean package`.
3. File WAR được tạo ở `target/jsp-servlet-currency-converter.war` khi BUILD SUCCESS.
4. Sao chép WAR vào `webapps` của Tomcat 10.1+ và khởi động Tomcat.
5. Truy cập `http://localhost:8080/jsp-servlet-currency-converter/`.

Không tải thư mục `target/` lên GitHub; tải mã nguồn và cấu hình dự án.
