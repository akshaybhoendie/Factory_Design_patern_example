package com.qualogy.shape;

import com.qualogy.shape.impl.Shape;

/**
 * Created by abhoendie on 9/14/2017.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
