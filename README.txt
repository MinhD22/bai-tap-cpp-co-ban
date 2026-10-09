BÀI THỰC HÀNH NODE.JS, NPM VÀ SASS CLI

Cấu trúc thư mục:
- index.html: trang minh họa sử dụng CSS được biên dịch từ SCSS.
- scss/style.scss: mã nguồn SCSS.
- css/style.css: CSS đầu ra đã biên dịch.
- package.json: khai báo Sass và các lệnh npm.

CÁCH THỰC HÀNH TRÊN WINDOWS (VS CODE)

1. Cài Node.js LTS từ https://nodejs.org/en/download/
2. Đóng rồi mở lại Terminal trong VS Code, kiểm tra:
   node -v
   npm -v

3. Mở Terminal tại thư mục đã giải nén và cài package:
   npm install

4. Biên dịch một lần:
   npm run sass:build
   Hoặc:
   npx sass scss/style.scss css/style.css

5. Theo dõi tự động:
   npm run sass:watch
   Để dừng watch, nhấn Ctrl+C.

6. Biên dịch tất cả SCSS trong scss/ sang css/:
   npx sass scss/:css/
   Theo dõi thư mục:
   npx sass --watch scss/:css/

7. Mở index.html bằng trình duyệt. Nếu đang watch, giữ Terminal chạy trong khi sửa SCSS.

CÀI SASS TOÀN CỤC (TÙY CHỌN)
   npm install -g sass
   sass --version
   sass scss/style.scss css/style.css
   sass --watch scss/style.scss:css/style.css

LƯU Ý VỀ POWERSHELL
Không nên đặt Set-ExecutionPolicy Unrestricted chỉ để cài Sass. Nếu PowerShell chặn npm.ps1, hãy thử chạy npm.cmd thay cho npm, hoặc dùng Command Prompt. Chỉ thay đổi Execution Policy khi hiểu rõ tác động và làm theo hướng dẫn phù hợp.

NỘP BÀI
Đưa index.html, scss/, css/, package.json và README.txt lên GitHub. Không cần đưa thư mục node_modules/ lên GitHub.
