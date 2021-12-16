/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Ciclo4.Interfaces;

import Reto2_Ciclo4.Modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author danie
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {
	    Optional<User> findByEmail(String email);
	    Optional<User> findByEmailAndPassword(String email,String password);
            
            List<User> findByMonthBirthtDay(String monthBirthtDay);
            Optional<User> findTopByOrderByIdDesc();
	}
