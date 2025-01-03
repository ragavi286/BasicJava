8. A fruit seller buys a dozen of banana at rs.x He sells 1 banana at rs.y. Write a program t o determine the profit or loss in rs for fruitseller.
import java. util. *;
class Main 
{
    public static void main (String[]args)
    {
        Scanner sc = new  Scanner(System.in);
        float x = sc.nextFloat();
        float y1 = sc.nextFloat();
        float y2 = y1*12;
        if(x>y2)
        System.out.printf("%.2f Loss", x-y2);
        else
        System.out.printf("%.2f Profit", y2-x);
    }
}
