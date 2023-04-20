package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный класс actor для всех клиентов
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name; // Имя клиента
    protected boolean isTakeOrder; // Забрал ли клиент заказ
    protected boolean isMakeOrder; // Сделал ли клиент заказ
    /**
     * Конструктор
     */
    public Actor(String name) {
        this.name = name;
    }
    /**
     * Общий для всех наследников метод getName()
     */
    public abstract String getName(); 

}
