package IngredientTypeTest;

import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class TypeIngredientValuesTest {

    @Test
    public void test() {
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

}
