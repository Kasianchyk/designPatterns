package org.patterns.structural.proxy;

//Our concrete class providing actual functionality
public class BitmapImage implements Image {
	
	private String location;
	private String name;
	
	public BitmapImage(String filename) {
		//Loads image from file on disk
		System.out.println("Loaded from disk:"+filename);
		name = filename;
	}
	
	@Override
	public void setLocation(String point2d) {
		location = point2d;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public void render() {
		//renders to screen
		System.out.println("Rendered "+this.name);
	}
	
}
