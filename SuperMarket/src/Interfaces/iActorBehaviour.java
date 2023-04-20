package Interfaces;

import Classes.Actor;
/**
 * Интерфейс, описывающий поведение всех акторов
 */
public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder); // Сделать заказ
    void setTakeOrder(boolean pickUpOrder); // Забрать заказ
    boolean isMakeOrder(); // Проверить, сделан ли заказ
    boolean isTakeOrder(); // Проверить, забрал ли клиент заказ
    Actor getActor(); // Вернуть объект Aktor (самого себя)
}
