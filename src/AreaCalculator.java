import shapes.interfaces.IAreaCalculator;
import shapes.interfaces.Shapeable;

import java.util.List;
import java.util.stream.Collectors;

public class AreaCalculator implements IAreaCalculator {
    @Override
    public double sum(List<Shapeable> shapes) {
        return shapes.stream().mapToDouble(Shapeable::area).sum();

    }

}
