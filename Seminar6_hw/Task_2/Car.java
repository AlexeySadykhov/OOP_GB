package Task_2;
/**
 * Класс машины
 */
public class Car extends Vehicle {
    /**
     * Конструктор
     * @param maxSpeed
     */
    public Car(int maxSpeed) {
        super(maxSpeed);
    }
    /**
     * Подсчет разрешенной скорости
     * @return
     */
    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.8;
    }
}
