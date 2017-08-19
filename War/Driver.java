import java.util.Scanner;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    private static Game myGame;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String ans = "";
        String again = "";
        myGame = new Game();
        do
        {
            System.out.println("Do you want to play war?");
            ans = scan.nextLine();
            if(ans.equalsIgnoreCase("yes"))
            {
                myGame.Play();
            }
        }while(!(ans.equalsIgnoreCase("yes")) && !(ans.equalsIgnoreCase("no")));
    }
}
