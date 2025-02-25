package IngredientTypeTest;

import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class TypeIngredientOrderTest {

    @Test
    public void test() {
        assertEquals(0, IngredientType.SAUCE.ordinal());
        assertEquals(1, IngredientType.FILLING.ordinal());
    }
}
