package BunTest;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import utils.Constants;

public class GetNameTest {

    @Test
    public void getNameTest() {
        Bun bun = new Bun(Constants.TEST_STRING, Constants.TEST_FLOAT);
        Assert.assertEquals(Constants.TEST_STRING, bun.getName());
    }

}
