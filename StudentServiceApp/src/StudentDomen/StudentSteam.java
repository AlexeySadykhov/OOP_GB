package StudentDomen;
import java.util.List;
import java.util.Iterator;
/**
 * Класс потока студентов
 * Имплементирует Itarable
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> groups; // Список групп студентов
    private int steamNumber; // Номер потока

    public StudentSteam(List<StudentGroup> groups, int steamNumber) {
        this.groups = groups;
        this.steamNumber = steamNumber;
    }
    /**
     * Получение списка групп
     */
    public List<StudentGroup> getGroups() {
        return groups;
    }
    /**
     * Установка списка групп
     * @param groups
     */
    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }
    /**
     * Получение номера потока
     */
    public int getSteamNumber() {
        return steamNumber;
    }
    /**
     * Установка номера потока
     * @param value
     */
    public void setSteamNumber(int value) {
        this.steamNumber = value;
    }
    /**
     * Переопределение итератора
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return i < groups.size();
            }
            @Override
            public StudentGroup next() {
                if (!hasNext()) return null;
                return groups.get(i++);
            }
        };
    }
    /**
     * Переопределение toString
     */
    @Override
    public String toString() {
        StringBuilder strbld = new StringBuilder();
        for (StudentGroup grp : this.groups) {
            strbld.append(grp.toString());
            strbld.append("---------------\n");
        }
        String result = String.format("Номер потока: %s\nКол-во групп: %s\n===============\n", 
        this.steamNumber, this.groups.size());
        return result + strbld.toString();
    }
}
