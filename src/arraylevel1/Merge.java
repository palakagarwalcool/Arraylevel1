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
public class Merge {
    public static void main(String[] args)
    {
        int a[]={1,2,3},b[]={5,6,8};
        int c[]=new int[6];
        int i,j,k=0;
        for(i=0;i<3;i++)
        {
            c[k]=a[i];
            k++;
            
        }
        for(j=0;j<3;j++)
        {
            c[k]=b[j];
            k++;
        }
        for(i=0;i<k;i++)
        {
            System.out.println(c[i]);
        }
    }
    
}
