package ofer.stempler.model;

import java.util.stream.DoubleStream;

public class Limit {

	public static void main(String[] args) {
		DoubleStream.generate(Math::random).count();
		System.out.println("aaa");
		

	}

}
