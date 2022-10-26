package odevpackage;
import java.util.*;
import java.math.*;
public class kokbulmasınıf {
	public void kok1(int a,int b,int c) {
		double delta=b*b-4*a*c;
		double kok1=(-b+Math.sqrt(delta))/2*a;
		double kok2=(-b-Math.sqrt(delta))/2*a;
		System.out.println("kokler:: ");
		System.out.println(kok1);
		System.out.println(" ");
		System.out.println(kok2);
	}
	
}
