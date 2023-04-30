package StudentService;

import java.util.List;
/**
 * Обобщенный интерфейс iUserService для всех юзеров
 */
public interface iUserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age, String academicDegree);
}
