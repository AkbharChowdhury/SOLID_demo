package shapes.interfaces;

import java.util.List;
@FunctionalInterface
public interface IAreaCalculator {
    double sum(List<Shapeable> shapes);
}
