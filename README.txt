BÀI THỰC HÀNH: TÁI CẤU TRÚC CSS THÀNH SASS

Nguồn bài tập tham khảo:
https://github.com/codegym-vn/responsive-grid

Tệp trong bài:
- responsive_grid.html: trang HTML minh họa lưới responsive.
- scss/style.scss: mã SCSS đã tái cấu trúc bằng biến, selector lồng nhau và media query.
- css/style.css: CSS đầu ra để mở trang ngay.
- package.json: lệnh npm để biên dịch và theo dõi SCSS.

Cách chạy:
1. Cài Node.js LTS nếu máy chưa có: https://nodejs.org/en/download/
2. Mở Terminal tại thư mục dự án.
3. Chạy: npm install
4. Biên dịch SCSS: npm run sass:build
5. Theo dõi thay đổi tự động: npm run sass:watch
6. Mở responsive_grid.html trong trình duyệt.

Lệnh Sass CLI tương đương:
  npx sass scss/style.scss css/style.css
  npx sass --watch scss/:css/

Khi nộp GitHub, đưa lên responsive_grid.html, scss/, css/, package.json, package-lock.json (nếu có) và README.txt. Không tải node_modules/ lên GitHub.

Ghi chú:
Đây là bản tái cấu trúc theo ý tưởng lưới 12 cột, khu vực đầu trang/nội dung/chân trang và các breakpoint responsive của bài gốc; cấu trúc HTML đã được làm gọn để chuyển các kiểu inline thành các class trong SCSS.
