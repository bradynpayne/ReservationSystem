import java.util.ArrayList;
import java.util.Scanner;



public class ReservationList {
    ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    ReservationList() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        while(true) {
            System.out.println(""); // Better way to do this?
            System.out.println("Press one to make a reservation, two to print out current reservations, three to delete a reservation,");
            System.out.println("and four to change the size of a reservation.");
            int choice = myObj.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Making reservation.");
                    System.out.println("Enter the number of people");
                    int groupSize = myObj.nextInt();
                    System.out.println("Enter the current time");
                    int timeReserving = myObj.nextInt();
                    System.out.println("Enter the time of the reservation");
                    int timeFor = myObj.nextInt();
                    System.out.println("Enter the name for the reservation");
                    String name = myObj.next();
                    addReservation(groupSize, timeReserving, timeFor, name);
                    System.out.println("Done!");
                    if(reservations.size() > 1) {
                        sortReservations();
                    }
                    break;
                case 2:
                    displayReservations();
                    break;
                case 3:
                    displayReservations();
                    System.out.println("Enter the position in the list of the reservation you want to remove.");
                    int toRemove = myObj.nextInt();
                    deleteReservation(toRemove - 1);
                    System.out.println("Done!");
                    break;
                case 4:
                    displayReservations();
                    System.out.println("Enter the position in the list of the reservation you would like to change the size of.");
                    int toChange = myObj.nextInt();
                    System.out.println("Enter the number of people you would like to change it to.");
                    int newNumber = myObj.nextInt();
                    changeGroupSize(toChange, newNumber);
                    System.out.println("Done!");
                    break;
                case 5:
                    displayReservations();
                    break;

                default:
                    System.out.println("Invalid Input!");
            }

        }
    }

    public static void main(String[] args) {
        // Starts the whole program w this, right?
        ReservationList obj = new ReservationList();
    }

    public void addReservation(int numpeople, int timemade, int timefor, String Name) {
        // simple adding reservaition
        reservations.add(new Reservation(numpeople, timemade, timefor, Name));
    }
    public void displayReservations() {
        System.out.println("Printing all reservations:");
        int count = 1;
        for(Reservation x : reservations) {
            if(count > 10) {
                System.out.println(count + ": (Waitlist) " + x.toString());
            } else {
                System.out.println(count + ": " + x.toString());
            }
            count++;
        }
    }

    public void sortReservations() {
        for(int i = 1; i < reservations.size(); i++) {
            for(int q = 0; q < reservations.size() - i; q ++) {
                if(reservations.get(q).time_made > reservations.get(q+1).time_made) {
                    Reservation temp = reservations.get(q);
                    reservations.set(q, reservations.get(q+1));
                    reservations.set(q+1, temp);
                }

            }
        }

    }

    public void deleteReservation(int index) {
        reservations.remove(index);
    }

    public void changeGroupSize(int index, int changeTo){
        reservations.get(index).num_people = changeTo;
    }


}
