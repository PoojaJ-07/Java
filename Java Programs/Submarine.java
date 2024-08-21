package com.xworkz.array;

public class Submarine {
    // Instance variables
    private String name;
    private double length;
    private double depth;
    private int crewCapacity;
    private boolean isNuclearPowered;

    private String countryOfOrigin;
    private String type;
    private double maxSpeed;
    private int yearCommissioned;
    private String sonarType;
    private int missileCapacity;
    private boolean hasStealthTechnology;
    private String propulsionType;
    private String onboardWeapons;
    private double displacement;
    private String communicationSystem;
    private int torpedoTubeCount;
    private String radarSystem;
    private boolean hasPeriscope;
    private boolean hasSatelliteLink;
    private String hullMaterial;
    private String commandSystem;
    private String navigationSystem;
    private int numberOfTorpedoes;
    private double maximumRange;
    private String sonarDetectionRange;
    private String navigationEquipment;
    private String communicationEquipment;
    private boolean hasAirConditioning;
    private String fuelType;
    private boolean hasEmergencyEscapeSystem;
    private int numberOfDecks;
    private boolean hasWaterDesalination;
    private double crewLifeSupportDuration;
    private String radarType;
    private int numberOfCrewMembers;
    private String engineType;
    private String safetyFeatures;
    private boolean hasAdvancedSensors;

    // Constructor to initialize 5 variables
    public Submarine(String name, double length, double depth, int crewCapacity, boolean isNuclearPowered) {
        this.name = name;
        this.length = length;
        this.depth = depth;
        this.crewCapacity = crewCapacity;
        this.isNuclearPowered = isNuclearPowered;
        System.out.println("Submarine constructor created");
    }

    // Setter methods for the remaining 35 variables
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYearCommissioned(int yearCommissioned) {
        this.yearCommissioned = yearCommissioned;
    }

    public void setSonarType(String sonarType) {
        this.sonarType = sonarType;
    }

    public void setMissileCapacity(int missileCapacity) {
        this.missileCapacity = missileCapacity;
    }

