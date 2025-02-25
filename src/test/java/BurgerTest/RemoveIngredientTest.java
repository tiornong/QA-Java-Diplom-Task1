package BurgerTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import praktikum.Burger;
import praktikum.Ingredient;

public class RemoveIngredientTest {

    @Test
    public void removeIngredientTest(){
        Ingredient ingredient = Mockito.mock(Ingredient.class);
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals(0, burger.ingredients.size());
    }
}
