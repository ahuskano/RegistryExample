
import constants.KeyHolder;
import models.Cat;
import models.Model;
import registry.Registry;

/**
 *
 * @author ahuskano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Registry.getInstance().set(KeyHolder.cat, new Cat("Lion", 1));

        Object object=Registry.getInstance().get(KeyHolder.cat);
        
        if(object instanceof Cat){
            System.out.println(((Cat)object).getName());
        }
    }

}
