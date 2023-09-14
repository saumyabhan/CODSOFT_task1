package com.company;
import java.util.Random;
import java.util.Scanner;
class Game {
    int comp;
    int input;
    int guesses = 0;
    Game() {
        Random ran = new Random();
        comp = ran.nextInt(100);
    }
    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number= ");
        input = sc.nextInt();
    }
    public boolean check() {
        guesses++;
        if (input == comp) {
            System.out.format("You guessed it right in %d attempts", guesses);
            return true;
        } else if (input > comp) {
            System.out.println("too high");
        }
        if (input < comp) {
            System.out.println("too low");
        }
        return false;
    }
}
public class GuessTheNumEx3 {
    public static void main(String[] args) {
        Game gg = new Game();
        boolean s= false;
        while (!s) {
            gg.takeInput();
            s = gg.check();
        }
    }
}