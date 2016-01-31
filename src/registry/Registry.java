
package registry;

import java.util.HashMap;

/**
 *
 * @author ahuskano
 */
public class Registry {

    private final HashMap<String, Object> items;

    private static Registry instance = null;

    protected Registry() {
        items=new HashMap<>();
        // Exists only to defeat instantiation.
    }

    public static Registry getInstance() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    public void set(String key, Object value) {
        this.items.put(key, value);
    }

    public Object get(String key) {
        return this.items.get(key);
    }

}
