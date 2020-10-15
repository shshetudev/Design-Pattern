package Factory_Pattern;

import Factory_Pattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle");
    }
}
