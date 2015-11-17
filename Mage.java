// Team RNM: Richard Wang, Nalanda Sharadjaya, Manish Saha
// APCS1 pd9
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Mage extends Character {
    public Mage() {
	super();
	name = "mage";
	HP = 90;
	strength = 110;
	defense = 30;
	attack = 0.3;
    }
    
    public Mage( String name ) {
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
	defense = 15;
	attack = 0.6;
    }

    public void normalize() { // resets all attributes
	defense = 30;
	attack = 0.3;
    }

    public String about() {
	return "Mage: When he/she requires help, he/she turns to the wise, learned mage for advice.";
    }

}
