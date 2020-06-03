package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Courses;

public class Program_Ex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Courses> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int ide = sc.nextInt();
			set.add(new Courses(ide, "A"));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int ide = sc.nextInt();
			set.add(new Courses(ide, "B"));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int ide = sc.nextInt();
			set.add(new Courses(ide, "C"));
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
