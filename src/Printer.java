import shapes.interfaces.IAreaCalculator;
import shapes.interfaces.Shapeable;

import java.util.List;

public class Printer {
    private final List<Shapeable> list;
    private final IAreaCalculator calculator;

    public Printer(List<Shapeable> list, IAreaCalculator calculator) {
        this.list = list;
        this.calculator = calculator;
    }

    public String json() {
        return String.format("{ShapeSum: %s}", calculator.sum(list));
    }

    public String csv() {
        return String.format("ShapeSum,%s", calculator.sum(list));
    }
}
