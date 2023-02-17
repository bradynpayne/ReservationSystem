import java.util.ArrayList;

public class Reservation {
    int num_people;
    int time_made;
    int time_for;
    Reservation(int numm_people, int timeMade, int timeFor) {
        this.num_people = numm_people;
        this.time_made = timeMade;
        this.time_for = timeFor;



    }

    public String toString() {
        return("Time made: " + this.time_made + ". People number: " + this.num_people + ". Time for: " + this.time_for );
    }



}
