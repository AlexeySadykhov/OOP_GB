package Classes;
/**
 * Класс обычного клиента
 */
public class OrdinaryClient extends Actor {
    /**
     * Конструктор
     * @param name
     */
    public OrdinaryClient(String name)
    {
        super(name);
    }
    /**
     * Получение имени
     */
    @Override
    public String getName() {        
        return super.name;
    }
    /**
     * Проверка сделал ли клиент заказ
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Проверка забрал ли клиент заказ
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * Установка значения isMakeOrder
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }
    /**
     * Установка значения isTakeOrder
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }
    /**
     * Получение самого actor
     */
    @Override
    public Actor getActor() {
        return this;
    }
    /**
     * Возврат заказа клиентом
     */
    public void returnOrder() {
        if (super.isTakeOrder) {
            System.out.println("Клиент " + this.getName() + " вернул заказ");
        }
    }
}
