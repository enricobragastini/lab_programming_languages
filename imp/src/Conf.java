import value.ExpValue;
import value.FunValue;

import java.util.Map;
import java.util.HashMap;

public class Conf {
    private Map<String, ExpValue<?>> variables;
    private Map<String, FunValue> functions;

    public Conf() {
        variables = new HashMap<>();
        functions = new HashMap<>();
    }

    public boolean contains(String id) {
        return variables.containsKey(id);
    }

    public ExpValue<?> get(String id) {
        return variables.get(id);
    }

    public void update(String id, ExpValue<?> v) {
        variables.put(id, v);
    }

    public void addFunction(FunValue f) {
        functions.put(f.getName(), f);
    }

    public FunValue getFunction(String name) {
        return functions.get(name);
    }

    public Map<String, ExpValue<?>> getVariables() {
        return variables;
    }

    public void changeContext(Map<String, ExpValue<?>> newVariables) {
        variables = newVariables;
    }
}
