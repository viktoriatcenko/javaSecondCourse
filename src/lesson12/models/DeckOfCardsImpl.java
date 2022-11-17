package lesson12.models;

import lesson12.interfaces.Card;
import lesson12.interfaces.DeckOfCards;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {

    // ����
    CardImpl[] cards = new CardImpl[52];

    // �����������


    public DeckOfCardsImpl() {
        cards[0] = new CardImpl("������ �����", 2);
        cards[1] = new CardImpl("������ �����", 2);
        cards[2] = new CardImpl("������ �����", 2);
        cards[3] = new CardImpl("������ ����", 2);

        cards[4] = new CardImpl("������ �����", 3);
        cards[5] = new CardImpl("������ �����", 3);
        cards[6] = new CardImpl("������ �����", 3);
        cards[7] = new CardImpl("������ ����", 3);

        cards[8] = new CardImpl("�������� �����", 4);
        cards[9] = new CardImpl("�������� �����", 4);
        cards[10] = new CardImpl("�������� �����", 4);
        cards[11] = new CardImpl("�������� ����", 4);

        cards[12] = new CardImpl("������� �����", 5);
        cards[13] = new CardImpl("������� �����", 5);
        cards[14] = new CardImpl("������� �����", 5);
        cards[15] = new CardImpl("������� ����", 5);

        cards[16] = new CardImpl("�������� �����", 6);
        cards[17] = new CardImpl("�������� �����", 6);
        cards[18] = new CardImpl("�������� �����", 6);
        cards[19] = new CardImpl("�������� ����", 6);

        cards[20] = new CardImpl("������� �����", 7);
        cards[21] = new CardImpl("������� �����", 7);
        cards[22] = new CardImpl("������� �����", 7);
        cards[23] = new CardImpl("������� ����", 7);

        cards[24] = new CardImpl("��������� �����", 8);
        cards[25] = new CardImpl("��������� �����", 8);
        cards[26] = new CardImpl("��������� �����", 8);
        cards[27] = new CardImpl("��������� ����", 8);

        cards[28] = new CardImpl("������� �����", 9);
        cards[29] = new CardImpl("������� �����", 9);
        cards[30] = new CardImpl("������� �����", 9);
        cards[31] = new CardImpl("������� ����", 9);

        cards[32] = new CardImpl("������� �����", 10);
        cards[33] = new CardImpl("������� �����", 10);
        cards[34] = new CardImpl("������� �����", 10);
        cards[35] = new CardImpl("������� ����", 10);

        cards[36] = new CardImpl("����� �����", 10);
        cards[37] = new CardImpl("����� �����", 10);
        cards[38] = new CardImpl("����� �����", 10);
        cards[39] = new CardImpl("����� ����", 10);

        cards[40] = new CardImpl("���� �����", 10);
        cards[41] = new CardImpl("���� �����", 10);
        cards[42] = new CardImpl("���� �����", 10);
        cards[43] = new CardImpl("���� ����", 10);

        cards[44] = new CardImpl("������ �����", 10);
        cards[45] = new CardImpl("������ �����", 10);
        cards[46] = new CardImpl("������ �����", 10);
        cards[47] = new CardImpl("������ ����", 10);

        cards[48] = new CardImpl("��� �����", 11);
        cards[49] = new CardImpl("��� �����", 11);
        cards[50] = new CardImpl("��� �����", 11);
        cards[51] = new CardImpl("��� ����", 11);
    }

    // ������
    @Override
    public CardImpl randomCards() {
       int randomIndex = ThreadLocalRandom.current().nextInt(0,51);
        return cards[randomIndex];
    }
}
