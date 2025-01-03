1.Check the given number is positive ,negative or zero

import java. util. *;
class Main 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        System.out.println("positive");
        else if(n<0)
        System.out.println("Negative");
        else if(n==0)
        System.out.println("Zero");
    }
}