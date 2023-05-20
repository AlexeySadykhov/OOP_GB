package Task_3;
/**
 * Класс круга
 */
public class Circle implements iCalculateArea {
    private double radius; // радиус
    /**
     * Конструктор
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    /**
     * Подсчет площади
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}