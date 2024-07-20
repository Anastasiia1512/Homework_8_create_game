public class Main {
    public static void main(String[] args) {
        Character superman = new Character("Superman", 150, 80,20);
        Character spiderman  = new Character ("Spiderman", 200,90,30);

        while(superman.isAlive() && spiderman.isAlive()){
            superman.attack(spiderman);
            spiderman.attack(superman);
            superman.displayStatus();
            spiderman.displayStatus();
            System.out.println();
        }
        if (superman.isAlive()) {
            System.out.println(superman.name +"переміг");
        }
        else if (spiderman.isAlive()) {
            System.out.println(spiderman.name +"переміг");
        }
        System.out.println("Загальна кількість персонажів"+Character.getCharacterCount());

    }
}