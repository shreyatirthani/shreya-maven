package sweets;

public class Candy extends Sweet
{
    String type;

    public Candy(String name,int price,int weight,String type)
    {
        super(name,price,weight);
        this.type=type;
    }
}
