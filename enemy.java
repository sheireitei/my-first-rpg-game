public abstract class enemy {
    protected String enemyName;
    protected int healthPoint;

    public enemy(String nama, int HP) {
        this.enemyName = nama;
        this.healthPoint = HP;
    }

    // Concrete method
    public void takeDamage(int damage) {
        this.healthPoint -= damage;
        System.out.println(this.enemyName + " took damage! HP remaining: " + this.healthPoint);
    }

    // Abstact Method
    public abstract void attackPlayer();
    public abstract void suaraKhas();

}