import org.example.Functions;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Functions func = new Functions();

    @org.junit.Test
    public void checkAdd() {
        assertEquals(func.Add(5.0, 5.0), 10.0, 0);
    }

    @org.junit.Test
    public void checkSubtract() {
        assertEquals(func.Subtract(5.0, 5.0), 0.0, 0);
    }

    @org.junit.Test
    public void checkMultiply() {
        assertEquals(func.Multiply( 5.0, 5.0), 25.0, 0);
    }

    @org.junit.Test
    public void checkDivide() {
        assertEquals(func.Divide(10.0, 5.0), 2.0, 1e-3);
    }

    @org.junit.Test
    public void checkSquare() {
        assertEquals(func.SquareRoot(4.0), 2.0, 1e-3);
    }
//
//    @org.junit.Test
//    public void checkFactorial() {
//        assertEquals(func.Factorial(5), 120, 0);
//    }
//
//    @org.junit.Test
//    public void checkLogarithm() {
//        assertEquals(func.Logarithm(1), 0.0, 0);
//    }
//
//    @org.junit.Test
//    public void checkPower() {
//        assertEquals(func.Power(2.0, 5.0), 32.0, 0);
//    }
}
