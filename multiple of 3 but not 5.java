4. check whether the number is multiple of 3 but not 5

import java. util. *;
class Main 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3==0 && n%5!=0)
        System.out.println("True");
        else
        System.out.println("false");
    }
}