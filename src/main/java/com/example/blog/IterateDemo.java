package com.example.blog;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateDemo {

	
	public static void main(String[] args) {
		
	//	IntStream.iterate(0, n->n+2).limit(10).skip(2).forEach(System.out::println);
		
		
     int[] a= {1,2,3,4,5};
     
//     for(int i=0;i<a.length;i++)
//     {
//    	 
//    	 if(a[i]%2==0)
//    	 {
//    		// System.out.println(a[i]);
//    	 }
//     }
//		
//		
//		List<int[]> collect = Stream.of(a).sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		
//		System.out.println(collect);
//		
		
//     Arrays.sort(a,Collections.reverseOrder());
     
     System.out.println(Arrays.toString(a));
     
     
 //    Integer[] b=new Integer[a.length](a);
		
		
	} 

}
