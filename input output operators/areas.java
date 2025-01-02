4. Sheela has three things in her bag. She wants to compute the area of 3 things but 3 things are in different shapes.
The three things are in a square shape, rectangular shape and circular shape respectively.
Write a program to help Sheela to calculate the area of different shapes
input format:
First input: a side of a square in integer
Second input: length of s rectangle in integer
Third input: breadth of a rectangle in integer
Fourth input: radius of a circle in float
output format:
First output is area of square in integer
Second output is area of rectangle in integer
Third output is area of circle the output have 2 values after decimal

input format
2
3
6
5.0

import java. util. *;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        float radius = sc.nextFloat();
        int areaofsquare = side*side;
        int areaofrectangle = length*breadth;
        float areaofcircle = (float) 3.14*(radius*radius);
        System.out.println(areaofsquare);
        System.out.println(areaofrectangle);
        System.out.printf("%.02f",areaofcircle);
    }
}