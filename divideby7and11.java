6.Check if a number is divided by 7,11 or both 

import java. util. *;
class Main 
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%7==0 && a%11==0)
        System.out.println("Divided by both 7 and 11");
        else if(a%7==0)
        System.out.println("divided by 7");
        else if(a%11==0)
        System.out.println("divided by 11");
        else
        System.out.println("not divided by 7 and 11");
    }
}
