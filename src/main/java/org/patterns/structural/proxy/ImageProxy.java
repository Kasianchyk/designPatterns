package org.patterns.structural.proxy;


//Proxy class.
public class ImageProxy implements Image {

    private BitmapImage image;
    private String name;

    private String location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(String point2d) {
        if (image != null) {
            image.setLocation(point2d);
        } else {
            this.location = point2d;
        }
    }

    @Override
    public String getLocation() {
        if (image != null) {
            return image.getLocation();
        }
        return location;
    }

    @Override
    public void render() {
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }
        image.render();
    }
}
