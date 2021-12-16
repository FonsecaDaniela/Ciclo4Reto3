/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Ciclo4.Repositorio;

import Reto2_Ciclo4.Interfaces.InterfaceSupplements;
import Reto2_Ciclo4.Modelo.Supplements;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danie
 */
@Repository
	public class SupplementsRepositorio {
	    @Autowired
	    private InterfaceSupplements repository;
	
	    public List<Supplements> getAll() {
	        return repository.findAll();
	    }
            public Optional<Supplements> getClothe (String reference){
                return repository.findById(reference);
            }
	    
	    public Supplements create(Supplements clothe) {
	        return repository.save(clothe);
	    }
	
	    public void update(Supplements clothe) {
	        repository.save(clothe);
	    }
	    
	    public void delete(Supplements clothe) {
	        repository.delete(clothe);
	    }
	}