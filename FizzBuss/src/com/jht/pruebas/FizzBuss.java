/**
 * 
 */
package com.jht.pruebas;

/**
 * @author jtorres
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". 
 * For numbers which are multiples of both three and five print "FizzBuzz".
 */
public class FizzBuss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i=1; i <= 100; i++) {
			boolean mul3 = false;
			boolean mul5 = false;
			if (i%3 == 0) {
				mul3 = true;
			}
			if (i%5 == 0) {
				mul5 = true;
			} 
			if (mul3 && mul5) {
				System.out.println("FizzBuzz");
			} else if (mul3) {
				System.out.println("Fizz");
			} else if (mul5) {
				System.out.println("Buzz");
			} else 
				System.out.println("i=" + i);
		}
		System.out.println(OtraClaseParaPruebas.hola());
	}

}
