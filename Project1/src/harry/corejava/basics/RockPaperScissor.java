package harry.corejava.basics;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int computerScore=0;
        int userScore=0;
        while(true)
        {
            System.out.print("Enter 0 for rock\nEnter 1 for paper\nEnter 2 for scissor\nEnter 8 to see scores\nEnter 9 to exit\n");
            int userInput=sc.nextInt();
            Random random=new Random();//creating instances for random class
            int computerInput=random.nextInt(3);//so we give upper bound to get a random input from computer less
            // than 3
            if(userInput==9)
                System.exit(0);
            if(userInput==8)
            {
                System.out.println("computer score: "+computerScore);
                System.out.println("user score: "+userScore);
                System.exit(0);
            }
            if(userInput==computerInput)
            {
                System.out.println("Draw");
            }
            else if((userInput==0 && computerInput==1)||(userInput==1 && computerInput==2)||(userInput==2 && computerInput==0))
            {
                System.out.println("Computer won!!!!!!!!!!!!!");
                computerScore++;
                System.out.println("**************************\n");
            }
            else
            {
                System.out.println("You won!!!!!!!!!!!!!!!!!");
                userScore++;
                System.out.println("*************************\n");
            }
            if(computerInput==0)
                System.out.println("Computer choice: Rock");
            else if(computerInput==1)
                System.out.println("Computer choice: Paper");
            else
                System.out.println("Computer choice: Scissors");
        }

    }
}
