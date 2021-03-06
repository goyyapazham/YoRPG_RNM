// Team RNM: Richard Wang, Nalanda Sharadjaya, Manish Saha
// APCS1 pd9
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Rogue extends Character {
    public Rogue() {
	super();
	name = "rogue";
	HP = 130;
	strength = 110;
	defense = 40;
	attack = 0.5;
    }
    
    public Rogue( String name ) {
	this();
	this.name = name;
    }

    public boolean isAlive() { // tests for life
        return super.isAlive();
    }

    // accessors (defense,name)
    
    public int getDefense() {
	return super.getDefense();
    }

    public String getName() {
	return super.getName();
    }

    // mutators (HP)
    
    public void lowerHP(int damage) {
	super.lowerHP(damage);
    }

    public int attack(Monster guy) {
	return super.attack(guy);
    }

    public void specialize() {
	defense = 20;
	attack = 0.7;
    }

    public void normalize() { // resets all attributes
	defense = 40;
	attack = 0.5;
    }

    public String about() {
        return "Rogue: The ruffian of them all. Strong power and will decide their fates.";
    }
}
