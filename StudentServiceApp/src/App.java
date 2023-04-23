import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
    /**
     * Метод печати студентов в группах
     * @param steam
     */
    public static void printGroups(StudentSteam steam) {
        for (StudentGroup group : steam) {
            System.out.printf("Группа: %s\n", group.getGroupNumber());
            for (Student student : group) {
                System.out.println(student);
            }
            System.out.println("---------------");
        }
    }
    public static void main(String[] args) throws Exception {
        // Создаем студентов
        // User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        Student s7 = new Student("Леонид", "Савельев", 24, (long)145);
        // Создаем списки студентов
        List<Student> l1 = new ArrayList<Student>();
        l1.add(s1);
        l1.add(s2);
        List<Student> l2 = new ArrayList<Student>();
        l2.add(s3);
        l2.add(s4);
        l2.add(s5);
        List<Student> l3 = new ArrayList<Student>();
        l3.add(s6);
        l3.add(s7);
        // Передаем списки в конструктор, создаем группы
        StudentGroup g1 = new StudentGroup(l1);
        StudentGroup g2 = new StudentGroup(l2);
        StudentGroup g3 = new StudentGroup(l3);
        // Создаем список групп
        List<StudentGroup> groupsList = new ArrayList<StudentGroup>();
        groupsList.add(g1);
        groupsList.add(g2);
        groupsList.add(g3);
        // Создаем поток
        StudentSteam steam = new StudentSteam(groupsList, 3);
        printGroups(steam); // Выводим всех студентов по группам
        System.out.println("Sorted");
        Collections.sort(steam.getGroups()); // Сортируем группы
        printGroups(steam); // Выводим отсортированный поток

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);

        // StudentGroup group = new StudentGroup(listStud);

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());


        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }
        


        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);
    }
}
