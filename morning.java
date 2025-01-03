3. Check whether the given time is morning , afternnon or night

import java. util. *;
class Main 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        if(n>0 && n<6)
        System.out.println("Midnight");
        else if(n>=6 && n<12)
        System.out.println("Morning");
        else if(n>=12 && n<16)
        System.out.println("Afternoon");
        else if(n>=16 && n<19)
        System.out.println("Evening");
        else if(n>=19 && n<22)
        System.out.println("Night");
        else if(n>=22 && n<24)
        System.out.println("Midnight");
        else
        System.out.println("Not valid");
    }
}