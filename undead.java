public class undead extends enemy {
    public undead() {
       super(" Nemesis",150);
    }

    @Override
    public void attackPlayer() {
    System.out.println(this.enemyName + " is chasing you. Player HP -20");
    }

    public void suaraKhas() {
        System.out.println(this.enemyName + ": AAAAAAAAKHHHH... Let me eat your BRAIN!");
    }
}
