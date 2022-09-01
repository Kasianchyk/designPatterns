package org.patterns.structural.proxy;


public class Client {

	public static void main(String[] args) {
		Image image = ImageFactory.getImage("store.txt");
		image.setLocation(null);
	}

}
