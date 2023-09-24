import java.util.*;
public class Homework4 {
    /**
     * 
     * @author Joshua Clarke
     * All Code for Programming Homework #4
     * Homework #4 creates two classes, one to store information of contestants in a race, and the other
     * to store information about each race. Contestants are held in an array in the race class. The program
     * then populates each race with a name, time, and contestant data then stores the race data in a schedule
     * array to be printed.
     */

    //Race class sets name and time of race, holds entrants to the race in an array
    public static class Race {
    String name;
    String time;
    ArrayList<HorseEntry> entries = new ArrayList();

    //makes Race schedule look nice and actually print the data we want
    @Override
    public String toString() {
        return name.toString() + " - " + time.toString() + "\n" + entries.toString().replace(",", "").replace("[", "").replace("]", "") + "\n" ;
    }
    }

    //HorseEntry stores contestant data (horse name, jockey name, and jockey weight), to be added to entries array
    public static class HorseEntry {
        String HorseName;
        String JockeyName;
        double JockeyWeightlb;

    // makes each entry look pretty when Race class is printed
        @Override
    public String toString() {
        return "\nHorse: " + HorseName.toString() + "\nJockey: " + JockeyName.toString() + "\nJockey Weight: " + JockeyWeightlb + " lbs\n";
    }
        }

    public static void main(String args[])
    {
    //creating contestants 
    HorseEntry jim = new HorseEntry();
    jim.HorseName = "Jim";
    jim.JockeyName = "Jimmothy";
    jim.JockeyWeightlb = 150;

    HorseEntry seab = new HorseEntry();
    seab.HorseName = "Seabiscuit";
    seab.JockeyName = "Red Pollard";
    seab.JockeyWeightlb = 170;

    HorseEntry secr = new HorseEntry();
    secr.HorseName = "Secreteriat";
    secr.JockeyName = "Ron Turcotte";
    secr.JockeyWeightlb = 180;

    HorseEntry thed = new HorseEntry();
    thed.HorseName = "Theodore";
    thed.JockeyName = "Jerome Thumpington";
    thed.JockeyWeightlb = 350;

    //creating races and adding contestants to those races 
    Race race1 = new Race();
    race1.name = "RACE 1";
    race1.time = "11:00 June 1, 2021";
    race1.entries.add(jim);
    race1.entries.add(seab);

    Race race2 = new Race();
    race2.name = "RACE 2";
    race2.time = "13:00 June 1, 2021";
    race2.entries.add(secr);
    race2.entries.add(thed);

    Race race3 = new Race();
    race3.name = "RACE 3";
    race3.time = "15:00 June 1, 2021";
    race3.entries.add(jim);
    race3.entries.add(seab);
    race3.entries.add(secr);

    //adding races to schedule array
    ArrayList<Race> schedule = new ArrayList<Race>();
    schedule.add(race1);
    schedule.add(race2);
    schedule.add(race3);

    //printing schedule array
    for(int i = 0; i < schedule.size(); i++) {   
        System.out.println(schedule.get(i));
    }
    
    }
}