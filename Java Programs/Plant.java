package com.xworkz.array;

public class Plant {
    private String species;
    private double height;
    private int age;
    private String color;
    private boolean isFlowering;

    private String soilType;
    private String growRate;
    private String climatePreference;
    private String waterNeeds;
    private String sunlightNeeds;

    public Plant(String species,double height,int age,String color,boolean isFlowering)
    {
        System.out.println("Constructor created");
        this.species=species;
        this.height=height;
        this.age=age;
        this.color=color;
        this.isFlowering=isFlowering;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public void setGrowRate(String growRate) {
        this.growRate = growRate;
    }

    public void setClimatePreference(String climatePreference) {
        this.climatePreference = climatePreference;
    }

    public void setWaterNeeds(String waterNeeds) {
        this.waterNeeds = waterNeeds;
    }

    public void setSunlightNeeds(String sunlightNeeds) {
        this.sunlightNeeds = sunlightNeeds;
    }
    public void details()
    {
        System.out.println("Species:"+this.species);
        System.out.println("Height:"+this.height+"meters");
        System.out.println("Age:"+this.age+"years");
        System.out.println("Color:"+this.color);
        System.out.println("Is flowering:"+this.isFlowering);
        System.out.println("Soil Type:"+this.soilType);
        System.out.println("Grow rate:"+this.growRate);
        System.out.println("Climate preference:"+this.climatePreference);
        System.out.println("Water needs:"+this.waterNeeds);
        System.out.println("Sunlight needs:"+this.sunlightNeeds);
    }

    public static void main(String[] args) {

        Plant plant1 = new Plant("Rose",0.5,2,"Red",true);
        plant1.setSoilType("Loamy");
        plant1.setGrowRate("Medium");
        plant1.setClimatePreference("Temperate");
        plant1.setWaterNeeds("Moderate");
        plant1.setSunlightNeeds("Full Sun");

        Plant plant2 = new Plant("Tulip",0.7,1,"Purple",true);
        plant2.setSoilType("Sandy");
        plant2.setGrowRate("Fast");
        plant2.setClimatePreference("Tropical");
        plant2.setWaterNeeds("Moderate");
        plant2.setSunlightNeeds("Partial shade");

        Plant[] plants=new Plant[2];
        plants[0]=plant1;
        plants[1]=plant2;
        for(Plant plant : plants)
        {
            System.out.println("================");
            System.out.println(plant);
            plant.details();
        }
    }
}
