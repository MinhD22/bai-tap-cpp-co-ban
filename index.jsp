<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi"><head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1">
<title>Chuyển đổi USD sang VNĐ</title>
<style>
*{box-sizing:border-box}body{margin:0;min-height:100vh;display:grid;place-items:center;padding:20px;font-family:Arial,sans-serif;background:#f4f7fb}
.converter{width:100%;max-width:420px;padding:32px;background:white;border-radius:14px;box-shadow:0 8px 24px #0001}
h1{margin-top:0;color:#1d4ed8;text-align:center;font-size:24px}label{display:block;margin:18px 0 7px;font-weight:bold}
input{width:100%;padding:12px;border:1px solid #cbd5e1;border-radius:7px;font-size:16px}
button{width:100%;margin-top:22px;padding:13px;border:0;border-radius:7px;color:white;background:#1d4ed8;font-size:16px;font-weight:bold;cursor:pointer}
button:hover{background:#1e40af}.note{color:#64748b;font-size:13px;text-align:center}
</style></head><body><main class="converter">
<h1>Chuyển đổi USD sang VNĐ</h1>
<form action="convert" method="post">
<label for="rate">Tỉ giá (VNĐ/USD)</label><input id="rate" type="number" name="rate" value="25000" min="0.01" step="any" required>
<label for="usd">Lượng USD cần đổi</label><input id="usd" type="number" name="usd" min="0" step="any" placeholder="Ví dụ: 100" required>
<button type="submit">Chuyển đổi</button></form><p class="note">Nhập tỉ giá và số USD để tính số tiền VNĐ.</p>
</main></body></html>
