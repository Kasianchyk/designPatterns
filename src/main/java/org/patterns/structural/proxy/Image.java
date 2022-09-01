package org.patterns.structural.proxy;


//Interface implemented by proxy and concrete objects
public interface Image {

	void setLocation(String point2d);
	
	String getLocation();
	
	void render();
	
}
