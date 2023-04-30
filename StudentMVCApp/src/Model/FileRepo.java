package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;
/**
 * Класс FileRepo
 * Модель в виде хранилища данных в файле
 */
public class FileRepo implements iGetModel {
    private String fileName; // имя файла
    private List<Student> students; // список студентов
    /**
     * Конструктор класса
     * инициализирует список студентов и создает файл
     * @param fileName
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Добавление студента в список
     * @param student
     */
    public void addStudent(Student student)
    {
        this.students.add(student);
    }
    /**
     * Чтение студентов из файла и добавление их в список
     */
    public void readAllStudentsFromFile()
    {
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Очистка файла
     */
    private void clearFile() {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Запись студентов в файл
     */
    public void saveAllStudentToFile()
    {
        clearFile();
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getStudentID());
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Получение всех студентов из модели
     */
    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }
    /**
     * Удаление студента из списка
     */
    private void deleteFromList(long id) {
        for (Student student : students) {
            if(student.getStudentID() == id) {
                students.remove(student);
                System.out.println("Студент удален");
                return;
            }
        }
        System.out.println("Студент с таким id не найден");
    }
    /**
     * Удаление студента по id
     */
    @Override
    public void deleteStudent(long id) {
        deleteFromList(id);
        saveAllStudentToFile();
    }
}