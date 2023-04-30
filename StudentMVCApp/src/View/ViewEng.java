package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;
/**
 * Класс ViewEng, имплементирует интерфейс iGetView
 */
public class ViewEng implements iGetView {
    /**
     * Метод вывода списка студентов в консоль
     */
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Students' list output-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----The end of the list-----");
    }
    /**
     * Метод получения команды от пользователя
     */
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
