public class slime extends enemy {
    public slime() {
        super(" Rimuru", 50);
    }

    @Override
    public void attackPlayer() {
        System.out.println(this.enemyName + " jump and spray acid! Player HP -15");
    }

    public void suaraKhas() {
        System.out.println(this.enemyName + ": Blubbb, I'll trap you!");
    }
}
