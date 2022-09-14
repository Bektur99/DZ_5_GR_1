public class Hero {

    private int damage;

    private String ability;

    private  int health;

    public Hero(int damage, String ability, int health) {
        this.damage = damage;
        this.ability = ability;
        this.health = health;

  }
    public Hero(int damage, int health) {
        this.damage = damage;
        this.health = health;
}

    public int getDamage() {
        return damage;
    }

    public String getAbility() {
        return ability;
    }

    public int getHealth() {
        return health;
    }
}
