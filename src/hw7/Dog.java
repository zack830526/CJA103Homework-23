package hw7;

import java.io.*;
import java.util.*;

public class Dog implements Serializable {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
