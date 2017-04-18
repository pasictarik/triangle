/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglehomework;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TriangleHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Triangle app");
        Scanner s=new Scanner(System.in);
        while(true)
            try{
                System.out.println("Enter sides of the triangle");
                double a,b,c;
                a=s.nextDouble();
                b=s.nextDouble();
                c=s.nextDouble();
                Triangle t=new Triangle(a,b,c);
                t.explainTriangle();
                break;
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("Invalid input, try again");
            }
    }
    
}
