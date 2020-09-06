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
public class Averag2 {
    public static void main(String[] args)
    {
        int n,i,sum=0,avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum+=sc.nextInt();
            
        }
        avg=sum/n;
        System.out.println(avg);
        
        
    }
    
}
