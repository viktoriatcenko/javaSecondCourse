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

        // Вариант 1. Победил крупье, если в игре никого не осталось
        if (countPlayersInGame() == 0) {
            System.out.println("Победило казино");
        }

        // Вариант 2. Победил крупье, если в игре никого не осталось
        if (countPlayersInGame() == 1) {
            System.out.println("Победил игрок"); // + распечатать имя
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

        // 3. Проверить значения карт игроков и выявить у кого результат лучше.
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
                    player.showCardsOnHands(); // + вывести его имя на консоль
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
        System.out.println("Введите кол-во игроков");
        Scanner scanner = new Scanner(System.in);
        playersInGame = new PlayerImpl[scanner.nextInt()];
        System.out.println( scanner.nextInt() + "игроков");
    }
}
