package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;
/**
 * Класс Model, хранящий значения в HashMap
 */
public class ModelHashMap implements iGetModel {
    private HashMap<Long, Student> students; // список студентов с их id
    /**
     * Конструктор
     * преобразует полученный список в HashMap
     * @param students
     */
    public ModelHashMap(List<Student> students) {
        HashMap<Long, Student> stud = new HashMap<>();
        for (Student s : students) {
            stud.put(s.getStudentID(), s);
        }
        this.students = stud;
    }
    /**
     * Получение всех студентов из модели
     */
    public List<Student> getAllStudent()
    {
        List<Student> studs = new ArrayList<>();
        for (Long id : this.students.keySet()) {
            studs.add(this.students.get(id));
        }
        return studs;
    }
    /**
     * Удаление студента по id
     */
    @Override
    public void deleteStudent(long id) {
        for (Long sID : this.students.keySet()) {
            if(sID == id) {
                this.students.remove(sID);
                System.out.println("Студент удален");
                return;
            }
    }
    System.out.println("Студент с таким id не найден");
}
}
