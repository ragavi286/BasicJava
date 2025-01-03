2.check if the number is divisible by 5 and 10

import java. util. *;
class Main 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0 && n%10==0)
        System.out.println("It is divided by 5 and 10");
        else
        System.out.println("It is not divided");
    }
}