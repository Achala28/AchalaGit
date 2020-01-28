/*Assume you have an array of length n initialized with all 0's and are given k update operations.

Each operation is represented as a triplet: [startIndex, endIndex, inc] which increments 
each element of subarray A[startIndex ... endIndex] (startIndex and endIndex inclusive) with inc.

Return the modified array after all k operations were executed.

Example:

    Input=	5		//array size, s
    		3		//no.of.operations, n
    		1 3 2	//next 'n' triplets
    		2 4 3
    		0 2 -2
    Output= [-2,0,3,5,3]	//modified array
    Explanation:
    Initial state:
    [0,0,0,0,0]
    
    After applying operation [1,3,2]:
    [0,2,2,2,0]
    
    After applying operation [2,4,3]:
    [0,2,5,5,3]
    
    After applying operation [0,2,-2]:
    [-2,0,3,5,3]
*/
import java.util.*;
class Cunning
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int o=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<o;i++)
        {
            int one=sc.nextInt();
            int two=sc.nextInt();
            int three=sc.nextInt();
            a[one]=a[one]+three;
            if(two+1<size)
            {
                a[two+1]=a[two+1]-three;
            }
    
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i]+sum;
            sum=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}