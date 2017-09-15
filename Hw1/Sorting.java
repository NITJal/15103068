/*
A simple java program to sort strings for a given input
*/

import java.util.Scanner;

public class Sorting
{
    public static void main(String[] input)
    {
        int i, j;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        String names[] = new String[5];
		
        System.out.print("Enter 5 Names/Words : ");
        for(i=0; i<5; i++)
        {
            names[i] = scan.nextLine();
        }
		
        
        for(i=0; i<5; i++)
        {
            for(j=1; j<5; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
		
        System.out.print("Sorted list is : \n\n");
		
        System.out.println("\nNow the List is :\n");
        for(i=0;i<5;i++)
        {
            System.out.println(names[i]);
        }
    }
}
