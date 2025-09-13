/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape implements Drawable {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    //Override dari Shape
    public double getArea(){
         return Math.PI * radius * radius;
    }
    public void draw(){
        System.out.println("Gambar lingkaran dengan radius: " + radius);
    }
}
