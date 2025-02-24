package IngredientTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;
import utils.Constants;

@RunWith(Parameterized.class)
public class GetTypeTest {

    IngredientType type;

    public GetTypeTest(IngredientType type) {
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
    public void getTypeTest(){
        Ingredient ingredient = new Ingredient(type, Constants.TEST_STRING, Constants.TEST_FLOAT);
        Assert.assertEquals(type, ingredient.getType());
    }

}
