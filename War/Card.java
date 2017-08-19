
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    private int num;
    private String name;
    public Card(int num, String name)
    {
        this.num = num;
        this.name = name;
    }
    public int getNum()
    {
        return(this.num);
    }
	public String getName()
	{
		return(this.name);
	   }
    public String toString()
    {
        return(this.name);
    }
}
