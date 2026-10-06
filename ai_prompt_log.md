# Nhật ký sử dụng AI

1. **Brainstorm:** Hỏi AI phân biệt Flexbox (bố cục một chiều) và CSS Grid (bố cục hai chiều); chọn Flexbox cho Navbar, Grid cho Dashboard.
2. **Audit:** Nhờ AI chỉ ra rủi ro của cột Navbar cố định theo pixel, các lớp Flexbox lồng nhau và media query thủ công cho Pricing.
3. **Thiết kế:** Tham khảo cú pháp Grid `repeat(3, minmax(0, 1fr))`, `grid-column: span 2` và breakpoint chuyển Dashboard về một cột trên mobile.
4. **Bootstrap:** Tham khảo cách dùng `row`, `col-12 col-md-4`, `card` và `card-body` cho ba gói giá.
5. **Kiểm thử:** Dùng AI lập checklist desktop, tablet, mobile; kiểm tra nội dung dài, menu điện thoại và khoảng cách bằng `gap`.

AI được dùng để brainstorm, rà soát và gợi ý mã mẫu. Mã cuối cùng cần được mở bằng Live Server và kiểm tra trực tiếp ở các kích thước màn hình khác nhau.
