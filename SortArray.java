import java.util.*;
class SortArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int X = sc.nextInt(); 
        int a[] = new int[X];
        int temp;
        System.out.println("enter the element");
        
       for(int i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();    //printing the array
		}
		 for(int i=0;i<a.length;i++)
		 {
		     for(int j=i+1;j<a.length;j++)
		     {
		         if(a[i]>a[j])
		         {
		             temp = a[i];
		             a[i]=a[j];
		             a[j]=temp;
		             
		         }
		     }
		 }
		 System.out.println(" Ascending order: ");
		 for(int i=0;i<a.length;i++)
		 {
		     System.out.println(a[i] +" ");
		 }
		        
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i+1;j<a.length;j++)
	        {
	            if(a[i]<a[j])
	            {
	                temp = a[i];
	                a[i]=a[j];
	                a[j]=temp;
	            }
	        }
	    }
	    
	    System.out.println("Desceding order");
	    for(int i=0;i<a.length;i++)
	    {
	        System.out.println(a[i]+ " ");
	    }
		
		
    }
}
