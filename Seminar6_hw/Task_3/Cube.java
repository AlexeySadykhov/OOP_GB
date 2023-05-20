package Task_3;
/**
 * Класс куба
 */
public class Cube implements iCalculateArea, iCaclulateVolume {
    private int edge; // сторона
    /**
     * Конструктор
     * @param edge
     */
    public Cube(int edge) {
        this.edge = edge;
    }
    /**
     * Подсчет площади
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    /**
     * Подсчет объема
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}