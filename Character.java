// Team RNM: Richard Wang, Nalanda Sharadjaya, Manish Saha
// APCS1 pd9
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16


public class Character {
    protected String name;
    protected int HP, strength, defense;
    protected double attack;

    public boolean isAlive() { // tests for life
	return HP > 0;
    }

    public String getName() {
	return name;
    }

    // accessors (defense)
    
    public int getDefense() {
	return defense;
    }

    // mutators (HP)
    
    public void lowerHP(int damage) {
	HP -= damage;
    }

    public int attack(Character guy) {
	int damage = (int)((strength * attack) - guy.getDefense()); // algo to attack
	if (damage < 0) {
	    damage = 0; // No negative damage
	}
	guy.lowerHP(damage);
	return damage;
    }

    public void normalize() { //default
	defense = 20;
	attack = .75;
    }

    public void specialize() {
	defense = 40;
	attack = .4;
    }

    public static String about() {
        String warrior  = "Warrior: A warrior fights the forces of evil for the good of his/her kingdom.";
        String mage     = "Mage: When he/she requires help, he/she turns to the wise, learned mage for advice.";
	String rogue    = "Rogue: The ruffian of them all. Strong power and will decide their fates.";
	String hunter   = "Hunter: With bow and quiver, they elegantly strike those who cross their path.";
	String guardian = "Guardian: Alas, the bravest of them all, willing to put their lives before those of their comrades.";
	String monster  = "Monster: Among the evils you must fight are monsters, who seek to destroy the kingdom's harmony.";
	return warrior  + "\n" + mage + "\n" + rogue + "\n" + hunter + "\n" + guardian + "\n" + monster;
    }
}
