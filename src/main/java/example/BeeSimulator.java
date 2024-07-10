package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BeeSimulator {
    private List<Bee> bees = new ArrayList<>();
    private Random random = new Random();


    private void attackBees() {
        for (Bee bee : bees) {
            int damage = random.nextInt(81); // random value from 0 -> 80.
            bee.damage(damage);
        }
        displayBeeStatus();
    }

    private void createRandomBees() {
        bees.clear();
        for (int i = 0; i < 10; i++) {
            bees.add(new Worker());
            bees.add(new Queen());
            bees.add(new Drone());
        }
        displayBeeStatus();

    }

    private void displayBeeStatus() {
        for (Bee bee : bees) {
            String type = bee.getClass().getSimpleName();
            System.out.println(type + " - Health: " + bee.getHealth() + " - Dead: " + bee.isDead());
        }
    }

    public static void main(String[] args) {
        BeeSimulator beeSimulator = new BeeSimulator();
        boolean check = true;
        Scanner inp = new Scanner(System.in);

        while (check) {
            System.out.println("1. Create bee list.");
            System.out.println("2. Attack bees.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice: ");
            int option = Integer.parseInt(inp.next());
            switch (option) {
                case 1 -> beeSimulator.createRandomBees();
                case 2 -> beeSimulator.attackBees();
                case 3 -> check = false;
                default -> System.out.println("Wrong input! Please enter your choice again!");
            }
        }
    }

}
