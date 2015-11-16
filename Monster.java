// Team RNM: Richard Wang, Nalanda Sharadjaya, Manish Saha
// APCS1 pd9
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Monster extends Character {

    public Monster() { // initializes stats
	super();
	name = "monsta";
	HP = 150;
	strength = (int)(Math.random() * 45) + 20; // strength: [20,65)
	defense = 20;
	attack = 1;
    }

    public boolean isAlive() {
        return super.isAlive();
    }

    public int getDefense() {
	return super.getDefense();
    }

    public String getName() {
	return super.getName();
    }

    public void lowerHP(int i) {
        super.lowerHP(i);
    }

    public int attack(Warrior guy) {
        return super.attack(guy);
    }

    public static String about() {
	String monster  = "Monster: Among the evils you must fight are monsters, who seek to destroy the kingdom's harmony.";
	return monster;
    }

}
