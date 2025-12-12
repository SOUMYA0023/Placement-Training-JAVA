import java.util.Scanner;

class Station {
    String name;
    Station next;

    Station(String name) {
        this.name = name;
        this.next = null;
    }
}

class RailwayRoute {
    private Station head;

    // Add station at end
    public void addStation(String name) {
        Station newStation = new Station(name);

        if (head == null) {
            head = newStation;
            return;
        }

        Station temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStation;
    }

    // Insert a station after an existing one
    public void insertStation(String after, String name) {
        Station temp = head;

        while (temp != null && !temp.name.equals(after)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Station not found!");
            return;
        }

        Station newStation = new Station(name);
        newStation.next = temp.next;
        temp.next = newStation;
    }

    // Remove a station
    public void removeStation(String name) {
        if (head == null) return;

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Station temp = head;
        while (temp.next != null && !temp.next.name.equals(name)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Station not found!");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Traverse the route
    public void printRoute() {
        Station temp = head;
        System.out.print("Route: ");
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Print next N stations from a given station
    public void nextNStations(String current, int n) {
        Station temp = head;

        // find the station
        while (temp != null && !temp.name.equals(current)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Station not found!");
            return;
        }

        System.out.println("Next " + n + " stations from " + current + ":");
        temp = temp.next;

        while (temp != null && n > 0) {
            System.out.println(temp.name);
            temp = temp.next;
            n--;
        }
    }
}

public class RailwayManagement {
    public static void main(String[] args) {
        RailwayRoute route = new RailwayRoute();

        route.addStation("Chennai");
        route.addStation("Tambaram");
        route.addStation("Chengalpattu");
        route.addStation("Villupuram");

        System.out.println("Initial Route:");
        route.printRoute();

        route.insertStation("Tambaram", "Perungalathur");
        System.out.println("\nAfter inserting:");
        route.printRoute();

        route.removeStation("Chengalpattu");
        System.out.println("\nAfter removal:");
        route.printRoute();

        System.out.println();
        route.nextNStations("Tambaram", 2);
    }
}