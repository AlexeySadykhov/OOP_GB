package Task_2;
/**
 * Класс автобуса
 */
public class Bus extends Vehicle {
    /**
     * Конструктор
     * @param maxSpeed
     */
    public Bus(int maxSpeed) {
        super(maxSpeed);
    }
    /**
     * Подсчет разрешенной скорости
     * @return
     */
    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.6;
    }
}
