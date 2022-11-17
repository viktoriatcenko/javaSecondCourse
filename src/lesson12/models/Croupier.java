package lesson12.models;

public class Croupier extends PlayerImpl{
    @Override
    public boolean needCard() {
        if (countValuesOfAllCardsOnHand() > 17) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isInGame() {
        return true;
    }

    @Override
    public void setInGame(boolean inGame) {
        super.setInGame(inGame);
    }

    @Override
    public boolean isCroupier() {
        return true;
    }
}
