/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglehomework;

/**
 *
 * @author User
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    
    public Triangle(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    /**
     * Private method to set side C as the largest side for easier calculations.
     */
    private void setCAsMaxSide(){
        double temp=0;
        if((c>a)&&(c>b))
            return;       
        else{ 
            if(c<a){
                temp=a;
                a=c;
                c=a;
            }
            if(c<b){
                temp=b;
                b=c;
                c=b;
            }
        }
    }
            
    public boolean isTriangle(){
        return ((a+b>c)&&(a+c>b)&&(b+c>a));
    }
    
    public int numberOfSameSides() throws NotATriangleException{
        if(this.isTriangle()==false)
            throw new NotATriangleException();
        if((a==b)&&(b==c))
            return 3;
        if((a==b)||(b==c)||(a==c))
            return 2;        
        return 0;
        
    }
    public int typeOfTriangle() throws NotATriangleException{
        if(this.isTriangle()==false)
            throw new NotATriangleException();
        this.setCAsMaxSide();
        if(a*a+b*b>c*c)
            return 1;
        else if(a*a+b*b==c*c)
            return 2;
        else return 3;
    }
    /**
     * Method to print results
     */
    public void explainTriangle() throws NotATriangleException{
        if(this.numberOfSameSides()==0)
            System.out.println("The Triangle has no same sides");
        else if(this.numberOfSameSides()==2)
            System.out.println("The Triangle has two equal sides (icocelies triangle)");
        else
            System.out.println("The Triangle has all equal sides");
        if(this.typeOfTriangle()==1)
            System.out.println("The Triangle is acute");
        else if(this.typeOfTriangle()==2)
            System.out.println("The Triangle is right(has 90 degrees angle)");
        else
            System.out.println("The Triangle is obtuse");
    }
}
