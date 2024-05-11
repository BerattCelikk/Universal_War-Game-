
import java.util.Scanner;
import java.util.Random;

public class UniversalWar {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);

        int human_special;
        int elf_special;
        int orc_special;
        //LONGSWORD STATUS
        int longsword_health = 2500;
        int longsword_attack = random.nextInt(400) + 100;
        int longsword_defence = 300;
        //ARMORED KNIGHT STATUS
        int armored_health = 3000;
        int armored_attack = random.nextInt(250) + 1;
        int armored_defence = 800;
        //BOSS STATUS
        int boss_health = 6000;
        int boss_attack = random.nextInt(200) + 1;
        int boss_defence = 0;
        //KAMIKAZE STATUS
        int kamikaze_health = 1500;
        int kamikaze_attack = random.nextInt(800) + 300;
        int kamikaze_defence = 0;
        //ARCHER STATUS
        int archer_health = 2000;
        int archer_attack = random.nextInt(500) + 100;
        int archer_defence = 300;
        //TANK STATUS
        int tank_health = 4000;
        int tank_attack = random.nextInt(250) + 1;
        int tank_defence = 500;

        
        System.out.println("Choose your race (Human => h / Orc => o / Elf=> e ) .");
        char race = get.next().charAt(0);

        int player_health = 0;
        int player_attack = 0;
        int player_defence = 0;
        int player_special = 0;

        int enemy_health = 0, enemy_attack = 0, enemy_defence = 0;

        if (race == 'h') {
            System.out.println("You are a human. Choose your role => Longsword(+high damage -low defence) => l  / Armored knight(+high defence +high health -low damage => a");
            char character_role = get.next().charAt(0);
            if (character_role == 'l') {
                player_health = longsword_health;
                player_attack = longsword_attack;
                player_defence = longsword_defence;
                System.out.println("You are Longsword (Human).");
            } else if (character_role == 'a') {
                player_health = armored_health;
                player_attack = armored_attack;
                player_defence = armored_defence;
                System.out.println("You are Armored Knight (Human).");
            }
        } else if (race == 'o') {
            System.out.println("You are an orc. Choose your role => Boss(+extremely health -no defence -low damage) => b  / Kamikaze(+extremely damage -no defence -low health => k");
            char character_role = get.next().charAt(0);
            if (character_role == 'b') {
                player_health = boss_health;
                player_attack = boss_attack;
                player_defence = boss_defence;
                System.out.println("You are Boss (Orc).");
            } else if (character_role == 'k') {
                player_health = kamikaze_health;
                player_attack = kamikaze_attack;
                player_defence = kamikaze_defence;
                System.out.println("You are Kamikaze (Orc).");
            }
        } else if (race == 'e') {
            System.out.println("You are an elf. Choose your role => Archer(+high damage  -low defence) => a  / Tank(+high health  -low damage => t");
            char character_role = get.next().charAt(0);
            if (character_role == 'a') {
                player_health = archer_health;
                player_attack = archer_attack;
                player_defence = archer_defence;
                System.out.println("You are Archer (Elf).");
            } else if (character_role == 't') {
                player_health = tank_health;
                player_attack = tank_attack;
                player_defence = tank_defence;
                System.out.println("You are Tank (Elf).");
            }
        }

        System.out.println("Who do you want to fight against?");
        System.out.println("Human => Longsword => l / Armored knight => a");
        System.out.println("Orc => Boss => b / Kamikaze => k");
        System.out.println("Elf => Archer => e / Tank => t");
        System.out.println("Random => r");
        int character_choose = get.next().charAt(0);
        char enemy_race=0;
        switch (character_choose) {
            case 'l':
                enemy_race='h';
                player_health = longsword_health;
                player_attack = longsword_attack;
                player_defence = longsword_defence;
                System.out.println("Your enemy is Longsword (Human).");
                break;
            case 'a':
                enemy_race='h';
                player_health = armored_health;
                player_attack = armored_attack;
                player_defence = armored_defence;
                System.out.println("Your enemy is Armored Knight (Human).");
                break;
            case 'b':
                enemy_race='o';
                player_health = boss_health;
                player_attack = boss_attack;
                player_defence = boss_defence;
                System.out.println("Your enemy is Boss (Orc).");
                break;
            case 'k':
                enemy_race='o';
                player_health = kamikaze_health;
                player_attack = kamikaze_attack;
                player_defence = kamikaze_defence;
                System.out.println("Your enemy is Kamikaze (Orc).");
                break;
            case 'e':
                enemy_race='e';
                player_health = archer_health;
                player_attack = archer_attack;
                player_defence = archer_defence;
                System.out.println("Your enemy is Archer (Elf).");
                break;
            case 't':
                enemy_race='e';
                player_health = tank_health;
                player_attack = tank_attack;
                player_defence = tank_defence;
                System.out.println("Your enemy is Tank (Elf).");
                break;
            case 'r':
                char[] characters = {'l', 'a', 'b', 'k', 'e', 't'};
                character_choose = characters[random.nextInt(characters.length)];
                switch (character_choose) {
                    case 'l':
                        enemy_race='h';
                        enemy_attack = longsword_attack;
                        enemy_health = longsword_health;
                        enemy_defence = longsword_defence;
                        System.out.println("Your enemy is Longsword (Human).");
                        break;
                    case 'a':
                        enemy_race='h';
                        enemy_attack = armored_attack;
                        enemy_health = armored_health;
                        enemy_defence = armored_defence;
                        System.out.println("Your enemy is Armored Knight (Human).");
                        break;
                    case 'b':
                        enemy_race='o';
                        enemy_attack = boss_attack;
                        enemy_health = boss_health;
                        enemy_defence = boss_defence;
                        System.out.println("Your enemy is Boss (Orc).");
                        break;
                    case 'k':
                        enemy_race='o';
                        enemy_attack = kamikaze_attack;
                        enemy_health = kamikaze_health;
                        enemy_defence = kamikaze_defence;
                        System.out.println("Your enemy is Kamikaze (Orc).");
                        break;
                    case 'e':
                        enemy_race='e';
                        enemy_attack = archer_attack;
                        enemy_health = archer_health;
                        enemy_defence = archer_defence;
                        System.out.println("Your enemy is Archer (Elf).");
                        break;
                    case 't':
                        enemy_race='e';
                        enemy_attack = tank_attack;
                        enemy_health = tank_health;
                        enemy_defence = tank_defence;
                        System.out.println("Your enemy is Tank (Elf).");
                        break;
                }
                break;
            default:
                System.out.println("Invalid character choice.");
        }
        int counter = 1; 
        int counter2=1;
        boolean player_turn=true;
        do {
            if(player_turn){
                System.out.println("CHOOSE YOUR ABILITY .");
                System.out.println("ATTACK => a / DEFENCE => d /Mana => m /Wait => w / Special = s :");
                char ability = get.next().charAt(0);
    
                if (ability == 'a') {
                    if (enemy_defence > 0) {
                        if (enemy_defence < player_attack) {
                            System.out.println("You hit " + player_attack + " damage !");
                            enemy_health -= (player_attack/2 - enemy_defence);
                            enemy_defence = 0;
                        } else {
                            System.out.println("You hit " + player_attack/2 + " damage to armor !");
                            enemy_defence -= player_attack / 2;
                        }
                    } else {
                        System.out.println("You hit !" + player_attack + " damage !");
                        enemy_health -= player_attack;
                    }
                } else if (ability == 'd') {
                    int defence_increase = random.nextInt(100) + 10;
                    System.out.println("you gained " + defence_increase + " armor !");
                    player_defence += defence_increase;
                } else if (ability == 'm') {
                    int damage_increase = random.nextInt(50) + 10;
                    System.out.println("You gained " + damage_increase + " attack power !");
                    player_attack += damage_increase;
                } else if (ability == 'w') {
                    int health_increase = random.nextInt(100) + 10;
                    System.out.println("You gained " + health_increase + " Health !");
                    player_health += health_increase;
                    counter++;
                } else if (ability == 's') {
                    if (counter % 4 == 0) {
                        if (race == 'e') {
                            int sp2 = random.nextInt(1000) + 300;
                            System.out.println("YOU USED ELF SPECIAL (Blessing) !! ");
                            player_health += sp2;
                            System.out.println("You gained " + sp2 + " health !!");
                        } else if (race == 'o') {
                            System.out.println("YOU USED ORC SPECIAL (Victory Shout) !! ");
                            enemy_defence =0;
                            System.out.println("The enemy defence has been reset  !!");
                        } else if (race == 'h') {
                            System.out.println("YOU USED HUMAN SPECIAL (triple shot)!! ");
                            int turn = 3;
                            while (turn != 0) {
                                if (enemy_defence > 0) {
                                    if (enemy_defence < player_attack) {
                                        System.out.println("You hit " + player_attack + " damage !");
                                        enemy_health -= (player_attack - enemy_defence);
                                        enemy_defence = 0;
                                    } else {
                                        System.out.println("You hit " + player_attack + " damage !");
                                        enemy_defence -= player_attack;
                                    }
                                } else {
                                    System.out.println("You hit !" + player_attack + " damage !");
                                    enemy_health -= player_attack;
                                }
                                turn--;
                            }
                        }
                        counter = 1; 
                    } else {
                        System.out.println("You cannot use special !  " + counter + "/4");
                        continue; 
                    }
                }
                System.out.println();
                System.out.println("Player Stats:");
                System.out.println("Health: " + player_health);
                System.out.println("Attack: " + player_attack);
                System.out.println("Defence: " + player_defence);
                System.out.println();
            }
            else{
                char[] enemy_ability = {'a', 'd', 'm','w','s'};
                char randomability = enemy_ability[random.nextInt(enemy_ability.length)];
                if (randomability == 'a') {
                    if (player_defence > 0) {
                        if (player_defence < enemy_attack) {
                            System.out.println("Enemy hit " + enemy_attack + " damage !");
                            player_health -= (enemy_attack/2 - player_defence);
                            player_defence = 0;
                        } else {
                            System.out.println("Enemy hit " + enemy_attack/2 + " damage to armor !");
                            player_defence -= enemy_attack / 2;
                        }
                    } else {
                        System.out.println("Enemy hit " + enemy_attack + " damage !");
                        player_health -= enemy_attack;
                    }
                } else if (randomability == 'd') {
                    int defence_increase2 = random.nextInt(100) + 10;
                    System.out.println("Enemy gained " + defence_increase2 + " armor !");
                    enemy_defence += defence_increase2;
                } else if (randomability == 'm') {
                    int damage_increase2 = random.nextInt(50) + 10;
                    System.out.println("Enemy gained " + damage_increase2 + " attack power !");
                    enemy_attack += damage_increase2;
                }else if(randomability=='w'){
                    int health_increase2 = random.nextInt(100) + 10;
                    System.out.println("Enemy gained " + health_increase2 + " Health !");
                    enemy_health += health_increase2;
                    counter2++;
                }else if(randomability=='s'){
                    if (counter2 % 4 == 0) {
                        if (enemy_race == 'e') {
                            int sp3 = random.nextInt(2500) + 1200;
                            System.out.println("ENEMY USED ELF SPECIAL (Blessing) !! ");
                            enemy_health += sp3;
                            System.out.println("Enemy gained " + sp3 + " health !!");
                        } else if (enemy_race == 'o') {
                            System.out.println("ENEMY USED ORC SPECIAL (Victory Shout) !! ");
                            player_defence =0;
                            System.out.println("Your defence has been reset  !!");
                        } else if (enemy_race == 'h') {
                            System.out.println("ENEMY USED HUMAN SPECIAL (triple shot)!! ");
                            int turn2 = 3;
                            while (turn2 != 0) {
                                if (player_defence > 0) {
                                    if (player_defence < enemy_attack) {
                                        System.out.println("You hit " + enemy_attack + " damage !");
                                        player_health -= (enemy_attack - player_defence);
                                        player_defence = 0;
                                    } else {
                                        System.out.println("You hit " + enemy_attack + " damage !");
                                        player_defence -= enemy_attack;
                                    }
                                } else {
                                    System.out.println("You hit !" + enemy_attack + " damage !");
                                    player_health -= enemy_attack;
                                }
                                turn2--;
                            }
                        }
                        counter2 = 1; 
                    }
                }
                System.out.println();
                System.out.println("Enemy Stats:");
                System.out.println("Health: " + enemy_health);
                System.out.println("Attack: " + enemy_attack);
                System.out.println("Defence: " + enemy_defence);
                System.out.println();
            }
            player_turn=!player_turn;

        } while (enemy_health > 0 && player_health > 0);

        if (enemy_health <= 0) {
            System.out.println("YOU WON");
        } else if (player_health <= 0) {
            System.out.println("YOU LOSE");
        }
    }
}
