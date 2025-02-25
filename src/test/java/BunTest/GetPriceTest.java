package BunTest;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import utils.Constants;

public class GetPriceTest {

    @Test
    public void getPriceTest(){
        Bun bun = new Bun(Constants.TEST_STRING, Constants.TEST_FLOAT);
        Assert.assertEquals(Constants.TEST_FLOAT, bun.getPrice(), 0);
    }
}
