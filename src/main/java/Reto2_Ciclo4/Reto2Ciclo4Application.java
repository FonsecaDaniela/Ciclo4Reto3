package Reto2_Ciclo4;

import Reto2_Ciclo4.Interfaces.InterfaceOrder;
import Reto2_Ciclo4.Interfaces.InterfaceSupplements;
import Reto2_Ciclo4.Interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2Ciclo4Application implements CommandLineRunner {

            @Autowired
	    private InterfaceSupplements interfaceSupplements;
	    @Autowired
	    private InterfaceUser interfaceUser;
            @Autowired
            private InterfaceOrder orderRepo;
            public static void main(String[] args) {
            SpringApplication.run(Reto2Ciclo4Application.class, args);
            }
	    @Override
	    public void run(String... args) throws Exception {
	        interfaceSupplements.deleteAll();
	        interfaceUser.deleteAll();
                orderRepo.deleteAll();

	    }
	        
	
	}
