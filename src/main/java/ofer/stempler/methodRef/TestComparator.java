package ofer.stempler.methodRef;

import java.util.*;

public class TestComparator {
	public static void main(String[] args) {

		List<String> data = new ArrayList<>();
		data.add("aaa");
		data.add("bbb");
		data.add("ccc");
		data.add("ddd");
		data.add("eee");

		SomeComparator st = new SomeComparator();

		Collections.sort(data, st::check);
		System.out.println(data);
		
		Collections.sort(data, SomeStaticComparator::check);
		System.out.println(data);

		List<String> words = Arrays.asList("David","Adam","Eve","Moses");
		System.out.println(words);

		Comparator<String> c = (String s1, String s2) ->{
			return s1.compareTo(s2);
		} ;
		Collections.sort(words, c);
		System.out.println(words);

	}
}
