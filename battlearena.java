import java.util.Scanner;

public class battlearena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        enemy[] monsterWave = new enemy[4];
        monsterWave[0] = new slime();
        monsterWave[1] = new dragon();
        monsterWave[2] = new slime();
        monsterWave[3] = new undead();

        System.out.println("=============================================");
        System.out.println("           ARENA RPG: MONSTER WAVE ");
        System.out.println("=============================================");
        System.out.println(" WATCH OUT! A group of monsters ambushes you! ");

        boolean isPlaying = true;

        while (isPlaying) {
            System.out.println("\n--- MONSTER'S STATUS ---");
            for (int i = 0; i < monsterWave.length; i++) {
                 System.out.println((i + 1) + "."
                 + monsterWave[i].enemyName + " (HP: "
                 + monsterWave[i].healthPoint + ")");
            }
         
            System.out.println("5. Escaped from the battle");
            System.out.println("\nChoose a target to attack (1/2/3/4) or 5 to escape");
            int pilihanTarget = input.nextInt();

            if (pilihanTarget == 5) {
                System.out.println("\nYou escaped from the battle");
                isPlaying = false;
                continue;
            }

            if (pilihanTarget < 1 || pilihanTarget > 4) {
                System.out.println("Invalid choice! You lose your turn.");
            } else {
                System.out.println("Enter your attack power (1-100): ");
                int power = input.nextInt();

                System.out.println("\n>>> YOUR ATTACK RESULT <<<");
                int indexMonster = pilihanTarget - 1;
                monsterWave[indexMonster].takeDamage(power);
            }

            System.out.println("\n MONSTER'S TURN");
            for (int i = 0; i < monsterWave.length; i++) {
            if (monsterWave[i].healthPoint > 0) {
                monsterWave[i].suaraKhas();

                monsterWave[i].attackPlayer();
            } else {
                System.out.println(monsterWave[i].enemyName + " has slain and cannot attack.");
            }
            }
            System.out.println("-----------------------------------------------------");
        }
        input.close();
        System.out.println("The game has ended.");
    }
}
