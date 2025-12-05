package TGame;

import java.io.IOException;
import java.util.Scanner;

public class Func {

    Scanner scan = new Scanner(System.in);
    Layout layout = new Layout();

    private Characters chooseCharacter(int choice) {
    switch (choice) {
        case 1:
            return new Lance(); // health = 100, shield = 10
        case 2:
            return new Khai(); // health = 120, shield = 5
        case 3:
            return new Judy(); // health = 80, shield = 15
        case 4:
            return new Cheryl();
        case 5:
            return new Manolito();
        case 6:
            return new Sarrah();
        default:
            return new Khai(); // fallback
        }
    }


     public void pVsp() {
        

        System.out.print("Player 1, choose your character (1-8): ");
        Characters player1 = chooseCharacter(scan.nextInt());

        System.out.print("Player 2, choose your character (1-8): ");
        Characters player2 = chooseCharacter(scan.nextInt());

        layout.clearScreen();
        System.out.println("               " + player1.getName() + " Vs " + player2.getName());
        System.out.println();


        pressAnyKey();
        layout.clearScreen();
        
        Battle battle = new Battle(player1, player2);
        battle.start();
     } 

    void pVsc(){
        int choice1;

            System.out.print("          Select your Character: ");
            choice1 = scan.nextInt();
            scan.nextLine(); // consume newline

            Characters player1 = chooseCharacter(choice1);

            // computer picks a random character
            int aiChoice = (int)(Math.random() * 6) + 1; // 1-6
            Characters player2 = chooseCharacter(aiChoice);
            // mark the opponent as computer-controlled so Battle treats it as AI
            player2.setComputer(true);

        System.out.println("        You've selected " + player1.getName());
        System.out.println("        Computer has selected " + player2.getName());

        pressAnyKey();

        layout.clearScreen();
        System.out.println("               " + player1.getName() + " Vs " + player2.getName());
        System.out.println();

        pressAnyKey();
        layout.clearScreen();

        Battle battle = new Battle(player1, player2);
        battle.start();
 
    }


    public void pressAnyKey() {
    System.out.println("         Press Enter to continue...");
    try {
        System.in.read();  
    } catch (IOException e) {
    }
}

        
    

}

