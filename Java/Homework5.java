import java.util.*;
public class Homework5 {
/**
     * 
     * @author Joshua Clarke
     * Homework5 is a planet finder game. The user is given a 3 billion x 3 billion x 3 billion mile
     * area to search for new planets for humans to colonize. The user is prompted to enter x,y,z coordinates
     * from 1 to 3 to search each 1 billion x 1 billion x 1 billion mile cube of space for a planet. The 
     * game keeps going until the user finds an inhospitable planet or finds all of the habitable planets.
     */



    public static void main(String args[]) { 
        boolean lost = false;
        int planetcount = 0;
        int turns = -1;
        Scanner scan = new Scanner(System.in);
        int [][][] map = new int[3][3][3];
        //uses nested for loops to populate 3d array with 0s, 1s, and 2s
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                for (int z = 0; z < map[y].length; z++) {
                map[x][y][z] = (int)(Math.random()*3);
            }
        }
    }
    //menu prompts the user to enter coordinates of where they think there might be a habitable planet
    while (lost == false) {
        int count = 0;
        System.out.println("\nWelcome to Planet Finder!");
        System.out.println("You have been tasked with finding habitable planets! Find as many as possible but be careful, \nif you send your team to an inhospitable planet they will die!");
        System.out.println("You have been assigned a 3 billion x 3 billion x 3 billion mile area of space to search, enter \nx\ny\nz\n coordinates of (1-3) to search for a viable planet");
        //this basically allows for user to input numbers 1-3 to represent x,y,x rather than 0-2
        int ex = scan.nextInt();
        int x = ex-1;
        int wy = scan.nextInt();
        int y = wy-1;
        int zee = scan.nextInt();
        int z = zee-1;
        //if-else to check if a planet is habitable, 0 = empty space, 1 = a habitable planet, 2 = an inhospitable planet, 3 = an area already searched
        if (map[x][y][z] == 1) {
            System.out.println("Congratulations! You found a habitable planet, human settlers will be sent shortly.");
            planetcount ++;
            map[x][y][z] = 3;
        } else if (map[x][y][z] == 2) {
            System.out.println("That planet is inhospitable, your team tried to explore the surface and died!");
            lost = true;
        } else if (map[x][y][z] == 3) {
            System.out.println("You already searched there.");
        } else {
            System.out.println("There is no planet there!");
            map[x][y][z] = 3;
        }
        turns++;
        //checks to see if user has found all habitable planets 
        for (x = 0; x < map.length; x++) {
            for (y = 0; y < map[x].length; y++) {
                for (z = 0; z < map[y].length; z++) {
                    if (map[x][y][z] != 1) {
                        count++;
                        if (count == 27) {
                            System.out.println("You have found all of the habitable planets!");
                            lost = true;
                        }
                    }
            }
        }
    }
        System.out.println(Arrays.deepToString(map));
    }
    //final stats printed at the end of the game
    System.out.println("\nThanks for playing!");
    System.out.println("You found " + planetcount + " habitable planets!");
    System.out.println("You survived " + turns + " turns!");
    }
}
