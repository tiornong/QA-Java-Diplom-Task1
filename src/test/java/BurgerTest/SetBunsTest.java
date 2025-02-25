package BurgerTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import praktikum.Bun;
import praktikum.Burger;

public class SetBunsTest {

    @Test
    public void setBunsTest(){
        Bun bunMock = Mockito.mock(Bun.class);

        Burger burger = new Burger();
        burger.setBuns(bunMock);
        Assert.assertSame(bunMock, burger.bun);
    }

}
