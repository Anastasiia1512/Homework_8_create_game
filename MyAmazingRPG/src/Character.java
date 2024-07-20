public class Character {
    String name;
    int health;
    int strength;
    int defense;
    static int characterCount =0;

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        characterCount++;
    }
    public void attack(Character other){
        int damage = Math.max(strength - other.defense, 0);
        other.takeDamage(damage);
        System.out.println(this.name +"атакував"+ other.name+ "і завдав"+ damage +"шкоди");
    }
    public void takeDamage (int damage) {
        this.health -= damage;
        if (this.health <0){
            this.health =0;
        }
    }
    public boolean isAlive() {
        return this.health >0;
    }
    public void displayStatus(){
        System.out.println(this.name +"Здоров'я"+ this.health+ "Сила"+this.strength+ "Захист"+this.defense);
    }
    public static int getCharacterCount(){
        return characterCount;
    }
}
