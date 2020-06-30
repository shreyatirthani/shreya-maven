package gifts;
import java.util.*;
import sweets.Sweet;

public class Gift
{
    ArrayList<Sweet> gifts=new ArrayList<Sweet>();

    public int getWeight()
    {
        int sum=0;
        for(int i=0;i<gifts.size();i++)
            sum+=gifts.get(i).getWeight();

        return sum;
    }

    public void add(Sweet a)
    {
        gifts.add(a);
    }

    public String toString()
    {
        StringBuilder s=new StringBuilder();

        for(int i=0;i<gifts.size();i++) {
            s.append(gifts.get(i).getName());
            s.append(" ");
        }
        String output=s.toString();

        return output;

    }
}