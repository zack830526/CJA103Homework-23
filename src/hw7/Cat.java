package hw7;

import java.io.*;
import java.util.*;

public class Cat implements Serializable {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
