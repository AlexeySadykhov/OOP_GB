package Model;

import java.util.List;

import Controller.iGetModel;
/**
 * Класс Model, хранящий значения в обычном списке
 */
public class Model implements iGetModel {
    private List<Student> students; // список студентов
    /**
     * Конструктор
     * @param students
     */
    public Model(List<Student> students) {
        this.students = students;
    }
    /**
     * Получение всех студентов из модели
     */
    public List<Student> getAllStudent()
    {
        return students;
    }
    /**
     * Удаление студента по id
     */
    @Override
    public void deleteStudent(long id) {
        for (Student student : students) {
            if(student.getStudentID() == id) {
                students.remove(student);
                System.out.println("Студент удален");
                return;
            }
        }
        System.out.println("Студент с таким id не найден");
    }
}
