import java.util.Scanner;

public class Crab {
    public static void main(String[] args) {
        while (true){
            rungame();
            System.out.println("play again? (y/n)");
            Scanner inp2 = new Scanner(System.in);
            String check4 = inp2.nextLine();
            if (check4.equals("n")){
                break;
            }
        }
    }
    public static void rungame(){
        System.out.println("LETS PLAY CRABS");
        System.out.println("Do you need instructions? (y/n)");
        Scanner inp = new Scanner(System.in);
        String check = inp.nextLine();
        if (check.equals("y")){
            System.out.println("1. Roll two six-sided dice.\n2. a. On first roll, if you get a 7 or 11 you win!\n2. b. On first roll, if you get a 2, 3, or 12 you lose!\n2. c. Any other number you don't win or lose. The die roll becomes your point.\n3. Keep rolling the dice again until:\n4. a. You roll the point again and win!\n4. b. or you roll a 7 and lose.");
  
        }
        System.out.println("GOOD LUCK!");
        System.out.println("Press <Enter> to roll the dice...");
        String check2 = inp.nextLine();
        boolean k = true;
        int point=0;
        if (check2.equals('\n')){
            Die d = new Die();
            System.out.println("your roll is: ");
            int roll = d.roll();
            System.out.print(roll);
            if (roll == 7 || roll == 11){
                System.out.println("YOU WIN");
                k=false;
            }
            else if (roll == 2 || roll == 3 || roll == 12){
                System.out.println("YOU LOSE");
                k=false;
            }
            else{
                point = roll;
            }
            while (k){
                System.out.println("Press <Enter> to roll the dice...");
                if (check2.equals('\n')){
                    System.out.println("your roll is: ");
                    int roll2 = d.roll();
                    System.out.print(roll2);
                    if (roll2 == point){
                        System.out.println("you win");
                        k=false;
                        break;

                    }
                    else if(roll2 == 7){
                        System.out.println("you lose");
                        k=false;
                        break;
                    }

                }

            }

            
        }
    }
}
