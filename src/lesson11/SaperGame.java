package lesson11;

import java.util.concurrent.ThreadLocalRandom;

//public class SaperGame {
//    // ����
//    private int row;
//    private int column;
//
//
//
//    public int [][] mapGame = new int[10][10];
//    public int [][] visibleMap = new int[10][10];
//
//
//
//    // �����������
//
//
//    // ������
//    public void bombsByLevel(int level) {
//        int countBombs = 0;
//        if (level == 1) {
//            countBombs = 20;
//        } else if (level == 2) {
//            countBombs = 15;
//        } else {
//            countBombs = 10;
//        }
//
//        for (int i = 0; i < countBombs; i++) {
//            this.addRandomBomb();
//        }
//    }
//
//    public void addRandomBomb() {
//        int row = ThreadLocalRandom.current().nextInt(0,10); // 0
//        int column = ThreadLocalRandom.current().nextInt(0,10); // 0
//
//        if (mapGame[row][column] != -1) {
//            mapGame[row][column] = -1;
//        } else {
//            this.addRandomBomb();
//        }
//    }
//
//    public void placeHelpNumbersOnMap() {
//        for (int i = 0; i < mapGame.length; i++) { // ������ (row)
//            for (int j = 0; j < mapGame[i].length; j++) { // ������� (columns)
//                if (mapGame[i][j] == -1) {
//                    for (int k = i - 1; k <= i + 1 ; k++) { // ������ ����� �����
//                        for (int l = j - 1; l <= j + 1 ; l++) { // ������� ����� �����
//                            if ((k >= 0 && k < mapGame.length) && (l >= 0 && l < mapGame.length) && mapGame[k][l] != -1) {
//                                mapGame[k][l]++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    public void printMapGame() {
//        for (int i = 0; i < mapGame.length; i++) {
//            for (int j = 0; j < mapGame[i].length; j++) {
//                if (visibleMap[i][j] == 1) {
//                    if (visibleMap[i][j] == 0) {
//                        System.out.print("   ");
//                    } else if (mapGame[i][j] == -1) {
//                        System.out.print("���");
//                    } else {
//                        System.out.print(" " + mapGame[i][j] + " ");
//                    }
//                } else {
//                    System.out.print(" * ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
//
//    public int checkPointsPlayers(int pointX, int pointY) {
//        if (pointX > 10 || pointX < 0 || pointY > 10 || pointY < 0) {
//            return 1; // 1 - ��������� ���
//        } else if (visibleMap[pointX][pointY] == 1) {
//            return 2;
//        }
//        visibleMap[pointX][pointY] = 1;
//
//        if (mapGame[pointX][pointY] == -1) {
//            return -1;
//        } else if (mapGame[pointX][pointY] > 0) {
//            return checkVictoryGame();
//        } else {
//            this.checkZeroOnMapGame(pointX, pointY);
//            return checkVictoryGame();
//        }
//
//    }
//
//    private void checkZeroOnMapGame(int pointX, int pointY) {
//        visibleMap[pointX][pointY] = 1;
//        for (int i = pointX - 1; i <= pointX; i++) {
//            for (int j = pointY - 1; j <= pointY ; j++) {
//                if ((i >= 0 && i < mapGame.length) && (j >= 0 && j < mapGame.length) && (mapGame[i][j] >= 0)) {
//                    if (mapGame[i][j] == 0 && visibleMap[i][j] == 0) {
//                        this.checkZeroOnMapGame(i, j);
//                    } else {
//                        visibleMap[i][j] = 1;
//                    }
//                }
//            }
//        }
//    }
//
//    public int checkVictoryGame() {
//        int check = 0;
//        for (int i = 0; i <visibleMap.length; i++) {
//            for (int j = 0; j <visibleMap[i].length ; j++) {
//                if (visibleMap[i][j] == 0 && mapGame[i][j] != -1) {
//                    check = 1;
//                    break;
//                }
//            }
//        }
//        return check;
//    }
//}

import java.util.Scanner;

public class SaperGame {
    // ����
    // ���������������� ���������� � ������� ����� �����, ����� ������ ������ ���� ��� ������ ������

    public int rows; // ���������� �����
    public int columns; // ���������� ��������
    public int[][] mapGame; // ������� ���� � �������, ������ ������ �����
    public int[][] visibleMap; // ������� ����, ������ ������ �����

    // ������������


    // ������

    // ��������� ����� � ������� � ���� �������� "-1"
    public void bombsByLevel(int level) {

        int bombCount; // ���������� ����, ������, ����� ������� ������� ����

        // � ������������ � ��������� ������� ������� �������� ��������� ���� - ������ ���� � ���������� ����
        switch (level) {
            case 1:
                bombCount = 99;
                columns = 30;
                rows = 16;
                break;
            case 2:
                bombCount = 40;
                columns = 16;
                rows = 16;
                break;
            case 3:
                bombCount = 10;
                columns = 10;
                rows = 10;
                // � ������������ ���� 9*9
                /*mapWidth=9;
                mapHeight=9;*/
                break;
            default:
                bombCount = 10;
                columns = 9;
                rows = 9;
                break;
        }

        // ������� ������ �������, �������������� ���
        mapGame = new int[rows][columns];
        visibleMap = new int[rows][columns];

        // �������� ����� �������
        this.fillBombMap(bombCount);

    }


    // ��������� ��� ����� �� �����
    private void fillBombMap(int bombCount) {
        for (int i = 0; i < bombCount; i++) {
            this.addRandomBomb();
        }
    }


