import gifts.*;
import sweets.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Sweet X=new Candy("X",130,80,"Gummies");
        Sweet Y=new Candy("Y",150,70,"Cotton Candy");
       

        Sweet A=new Chocolate("A",200,50,"Waffer");
        Sweet B=new Chocolate("B",250,60,"Nuts");


        Gift gifts=new Gift();
        gifts.add(X);
        gifts.add(Y);
        gifts.add(A);
        gifts.add(B);
        

        System.out.println(gifts.getWeight());
        System.out.println(gifts.toString());

    }
}
