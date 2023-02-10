package com.collection.api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;



public class Main {
	
	
	//Quest 1- Write a program to reverse String using Stack
	
	public static String reverseString(String str) {
		Stack<Character> st = new Stack<Character>();
		char[] arr = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		
		for(int i=0;i<str.length();i++) {
			arr[i] = st.pop();
		}
		
		return String.valueOf(arr);
	}
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(reverseString(input));
		
		
		
		//Quest 3- Write a program to serialize and de-serialize HashMap.
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "First");
		map.put(2, "Second");
		map.put(3, "Third");
		map.put(4, "Fourth");
		map.put(5, "Fifth");
		
		OutputStream fileStream = new FileOutputStream("hello.ser");
		ObjectOutputStream obj = new ObjectOutputStream(fileStream);
		
		obj.writeObject(map);
		obj.close();
		fileStream.close();
		System.out.println("Map Serialized");
		
		InputStream inputStream = new FileInputStream("hello.ser");
		ObjectInputStream inputObj = new ObjectInputStream(inputStream);
		System.out.println(inputObj.readObject());
		
		inputObj.close();
		inputStream.close();
		

		
		
		
		//Quest 5- Define a Employee bean with properties empCode, empName, empSalary, empDept.
		//Store 10 employees in ArrayList and sort this arraylist using employee salary.

		List<Employee> employees = new ArrayList<>();
        	employees.add(new Employee(1, "A", 75000, "IT"));
        	employees.add(new Employee(2, "B", 80000, "HR"));
        	employees.add(new Employee(3, "C", 65000, "IT"));
        	employees.add(new Employee(4, "D", 72000, "Marketing"));
        	employees.add(new Employee(5, "D", 78000, "Finance"));
        	employees.add(new Employee(6, "E", 85000, "IT"));
        	employees.add(new Employee(7, "F", 63000, "Marketing"));
        	employees.add(new Employee(8, "G", 80000, "HR"));
        	employees.add(new Employee(9, "H", 74000, "Finance"));
        	employees.add(new Employee(10, "I", 79000, "IT"));
        
        	Collections.sort(employees);
        
        	for (Employee employee : employees) {
        		System.out.println(employee);
        	}

	}

}
