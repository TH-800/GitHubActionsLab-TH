/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package come.test.testcalculator;

/**
 *
 * @author kaput
 */
public class TestCalculator {

   public double Divide(double x, double y)
   {
       double result = x/y;
       if (x ==0)
       {
           throw new ArithmeticException("Cant divide by 0");
       }
       if (y ==0)
       {
           throw new ArithmeticException("Cant divide by 0");
       }
       else
       {
           return result;
       }

       // or you can do this
       // return x/y
   }
}
