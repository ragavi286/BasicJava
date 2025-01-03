11. traffic signal
We are driving down the street and see a green traffic light ahead because we know precisely the pattern of this traffic light we know exactly how long we have before it will turn red we wish to compute whether we will pass the traffic light before it turns red at our current speed write a program to check whether we will beat the light or not with the current speed.
input format
floating point denotes current speed in miler per hour
floating point denotes distance of light in miles
floating point denotes time until it turns red in seconds

import java. util. *;
class Main 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        float sp = sc.nextFloat();
        float d = sc.nextFloat();
        float t = sc.nextFloat();
        double ts = sp/3600.0;
        double t1 = (float) d/ts;
        if(t1<t)
        System.out.println("beat the light");
        else
        System.out.println("not beat the light");
    }
}