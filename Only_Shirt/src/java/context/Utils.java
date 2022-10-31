package context;

import javax.persistence.*;

public class Utils {
     static public EntityManager getEntityManager(){
             EntityManagerFactory  factory = Persistence.createEntityManagerFactory("OnlyShirtPU");
            return  factory.createEntityManager();
    }
}
