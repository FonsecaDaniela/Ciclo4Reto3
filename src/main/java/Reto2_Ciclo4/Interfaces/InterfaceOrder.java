/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Ciclo4.Interfaces;

import Reto2_Ciclo4.Modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author danie
 */
public interface InterfaceOrder extends MongoRepository<Order, Integer> {
    
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(String zone);
    
    Optional<Order> findTopByOrderByIdDesc();
    }
