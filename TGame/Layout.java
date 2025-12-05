package TGame;

public class Layout {

    public void clearProgram(){
        System.exit(0);
    }

    public void clearScreen(){

            for(int i = 0; i < 50; i++){
                System.out.println();
        }
    }
    
    public void display(){

        int width = 50;

        for(int i = 0; i < width; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int rep = 0; rep < 2; rep++){
        for(int i = 0; i <= width; i++){
            if(i == 0){
                System.out.print("|");
            }  else if(i != 0){
                System.out.print(" ");
            }if(i == width - 2){
                System.out.print("|");
                }
            }
            System.out.println();
        }

        System.out.print("|               Professors Royale                |");
        System.out.println();

        for(int rep = 0; rep < 2; rep++){
        for(int i = 0; i <= width; i++){
            if(i == 0){
                System.out.print("|");
            }  else if(i != 0){
                System.out.print(" ");
            }if(i == width - 2){
                System.out.print("|");
                }
            }
            System.out.println();
        }
        
        for(int i = 0; i < width; i++){
            System.out.print("*");
        }
        System.out.println();

    }

    public void menuOptions(){

        System.out.println();

        System.out.println("                 [1]Player vs Player          ");
        System.out.println("               [2]Player vs Computer          ");
        System.out.println("                   [3]Practice          ");
        System.out.println("                     [4]Quit         ");
    }
    
    public void chooseCharacterlayout(){

        System.out.println("[1] Lance                      [5] Manolito");
        System.out.println("[2] Khai                       [6] Sarrah");
        System.out.println("[3] Judy                       [7] Character 7");
        System.out.println("[4] Cheryl                     [8] Character 8\n");
    }
}


