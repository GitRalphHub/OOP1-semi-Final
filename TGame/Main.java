package TGame;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        
        try (Scanner scan = new Scanner(System.in)) {
            Layout layout = new Layout();
            Func function = new Func();
            
            
            layout.display();
            layout.menuOptions();
            
            int num = scan.nextInt();
            
            
            switch (num) {
                case 1 -> {
                    layout.clearScreen();
                    layout.display();
                    System.out.println();
                    System.out.print("     You have selected Player Vs Player\n\n");
                    layout.chooseCharacterlayout();
                    function.pVsp();
                }
                    
                    
                case 2 -> {
                    layout.clearScreen();
                    layout.display();
                    System.out.println();
                    System.out.print("     You have selected Player Vs Computer\n\n");
                    layout.chooseCharacterlayout();
                    function.pVsc();
                }
                    
                case 3 -> {
                    layout.clearScreen();
                    layout.display();
                    System.out.println();
                    System.out.print("     You have selected Practice\n");
                    layout.chooseCharacterlayout();
                }
                    
                default -> {
                    layout.clearScreen();
                    System.out.println();
                    System.out.print("               Thank you for Playing!\n\n\n");
                    layout.clearProgram();
                    System.exit(0);
                }
                    
            }
        }
    }       
}

