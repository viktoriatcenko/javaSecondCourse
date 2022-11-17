package lesson12.interfaces;


import lesson12.models.CardImpl;

public interface Player {
    void takeCard(CardImpl card); // взять карту из колоды

    int countValuesOfAllCardsOnHand(); // посчитать кол-во очков в картах на руках

    boolean needCard(); // ответить игре нужна ли еще карта

    void showCardsOnHands(); // показать карты

    boolean isInGame();

    void setInGame(boolean inGame);

    boolean isCroupier();
}
