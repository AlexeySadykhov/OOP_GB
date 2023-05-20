package Task_2;
/**
 * Класс транспортного средства
 */
public class Vehicle {
    int maxSpeed; // Макстимальная скорость
    /**
     * Конструктор
     * @param maxSpeed
     */
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    /**
     * Получение максимальной скорости
     * @return
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /**
     * Подсчет разрешенной скорости
     * @return
     */
    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.0;
    }
}
