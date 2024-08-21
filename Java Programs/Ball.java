package com.xworkz.array;

public class Ball {
//constructor
    private String color;
    private String material;
    private double diameter;
    private double weight;
    private String type;

    //setter method
    private String brand;
    private boolean isInflated;
    private String pattern;
    private double bounceHeight;
    private String originCountry;

    private int yearOfManufacture;
    private String size;
    private String use;
    private boolean hasLogo;
    private int noOfLines;

    private boolean isWaterproof;
    private String shape;
    private double inflationPressure;
    private int numberOfPanels;
    private boolean isHandStitched;

    private String stitchingPattern;
    private double surfaceTemperature;
    private boolean isEcoFriendly;
    private String packaging;
    private double lifespan;

    public Ball(String color,String material,double diameter,double weight,String type)
    {
        System.out.println("Constructor created");
        this.color=color;
        this.material=material;
        this.diameter=diameter;
        this.weight=weight;
        this.type=type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setBounceHeight(double bounceHeight) {
        this.bounceHeight = bounceHeight;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public void setHasLogo(boolean hasLogo) {
        this.hasLogo = hasLogo;
    }

    public void setNoOfLines(int noOfLines) {
        this.noOfLines = noOfLines;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setInflationPressure(double inflationPressure) {
        this.inflationPressure = inflationPressure;
    }

    public void setNumberOfPanels(int numberOfPanels) {
        this.numberOfPanels = numberOfPanels;
    }

    public void setHandStitched(boolean handStitched) {
        isHandStitched = handStitched;
    }

    public void setStitchingPattern(String stitchingPattern) {
        this.stitchingPattern = stitchingPattern;
    }

    public void setSurfaceTemperature(double surfaceTemperature) {
        this.surfaceTemperature = surfaceTemperature;
    }

    public void setEcoFriendly(boolean ecoFriendly) {
        isEcoFriendly = ecoFriendly;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public void setLifespan(double lifespan) {
        this.lifespan = lifespan;
    }
    public void display()
    {
        System.out.println("Color:"+this.color);
        System.out.println("material:"+this.material);
        System.out.println("Diameter:"+ this.diameter);
        System.out.println("weight:"+this.weight+"Grams");
        System.out.println("type:"+this.type);

        System.out.println("Brand:"+this.brand);
        System.out.println("Is inflated:"+this.isInflated);
        System.out.println("pattern:"+this.pattern);
        System.out.println("Bounce Height:"+this.bounceHeight);
        System.out.println("origin country:"+this.originCountry);

        System.out.println("Year of manufacture:"+this.yearOfManufacture);
        System.out.println("Size:"+this.size);
        System.out.println("Use:"+this.use);
        System.out.println("Has a logo:"+this.hasLogo);
        System.out.println("No od Lines:"+this.noOfLines);

        System.out.println("Is Waterproof:"+this.isWaterproof);
        System.out.println("Shape:"+this.shape);
        System.out.println("Inflation Pressure:"+this.inflationPressure);
        System.out.println("No of panels:"+numberOfPanels);
        System.out.println("Is hand Stitched:"+this.isHandStitched);

        System.out.println("Stitching pattern:"+this.stitchingPattern);
        System.out.println("Surface Temperature:"+this.surfaceTemperature+"°C");
        System.out.println("Is eco friendly:"+this.isEcoFriendly);
        System.out.println("Packaging:"+this.packaging);
        System.out.println("Lifespan:"+this.lifespan+"Years");
    }

    public static void main(String[] args) {


        Ball ball1 = new Ball("Green", "Rubber", 7.5, 150, "Soccer");
        ball1.setBrand("Nike");
        ball1.setInflated(true);
        ball1.setPattern("Stripes");
        ball1.setBounceHeight(1.2);
        ball1.setOriginCountry("India");

        ball1.setYearOfManufacture(2023);
        ball1.setSize("Size 5");
        ball1.setUse("Training");
        ball1.setHasLogo(true);
        ball1.setNoOfLines(12);

        ball1.setWaterproof(true);
        ball1.setShape("Round");
        ball1.setInflationPressure(8.5);
        ball1.setNumberOfPanels(32);
        ball1.setHandStitched(false);

        ball1.setPattern("Hexagonal");
        ball1.setSurfaceTemperature(22.5);
        ball1.setEcoFriendly(true);
        ball1.setPackaging("Box");
        ball1.setLifespan(3);


        Ball ball2 = new Ball("Red", "Rubber", 3.5, 150, "Cricket");
        ball2.setBrand("MRF");
        ball2.setInflated(true);
        ball2.setPattern("Non Stripes");
        ball2.setBounceHeight(1.6);
        ball2.setOriginCountry("USA");

        ball2.setYearOfManufacture(2024);
        ball2.setSize("Size 2");
        ball2.setUse("Competition");
        ball2.setHasLogo(true);
        ball2.setNoOfLines(2);
        ball2.setWaterproof(true);
        ball2.setShape("Round");
        ball2.setInflationPressure(5.5);
        ball2.setNumberOfPanels(22);
        ball2.setHandStitched(false);

        ball2.setPattern("Hexagonal");
        ball2.setSurfaceTemperature(12.5);
        ball2.setEcoFriendly(true);
        ball2.setPackaging("Box");
        ball2.setLifespan(1);
        Ball[] balls = new Ball[2];
        balls[0]=ball1;
        balls[1]=ball2;

        for(Ball ball:balls)
        {
            System.out.println("===============");
            System.out.println(ball);
            ball.display();
        }
    }
}
