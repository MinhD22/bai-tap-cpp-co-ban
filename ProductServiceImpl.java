package vn.edu.demo.service;
import vn.edu.demo.model.Product; import java.math.BigDecimal; import java.util.*; import java.util.concurrent.atomic.AtomicInteger; import java.util.stream.Collectors;
public class ProductServiceImpl implements ProductService {
 private final List<Product> products=new ArrayList<>(); private final AtomicInteger nextId=new AtomicInteger(4);
 public ProductServiceImpl(){products.add(new Product(1,"Bàn phím cơ",new BigDecimal("850000"),12,"Bàn phím cơ dùng cho máy tính."));products.add(new Product(2,"Chuột không dây",new BigDecimal("250000"),25,"Chuột không dây kết nối USB."));products.add(new Product(3,"Màn hình 24 inch",new BigDecimal("3200000"),8,"Màn hình máy tính 24 inch."));}
 public synchronized List<Product> findAll(){return new ArrayList<>(products);}
 public synchronized List<Product> searchByName(String k){String s=k==null?"":k.trim().toLowerCase();if(s.isEmpty())return findAll();return products.stream().filter(p->p.getName().toLowerCase().contains(s)).collect(Collectors.toList());}
 public synchronized Optional<Product> findById(int id){return products.stream().filter(p->p.getId()==id).findFirst();}
 public synchronized Product add(Product p){p.setId(nextId.getAndIncrement());products.add(p);return p;}
 public synchronized boolean update(Product p){for(int i=0;i<products.size();i++)if(products.get(i).getId()==p.getId()){products.set(i,p);return true;}return false;}
 public synchronized boolean delete(int id){return products.removeIf(p->p.getId()==id);}
}