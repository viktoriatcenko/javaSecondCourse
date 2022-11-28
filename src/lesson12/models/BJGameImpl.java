package lesson12.models;

import lesson12.interfaces.BJGame;

import java.util.Scanner;

public class BJGameImpl implements BJGame {
    PlayerImpl[] playersInGame;
    DeckOfCardsImpl deck = new DeckOfCardsImpl();

    @Override
    public void addPlayerToGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }

    }

    @Override
    public void giveToPlayersTwoCardsOnStart() {
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                player.takeCard(deck.randomCards());
                player.takeCard(deck.randomCards());
            }
        }
    }

    @Override
    public void giveCardToPlayerIfNeed() {
        for (PlayerImpl player: playersInGame) {
            if (player != null) {
                while(player.needCard()) {
                    player.takeCard(deck.randomCards());
                }
            }
        }
    }

    @Override
    public void determineWinner() {
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.countValuesOfAllCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }

        }

        // ������� 1. ������� ������, ���� � ���� ������ �� ��������
        if (countPlayersInGame() == 0) {
            System.out.println("�������� ������");
        }

        // ������� 2. ������� ������, ���� � ���� ������ �� ��������
        if (countPlayersInGame() == 1) {
            System.out.println("������� �����"); // + ����������� ���
            for (PlayerImpl player : playersInGame) {
                if (player != null) {
                    if (player.isInGame()) {
                        player.showCardsOnHands();
                        return;
                    }
                }
            }
        }

        int bestValue = 0;

        // 3. ��������� �������� ���� ������� � ������� � ���� ��������� �����.
        if (countPlayersInGame() > 1) {

            for (PlayerImpl player : playersInGame) {
                if (player != null) {
                    if (bestValue < player.countValuesOfAllCardsOnHand()) {
                        bestValue = player.countValuesOfAllCardsOnHand();
                    }
                }
            }
        }

        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.isInGame() && !player.isCroupier() && bestValue == player.countValuesOfAllCardsOnHand()) {
                    player.showCardsOnHands(); // + ������� ��� ��� �� �������
                }
            }
        }
    }

    @Override
    public int countPlayersInGame() {
        int players = 0;
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.isInGame()) {
                    players++;
                }
            }

        }
        return players;
    }

    @Override
    public void setCountOfPlayers() {
        System.out.println("������� ���-�� �������");
        Scanner scanner = new Scanner(System.in);
        playersInGame = new PlayerImpl[scanner.nextInt()];
        System.out.println( scanner.nextInt() + "�������");
    }
}
