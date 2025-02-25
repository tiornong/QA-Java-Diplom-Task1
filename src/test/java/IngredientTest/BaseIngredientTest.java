package IngredientTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;
import utils.Constants;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;


@RunWith(Parameterized.class)
public class BaseIngredientTest {

    IngredientType type;

    public BaseIngredientTest(IngredientType type) {
        this.type = type;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {IngredientType.SAUCE},
                {IngredientType.FILLING}
        };
    }

    @Test
    public void constructorTest() {
        try {
            Ingredient ingredient = new Ingredient(type, Constants.TEST_STRING, Constants.TEST_FLOAT);
            assertNotNull("Объект не создался!", ingredient);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
