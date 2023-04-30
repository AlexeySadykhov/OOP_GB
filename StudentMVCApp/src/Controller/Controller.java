package Controller;

import java.util.ArrayList;
import java.util.List;

// import javax.jws.WebParam.Mode;

import Model.Student;
import Model.Model;
import View.View;
/**
 * Класс Controller
 */
public class Controller {

    private List<Student> students; // список студентов
    private iGetView view; // подключение view
    private iGetModel model; // подключение model
    /**
     * Конструктор передает контроллеру модель и view 
     * и инициализирует пустой список студентов, чтобы класть туда
     * копию данных из модели
     * @param view
     * @param model
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    } 
    /**
     * Запрос данных из модели
     */
    public void getAllStudent()
    {
        students = model.getAllStudent();
    }
    /**
     * Проверка корректности данных,
     * в данном случае проверка является ли список пустым
     * @return
     */
    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Отправка данных в view
     */
    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
        
        //MVC
        //view.printAllStudent(model.getAllStudent());
    }
    /**
     * Подключение команд
     */
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                case DELETE:
                    long studentId = Long.parseLong(view.prompt("Введите id студента:"));
                    model.deleteStudent(studentId);
                    break;

        }
    }

}
}