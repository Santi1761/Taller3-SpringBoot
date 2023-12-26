package icesi.edu.co.LibrarySystem.persistence.models;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BeanA {
    private static Logger log = LoggerFactory.getLogger(BeanA.class);


    @PostConstruct
    public void post(){
        log.info("Método postconstruct llamado");
    }
}
