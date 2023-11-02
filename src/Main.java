public class Main {
    public static void main(String[] args) {


        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Орда варваров");


        System.out.println("BOSS INFO :");
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defence: " + boss.getDefenseType());
    }


}