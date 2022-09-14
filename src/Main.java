public class Main {
    public static void main(String[] args) {
        Boss NIX = new Boss();
        NIX.setDamage(55);
        NIX.setHealth(660);
        NIX.setTypeDefence("Magic");
        System.out.println("Damage: " + NIX.getDamage());
        System.out.println("Type Defence: " + NIX.getTypeDefence());
        System.out.println("Health: " + NIX.getHealth());


        createHeroes();

        for (int i = 0; i < createHeroes().length ; i++) {
            System.out.println("Damage: "+ createHeroes()[i].getDamage());
            System.out.println("Ability: "+ createHeroes()[i].getAbility());
            System.out.println("Health: "+ createHeroes()[i].getHealth());
        }

    }


    public static Hero[] createHeroes() {
        Hero minerva = new Hero(30, "Magic", 450);
        Hero valmod = new Hero(20, "magic",500);
        Hero saber = new Hero(35, "Critical", 320);

        Hero[] heroes = {minerva, valmod, saber};
        return heroes;
    }

}
