package Controller;

import java.util.List;
import Model.Student;
/**
 * Интерфейс iGetModel для взаимодействия с разными моделями
 */
public interface iGetModel {
    public List<Student> getAllStudent();
    public void deleteStudent(long id);
}
