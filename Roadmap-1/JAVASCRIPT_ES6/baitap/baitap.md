# Bài tập cơ bản

## Phần 3 - Điều kiện & Vòng lặp
### 1. Viết chương trình nhập một số n, in ra bảng cửu chương n.
### 2. Dùng switch in ra tên thứ trong tuần khi nhập số từ 1–7.
### 3. Dùng for...of in ra từng ký tự của chuỗi "JavaScript".

## Phần 4 - Hàm
### 1. Viết hàm tinhGiaiThua(n) trả về n!
### 2. Viết hàm laSoChan(n) trả về true/false
### 3. Viết hàm sayHello(name) với tham số mặc định là "bạn"

## Phần 5 - Mảng & chuỗi
### 1. Tạo mảng ["HTML", "CSS", "JavaScript"], thêm "React" vào cuối.
### 2. In ra độ dài của chuỗi "Hello World" và chuyển thành chữ thường.
### 3. Duyệt mảng số [2,4,6,8] và in ra bình phương của mỗi số.

## Phần 6 - Tương tác HTML cơ bản
### 1. Tạo 1 nút "Đổi màu nền" → click để đổi màu body.
### 2. Khi gõ vào ô input, hiển thị ngay chữ vừa gõ vào thẻ < p >
HTML Mẫu:

    <input id="name" placeholder="Nhập tên của bạn">
    <p id="result"></p>
### 3. Tạo form nhập họ tên → bấm nút gửi in ra console.
---
# Bài tập tổng hợp: Ứng dụng Quản lý Danh sách Sinh viên
## Viết một ứng dụng web đơn giản cho phép:
### 1. Nhập tên sinh viên vào ô input
### 2. Thêm vào danh sách khi bấm nút
### 3. Hiển thị danh sách trên trang web
### 4. Có nút xóa sinh viên trong danh sách
### 5. Hiển thị tổng số sinh viên hiện có
### 6. Thêm tính năng Tìm kiếm sinh viên bằng tên.
### 7. Thêm tính năng Sửa tên sinh viên khi click vào tên.
### 8. Sắp xếp danh sách theo thứ tự A-Z.
### 9. Đổi màu nền của danh sách
    - Thêm 3 nút: "Xanh", "Vàng", "Trắng".
    - Khi click vào từng nút, thay đổi màu nền (background-color) của toàn bộ danh sách sinh viên (<ul>).
### 10. Tô đậm tên sinh viên khi di chuột
    - Khi di chuột vào tên sinh viên trong danh sách (<li>), chữ sẽ tô đậm và đổi màu thành đỏ.
    - Khi rời chuột, trở lại bình thường.
### 11. Hiển thị tổng số ký tự tất cả tên
    - Thêm một dòng hiển thị: "Tổng số ký tự: X".
    - Mỗi khi danh sách thay đổi, cập nhật lại tổng số ký tự của tất cả tên trong mảng students.
### 12. Tìm kiếm và Tô màu kết quả
    1. Thêm một ô input "Tìm kiếm sinh viên" và một nút "Tìm".
    2. Khi người dùng nhập từ khóa và bấm nút:
        - Các sinh viên có chứa từ khóa (không phân biệt hoa thường) sẽ được tô nền vàng.
        - Các sinh viên không khớp từ khóa sẽ trở lại màu nền mặc định.
    3. Nếu không tìm thấy sinh viên nào → hiển thị thông báo "Không tìm thấy" bên dưới danh sách.
    4. Nếu ô tìm kiếm để trống → bỏ toàn bộ tô màu và xóa thông báo.

HTML mẫu:

    <h1>Quản lý Sinh viên</h1>

    <input id="studentName" placeholder="Nhập tên sinh viên">
    <button id="addBtn">Thêm</button>

    <h3>Danh sách sinh viên:</h3>
    <ul id="studentList"></ul>

    <p id="total"></p>

    <script src="app.js"></script>

Lưu ý: Có thể tùy biến HTML mẫu tùy ý