package unitTesting.rpg_lab;

import org.junit.Assert;
import org.junit.Test;

public class AxeTest {

    @Test
    public void weaponAttacksLosesDurability() {
        Axe axe = new Axe(10, 10);

        Dummy dummy = new Dummy(100, 100);
        axe.attack(dummy);

        Assert.assertEquals(9, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void durabilityDeficit() {
        Axe axe = new Axe(10, 0);
        Dummy dummy = new Dummy(100, 100);
        axe.attack(dummy);
    }
}