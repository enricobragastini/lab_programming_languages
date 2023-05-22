package value;
import parser.ImpParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FunValue extends Value {

    private final String name;
    private final List<String> params;

    private final ImpParser.ComContext body;

    private final ImpParser.ExpContext returnExp;

    private final Map<String, ExpValue<?>> variables = new HashMap<>();

    public FunValue(String name, List<String> params, ImpParser.ComContext body, ImpParser.ExpContext returnExp) {
        this.name = name;
        this.params = params;
        this.body = body;
        this.returnExp = returnExp;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FunValue funValue = (FunValue) obj;
        return name.equals(funValue.name) &&
                this.params.equals(funValue.params);
    }

    @Override
    public int hashCode() {
        return name.hashCode() ^ this.params.hashCode();
    }

    public ImpParser.ComContext getBody() {
        return body;
    }

    public ImpParser.ExpContext getReturnExp() {
        return returnExp;
    }

    public Map<String, ExpValue<?>> getVariables() {
        return variables;
    }

    public int totParams() {
        return params.size();
    }

    public List<String> getParams() {
        return params;
    }
}
