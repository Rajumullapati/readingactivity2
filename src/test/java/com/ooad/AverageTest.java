package com.ooad;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.jupiter.api.Assertions.*;

public class AverageTest extends TestCase{

    Average avg = new Average();

    public void testAverageBasic(){
        int[] list = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int avg = 2;
        int result = this.avg.average(k, list);
        assertTrue(result == avg);
     }

     public void testAverageKGreater(){
        int[] list = new int[]{1,2,3,4,5,6,7};
        int k = 4;
        int avg = (1+2+3+4)/4;
        int result = this.avg.average(k, list);
        assertTrue(result == avg);
     }


     public void testAverageKLesser(){
        int[] list = new int[]{1,2,3,4,5,6,7};
        int k = 10;
        int avg = 28/7;
        int result = this.avg.average(k, list);
        assertTrue(result == avg);
     }

     public void testAverageDivideByZero(){
        int[] list = new int[]{1,2,3,4,5,6,7};
        int k = 0;
        assertTrue(0 == this.avg.average(k, list));
     }

     public void testAverageDecimal(){
        int[] list = new int[]{1,2,3,3,4,5,6,7};
        int k = 4;
        double avg = 2.25;
        System.out.println(avg);
        assertTrue(avg == this.avg.average(k, list));
     }
}
 