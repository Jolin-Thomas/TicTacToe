import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //data vars
        int chance;
        String p1score = "", p2score = "";
        String p1, p2, pos;
        char[][] game_board = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
        int[][] win_cond = {{1,2,3}, {4,5,6}, {7,8,9}, {1,4,7}, {2,5,8}, {3,6,9}, {1,5,9}, {3,5,7}};

        //to print the game_board structure
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Multiplayer Tic Tac Toe");
        System.out.print("Enter Player1 name(O): ");
        p1 = sc.nextLine();
        System.out.print("Enter Player2 name(X): ");
        p2 = sc.nextLine();
        System.out.println("\n\n");
        printGameBoard(game_board);

        //iteration for 9 chances
        //5 chances for p1(O) and 4 chances for p2(X)
        for(chance = 1; chance<=9; chance++) {

            //to choose players on the basis of chances
            if(chance%2!=0) {

                System.out.printf("\n%s Enter your placement: ", p1);
                pos = sc.nextLine();
                p1score = p1score.concat(pos);

            }
            else {
                System.out.printf("\n%s Enter your placement: ", p2);
                pos = sc.nextLine();
                p2score = p2score.concat(pos);
            }

            /*
            to clearScreen
            this only works in terminal
            */
            System.out.print("\033\143");
            System.out.flush();
            System.out.println();

            /*
            working on using
            clearScreen in text panels of ide
             */

            //to place the value in the game_board
            placeValue(game_board, pos, chance);

            //logic to check if any player has won
            if(chance >= 5) {
                for (int[] win : win_cond) {
                    int count = 0;
                    for (int i : win) {
                        if (p1score.contains(Integer.toString(i))) {
                            count++;
                        }
                    }
                    if (count == 3) {
                        System.out.printf("\n%s wins\n", p1);
                        System.exit(0);
                    }
                }
            }
            if(chance >= 6) {
                for (int[] win : win_cond) {
                    int count = 0;
                    for (int i : win) {
                        if (p2score.contains(Integer.toString(i))) {
                            count++;
                        }
                    }
                    if (count == 3) {
                        System.out.printf("\n%s wins\n", p2);
                        System.exit(0);
                    }
                }
            }
            if(chance == 9) {
                System.out.println("Draw");
                System.exit(0);
            }
        }
        sc.close();
    }

    //method to enter the value in the game_board
    public static void placeValue(char[][] game_board, String pos, int chance) {
        char ch;
        switch (pos) {
            case "1" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[0][0] = ch;
            }
            case "2" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[0][2] = ch;
            }
            case "3" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[0][4] = ch;
            }
            case "4" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[2][0] = ch;
            }
            case "5" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[2][2] = ch;
            }
            case "6" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[2][4] = ch;
            }
            case "7" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[4][0] = ch;
            }
            case "8" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[4][2] = ch;
            }
            case "9" -> {
                ch = (chance % 2 == 0) ? 'X' : 'O';
                game_board[4][4] = ch;
            }
            default -> System.out.println("Invalid input");
        }
        printGameBoard(game_board);
    }

    //method to print the game_board
    public static void printGameBoard(char[][] game_board) {
        for(char[] row: game_board) {
            for(char ch: row) {
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
