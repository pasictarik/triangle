/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglehomework;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    /**
     * This test will test the method that will return a boolean value true or
     * false, depending on whether we can construct a triangle or not.
     */
    @Test
    public void testIsTriangle1() {
        Triangle t=new Triangle(10,2,1);
        assertEquals(false,t.isTriangle());
    }       
    @Test
    public void testIsTriangle2() {
        Triangle t=new Triangle(3,2,2);
        assertEquals(true,t.isTriangle());
    }
    /**
     * These tests will test the method that will return the number of same sides
     * in a triangle. Values may be 0,2 or 3.
     */
    @Test
    public void testNumberOfSameSides1(){
        Triangle t=new Triangle(3,2,2);
        assertEquals(2,t.numberOfSameSides());
    }
    @Test
    public void testNumberOfSameSides2(){
        Triangle t=new Triangle(3,3,3);
        assertEquals(3,t.numberOfSameSides());
    }
    @Test
    public void testNumberOfSameSides3(){
        Triangle t=new Triangle(3,6,4);
        assertEquals(0,t.numberOfSameSides());
    }
    /**
     * These tests will test the method that will return a certain value depending
     * on whether the triangle is right, acute or obtuse.
     * 1 for acute
     * 2 for right
     * 3 for obtuse
     */
    @Test
    public void testTypeOfTriangle1(){
        Triangle t=new Triangle(3,4,4);
        assertEquals(1,t.typeOfTriangle());
    }
    @Test
    public void testTypeOfTriangle2(){
        Triangle t=new Triangle(3,4,5);
        assertEquals(2,t.typeOfTriangle());
    }
    @Test
    public void testTypeOfTriangle3(){
        Triangle t=new Triangle(3,4,6);
        assertEquals(3,t.typeOfTriangle());
    }
    
    
}
