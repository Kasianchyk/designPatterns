package org.patterns.creational.simplefactory;

import java.text.NumberFormat;

public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("product");

	}

}
