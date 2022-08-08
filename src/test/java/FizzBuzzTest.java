import org.example.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup () {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldReturnNumberIfCannotDivideBy3Or5(){
        List<String> result = fizzBuzz.range(1,2);
        assertEquals(List.of("1","2"), result);
    }

    @Test
    void shouldReturnNumberAndFizzIfDivideByThree(){
        List<String> result = fizzBuzz.range(1, 3);
        assertEquals(List.of("1","2", "Fizz"), result);
    }

    @Test
    void shouldReturnFizzIfDivideBy3(){
        String result = fizzBuzz.say(3);
        assertEquals("Fizz", result);
    }
}
