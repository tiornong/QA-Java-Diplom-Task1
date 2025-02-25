package BurgerTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class GetReceiptTest {

    @Test
    public void getReceiptShouldContainCorrectInformation() {
        Bun bun = Mockito.mock(Bun.class);
        Ingredient ingredient1 = Mockito.mock(Ingredient.class);

        Mockito.when(bun.getName()).thenReturn("white bun");
        Mockito.when(bun.getPrice()).thenReturn(200f);

        Mockito.when(ingredient1.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(ingredient1.getName()).thenReturn("chili sauce");

        Burger burger = new Burger();

        burger.setBuns(bun);
        burger.addIngredient(ingredient1);

        String expectedReceipt = "(==== white bun ====)\n" +
                "= sauce chili sauce =\n" +
                "(==== white bun ====)\n\n" +
                "Price: 400,000000\n";

        Assert.assertEquals(expectedReceipt, burger.getReceipt());
    }

    @Test
    public void getReceiptWithNoIngredientsShouldShowOnlyBuns() {
        Bun bun = Mockito.mock(Bun.class);
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(bun.getPrice()).thenReturn(150f);


        Burger burger = new Burger();
        burger.setBuns(bun);

        String expectedReceipt = "(==== black bun ====)\n" +
                "(==== black bun ====)\n\n" +
                "Price: 300,000000\n";

        Assert.assertEquals(expectedReceipt, burger.getReceipt());
    }
}
