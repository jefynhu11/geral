package com.jeferson.jogos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class JogoVelho {
    protected static final int MATRIX[][] = new int[3][3];
    protected enum PLAYER {
        ONE(0xF1, 'X'),
        TWO(0xF2, 'O');
        private final int code;
        private final char name;

        private static final Map<Integer, PLAYER> lookup = new HashMap<Integer, PLAYER>();

        static {
            for (PLAYER player : PLAYER.values()) {
                lookup.put(player.getCode(), player);
            }
        }

        PLAYER(int code, char name) {
            this.code = code;
            this.name = name;
        }
        public int getCode() {
            return code;
        }
        public char getName() {
            return name;
        }
        public static PLAYER get(int code) {
            return lookup.get(code);
        }
    }
    protected enum GAME_STATUS {
        PLAYING,
        DRAW,
        PLAYER_ONE_WON,
        PLAYER_TWO_WON
    }
    protected static final int WIN_CONDITIONS[][] = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
    };
    protected static PLAYER currentPlayer = PLAYER.ONE;
    protected static GAME_STATUS gameStatus = GAME_STATUS.PLAYING;
    protected static Scanner input = new Scanner(System.in);

    // interaction methods
    public static int chooseNumber() {
        int choose;
        while (true) {
            choose = input.nextInt();
            if (!isValidChoose(choose)) {
                System.out.print("Invalid choose, please choose again: ");
            } else {
                break;
            }
        }
        return choose;
    }

    // processing methods
    public static void processPlayerChoose() {
        int row, column, choosen;
        do {
            System.out.print("Player " + renderPlayer(currentPlayer) + " choose a number: ");
            choosen = chooseNumber() - 1;
            column = choosen % 3;
            row = choosen / 3;
        } while (isCellTaken(row, column));
        setCell(row, column);
        checkGameBoard(choosen);
        currentPlayer = currentPlayer == PLAYER.ONE ? PLAYER.TWO : PLAYER.ONE;
    }
    protected static void checkGameBoard(int number) {
        Stream<int[]> conditions = Arrays.stream(WIN_CONDITIONS).filter(condition -> Arrays.stream(condition).anyMatch(position -> position == number));
        boolean end = conditions.anyMatch(condition -> {
            if (isWinningCondition(condition)) {
                gameStatus = currentPlayer == PLAYER.ONE ? GAME_STATUS.PLAYER_ONE_WON : GAME_STATUS.PLAYER_TWO_WON;
                return true;
            }
            return false;
        });

        if (!end && Arrays.stream(MATRIX).flatMapToInt(mapper -> Arrays.stream(mapper)).allMatch(cell -> cell > 10)) {
            gameStatus = GAME_STATUS.DRAW;
        }

    }
    protected static boolean isWinningCondition(int[] condition) {
        return Arrays.stream(condition).allMatch(number -> MATRIX[number / 3][number % 3] == currentPlayer.getCode());
    }
    protected static boolean isValidChoose(int number) {
        return number >= 1 && number <= 9;
    }
    protected static boolean isCellTaken(int row, int column) {
        return MATRIX[row][column] > 10;
    }
    protected static void setCell(int row, int column) {
        MATRIX[row][column] = currentPlayer.getCode();
    }
    protected static void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MATRIX[i][j] = i * 3 + j + 1;
            }
        }
    }
    protected static boolean gameStatusIsPlaying() {
        return gameStatus == GAME_STATUS.PLAYING;
    }

    // Render Methods
    protected static void renderScene() {
        renderBoard();
        renderStatus();
    }
    protected static void renderBoard() {
        for (int[] line: MATRIX) {
            for (int column: line) {
                System.out.print(renderValue(column) + " ");
            }
            System.out.println();
        }
    }
    protected static void renderStatus() {
        switch (gameStatus) {
            case PLAYING:
                System.out.println("Current player: " + renderPlayer(currentPlayer));
                break;
            case DRAW:
                System.out.println("Draw!");
                break;
            case PLAYER_ONE_WON:
                System.out.println("Player one won!");
                break;
            case PLAYER_TWO_WON:
                System.out.println("Player two won!");
                break;
        }
    }
    protected static char renderValue(int value) {
        if (value < 10) {
            return (char) ('0' + value);
        }
        return PLAYER.get(value).getName();
    }
    protected static char renderPlayer(PLAYER player) {
        return player.getName();
    }

    public static void main(String[] args) {
        reset();
        do {
            renderScene();
            processPlayerChoose();
        } while (gameStatusIsPlaying());
        renderScene();
    }

}