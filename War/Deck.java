import java.math.*;
import java.util.*;
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck
{
    private ArrayList<Card> myDeck = new ArrayList<Card>();
    private ArrayList<Card> Player1 = new ArrayList<Card>();
    private ArrayList<Card> Player2 = new ArrayList<Card>();
    private ArrayList<Card> Temp = new ArrayList<Card>();
    public Deck()
    {

    }
    public void createDeck()
    {
        int num = 2;
        String name = "";
     
        for(int i = 0; i < 52; i++)
        {
            if(num < 11)
            {
                name += num;
                Card myCard = new Card(num,name);
                myDeck.add(myCard);
                name = "";
                //System.out.println(myDeck.get(i));
                num++;
            }
            else if(num == 11)
            {
                name = "Jack";
                num = 11;
                Card myCard = new Card(num,name);
                myDeck.add(myCard);
                //System.out.println(myDeck.get(i));
                num++;
                name = "";
            }
            else if(num == 12)
            {
                name = "Queen";
                num = 12;
                Card myCard = new Card(num,name);
                myDeck.add(myCard);
                //System.out.println(myDeck.get(i));
                num++;
                name = "";
            }
            else if(num == 13)
            {
                name = "King";
                num = 13;
                Card myCard = new Card(num,name);
                myDeck.add(myCard);
                //System.out.println(myDeck.get(i));
                num++;
                name = "";
            }
            else if(num == 14)
            {
                name = "Ace";
                num = 14;
                Card myCard = new Card(num,name);
                myDeck.add(myCard);
                //System.out.println(myDeck.get(i));
                num = 2;
                name = "";
            }
        }
    }
    public void deal()
    {
        for(int i = 0; i < myDeck.size(); i++)
        {
            if(i % 2 == 0)
            {
                Player1.add(myDeck.get(i));     
             }
            else
            {
                Player2.add(myDeck.get(i));
             }
          }
        System.out.println(Player1.size() + "  " + Player2.size());
        
        for(int i = 0; i < Player1.size(); i++)
        {
            System.out.print(Player1.get(i));
          }
        System.out.println();
        for(int i = 0; i < Player2.size(); i++)
        {
            System.out.print(Player2.get(i));
          }
          
       }
       
    public void shuffle()
    {
        Collections.shuffle(myDeck);
    }
    public Card draw1(int pos)
    {
        return(Player1.get(pos));
    }
    public Card draw2(int pos)
    {
        return(Player2.get(pos));
       }
    public int getP1size()
    {
        return(Player1.size());
       }
    public int getP2size()
    {
        return(Player2.size());
       }
    public int getNum1(int pos)
    {
        return(Player1.get(pos).getNum());
       }
    public int getNum2(int pos)
    {
        return(Player2.get(pos).getNum());
       }
    public void Play1Wins(int pos)
    {
        Temp.add(Player1.get(pos));
        Player1.remove(pos);
        Player1.add(Temp.get(0));
        Temp.remove(0);
        Player1.add(Player2.get(pos));
        Player2.remove(Player2.get(pos));
       }
    public void Play2Wins(int pos)
    {
        Temp.add(Player2.get(pos));
        Player2.remove(pos);
        Player2.add(Temp.get(0));
        Temp.remove(0);
        Player2.add(Player1.get(pos));
        Player1.remove(Player1.get(pos));
       }
    public void printHands()
    {
        for(int i = 0; i < Player1.size(); i++)
        {
            System.out.print(Player1.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < Player2.size(); i++)
        {
            System.out.print(Player2.get(i) + " ");
        }
    }
    public void probswin()
    {
        int player1points = 0;
        int player2points = 0;
        
        for(int i = 0; i < Player1.size(); i++)
        {
            if(Player1.get(i).getNum() == 14)
            {
                player1points += 5;
            }
            else if(Player1.get(i).getNum() == 13)
            {
                player1points += 4;
            }
            else if(Player1.get(i).getNum() == 12)
            {
                player1points += 3;
            }
            else if(Player1.get(i).getNum() == 11)
            {
                player1points += 2;
            }
            else
            {
                player1points++;
            }
        }
        for(int i = 0; i < Player2.size(); i++)
        {
            if(Player2.get(i).getNum() == 14)
            {
                player2points += 5;
            }
            else if(Player2.get(i).getNum() == 13)
            {
                player2points += 4;
            }
            else if(Player2.get(i).getNum() == 12)
            {
                player2points += 3;
            }
            else if(Player2.get(i).getNum() == 11)
            {
                player2points += 2;
            }
            else
            {
                player2points++;
            }
        }
        double p1cent = (player1points / 92.0) * 100.0;
        double p2cent = (player2points / 92.0) * 100.0;
        
        System.out.println("Player 1 points: " + player1points);
        System.out.println("Player 2 points: " + player2points);
        System.out.println("P1 % of winning " + p1cent + " P2 % of winning " + p2cent);
        
    }
}
