import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        // Test 1: Proveravanje osnovne aritmetike
        assertEquals("9.0", Calculator.Calculate("4 + 5"), "4 + 5 treba da bude 9.0");

        // Test 2: Oduzimanje
        assertEquals("5.0", Calculator.Calculate("10 - 5"), "10 - 5 treba da bude 5.0");

        // Test 3: Množenje
        assertEquals("42.0", Calculator.Calculate("7 * 6"), "7 * 6 treba da bude 42.0");

        // Test 4: Deljenje
        assertEquals("5.0", Calculator.Calculate("15 / 3"), "15 / 3 treba da bude 5.0");

        // Test 5: Prioritet operacija
        assertEquals("30.0", Calculator.Calculate("10 + 5 * 4"), "10 + 5 * 4 treba da bude 30.0");

        // Test 6: Zagrade
        assertEquals("5.0", Calculator.Calculate("(3 - 2) * 5"), "(3 - 2) * 5 treba da bude 5.0");

        // Test 7: Nepotpuni izraz
        assertEquals("ERROR", Calculator.Calculate("10 +"), "Nepotpuni izraz treba da vrati ERROR");

        // Test 8: Deljenje sa nulom
        assertEquals("Infinity", Calculator.Calculate("10 / 0"), "Deljenje sa nulom treba da vrati Infinity");
    }
}
