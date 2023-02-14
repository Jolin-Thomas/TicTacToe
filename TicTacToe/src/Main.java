import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //classes

        Scanner sc = new Scanner(System.in);
        
        //data vars

        int chance;
        String p1score = "", p2score = "";
        String p1, p2, pos;
        char gameboard[][] = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};
        int Wincond1[] = {1, 2, 3};
        int Wincond2[] = {4, 5, 6};
        int Wincond3[] = {7, 8, 9};
        int Wincond4[] = {1, 4, 7};
        int Wincond5[] = {2, 5, 8};
        int Wincond6[] = {3, 6, 9};
        int Wincond7[] = {1, 5, 9};
        int Wincond8[] = {3, 5, 7};
    
        //to print the gameboard structure

        System.out.println("\t\t\t\t\t\t Multiplayer Tic Tac Toe");
        System.out.print("Enter Player1 name(O): ");
        p1 = sc.nextLine();
        System.out.print("Enter Player2 name(X): ");
        p2 = sc.nextLine();
        System.out.println("\n\n");
        printGameBoard(gameboard);
        
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

            //to place the value in the gameboard

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(" ");
            placeValue(gameboard, pos, chance);
            
            //logic to check if any player has won

            if(chance >= 5) {
                int count = 0;
                for(int i: Wincond1) {
                    if(p1score.contains(Integer.toString(i))) {
                        count++;
                    }
                    if(count == 3) {
                        System.out.printf("\n%s wins\n", p1);
                        System.exit(0);
                    }
                }
                count = 0;
                for(int i: Wincond2) {
                    if(p1score.contains(Integer.toString(i))) {
                        count++;
                    }
                    if(count == 3) {
                        System.out.printf("\n%s wins\n", p1);
                        System.exit(0);
                    }
                }
                count = 0;
                for(int i: Wincond3) {
                    if(p1score.contains(Integer.toString(i))) {
                        count++;
                    }
                    if(count == 3) {
                        System.out.printf("\n%s wins\n", p1);
                        System.exit(0);
                    }
                }
                count = 0;
                for(int i: Wincond4) {
                    if(p1score.contains(Integer.toString(i))) {
                        count++;
                    }
                    if(count == 3) {
                        System.out.printf("\n%s wins\n", p1);
                        System.exit(0);
                    }
                }
                count = 0;
                for(int i: Wincond5) {
                    if(p1score.contains(Integer.toString(i))) {
                        count++;
                    }
                    if(count == 3) {
                        System.out.printf("\n%s wins\n", p1);
                        System.exit(0);
                    }
                }
                count = 0;
                for(int i: Wincond6) {
                    if(p1score.contains(Integer.toString(i))) {
                        count++;
                    }
                    if(count == 3) {
                        System.out.printf("\n%s win\n", p1);
                        System.exit(0);
                    }
                }
                count = 0;
                for(int i: Wincond7) {
                    if(p1score.contains(Integer.toString(i))) {
                        count++;
                    }
                    if(count == 3) {
                        System.out.printf("\n%s wins\n", p1);
                        System.exit(0);
                    }
                }
                count = 0;
                for(int i: Wincond8) {
                    if(p1score.contains(Integer.toString(i))) {
                        count++;
                    }
                    if(count == 3) {
                        System.out.printf("\n%s wins\n", p1);
                        System.exit(0);
                    }
                }
            }
            if(chance >= 6) {
                int count2 = 0;
                for(int i: Wincond1) {
                    if(p2score.contains(Integer.toString(i))) {
                        count2++;
                    }
                    if(count2 == 3) {
                        System.out.printf("\n%s wins\n", p2);
                        System.exit(0);
                    }
                }
                count2 = 0;
                for(int i: Wincond2) {
                    if(p2score.contains(Integer.toString(i))) {
                        count2++;
                    }
                    if(count2 == 3) {
                        System.out.printf("\n%s wins\n", p2);
                        System.exit(0);
                    }
                }
                count2 = 0;
                for(int i: Wincond3) {
                    if(p2score.contains(Integer.toString(i))) {
                        count2++;
                    }
                    if(count2 == 3) {
                        System.out.printf("\n%s wins\n", p2);
                        System.exit(0);
                    }
                }
                count2 = 0;
                for(int i: Wincond4) {
                    if(p2score.contains(Integer.toString(i))) {
                        count2++;
                    }
                    if(count2 == 3) {
                        System.out.printf("\n%s wins\n", p2);
                        System.exit(0);
                    }
                }
                count2 = 0;
                for(int i: Wincond5) {
                    if(p2score.contains(Integer.toString(i))) {
                        count2++;
                    }
                    if(count2 == 3) {
                        System.out.printf("\n%s wins\n", p2);
                        System.exit(0);
                    }
                }
                count2 = 0;
                for(int i: Wincond6) {
                    if(p2score.contains(Integer.toString(i))) {
                        count2++;
                    }
                    if(count2 == 3) {
                        System.out.printf("\n%s wins\n", p2);
                        System.exit(0);
                    }
                }
                count2 = 0;
                for(int i: Wincond7) {
                    if(p2score.contains(Integer.toString(i))) {
                        count2++;
                    }
                    if(count2 == 3) {
                        System.out.printf("\n%s wins\n", p2);
                        System.exit(0);
                    }
                }
                count2 = 0;
                for(int i: Wincond8) {
                    if(p2score.contains(Integer.toString(i))) {
                        count2++;
                    }
                    if(count2 == 3) {
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

    //method to enter the value in the gameboard

    public static void placeValue(char[][] gameboard, String pos, int chance) {
        char ch;
            switch(pos) {
            case "1":
                ch = (chance%2==0)? 'X': 'O';
                gameboard[0][0] = ch;
                break;
            case "2":
                ch = (chance%2==0)? 'X': 'O';
                gameboard[0][2] = ch;
                break;
            case "3":
                ch = (chance%2==0)? 'X': 'O';    
                gameboard[0][4] = ch;
                break;
            case "4":
                ch = (chance%2==0)? 'X': 'O';
                gameboard[2][0] = ch;
                break;
            case "5":
                ch = (chance%2==0)? 'X': 'O';
                gameboard[2][2] = ch;
                break;
            case "6":
                ch = (chance%2==0)? 'X': 'O';
                gameboard[2][4] = ch;
                break;
            case "7":
                ch = (chance%2==0)? 'X': 'O';
                gameboard[4][0] = ch;
                break;
            case "8":
                ch = (chance%2==0)? 'X': 'O';
                gameboard[4][2] = ch;
                break;
            case "9":
                ch = (chance%2==0)? 'X': 'O';
                gameboard[4][4] = ch;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        printGameBoard(gameboard);
    }

    //method to print the gameboard

    public static void printGameBoard(char[][] gameboard) {
        for(char[] row: gameboard) {
            for(char ch: row) {
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}   
