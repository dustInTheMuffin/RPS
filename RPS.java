import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import java.util.Random;

//Very simple rock paper scisors ga

public class RPS {
    private static Scanner sc = new Scanner(System.in);
    private static int pick;
    private static int comp;
    private static Random rand = new Random();
    private static int wins, losses, ties;

    // 0- rock 1- paper 2- scissors
    public static void main(String[] args) {
        while(true){
        System.out.println("Rock (0) -- Paper (1) -- Scissors (2)");
        pick = sc.nextInt();
        //outside bounds
        if(pick > 2){
            System.out.println("Invalid Pick");
        }
        comp = rand.nextInt(3);
        Result(pick, comp);
        // if user chooses rock
        System.out.println("Now what would you like to do?  a)play again b)exit game c)view stats");
        String mPick = sc.next();
        if (mPick.compareTo("b") == 0) {
            return;
        }
        if (mPick.compareTo("c") == 0) {
            System.out.println("wins: " + wins + " losses: " + losses + " ties: " + ties);
            System.out.println("To reset enter R. Otherwise, press any key to play again.");
            mPick = sc.next();
            if (mPick.compareTo("R") == 0) {
                wins = 0;
                ties = 0;
                losses = 0;
            }
        }
    }
}

public static void Result(int pick, int comp) {
        if(pick == 0){
            if(comp == 0){
                System.out.print("Rock v. Rock --- Tie!");
                ties++;
            }
            else if(comp == 1){
                System.out.print("Rock v. Paper --- Loss!");
                losses++;
            }
            else if(comp == 2){
                System.out.print("Rock v. Scissors --- Win!");
                wins++;
            }
        }
        //user picks paper
        if(pick == 1){
            if(comp == 0){
                System.out.println("Paper v. Rock --- Win!");
                wins++;
            }
            else if(comp == 1){
                System.out.println("Paper v. Paper --- Tie!");
                ties++;
            }
            else if(comp == 2){
                System.out.println("Paper v. Scissors --- Loss!");
                losses++;
            }
        }
        //user picks scissors
        if(pick == 2){
            if(comp == 0){
                System.out.println("Scissors v. Rock --- Loss!");
                losses++;
            }
            else if(comp == 1){
                System.out.println("Scissors v. Paper --- Win!");
                wins++;
            }
            else if(comp == 2){
                System.out.println("Scissors v. Scissors --- Tie!");
                ties++;
            }
        }
    }
}
