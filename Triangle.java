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
    private int a;
    private int b;
    private int c;
    
    public Triangle(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    /**
     * Private method to set side C as the largest side for easier calculations.
     */
    private void setCAsMaxSide(){
        int temp=0;
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
    
    public int numberOfSameSides(){
        if(this.isTriangle()==false)
            throw new NotATriangleException();
        if(a==b){
            if(b==c)
                return 3;
            else return 2;
        }
        if(b==c)
            return 2;
        return 0;
        
    }
    public int typeOfTriangle(){
        if(this.isTriangle()==false)
            throw new NotATriangleException();
        this.setCAsMaxSide();
        if(a*a+b*b>c*c)
            return 1;
        else if(a*a+b*b==c*c)
            return 2;
        else return 3;
    }
}
