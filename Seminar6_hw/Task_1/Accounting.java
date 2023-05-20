package Task_1;
/**
 * Класс бухгалтерии
 */
public class Accounting {
    /**
     * Метод подсчета зарплаты сотрудника
     * @param emp
     * @return
     */
    public int calculateNetSalary(Employee emp) {
        int baseSalary = emp.getBaseSalary();
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}