package com.java.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SteamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lt = Arrays.asList("asd","asd","","rge","gffd","lla");
		int emptyCount = (int) lt.stream().filter(a-> a.isEmpty()).count();
		System.out.println("number of empty strings " + emptyCount);
		
		List filterlist = lt.stream().filter(a-> !a.isEmpty()).collect(Collectors.toList());
		System.out.println("filtered lists "+ filterlist);
		
		String meargeList = lt.stream().filter(l-> !l.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Mearge list "+ meargeList);
		
		List<Integer> num = Arrays.asList(1,4,5,6,8,4,2);
		List square = num.stream().map(n->n*n).distinct().collect(Collectors.toList());
		System.out.println("square: "+square);
		 IntSummaryStatistics state = num.stream().mapToInt(n->n).summaryStatistics();
		 System.out.println("max: "+ state.getMax() );
		 System.out.println("min: "+ state.getMin());
		 System.out.println("avg" + state.getAverage());
		 
		 
		
	}

}
