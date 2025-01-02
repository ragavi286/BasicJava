5. Sara wished to build a new house but she didn't have a sufficient amount so she is planning to barrow some money from the bank on simple interest When borrowing some money from the bank, she has to pay back the original amount accompanied by a certain amount of interest on that amount. She wants to find the interest for barrowed money within a certain period. Help to find the simple interest
Input format:
The first line containing an integer value denoting the barrowed amount(principal amount)15000
period in years 2 years
rate of interest 2.8

import java. util. *;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int y = sc.nextInt();
        float r = sc.nextFloat();
        float s = (p*y*r)/100;
        System.out.printf("%.02f",s);
    }
}
