package Classes;
/**
 * Класс акционного клиента
 */
public class PromotionClient extends Actor {
    private String promotionName; // Название акции
    private int clientNumberInPromotion; // Номер клиента в акции
    static int counter = 1; // Счетчик

    /**
     * Конструктор помимо поля родительского класса name добавляет
     * название акции и вычиляет номер участника
     */
    public PromotionClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;
        this.clientNumberInPromotion = counter++; // Автоинкремент clientNumberInPromotion
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
     * Получение названия акции, в которой участвует клиент
     */
    public String getPromotionName() {
        return promotionName;
    }
    /**
     * Получение номера клиента в акции
     */
    public int getClientNumberInPromotion() {
        return clientNumberInPromotion;
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