/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hamza Gul.
 */
public class UniversityTransportSystem {
    public static void main(String[] args) {
        // Create transport services
        BusService bus1 = new BusService("Campus Shuttle");
        BusService bus2 = new BusService("City Shuttle");

        // Create students
        Student student1 = new Student("ali");
        Student student2 = new Student("kashif");
        Student student3 = new Student("waseem");

        // Register students for notifications
        bus1.addObserver(student1);
        bus1.addObserver(student2);

        bus2.addObserver(student3);
        bus2.addObserver(student1);

        // Update bus status
        bus1.updateStatus("Delayed due to traffic.");
        bus2.updateStatus("On schedule.");

        // Remove a student and update again
        bus1.removeObserver(student2);
        bus1.updateStatus("Resumed on time.");
    }
}

