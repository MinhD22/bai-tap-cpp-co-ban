package vn.edu.demo.service;
import vn.edu.demo.model.Product; import java.util.*;
public interface ProductService { List<Product> findAll(); List<Product> searchByName(String keyword); Optional<Product> findById(int id); Product add(Product p); boolean update(Product p); boolean delete(int id); }