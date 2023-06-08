import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {
    Calculator calculator = new Calculator();

    @Test
    void additionTest() {


        Assertions.assertEquals(14, calculator.addition(5, 9));
    }

    @Test
    void soustractionTest() {
        Assertions.assertEquals(14, calculator.sousrtaction(20, 6));
    }

    @Test
    void multiplicationTest() {
        Assertions.assertEquals(15, calculator.multiplication(3, 5));
    }

    @Test
    void divisionTest() {

        //3,672727272727273//
        // Assertions.assertEquals(3.6727273f,calculator.divison(20.20f,5.5f));
        //assertTrue(Math.abs(3.672f - calculator.divison(20.20f, 5.5f)) <= 0.1);

        Assertions.assertEquals("ne pas utiliser 0",calculator.divison(18,0));
    }

    @Test
    void exceptingTest() {

       Assertions.assertThrows(ArithmeticException.class, () ->{
           calculator.divison2(20, 0);
        });

    }
}
