package BunTest;

import org.junit.Test;
import praktikum.Bun;
import utils.Constants;

import static org.junit.Assert.*;

public class BaseBunTest {

    @Test
    public void constructorTest() {
        try {
            Bun bun = new Bun(Constants.TEST_STRING, Constants.TEST_FLOAT);
            assertNotNull("Объект не создался!", bun);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
