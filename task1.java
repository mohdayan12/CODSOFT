import java.util.*;
public class task1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int randomNumber=(int)Math.floor(Math.random()*100)+1;
        System.out.println("guess the number");
        int guessLimit=10;
         int guess=sc.nextInt();
         guessLimit--;
        while(true){
            if(guessLimit==0){
                System.out.println("the guess limit is over");
                break;
            }
             if(randomNumber==guess){
                System.out.println("the guess is correct:");
                break;
            }
            else if(randomNumber>guess){
                System.out.println("guess is too low:");
                System.out.println("guess the number again");
                guess=sc.nextInt();
                guessLimit--;
            }
            else{
                System.out.println("guess is too high:");
                System.out.println("guess the number again");
                guess=sc.nextInt();
                 guessLimit--;
            }
        }
        if (guessLimit>=5){
            System.out.println("the score is: 10 ");
        }
        else {
            System.out.println("the score is: 5 ");
        }
        sc.close();
    }
}