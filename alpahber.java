7. Check whether given character is alphabet or not and also check it is vowel or consonant

import java. util. *;
class Main 
{
    public static void main (String[]args)
    {
        Scanner sc = new  Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c>='A'&& c<='Z'|| c>='a' && c<='z'){
        System.out.println("It is alphabet");
           if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
           System.out.println("It is vowel");
           else
           System.out.println("It is consonant");
        }
        else
        System.out.println("It is not alphabet");
    }
}