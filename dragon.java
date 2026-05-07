public class dragon extends enemy {
    public dragon() {
        super(" Yu Zhong", 500);
    }
    
    @Override
    public void attackPlayer() {
    System.out.println(this.enemyName + " Breathes out flames from the air. Player HP -50");
    }

    public void suaraKhas() {
        System.out.println(this.enemyName + ": I will be the truth this world desperately needs.");
    }
}
