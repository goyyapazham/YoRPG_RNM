// Team RNM: Richard Wang, Nalanda Sharadjaya, Manish Saha
// APCS1 pd9
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16

public class Guardian extends Character {
 
    public Guardian() {
	super();
	name = "guardian";
	HP = 200;
	strength = 45;
	defense = 80;
	attack = 0.2;
    }
    
    public Guardian( String name ) {
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
	super.defense = 100;
	super.attack = 0.1;
    }

    public void normalize() { // resets all attributes
	super.defense = 80;
	super.attack = 0.2;
    }

    public String about() {
        return "Guardian: Alas, the bravest of them all, willing to put their lives before those of their comrades.";
    }
}
