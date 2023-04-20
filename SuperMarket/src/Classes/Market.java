package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
/**
 * Класс магазина. Имплементирут сразу два интерфейса.
 */
public class Market implements iMarketBehaviour,iQueueBehaviour{
    //private List<Actor> queue;
    private List<iActorBehaviour> queue; // Список интерфейсов (поведения) клиентов
    /**
     * Конструктор класса создает объект и инициализирует очередь
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
    /**
     * Заход клиента в магазин
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }
    /**
     * Добавление клиента в очередь
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }
    /**
     * Удаление клиента из магазина
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }
    /**
     * Обновление состояния магазина: получение заказа, выдача, удаление из очереди
     */
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }
    /**
     * Получение заказа клиентом
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
    /**
     * Удаление клиента из очереди
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }
    /**
     * Создание заказа клиентом
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
}
