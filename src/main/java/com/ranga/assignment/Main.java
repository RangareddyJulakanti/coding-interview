package com.ranga.assignment;

import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.Math.floor;
import static java.lang.Math.log;

class Main
{


	public static void main(String[] args)
	{
      System.out.println(getString(703));
	}
	private static String getString(int n) {
		int temp=n-1;
		char c=(char)('A'+temp);
		StringBuilder sb=new StringBuilder();
		sb.append(c);
		return sb.toString();
	}

}