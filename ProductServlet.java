package vn.edu.demo.web;
import jakarta.servlet.*; import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*; import vn.edu.demo.model.Product; import vn.edu.demo.service.*; import java.io.IOException; import java.math.BigDecimal;
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
 private ProductService service;
 public void init(){service=new ProductServiceImpl();}
 protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
  req.setCharacterEncoding("UTF-8");String a=req.getParameter("action");if(a==null)a="list";
  switch(a){
   case "new":req.setAttribute("pageTitle","Thêm sản phẩm");req.getRequestDispatcher("/WEB-INF/views/product-form.jsp").forward(req,resp);break;
   case "edit":{Product p=service.findById(number(req.getParameter("id"),-1)).orElse(null);if(p==null){resp.sendRedirect(req.getContextPath()+"/products");return;}req.setAttribute("product",p);req.setAttribute("pageTitle","Cập nhật sản phẩm");req.getRequestDispatcher("/WEB-INF/views/product-form.jsp").forward(req,resp);break;}
   case "detail":{Product p=service.findById(number(req.getParameter("id"),-1)).orElse(null);if(p==null){resp.sendRedirect(req.getContextPath()+"/products");return;}req.setAttribute("product",p);req.getRequestDispatcher("/WEB-INF/views/product-detail.jsp").forward(req,resp);break;}
   case "delete":service.delete(number(req.getParameter("id"),-1));resp.sendRedirect(req.getContextPath()+"/products");break;
   case "search":req.setAttribute("keyword",safe(req.getParameter("keyword")));req.setAttribute("products",service.searchByName(req.getParameter("keyword")));req.getRequestDispatcher("/WEB-INF/views/product-list.jsp").forward(req,resp);break;
   default:req.setAttribute("keyword","");req.setAttribute("products",service.findAll());req.getRequestDispatcher("/WEB-INF/views/product-list.jsp").forward(req,resp);
  }
 }
 protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
  req.setCharacterEncoding("UTF-8");
  try {String a=req.getParameter("action"),name=safe(req.getParameter("name")).trim(),desc=safe(req.getParameter("description")).trim();BigDecimal price=new BigDecimal(req.getParameter("price"));int qty=Integer.parseInt(req.getParameter("quantity"));
   if(name.isEmpty()||price.signum()<0||qty<0){req.setAttribute("error","Tên không được để trống; giá và số lượng phải >= 0.");req.setAttribute("pageTitle","Thông tin sản phẩm");req.getRequestDispatcher("/WEB-INF/views/product-form.jsp").forward(req,resp);return;}
   if("edit".equals(a))service.update(new Product(Integer.parseInt(req.getParameter("id")),name,price,qty,desc));else service.add(new Product(0,name,price,qty,desc));resp.sendRedirect(req.getContextPath()+"/products");
  }catch(NumberFormatException e){req.setAttribute("error","Giá hoặc số lượng không hợp lệ.");req.setAttribute("pageTitle","Thông tin sản phẩm");req.getRequestDispatcher("/WEB-INF/views/product-form.jsp").forward(req,resp);}
 }
 private int number(String s,int d){try{return Integer.parseInt(s);}catch(Exception e){return d;}} private String safe(String s){return s==null?"":s;}
}