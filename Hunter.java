// Team RNM: Richard Wang, Nalanda Sharadjaya, Manish Saha
// APCS1 pd9
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Hunter extends Character {
    public Hunter() {
	super();
	name = "hunter";
	HP = 100;
	strength = 95;
	defense = 35;
	attack = 0.5;
    }
    
    public Hunter( String name ) {
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
	super.defense = 20;
	super.attack = 0.7;
    }

    public void normalize() { // resets all attributes
	super.defense = 35;
	super.attack = 0.5;
    }

    public static String about() {
	String hunter   = "Hunter: With bow and quiver, they elegantly strike those who cross their path.";
	return hunter;
    }
}
