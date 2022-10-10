package com.example.blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

	
	public static void main(String[] args) {

		
		Arrays.asList(3,5,2,8).stream().sorted().forEach(System.out::println);
		
		
		System.out.println("");
		Arrays.asList(4,2,6,1).stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
		
		Arrays.asList("bhariam","zee","dog","joker").stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
		
//		List<User> list=new ArrayList<User>(
//				 new User(33, "John"),
//				 new User(26,"Robert"),
//			     new User(26,"Mark"),
//			     new User(42,"Brandon"));
		
		
		
		List<User> list=new ArrayList<>(Arrays.asList(new User(33, "John"),new User(26,"Robert"),new User(26,"Mark"),new User(42,"Brandon")));
		
//		list.stream().sorted().forEach(System.out::println);
	
		System.out.println(""
				+ ""
				+ "");
		
		
//		list.stream().sorted(new Comparator<User>() {
//
//			@Override
//			public int compare(User o1, User o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareToIgnoreCase(o2.getName());
//			}
//		
//		}).forEach(System.out::println);
//		
//	}

	
	
//	list.stream().sorted(Comparator.comparingInt(User::getId)).forEach(System.out::println);
	
	
//	list.stream().sorted(Comparator.comparingInt(User::getId).reversed()).forEach(System.out::println);
	
	
	list.stream().sorted((o1,o2)->
	{
		if(o1.getName() == o2.getName())
            return o1.getName().compareTo(o2.getName());
        else if(o1.getId() < o2.getId())
            return 1;
        else return -1;
		
	}
	).forEach(System.out::println);
	
	
	
	Arrays.asList("shakar","Aah","aaa","Divya").stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
	
	
    List<List<String>>  list23=	Arrays.asList(Arrays.asList("avinash","adv"),Arrays.asList("divya","anu"),Arrays.asList("shanku","sha"));
	
     list23.stream().flatMap(Collection::stream).collect(Collectors.toList());
     
     
  Stream<Integer> st=Stream.iterate(2,i->i*2);
  
  st.forEach(System.out::println);
     
    
    
	System.out.println(list23);
	
	}
		
}
