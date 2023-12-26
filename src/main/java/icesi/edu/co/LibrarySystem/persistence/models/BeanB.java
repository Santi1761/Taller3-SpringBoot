package icesi.edu.co.LibrarySystem.persistence.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanB {
    private static Logger log = LoggerFactory.getLogger(BeanB.class);

    public void initialize(){
        log.info("Método initialize llamado");
    }
}