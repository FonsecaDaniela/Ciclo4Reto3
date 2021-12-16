/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Ciclo4.Repositorio;

import Reto2_Ciclo4.Modelo.Order;
import com.jayway.jsonpath.Criteria;
import java.util.List;
import Reto2_Ciclo4.Interfaces.InterfaceOrder;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;



/**
 *
 * @author danie
 */
@Repository
public class OrderRepository {

    @Autowired
    private InterfaceOrder interfaceOrder;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Order> getAll() {
        return (List<Order>) interfaceOrder.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return interfaceOrder.findById(id);
    }

    public Order create(Order order) {
        return interfaceOrder.save(order);
    }

    public void update(Order order) {
        interfaceOrder.save(order);
    }

    public void delete(Order order) {
        interfaceOrder.delete(order);
    }

    public Optional<Order> lastUserId() {
        return interfaceOrder.findTopByOrderByIdDesc();
    }

    public List<Order> findByZone(String zona) {
        return interfaceOrder.findByZone(zona);
    }


}
