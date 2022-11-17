package lesson12.interfaces;

import lesson12.models.PlayerImpl;

public interface BJGame {
    // добавить игроков в игру
    void addPlayerToGame(PlayerImpl player);

    //–аздавать по 2 карты каждому игроку на старте
    void giveToPlayersTwoCardsOnStart();

    //–аздавать карты, пока это требуетс€ игрокам
    void giveCardToPlayerIfNeed();

    // ќпредел€ть победител€
    void determineWinner();

    int countPlayersInGame();
}
