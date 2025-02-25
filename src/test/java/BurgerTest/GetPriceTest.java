package BurgerTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

public class GetPriceTest {

    @Test
    public void  getPriceTest() {
        Bun bun = Mockito.mock(Bun.class);
        Mockito.when(bun.getPrice()).thenReturn(100f);

        Ingredient ingredient1 = Mockito.mock(Ingredient.class);
        Mockito.when(ingredient1.getPrice()).thenReturn(50f);

        Ingredient ingredient2 = Mockito.mock(Ingredient.class);
        Mockito.when(ingredient2.getPrice()).thenReturn(200f);

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);

        float expectedPrice = 100 * 2 + 50 + 200;
        Assert.assertEquals(expectedPrice, burger.getPrice(), 0);
    }
}
