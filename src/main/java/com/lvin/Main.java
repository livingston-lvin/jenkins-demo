package com.lvin;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int length = 5;

		for (int i = 1; i <= length; i++) {
			new Random().ints(length, 50, 120).forEach(n->System.out.print((char)n));
		}

	}

}
