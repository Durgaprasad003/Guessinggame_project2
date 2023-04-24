import java.util.Scanner;
import java.util.Random;
class guess{
    public void random()
    {
        System.out.println("__WELCOME TO GUESSING GAME__\n\n");
        Random sc=new Random();

        int random=sc.nextInt(100);
        System.out.println("The guess should between 0 and 100");
        System.out.println("In this game you will have five trials\n");
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your guess number");
        for(int i=0;i<5;i++)
        {
            int guess=input.nextInt();
            if(random==guess)
            {
                System.out.println("CONGRATULATIONS😘😘😘😘🥰🥰");
                
            }
            else if(random>guess)
            {
                System.out.println("You entered too low number");
            }
            else if(random<guess)
            {
                System.out.println("You entered high number");
            }
           

        }
        System.out.println("You lose");
        System.out.println("Trials are ended");
    }
}
public class guessgame
{
    public static void main(String[] args) {
        guess var=new guess();
        var.random();
    }
}
