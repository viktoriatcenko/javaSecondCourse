package lesson12;

import lesson12.interfaces.BJGame;
import lesson12.interfaces.DeckOfCards;
import lesson12.models.*;

public class Main {
    public static void main(String[] args) {
        /**
         * ���� BlackJack
         * ���� ����������� � ���, ����� ������� ��� ����� ������ �����, �� �� ����� 21 � �������� ����� ������.
         * � ���� ������������ �� ����� �� ������ �����. ��-�� ���� ��� ����������� ���������� ����-���� ��� �������
         * ����� ����� ����, �� ������������ ������ ����������� ��� ���������� ����� �����. ��� ���� � �����-��������
         * ���������, ��� ������������ ����������� ������.
         *
         * �������� ����� ������ �����:
         *      �� ������ �� ������� � �� 2 �� 10 ��������������;
         *      � ���� � 1 ��� 11 (11 ���� ����� ����� �� ������ 21, ����� 1);
         *      � �. �. �������� (������, ����, �����) � 10;
         *
         * ���� � ������ � ������ ����� ����� �� ����� ������, �� ����� �������� ���������� ������: �� ������� ���
         * ���������� � ��� (����. push). � ����� �������� ��� �������� ��� ����� �������, ����� �� ���������� � ��
         * �����������. ���� � ������ ������ ����������, � ��� �push� ���������� ������
         */

        // Interface Player                             Class PlayerImpl
        // Player player = new PlayerImpl();

        // 1. ������� ����
        // 2. ��������� �������
        // 3. ������� ������
        // 4. �������� ������� � �������� ������ � ����
        // 5. �������� ������ ����
        // 6. �������� ����� � ������
        // 7. ������� �� 2 ����� ������� ������
        // 8. ��������� ������� �� 2 �����, ���� ��� ���������
        // 9. ���������� ����������

        // 1. ������� ����
        BJGame game = new BJGameImpl();
        game.setCountOfPlayers();

        // 2. ��������� �������
        PlayerImpl player1 = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();

        // 3. ������� ������
        Croupier croupier = new Croupier();

        // 4. �������� ������� � �������� ������ � ����
        game.addPlayerToGame(player1);
        game.addPlayerToGame(player2);
        game.addPlayerToGame(croupier);

        // 5. �������� ������ ����
        // 6. �������� ����� � ������
        DeckOfCards deckOfCards = new DeckOfCardsImpl();

        // 7. ������� �� 2 ����� ������� ������
        game.giveToPlayersTwoCardsOnStart();

        // 8. ��������� ������� �� 1 ����e, ���� ��� ���������
        game.giveCardToPlayerIfNeed();

        // 9. ���������� ����������
        game.determineWinner();


        System.out.println();

    }
}
