package vn.edu.demo.model;
import java.math.BigDecimal;
public class Product {
 private int id, quantity; private String name, description; private BigDecimal price;
 public Product() {}
 public Product(int id,String name,BigDecimal price,int quantity,String description){this.id=id;this.name=name;this.price=price;this.quantity=quantity;this.description=description;}
 public int getId(){return id;} public void setId(int v){id=v;}
 public String getName(){return name;} public void setName(String v){name=v;}
 public BigDecimal getPrice(){return price;} public void setPrice(BigDecimal v){price=v;}
 public int getQuantity(){return quantity;} public void setQuantity(int v){quantity=v;}
 public String getDescription(){return description;} public void setDescription(String v){description=v;}
}