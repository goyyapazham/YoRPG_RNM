// Team RNM: Richard Wang, Nalanda Sharadjaya, Manish Saha
// APCS1 pd9
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16


public abstract class Character {
    protected String name;
    protected int HP, strength, defense;
    protected double attack;

    public boolean isAlive() { // tests for life
	return HP > 0;
    }

    // accessors (name,defense)
    
    public String getName() {
	return name;
    }
    
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

    // abstract methods
    public abstract void normalize();
    public abstract void specialize();
    public abstract String about();
}
