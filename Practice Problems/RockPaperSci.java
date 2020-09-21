import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class RockPaperSci{
    
    public static void main(String args[]){
        int choice;
        int choiceComp;
        // int turn = 5;
        // int countUser = 0, countComp = 0;

        // while(turn > 0){
        //     turn -= 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice from the following menu");

            System.out.println("1. For Rock");
            System.out.println("2. For Paper");
            System.out.println("3. For Scissors");
            choice = sc.nextInt();
            sc.close();

            choiceComp = ThreadLocalRandom.current().nextInt(1, 3+1);

            if(choice == choiceComp){
                System.out.print("Match tied");
                if(choiceComp == 1){
                    System.out.println(" Computer choose Rock too");
                }

                else if(choiceComp == 2){
                    System.out.println(" Computer choose Paper too");
                }

                else{
                    System.out.println(" Computer choose Scissors too");
                }
            }

            else if(choice == 1 && choiceComp == 2){
                System.out.println("You Lost, Computer choose Paper");
                // countComp += 1;
            }

            else if(choice == 1 && choiceComp == 3){
                System.out.println("You Won, Computer choose Scissors");
                // countUser += 1;
            }

            else if(choice == 2 && choiceComp == 1){
                System.out.println("You Won, Computer choose Rock");
                // countUser += 1;
            }

            else if(choice == 2 && choiceComp == 3){
                System.out.println("You Lost, Computer choose Scissors");
                // countComp += 1;
            }

            else if(choice == 3 && choiceComp == 1){
                System.out.println("You Lost, Computer choose Rock");
                // countComp += 1;
            }

            else{
                System.out.println("You Won, Computer choose Paper");
            }

        // if (countComp > countUser){ System.out.println("Computer Won the game"); }

        // else if ( countComp < countUser ){ System.out.println("You Won the game"); }

        // else{ System.out.println("Game tied"); }

    }

}