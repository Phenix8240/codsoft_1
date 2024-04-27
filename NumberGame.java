package Projects;



import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random =new Random();
        int minRang=1,maxRang=100,maxAtttmpt=5,score=0;
        boolean playAgain=true;

        System.out.println("WellCome to the Number Game!");

        while(playAgain){
            int rand=random.nextInt(maxRang-minRang),attmpt=maxAtttmpt;
            boolean gc=false;

            System.out.println("I have selected a random number between " + minRang + " and " + maxRang);
            System.out.println("You have " + attmpt + " attempts to guess the number.");

            while(attmpt>0 && !gc){
                System.out.println("Enter your Guess:");
                int gus=sc.nextInt();
                sc.nextLine();

                if(gus==rand){
                    System.out.println("Congratulations! You guessed the correct number.");
                    gc=true;
                    score+=attmpt;
                }else if(gus<rand){
                    System.out.println("Too low! Try again.");
                }else{
                    System.out.println("Too high! Try again.");
                }
                attmpt--;
            }
            if (!gc) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + rand);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.nextLine().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
        sc.close();
        }
    }

