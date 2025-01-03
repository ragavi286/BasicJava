9. ask a user for their birth year encoded as two digits(like "62") and for the current year two digits(like "99") write a program to find the users current age in years.

import java. util. *;
class Main 
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int century = (100-a)+b;
        int year = b-a;
        if(a>b)
        System.out.println(century);
        else
        System.out.println(year);
    }
}