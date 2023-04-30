package Controller;

import java.util.List;
import Model.Student;
/**
 * Интерфейс iGetView для взаимодействия с разными view
 */
public interface iGetView {
    void printAllStudent(List<Student> students);
    String prompt(String message);
}
