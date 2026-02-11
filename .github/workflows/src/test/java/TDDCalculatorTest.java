/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import come.test.testcalculator.TestCalculator;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author kaput
 */
public class TDDCalculatorTest {
    
    @Test
    public void testDivideTwoPositiveNumbers()
    {
        TestCalculator calc = new TestCalculator();
        double result = calc.Divide(12,2);
        assertEquals(6,result);x
    }
    
    @Test
    public void testDivideByZero()
    {
        TestCalculator calc = new TestCalculator();
        double result = calc.Divide(0,0);
        Assertions.assertThrows(ArithmeticException.class, () ->calc.Divide(6, 0));
    }
}
