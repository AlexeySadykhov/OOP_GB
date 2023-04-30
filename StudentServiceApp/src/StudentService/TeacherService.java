package StudentService;

import java.util.ArrayList;
import java.util.List;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;
/**
 * Класс TeacherService
 * имплементирует iUserService
 */
public class TeacherService implements iUserService<Teacher> {
    private int count; // счетчик
    private List<Teacher> teachers; // список учителей
    /**
     * Конструктор инициализирует лист учителей
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    /**
     * Переопределение метода create
     */
    @Override
    public void create(String firstName, String secondName, int age, String academicDegree) {
       Teacher per = new Teacher(firstName, secondName, age, count, academicDegree);
       count++;
       teachers.add(per);
    }
    /**
     * Переопределение метода getAll
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    /**
     * Метод сортировки по ФИО
     * @param numberGroup
     * @return
     */
    public List<Teacher> getSortedByFIOStudentGroup(int numberGroup) {
        List<Teacher> teach = new ArrayList<>(teachers);
        teach.sort(new UserComparator<Teacher>());
        return teach;
    }
}
