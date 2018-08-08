package co.grandcircus.lists;


import java.io.*;
public class algorithm {
		
		static int frequency(int a[],
			    int n, int x)
			    {
			        int count = 0;
			        for (int i=0; i < n; i++)
			        if (a[i] == x) 
			            count++;
			        return count;
			        }
			        
			        public static void main( String[] args) {
			        	         
			        	        int a[] = { 1,2,3,4,5,6,6,8,9,7,7,7,10,11,11};
			        	        int x = 7;
			        	        int n = a.length;
			        	         
			        	        System.out.println(frequency(a, n, x));
			        	    }
			        {
			    }
			    {
	}

}
