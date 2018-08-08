package co.grandcircus.lists;


import java.io.*;
import java.util.*;

public class hashmap {

	static HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
	 
	   static void countFreq(int a[], int n)
	   {
	        // Insert objects &  frequencies in hashMap.
	        for (int i=0; i<n; i++)
	            if (hm.containsKey(a[i]) )
	                hm.put(a[i], hm.get(a[i]) + 1);
	            else hm.put(a[i] , 1);
	    }
	     
	    // Return frequency of x 
	    static int query(int x)
	    {
	        if (hm.containsKey(x))
	            return hm.get(x);
	        return 0;
	    }
	 
		public static void main (String[] args) {
	        int a[] = { 1,2,3,4,5,6,6,8,9,7,7,7,10,11,11};
	        int n = a.length;
	        countFreq(a, n);
	        System.out.println(query(2));
	        System.out.println(query(11));
	        System.out.println(query(7));
	    }
		{
	 

	}

}
