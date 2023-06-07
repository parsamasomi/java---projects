import java.util.Scanner;

public class Classroom {
    private int roomNumber;
    private int capacity;
    private int numStudents;

    public Classroom(int roomNumber, int capacity, int numStudents) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.numStudents = numStudents;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public int getRemainingCapacity() {
        return capacity - numStudents;
    }

    public boolean isFull() {
        return numStudents >= capacity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the room number: ");
        int roomNumber = input.nextInt();
        System.out.print("Enter the capacity of the room: ");
        int capacity = input.nextInt();
        System.out.print("Enter the number of registered students: ");
        int numStudents = input.nextInt();

        Classroom classroom = new Classroom(roomNumber, capacity, numStudents);

        System.out.println("Room number: " + classroom.getRoomNumber());
        System.out.println("Capacity of the room: " + classroom.getCapacity());
        System.out.println("Number of registered students: " + classroom.getNumStudents());
        System.out.println("Remaining capacity: " + classroom.getRemainingCapacity());

        if (classroom.isFull()) {
            System.out.println("The room is full.");
        } else {
            System.out.println("The room is not full.");
        }
    }
}