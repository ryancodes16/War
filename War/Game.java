import java.math.*;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    private Deck myDeck = new Deck();
    private int[] DrawnP1 = new int[6];
    private int[] DrawnP2 = new int[6];
    private int rounds = 0;
    public Game()
    {
       
    }
    public void Play()
    {
        myDeck.createDeck();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.deal();
        System.out.println();
        myDeck.probswin();
        while(cont() == true)
        {
        getWinner();
        System.out.println("P1 # cards: " + myDeck.getP1size() + " P2 # cards: " + myDeck.getP2size());
        cont();
        rounds++;
      }
      System.out.println("Number of rounds: " + rounds);
      System.out.println();
      myDeck.printHands();
      System.out.println();
        }
    public void getWinner()
    {
        DrawnP1[0] = myDeck.draw1(0).getNum();
        DrawnP2[0] = myDeck.draw2(0).getNum();
        if(DrawnP1[0] > DrawnP2[0])
            {
                myDeck.Play1Wins(0);
                System.out.println("P1: " + DrawnP1[0] + " P2: " + DrawnP2[0]);
                //System.out.println();
                //myDeck.printHands();
                //System.out.println();
                //System.out.println(myDeck.getP1size());
                //System.out.println(myDeck.getP2size());
            }
            else if(DrawnP2[0] > DrawnP1[0])
            {
                myDeck.Play2Wins(0);
                System.out.println("P1: " + DrawnP1[0] + " P2: " + DrawnP2[0]);
                //System.out.println();
                //myDeck.printHands();
                //System.out.println();
                //System.out.println(myDeck.getP1size());
                //System.out.println(myDeck.getP2size());
            }
            else if(DrawnP1[0] == DrawnP1[0])
            {
                System.out.println("P1: " + DrawnP1[0] + " P2: " + DrawnP2[0]);
                if(myDeck.getP1size() >= 3 && myDeck.getP2size() >= 3)
                {
                    DrawnP1[1] = myDeck.draw1(1).getNum();
                    DrawnP1[2] = myDeck.draw1(2).getNum();
                    DrawnP2[1] = myDeck.draw2(1).getNum();
                    DrawnP2[2] = myDeck.draw2(2).getNum();
                    System.out.println("WARRRRRR!");
                    Tie();
                    //System.out.println();
                    //myDeck.printHands();
                    //System.out.println();
                    //System.out.println(myDeck.getP1size());
                    //System.out.println(myDeck.getP2size());
                    }
                else if(myDeck.getP1size() >= 3 && myDeck.getP2size() < 3)
                {
                    myDeck.Play1Wins(0);
                    }
                    else if(myDeck.getP2size() >= 3 && myDeck.getP1size() < 3)
                {
                    myDeck.Play2Wins(0);
                    }
            }
       }    
    public void Tie()
    {
       if(DrawnP2[2] > DrawnP1[2])
        {
            myDeck.Play2Wins(0);
            myDeck.Play2Wins(0);
            myDeck.Play2Wins(0);
            System.out.println("P2 won: " + "P2 Cards: " +  DrawnP2[0] + " " + DrawnP2[1] + " " + DrawnP2[2] + " P1 Cards Won: "  + " " + DrawnP1[0] + " " + DrawnP1[1] + " " + DrawnP1[2]);
        }
        else if(DrawnP2[2] < DrawnP1[2])
        {
            myDeck.Play1Wins(0);
            myDeck.Play1Wins(0);
            myDeck.Play1Wins(0);
            System.out.println("P1 won: " + "P1 Cards: " +   DrawnP1[0] + " " + DrawnP1[1] + " " + DrawnP1[2] + " P2 Cards Won: " + DrawnP2[0] + " " + DrawnP2[1] + " " + DrawnP2[2]);
        }
       else if(DrawnP2[2] == DrawnP1[2])
       {
               if(myDeck.getP1size() >= 6 && myDeck.getP2size() >= 6)
               {
                   System.out.println();
                   System.out.println("Double WARRRRRRRR!");
                   DrawnP1[3] = myDeck.draw1(3).getNum();
                   DrawnP1[4] = myDeck.draw1(4).getNum();
                   DrawnP1[5] = myDeck.draw1(5).getNum();
                   DrawnP2[3] = myDeck.draw2(3).getNum();
                   DrawnP2[4] = myDeck.draw2(4).getNum();
                   DrawnP2[5] = myDeck.draw2(5).getNum();
                   if(DrawnP1[5] > DrawnP2[5])
                         {
                            System.out.println("P1: " + DrawnP1[5] + " P2: " + DrawnP2[5]);
                            myDeck.Play1Wins(0);
                            myDeck.Play1Wins(0);
                            myDeck.Play1Wins(0);
                            myDeck.Play1Wins(0);
                            myDeck.Play1Wins(0);
                            myDeck.Play1Wins(0);
                            System.out.println("P1 won: " + DrawnP1[0] + " " + DrawnP1[1] + " " + DrawnP1[2] + " " + DrawnP1[3] + " " + DrawnP1[4] + " " + DrawnP1[5] + " " + DrawnP2[0] + " " + DrawnP2[1] + " " + DrawnP2[2] + " " + DrawnP2[3] + " " + DrawnP2[4] + " " + DrawnP2[5]);
                            System.out.println();
                            }
                         else if(DrawnP2[5] > DrawnP1[5])
                         {
                            System.out.println("P1: " + DrawnP1[5] + " P2: " + DrawnP2[5]);
                            myDeck.Play2Wins(0);
                            myDeck.Play2Wins(0);
                            myDeck.Play2Wins(0);
                            myDeck.Play2Wins(0);
                            myDeck.Play2Wins(0);
                            myDeck.Play2Wins(0);
                            System.out.println("P1 won: " + DrawnP1[0] + " " + DrawnP1[1] + " " + DrawnP1[2] + " " + DrawnP1[3] + " " + DrawnP1[4] + " " + DrawnP1[5] + " " + DrawnP2[0] + " " + DrawnP2[1] + " " + DrawnP2[2] + " " + DrawnP2[3] + " " + DrawnP2[4] + " " + DrawnP2[5]);
                            System.out.println();
                         }
                         else if(DrawnP1[5] == DrawnP1[5])
                         {
                             int winner = (int)(Math.random() * 2) + 1;
                             System.out.println(winner);
                             System.out.println();
                             System.out.println("Triple WARRRRRRRR! and player " + winner + " takes the pot!");
                             if(winner == 1)
                             {
                                myDeck.Play1Wins(0);
                                myDeck.Play1Wins(0);
                                myDeck.Play1Wins(0);
                                myDeck.Play1Wins(0);
                                myDeck.Play1Wins(0);
                                myDeck.Play1Wins(0);
                                System.out.println("P1 won: " + DrawnP1[0] + " " + DrawnP1[1] + " " + DrawnP1[2] + " " + DrawnP1[3] + " " + DrawnP1[4] + " " + DrawnP1[5] + " " + DrawnP2[0] + " " + DrawnP2[1] + " " + DrawnP2[2] + " " + DrawnP2[3] + " " + DrawnP2[4] + " " + DrawnP2[5]);
                                System.out.println();
                                }
                             else if(winner == 2)
                             {
                                myDeck.Play2Wins(0);
                                myDeck.Play2Wins(0);
                                myDeck.Play2Wins(0);
                                myDeck.Play2Wins(0);
                                myDeck.Play2Wins(0);
                                myDeck.Play2Wins(0);
                                System.out.println("P1 won: " + DrawnP1[0] + " " + DrawnP1[1] + " " + DrawnP1[2] + " " + DrawnP1[3] + " " + DrawnP1[4] + " " + DrawnP1[5] + " " + DrawnP2[0] + " " + DrawnP2[1] + " " + DrawnP2[2] + " " + DrawnP2[3] + " " + DrawnP2[4] + " " + DrawnP2[5]);
                                System.out.println();
                                }
                       }                   
               }
               else if(myDeck.getP1size() >= 6 && myDeck.getP2size() < 6)
                   {
                        myDeck.Play1Wins(0);
                        myDeck.Play1Wins(0);
                        myDeck.Play1Wins(0);
                        System.out.println("Not enough cards :/");
                       }
                   else if(myDeck.getP2size() >= 6 && myDeck.getP1size() < 6)
                   {
                        myDeck.Play2Wins(0);
                        myDeck.Play2Wins(0);
                        myDeck.Play2Wins(0);
                        System.out.println("Not enough cards :/");
                       }
           }
    }
        public boolean cont()
    {
        boolean ans = true;
        if(myDeck.getP1size() > 0 && myDeck.getP2size() > 0)
        {
            ans = true;
        }
        else
        {
            ans = false;      
        }
        return(ans);
    }
    public void showHands()
    {
        myDeck.printHands();
    }
}

