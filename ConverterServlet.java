package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ConverterServlet", urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try {
            BigDecimal rate = new BigDecimal(request.getParameter("rate"));
            BigDecimal usd = new BigDecimal(request.getParameter("usd"));
            if (rate.signum() <= 0 || usd.signum() < 0) {
                showError(response, "Tỉ giá phải lớn hơn 0 và lượng USD không được âm.");
                return;
            }
            BigDecimal vnd = rate.multiply(usd);
            NumberFormat fmt = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
            fmt.setMaximumFractionDigits(2);
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html><html lang='vi'><head><meta charset='UTF-8'><meta name='viewport' content='width=device-width,initial-scale=1'><title>Kết quả</title>");
                out.println("<style>body{font-family:Arial;background:#f4f7fb;display:grid;place-items:center;min-height:100vh;margin:0}.card{background:white;padding:32px;border-radius:14px;box-shadow:0 8px 24px #0001;text-align:center;max-width:460px;width:calc(100% - 48px)}h1{color:#1d4ed8}.amount{font-size:25px;color:#15803d;font-weight:bold}a{display:inline-block;margin-top:18px;padding:10px 18px;background:#1d4ed8;color:white;text-decoration:none;border-radius:6px}</style></head><body><main class='card'>");
                out.println("<h1>Kết quả chuyển đổi</h1><p>Tỉ giá: " + rate.toPlainString() + " VNĐ/USD</p>");
                out.println("<p>Lượng USD: " + usd.toPlainString() + " USD</p><p class='amount'>Thành tiền: " + fmt.format(vnd) + " VNĐ</p>");
                out.println("<a href='index.jsp'>Quay lại</a></main></body></html>");
            }
        } catch (NumberFormatException | NullPointerException ex) {
            showError(response, "Vui lòng nhập tỉ giá và lượng USD hợp lệ.");
        }
    }
    private void showError(HttpServletResponse response, String message) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html lang='vi'><head><meta charset='UTF-8'><title>Lỗi</title></head><body style='font-family:Arial;text-align:center;margin-top:80px'>");
            out.println("<h2 style='color:#dc2626'>" + message + "</h2><a href='index.jsp'>Quay lại</a></body></html>");
        }
    }
}
