/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratchandwin;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ScratchandWin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            doTextCase();
        }

    }

    private static void doTextCase() {
        Scanner reader = new Scanner(System.in);
        //$1,$2,$5,$10,$50,$100,$1000,$10 000,$500 000  and $1 000 000
        int[] possible = new int[10];
        int[] money = {1, 2, 5, 10, 50, 100, 1000, 10000, 500000, 1000000};
        int undefine = 0;
        for (int i = 0; i < 9; i++) {
            String a = reader.nextLine();
            int n = ChangeToNum(a);
            switch (n) {
                case 1:
                    possible[0]++;
                    break;
                case 2:
                    possible[1]++;
                    break;
                case 5:
                    possible[2]++;
                    break;
                case 10:
                    possible[3]++;
                    break;
                case 50:
                    possible[4]++;
                    break;
                case 100:
                    possible[5]++;
                    break;
                case 1000:
                    possible[6]++;
                    break;
                case 10000:
                    possible[7]++;
                    break;
                case 500000:
                    possible[8]++;
                    break;
                case 1000000:
                    possible[9]++;
                    break;
                default:
                    undefine++;
                    break;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (possible[i] == 2 && undefine != 0 || possible[i] > 2) {
                System.out.print("$" + money[i] + " ");
                count++;
            }

        }
        if (count == 0) {
            System.out.println("No Prizes Possible");
        } else {
            System.out.println();
        }
    }

    private static int ChangeToNum(String a) {
        int num = 0;
        if (a.length() != 1) {
            String n = a.substring(1);
            num = Integer.parseInt(n);
        }
        return num;
    }
}
