package Controllers;

import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.TeacherService;
/**
 * Класс TeacherController
 * имплементирует интерфейс iUserController
 */
public class TeacherController implements iUserController<Teacher> {
    private final TeacherService teachService = new TeacherService(); // Инициализация TeacherService
    /**
     * Переопределение метода create
     */
    @Override
    public void create(String firstName, String secondName, int age, String academicDegree) {
        teachService.create(firstName, secondName, age, academicDegree);
    }
    /**
     * Метод выплаты зарплаты
     * @param <T>
     * @param person
     */
    static public <T extends Teacher> void paySalary(T person) {
        System.out.println(((User) person).getFirstName()+" зп 30000р ");
    }
}
