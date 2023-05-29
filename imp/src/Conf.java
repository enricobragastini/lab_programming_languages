import value.ExpValue;
import value.FunValue;

import java.util.Map;
import java.util.HashMap;

public class Conf {
    private final Map<String, ExpValue<?>> map = new HashMap<>();

    public boolean contains(String id) {
        return map.containsKey(id);
    }

    public ExpValue<?> get(String id) {
        return map.get(id);
    }

    public void update(String id, ExpValue<?> v) {
        map.put(id, v);
    }
}