    public void setHasStealthTechnology(boolean hasStealthTechnology) {
        this.hasStealthTechnology = hasStealthTechnology;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public void setOnboardWeapons(String onboardWeapons) {
        this.onboardWeapons = onboardWeapons;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public void setCommunicationSystem(String communicationSystem) {
        this.communicationSystem = communicationSystem;
    }

    public void setTorpedoTubeCount(int torpedoTubeCount) {
        this.torpedoTubeCount = torpedoTubeCount;
    }

    public void setRadarSystem(String radarSystem) {
        this.radarSystem = radarSystem;
    }

    public void setHasPeriscope(boolean hasPeriscope) {
        this.hasPeriscope = hasPeriscope;
    }

    public void setHasSatelliteLink(boolean hasSatelliteLink) {
        this.hasSatelliteLink = hasSatelliteLink;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public void setCommandSystem(String commandSystem) {
        this.commandSystem = commandSystem;
    }

    public void setNavigationSystem(String navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public void setNumberOfTorpedoes(int numberOfTorpedoes) {
        this.numberOfTorpedoes = numberOfTorpedoes;
    }

    public void setMaximumRange(double maximumRange) {
        this.maximumRange = maximumRange;
    }

    public void setSonarDetectionRange(String sonarDetectionRange) {
        this.sonarDetectionRange = sonarDetectionRange;
    }

    public void setNavigationEquipment(String navigationEquipment) {
        this.navigationEquipment = navigationEquipment;
    }

    public void setCommunicationEquipment(String communicationEquipment) {
        this.communicationEquipment = communicationEquipment;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setHasEmergencyEscapeSystem(boolean hasEmergencyEscapeSystem) {
        this.hasEmergencyEscapeSystem = hasEmergencyEscapeSystem;
    }

    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public void setHasWaterDesalination(boolean hasWaterDesalination) {
        this.hasWaterDesalination = hasWaterDesalination;
    }

    public void setCrewLifeSupportDuration(double crewLifeSupportDuration) {
        this.crewLifeSupportDuration = crewLifeSupportDuration;
    }

    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }

    public void setNumberOfCrewMembers(int numberOfCrewMembers) {
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setSafetyFeatures(String safetyFeatures) {
        this.safetyFeatures = safetyFeatures;
    }

    public void setHasAdvancedSensors(boolean hasAdvancedSensors) {
        this.hasAdvancedSensors = hasAdvancedSensors;
    }

    // Method to display submarine details
    public void details() {
        System.out.println("Name: " + this.name);
        System.out.println("Length: " + this.length + " meters");
        System.out.println("Depth: " + this.depth + " meters");
        System.out.println("Crew Capacity: " + this.crewCapacity);
        System.out.println("Is Nuclear Powered: " + this.isNuclearPowered);
        System.out.println("Country of Origin: " + this.countryOfOrigin);
        System.out.println("Type: " + this.type);
        System.out.println("Max Speed: " + this.maxSpeed + " knots");
        System.out.println("Year Commissioned: " + this.yearCommissioned);
        System.out.println("Sonar Type: " + this.sonarType);
        System.out.println("Missile Capacity: " + this.missileCapacity);
        System.out.println("Has Stealth Technology: " + this.hasStealthTechnology);
        System.out.println("Propulsion Type: " + this.propulsionType);
        System.out.println("Onboard Weapons: " + this.onboardWeapons);
        System.out.println("Displacement: " + this.displacement + " tons");
        System.out.println("Communication System: " + this.communicationSystem);
        System.out.println("Torpedo Tube Count: " + this.torpedoTubeCount);
        System.out.println("Radar System: " + this.radarSystem);
        System.out.println("Has Periscope: " + this.hasPeriscope);
        System.out.println("Has Satellite Link: " + this.hasSatelliteLink);
        System.out.println("Hull Material: " + this.hullMaterial);
        System.out.println("Command System: " + this.commandSystem);
        System.out.println("Navigation System: " + this.navigationSystem);
        System.out.println("Number of Torpedoes: " + this.numberOfTorpedoes);
        System.out.println("Maximum Range: " + this.maximumRange + " nautical miles");
        System.out.println("Sonar Detection Range: " + this.sonarDetectionRange);
        System.out.println("Navigation Equipment: " + this.navigationEquipment);
        System.out.println("Communication Equipment: " + this.communicationEquipment);
        System.out.println("Has Air Conditioning: " + this.hasAirConditioning);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Has Emergency Escape System: " + this.hasEmergencyEscapeSystem);
        System.out.println("Number of Decks: " + this.numberOfDecks);
        System.out.println("Has Water Desalination: " + this.hasWaterDesalination);
        System.out.println("Crew Life Support Duration: " + this.crewLifeSupportDuration + " days");
        System.out.println("Radar Type: " + this.radarType);
        System.out.println("Number of Crew Members: " + this.numberOfCrewMembers);
        System.out.println("Engine Type: " + this.engineType);
        System.out.println("Safety Features: " + this.safetyFeatures);
        System.out.println("Has Advanced Sensors: " + this.hasAdvancedSensors);
    }

    // Main method to test the Submarine class
    public static void main(String[] args) {

        Submarine sub1 = new Submarine("USS Virginia", 115.0, 10.0, 140, true);
        sub1.setCountryOfOrigin("USA");
        sub1.setType("Attack Submarine");
        sub1.setMaxSpeed(25.0);
        sub1.setYearCommissioned(2004);
        sub1.setSonarType("Advanced");
        sub1.setMissileCapacity(12);
        sub1.setHasStealthTechnology(true);
        sub1.setPropulsionType("Nuclear");
        sub1.setOnboardWeapons("Tomahawk Missiles");
        sub1.setDisplacement(7800.0);
        sub1.setCommunicationSystem("Satellite");
        sub1.setTorpedoTubeCount(4);
        sub1.setRadarSystem("Phased Array Radar");
        sub1.setHasPeriscope(true);
        sub1.setHasSatelliteLink(true);
        sub1.setHullMaterial("Titanium");
        sub1.setCommandSystem("Integrated");
        sub1.setNavigationSystem("GPS");
        sub1.setNumberOfTorpedoes(20);
        sub1.setMaximumRange(40000.0);
        sub1.setSonarDetectionRange("500 km");
        sub1.setNavigationEquipment("Advanced Navigational Instruments");
        sub1.setCommunicationEquipment("Encrypted Radio");
        sub1.setHasAirConditioning(true);
        sub1.setFuelType("Nuclear");
        sub1.setHasEmergencyEscapeSystem(true);
        sub1.setNumberOfDecks(3);
        sub1.setHasWaterDesalination(true);
        sub1.setCrewLifeSupportDuration(90.0);
        sub1.setRadarType("Long-Range");
        sub1.setNumberOfCrewMembers(140);
        sub1.setEngineType("Nuclear Reactor");
        sub1.setSafetyFeatures("Fire Suppression System");
        sub1.setHasAdvancedSensors(true);



        Submarine sub2 = new Submarine("HMS Astute", 97.0, 10.0, 98, true);
        sub2.setCountryOfOrigin("UK");
        sub2.setType("Attack Submarine");
        sub2.setMaxSpeed(30.0);
        sub2.setYearCommissioned(2010);
        sub2.setSonarType("Medium Frequency");
        sub2.setMissileCapacity(6);
        sub2.setHasStealthTechnology(true);
        sub2.setPropulsionType("Nuclear");
        sub2.setOnboardWeapons("Tomahawk Missiles");
        sub2.setDisplacement(7400.0);
        sub2.setCommunicationSystem("Satellite");
        sub2.setTorpedoTubeCount(6);
        sub2.setRadarSystem("Phased Array Radar");
        sub2.setHasPeriscope(true);
        sub2.setHasSatelliteLink(true);
        sub2.setHullMaterial("Steel");
        sub2.setCommandSystem("Advanced");
        sub2.setNavigationSystem("GPS");
        sub2.setNumberOfTorpedoes(38);
        sub2.setMaximumRange(50000.0);
        sub2.setSonarDetectionRange("600 km");
        sub2.setNavigationEquipment("Modern Navigational Instruments");
        sub2.setCommunicationEquipment("Secure Radio");
        sub2.setHasAirConditioning(true);
        sub2.setFuelType("Nuclear");
        sub2.setHasEmergencyEscapeSystem(true);
        sub2.setNumberOfDecks(2);
        sub2.setHasWaterDesalination(true);
        sub2.setCrewLifeSupportDuration(80.0);
        sub2.setRadarType("Medium-Range");
        sub2.setNumberOfCrewMembers(98);
        sub2.setEngineType("Nuclear Reactor");
        sub2.setSafetyFeatures("Advanced Fire Suppression System");
        sub2.setHasAdvancedSensors(true);

        Submarine[] submarines = new Submarine[2];
        submarines[0]=sub1;
        submarines[1]=sub2;


        for(Submarine sub:submarines)
        {
            System.out.println("----------------");
            sub.details();
        }
    }
}
