package icesi.edu.co.LibrarySystem.persistence.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanC {

    private static Logger log = LoggerFactory.getLogger(BeanC.class);

    public void destroy(){
        log.info("Método destroy llamado");
    }
}