    // ��������� ����� �� �����
    public void addRandomBomb() {
        // ������������� ����������� � ������� ��� ��������� ����� - ���������� ������
        int row = ThreadLocalRandom.current().nextInt(0, rows);
        int column = ThreadLocalRandom.current().nextInt(0, columns);

        // �� �������� ���� � ������� ������� ����� �� ��������
        // ����� �� ����� ������� ����� � ������, ��� ��� ���� �����
        if ((mapGame[row][column] != -1) &&
                (column != 0 && row != 0) &&
                (column != columns && row != rows) &&
                (column != 0 && row != rows) &&
                (column != columns && row != 0)) {
            mapGame[row][column] = -1;
        } else {
            this.addRandomBomb();
        }
    }


    // ��������� �����
    public void placeHelpNumbersOnMap() {
        for (int i = 0; i < mapGame.length; i++) { //������
            for (int j = 0; j < mapGame[i].length; j++) { // �������
                if (mapGame[i][j] == -1) {
                    for (int k = i - 1; k <= i + 1; k++) { //������ ����� �����
                        for (int l = j - 1; l <= j + 1; l++) { // ������� ����� �����
                            if ((k >= 0 && k < mapGame.length) && (l >= 0 && l < mapGame[i].length) && mapGame[k][l] != -1) {
                                mapGame[k][l]++;
                            }
                        }

                    }
                }
            }

        }
    }

    // ����������� ����� � ����������� �� � �������
    public void printMapGame() {
        if (mapGame.length > 10) {
            printBigField();
        } else {
            printSmallField();
        }
    }

    private void printBigField() {
        String columnNumbers = "      ";
        String columnDelimiter = "      ";

        // ���������� ������ ��������
        for (int i = 0; i < mapGame[0].length; i++) {
            if (i < 10) {
                columnNumbers += "  " + i + "  ";
            } else {
                columnNumbers += "  " + i + " ";
            }
            columnDelimiter += "�����";
        }
        System.out.println(columnNumbers);
        System.out.println(columnDelimiter);

        // ���������� ������ � �� ��������
        for (int i = 0; i < mapGame.length; i++) {
            if (i < 10) {
                System.out.print("  " + i + "  |");
            } else {
                System.out.print("  " + i + " |");
            }

            for (int j = 0; j < mapGame[i].length; j++) {
                if (visibleMap[i][j] == 1) {
                    if (mapGame[i][j] == 0) {
                        System.out.print("    ");
                    } else if (mapGame[i][j] == -1) {
                        System.out.print(" ��� ");
                    } else {
                        System.out.print("  " + mapGame[i][j] + "  ");
                    }
                } else {
                    System.out.print("  *  ");
                }
            }
            System.out.println();
        }
    }

    private void printSmallField() {
        String columnNumbers = "    ";
        String columnDelimiter = "    ";

        for (int i = 0; i < mapGame.length; i++) {
            columnNumbers += " " + i + " ";
            columnDelimiter += "���";
        }
        System.out.println(columnNumbers);
        System.out.println(columnDelimiter);
        for (int i = 0; i < mapGame.length; i++) {
            System.out.print(" " + i + " |");

            for (int j = 0; j < mapGame[i].length; j++) {
                if (visibleMap[i][j] == 1) {
                    if (mapGame[i][j] == 0) {
                        System.out.print("   ");
                    } else if (mapGame[i][j] == -1) {
                        System.out.print("���");
                    } else {
                        System.out.print(" " + mapGame[i][j] + " ");
                    }
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    // ������ ��� � ��������� ����
    public boolean doStep() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ������:");
        int stepRow = scanner.nextInt();

        System.out.println("������� ����� �������:");
        int stepColumn = scanner.nextInt();

        if (stepRow < 0 || stepRow > rows || stepColumn < 0 || stepColumn > columns) {
            System.out.println("�� ����� ������������ ������, ��������� ����");
            System.out.println("������ �� 0 �� " + (rows - 1));
            System.out.println("������� �� 0 �� " + (columns - 1));
            return doStep();
        } else {
            if (visibleMap[stepRow][stepColumn] == 1) {
                System.out.println("�� ��� ��������� ����� ���, ������� ���������");
                return doStep();
            } else if (mapGame[stepRow][stepColumn] != -1) {
                this.checkZeroOnMapGame(stepRow, stepColumn);
                printMapGame();
                return checkVictory();
            } else {
                visibleMap[stepRow][stepColumn] = 1;
                printMapGame();
                System.out.println("�� ���������!");
                return false;
            }
        }
    }

    // ��������
    private boolean checkVictory() {
        boolean check = false;
        for (int i = 0; i < visibleMap.length; i++) {
            for (int j = 0; j < visibleMap[i].length; j++) {
                if (mapGame[i][j] != -1 && visibleMap[i][j] == 0) {
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.println("�����������, �� ��������!");
        }
        return check;
    }

    private void checkZeroOnMapGame(int stepRow, int stepColumn) {
        visibleMap[stepRow][stepColumn] = 1;
        for (int i = stepRow - 1; i <= stepRow + 1; i++) {
            for (int j = stepColumn - 1; j <= stepColumn + 1; j++) {
                if ((i >= 0 && i < mapGame.length) && (j >= 0 && j < mapGame[0].length) && mapGame[i][j] >= 0) {
                    if (mapGame[i][j] == 0 && visibleMap[i][j] == 0) {
                        this.checkZeroOnMapGame(i, j);
                    } else {
                        visibleMap[i][j] = 1;
                    }
                }
            }
        }

    }

}
