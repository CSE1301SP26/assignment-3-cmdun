import java.util.Scanner;

public class FrequencyTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of die: ");
        int diceCount = in.nextInt();
        int n = diceCount * 6;

        int[] diceRoll = new int[diceCount];
        int[] frequencyTable = new int[n];

        //Each value in table
        for (int x = 0; x <= 10000; x++) {
            //Each individual roll
            int setValue = 0;
            for (int roll = 0; roll < diceCount; roll++) {
                double random = Math.random();
                if (random <= (0.1667)) {
                    diceRoll[roll] = 1;
                } else if (random <= (0.333)) {
                    diceRoll[roll] = 2;
                } else if (random <= (0.5)) {
                    diceRoll[roll] = 3;
                } else if (random <= (0.666)) {
                    diceRoll[roll] = 4;
                } else if (random <= (0.833)) {
                    diceRoll[roll] = 5;
                } else {
                    diceRoll[roll] = 6;
                }
                setValue = setValue + diceRoll[roll];
            }
            frequencyTable[setValue - diceCount] = frequencyTable[setValue - diceCount] + 1;
        }

        System.out.println("Times each value was rolled with " + diceCount + " dice over 10000 rolls");
    
        for (int i = 0; i <= (n - diceCount); i++) {
            System.out.println((i + diceCount) + ": " + frequencyTable[i]);
        }


    }

}
