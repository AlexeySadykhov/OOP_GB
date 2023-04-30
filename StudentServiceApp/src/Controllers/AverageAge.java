package Controllers;

import java.util.List;

import StudentDomen.User;
/**
 * Обобщенный класс AverageAge
 * для подсчета среднего возраста
 */
public class AverageAge<T extends User> {
    /**
     * Метод подсчета среднего арифметического
     * @param users
     * @return
     */
    public double findAvg(List<T> users) {
        double sum = 0.0;
        for (T user : users) {
            sum += user.getAge();
        }
        return sum / (double) users.size();
    }
}
