package Interfaces;

// import Classes.Actor;
/**
 * Интерфейс, описывающий поведение магазина
 */
public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor); // Добавить клиента в очередь
    void releaseFromQueue(); // Удалить клиента из очереди
    void takeOrder(); // Принять заказ
    void giveOrder(); // Выдать заказ
}
