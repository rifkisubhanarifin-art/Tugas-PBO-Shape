/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main (String args[]){
         // Buat array of Shapes (polymorphism)
        Shape[] shapes = {
            new Circle(5.0),
            new Rectangle(4.0, 6.0),
            new Circle(3.5),
            new Rectangle(2.5, 3.0)
        };
        
        // Tampilkan luas dan gambar setiap shape
        for (Shape shape : shapes) {
            System.out.println("Area: " + String.format("%.2f", shape.getArea()));
            
            // Check jika shape adalah Drawable
            if (shape instanceof Drawable) {
                Drawable drawableShape = (Drawable) shape;
                drawableShape.draw();
            }
            System.out.println("----------------------");
        }
    }
    }