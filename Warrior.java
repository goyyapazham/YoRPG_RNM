// Team RNM: Richard Wang, Nalanda Sharadjaya, Manish Saha
// APCS1 pd9
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-13

public class Warrior extends Character {

    public Warrior() { // initializes stats
	super();
	name = "warrior";
	HP = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }
    
    public Warrior( String name ) {
	this();
	super.name = name;
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
	super.specialize();
    }

    public void normalize() { // resets all attributes
        super.normalize();
    }

}
