package com.program.principles.inheritance;

import com.program.principles.Chicken;

public class Rooster extends Chicken {

    public Rooster() {
        System.out.println("Created Rooster constructor using no args");
    }

        public static void main(String[] args) {
            // Create a Chicken instance
            Chicken chicken1 = new Rooster();
            chicken1.chickenBreed = "Leghorn";
            chicken1.chickenAge = 2;
            chicken1.isRooster = false;
            chicken1.chickenWeight = 3.5;
            chicken1.chickenColor = "White";
            chicken1.eggsLaid = 10;
            chicken1.wingSpan = 1.2;
            chicken1.chickenName = "Clucky";
            chicken1.isFreeRange = true;
            chicken1.dailyFeedAmount = 0.5;

            System.out.println("Chicken Breed: " + chicken1.chickenBreed);
            System.out.println("Chicken Age: " + chicken1.chickenAge);
            System.out.println("Is Rooster: " + chicken1.isRooster);
            System.out.println("Chicken Weight: " + chicken1.chickenWeight);
            System.out.println("Chicken Color: " + chicken1.chickenColor);
            System.out.println("Eggs Laid: " + chicken1.eggsLaid);
            System.out.println("Wing Span: " + chicken1.wingSpan);
            System.out.println("Chicken Name: " + chicken1.chickenName);
            System.out.println("Is Free Range: " + chicken1.isFreeRange);
            System.out.println("Daily Feed Amount: " + chicken1.dailyFeedAmount);

            chicken1.cluck();
            chicken1.layEgg();
            chicken1.crow();
            chicken1.drink();
            chicken1.eat();
            chicken1.flapWings();
            chicken1.peck();
            chicken1.run();
            chicken1.sleep();
            chicken1.strut();

            System.out.println("==========================");
            // Create a Rooster instance
            Chicken chicken2 = new Rooster();
            chicken2.chickenBreed = "Rhode Island Red";
            chicken2.chickenAge = 3;
            chicken2.isRooster = true;
            chicken2.chickenWeight = 4.0;
            chicken2.chickenColor = "Red";
            chicken2.eggsLaid = 0; // Roosters don't lay eggs
            chicken2.wingSpan = 1.5;
            chicken2.chickenName = "Rudy";
            chicken2.isFreeRange = false;
            chicken2.dailyFeedAmount = 0.7;

            System.out.println("Rooster Breed: " + chicken2.chickenBreed);
            System.out.println("Rooster Age: " + chicken2.chickenAge);
            System.out.println("Is Rooster: " + chicken2.isRooster);
            System.out.println("Rooster Weight: " + chicken2.chickenWeight);
            System.out.println("Rooster Color: " +chicken2.chickenColor);
            System.out.println("Eggs Laid: " + chicken2.eggsLaid); // Should be 0
            System.out.println("Wing Span: " + chicken2.wingSpan);
            System.out.println("Rooster Name: " + chicken2.chickenName);
            System.out.println("Is Free Range: " + chicken2.isFreeRange);
            System.out.println("Daily Feed Amount: " + chicken2.dailyFeedAmount);

            chicken2.cluck();
            chicken2.layEgg();
            chicken2.crow();
            chicken2.drink();
            chicken2.eat();
            chicken2.flapWings();
            chicken2.peck();
            chicken2.run();
            chicken2.sleep();
            chicken2.strut();
        }
    }



