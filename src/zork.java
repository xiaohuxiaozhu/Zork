import java.util.*;

public class zork {

    private static int roomVisited = 0;


    private static int goToRoom = -1;


    private static Random random = new Random();


    public static void main(String[] args) {
        boolean continueGame = true;


        Scanner sc = new Scanner(System.in);


        String roomName[] = {
                "outside",
                "foyer",
                "front room",
                "library", "kitchen",
                "dinning room",
                "vault",
                "parlor",
                "secret room"};


        System.out.println("Welcome to play zork game: Do you want to play?");
        String answer = sc.nextLine();
        char direction = answer.charAt(0);

        if (direction == 'Y' || direction == 'y') {
            goToRoom += 1;
            while (continueGame) {


                if (goToRoom == 0) {
                    System.out.println("You are in the outside.");

                int random2=random.nextInt(4);
                if ( random2 == 1 && roomVisited > 0) {
                    System.out.println("You are followed by a ghost.");
                }}
                else if (goToRoom == 1)
                    System.out.println("You are in the foyer.");
                else if (goToRoom == 2)
                    System.out.println("You are in the front room. ");
                else if (goToRoom == 3)
                    System.out.println("You are in the library");
                else if (goToRoom == 4)
                    System.out.println("You are in the kitchen.");
                else if (goToRoom == 5)
                    System.out.println("You are in the dinning room.");
                else if (goToRoom == 6)
                    System.out.println("You are in the vault.");
                else if (goToRoom == 7)
                    System.out.println("You are in the parlor.");
                else
                    System.out.println("You are in the secret room.");







                System.out.println("Which direction you would like to go? (N,W,E,S)or Q to Quit");
                answer = sc.nextLine();
                direction = answer.charAt(0);

                if (direction == 'Q' || direction == 'q') {

                    goToRoom = -1;

                }

                switch (goToRoom) {


                    case 0:
                        outsideHouse(direction);
                        break;
                    case 1:
                        foyer(direction);
                        break;
                    case 2:
                        frontRoom(direction);
                        break;
                    case 3:
                        library(direction);
                        break;
                    case 4:
                        kitchen(direction);
                        break;
                    case 5:
                        diningRoom(direction);
                        break;
                    case 6:

                        vault(direction);

                       break;
                    case 7:
                        parlor(direction);
                        break;
                    case 8:
                        secretRoom(direction);
                        break;

                    default:
                        System.out.println("Good bye!");
                        System.out.println("You vistied this number of rooms: " + roomVisited);
                        continueGame = false;
                        break;


                }
            }

        }

    }

    private static void outsideHouse(char direction) {

        switch (direction) {
            case 'N':
            case 'n':

                roomVisited++;
                goToRoom = 1;
                break;
            default:

                goToRoom = 0;
                break;

        }
    }

    private static void foyer(char direction) {



        switch (direction) {
            case 'N':
            case 'n':
                roomVisited++;
                goToRoom = 2;
                break;

            case 'S':
            case 's':
                goToRoom = 0;
                    break;


            default:

                goToRoom = 1;
                break;


        }
    }

    private static void frontRoom(char direction) {


        switch (direction) {
            case 'W':
            case 'w':
                roomVisited++;
                goToRoom = 3;
                break;

            case 'E':
            case 'e':
                roomVisited++;
                goToRoom = 4;
                break;

            case 'S':
            case 's':
                roomVisited++;
                goToRoom = 1;
                break;

            default:

                goToRoom = 2;
                break;
        }

    }

    private static void library(char direction) {

        switch (direction) {
            case 'E':
            case 'e':
                roomVisited++;
                goToRoom = 2;
                break;

            case 'N':
            case 'n':
                roomVisited++;
                goToRoom = 5;
                break;

            default:

                goToRoom = 3;
                break;

        }
    }

    private static void kitchen(char direction) {

        switch (direction) {
            case 'W':
            case 'w':
                roomVisited++;
                goToRoom = 2;
                break;

            case 'N':
            case 'n':
                roomVisited++;
                goToRoom = 7;
                break;
            default:

                goToRoom = 4;
                break;
        }
    }

    private static void diningRoom(char direction) {


        switch ((direction)) {
            case 'S':
            case 's':
                roomVisited++;
                goToRoom = 3;
                break;
            default:

                goToRoom = 5;
                break;

        }
    }

    private static void vault(char direction) {


        switch (direction) {
            case 'E':
            case 'e':

                int random1 = random.nextInt(4) + 1;

                if (random1 == 1) {


                    goToRoom = 8;
                    roomVisited++;
                    break;

                }


                roomVisited++;
                goToRoom = 7;
                break;

            default:

                goToRoom = 6;
                break;

        }
    }

    private static void parlor(char direction) {


        switch (direction) {
            case 'S':
            case 's':
                roomVisited++;
                goToRoom = 4;
                break;

            case 'W':
            case 'w':
                roomVisited++;
                goToRoom = 6;
                break;

            default:

                goToRoom = 7;
                break;

        }
    }


    private static void secretRoom(char direction) {


        switch (direction) {
            case 'W':
            case 'w':
                roomVisited++;
                goToRoom = 6;
                break;
            default:

                goToRoom = 8;
                break;


        }

    }
}



