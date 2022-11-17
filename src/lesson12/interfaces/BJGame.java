package lesson12.interfaces;

import lesson12.models.PlayerImpl;

public interface BJGame {
    // �������� ������� � ����
    void addPlayerToGame(PlayerImpl player);

    //��������� �� 2 ����� ������� ������ �� ������
    void giveToPlayersTwoCardsOnStart();

    //��������� �����, ���� ��� ��������� �������
    void giveCardToPlayerIfNeed();

    // ���������� ����������
    void determineWinner();

    int countPlayersInGame();
}
