import java.util.ArrayList;

public class Reservation {
    int num_people;
    int time_made;
    int time_for;
    String name;
    Reservation(int numm_people, int timeMade, int timeFor, String Name) {
        this.num_people = numm_people;
        this.time_made = timeMade;
        this.time_for = timeFor;
        this.name = Name;
    }

    public String toString() {
        return("Name: " + this.name + ". People number: " + this.num_people + ". Time for: " + this.time_for + ". Time Made: " + this.time_made + ".");
    }
}

