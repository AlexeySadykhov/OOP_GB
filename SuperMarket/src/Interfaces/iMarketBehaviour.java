package Interfaces;

import java.util.List;

import Classes.Actor;
/**
 * Интерфейс, описывающий поведение магазина
 */
public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor); // Запустить клиента в магазин
    void releaseFromMarket(List<Actor> actors); // Выпустить клиента из магазина
    void update();    // Обновить состояние магазина
}
