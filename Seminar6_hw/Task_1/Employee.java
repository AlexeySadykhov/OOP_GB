package Task_1;
import java.util.Date;
/**
 * Класс сотрудника
 */
public class Employee {
    private String name; // Имя
    private Date dob; // Дата рождения
    private int baseSalary; // базовая зарплата
    /**
     * Конструктор
     * @param name
     * @param dob
     * @param baseSalary
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    /**
     * Получение информации о сотруднике
     * @return
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
    /**
     * Получение базовой зарплаты
     * @return
     */
    public int getBaseSalary() {
        return this.baseSalary;
    }
}