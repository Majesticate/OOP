package unitTesting.rpg_lab;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTest {

    private static final int HEALTH = 10;

    //•	Dummy loses health if attacked.
    //•	Dead Dummy throws exception if attacked.
    //•	Dead Dummy can give XP.
    //•	Alive Dummy can't give XP

    private Dummy aliveDummy;
    private Dummy deadDummy;
    Axe axe;

    @Before
    public void setUp() {
        this.aliveDummy = new Dummy(HEALTH, 100);
        this.deadDummy = new Dummy(0, 100);
        this.axe = new Axe(5, 5);
    }

    @Test
    public void testDummyLosesHealthIfAttacked() {

        axe.attack(aliveDummy);

        Assert.assertEquals(HEALTH - axe.getAttackPoints(), aliveDummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testIsDummyDeadFromAttack() {
        deadDummy.takeAttack(axe.getAttackPoints());
    }

    @Test
    public void testDeadDummyDropHisXP(){
        int experience = deadDummy.giveExperience();
        Assert.assertEquals(experience, deadDummy.giveExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyDoesNotDropXP(){
        aliveDummy.giveExperience();
    }
}