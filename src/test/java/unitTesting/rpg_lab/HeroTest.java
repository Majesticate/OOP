package unitTesting.rpg_lab;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class HeroTest {

    private static final int TARGET_XP = 10;

    @Test
    public void attackGainsExperienceIfTargetIsDead(){
        Weapon fakeWeapon = Mockito.mock(Weapon.class);
        Target fakeTarget = Mockito.mock(Target.class);

        Mockito.when(fakeTarget.isDead()).thenReturn(true);
        Mockito.when(fakeTarget.giveExperience()).thenReturn(TARGET_XP);

        Hero hero = new Hero("Zevz", fakeWeapon);
        hero.attack(fakeTarget);
        Assert.assertEquals("Wrong experience",TARGET_XP,hero.getExperience());
    }
}