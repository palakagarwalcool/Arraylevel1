/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylevel1;

/**
 *
 * @author Palak
 */
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args)
    {
        int a[]={1,3,4,8,9};
        int n,i,f=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println(i);
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("No such element");
        }
        
    }
    
}
