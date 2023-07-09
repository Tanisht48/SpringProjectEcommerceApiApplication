package com.geekster.Spring.Project.Ecommerce.API.Repository;

import com.geekster.Spring.Project.Ecommerce.API.Model.Product;
import com.geekster.Spring.Project.Ecommerce.API.Model.ProductCategory;
import com.geekster.Spring.Project.Ecommerce.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {
   List<Product> findByProductCategory(ProductCategory category);
}
