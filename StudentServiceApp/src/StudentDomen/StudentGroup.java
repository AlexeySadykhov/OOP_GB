package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс группы студентов.
 * Имплементирует Itarable и Comparable
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students; // Список студентов
    private int groupNumber; // Номер группы
    static int counter = 1; // Счетчик

    public StudentGroup(List<Student> students) {
        this.students = students;
        this.groupNumber = counter++;
    }
    /**
     * Получение списка студентов
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     * Установка списка студентов
     * @param students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    /**
     * Получение номера группы
     */
    public int getGroupNumber() {
        return groupNumber;
    }
    /**
     * Изменение номера группы
     * @param value
     */
    public void setGroupNumber(int value) {
        this.groupNumber = value;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    /**
     * Переопределение итератора
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }
    /**
     * Переопределение компаратора
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.students.size()) {
            return 0;
        }
        if (this.students.size() < o.students.size()) {
            return -1;
        }
        else return 1;
    }
    // @Override
    // public int compareTo(StudentGroup o) {
    //     if (this.groupNumber == o.groupNumber) {
    //         return 0;
    //     }
    //     if (this.groupNumber < o.groupNumber) {
    //         return -1;
    //     }
    //     else return 1;
    // }
    /**
     * Переопределение toString
     */
    @Override
    public String toString() {
        StringBuilder strbld = new StringBuilder();
        for (Student student : this.students) {
            strbld.append(student.toString());
            strbld.append("\n");
        }
        String result = String.format("Номер группы: %s\nКол-во студентов: %s\n", 
        this.groupNumber, this.students.size());
        return result + strbld.toString();
    }
    
}
