import java.util.*;
public class CharacterBattle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name1, name2;
        int hitPoints, move, power, speed;
        int hitPoints2, move2, power2, speed2;
        int rounds;
        int score1 = 0, score2 = 0;
        int count = 0;
        Random ran = new Random();


        System.out.println("Enter a odd number of rounds: ");
        rounds = scanner.nextInt();

        while (true) {
            if (rounds % 2 == 1) {
                for (int i = 1; i <= rounds; i++) {
                    count++;
                    System.out.println("Enter a player 1s name: ");
                    name1 = scanner.next();

                    System.out.println("Enter number of hit points: ");
                    hitPoints = scanner.nextInt();

                    System.out.println("Enter number to move: ");
                    move = scanner.nextInt();

                    System.out.println("Enter number of power: ");
                    power = scanner.nextInt();

                    System.out.println("Enter number of attack speed: ");
                    speed = scanner.nextInt();

                    System.out.println("Enter a player 2s name: ");
                    name2 = scanner.next();

                    System.out.println("Enter number of hit points: ");
                    hitPoints2 = scanner.nextInt();

                    System.out.println("Enter number to move: ");
                    move2 = scanner.nextInt();

                    System.out.println("Enter number of power: ");
                    power2 = scanner.nextInt();

                    System.out.println("Enter number of attack speed: ");
                    speed2 = scanner.nextInt();

                    boolean keepGoing = true;

                    while (keepGoing) {
                        if (speed > speed2) {
                            hitPoints2 = hitPoints2 - power;
                            if (hitPoints2 <= 0) {
                                System.out.println(name1 + " wins");
                                score1++;
                                keepGoing = false;
                            } else{
                                hitPoints = hitPoints - power2;
                                if (hitPoints <= 0) {
                                    System.out.println(name2 + " wins");
                                    score2++;
                                    keepGoing = false;
                                }
                            }
                        } else if (speed2 > speed) {
                             hitPoints = hitPoints - power2;
                            if (hitPoints <= 0) {
                                System.out.println(name2 + " wins");
                                score2++;
                                keepGoing = false;
                            } else{
                                hitPoints2 = hitPoints2 - power;
                                if (hitPoints2 <= 0) {
                                    System.out.println(name1 + " wins");
                                    score1++;
                                    keepGoing = false;
                                }
                            }
                        }else{
                            speed = ran.nextInt(0,9);
                            speed2 = ran.nextInt(0, 9);
                        }
                    }




                }
                if( count == rounds){
                    break;
                }




            } else if (rounds % 2 == 0) {
                System.out.println("Enter ODD number of rounds: ");
                rounds = scanner.nextInt();
            }
        }


        System.out.println("Final score for Player 1: " + score1 + "\nFinal Score Player 2: " + score2);
        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score2 > score1) {
            System.out.println("Player 2 wins!");
        }
    }
}

