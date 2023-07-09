package com.geekster.Spring.Project.Ecommerce.API.Repository;

import com.geekster.Spring.Project.Ecommerce.API.Model.Orders;
import com.geekster.Spring.Project.Ecommerce.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Orders,Integer> {
}
