/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Ciclo4.Interfaces;

import Reto2_Ciclo4.Modelo.Supplements;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author danie
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
	 public List<Supplements> findByPriceLessThanEqual(double precio);    
	}
