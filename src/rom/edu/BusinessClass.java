package rom.edu;/*
  @author   Romanyuk Bohdan
  @project   LabWork2
  @class  BusinessClass
  @version  1.0.0 
  @since 05.04.2021 - 18.37
*/

public class BusinessClass implements ICosting {


    // parameters for BusinessClass Class

    private String name;                    // name of flight
    private double kilometerPrice;       // price for one kilometer
    private double distance;                // number of kilometers
    private double сlassMultiplier; // multiplier for business-class tickets


    // empty constructor

    public BusinessClass() {
    }


    // full constructor

    public BusinessClass(String name, double kilometerPrice, double distance, double сlassMultiplier) {
        this.name = name;
        this.kilometerPrice = kilometerPrice;
        this.distance = distance;
        this.сlassMultiplier = сlassMultiplier;
    }


    // getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKilometerPrice() {
        return kilometerPrice;
    }

    public void setKilometerPrice(double kilometerPrice) {
        this.kilometerPrice = kilometerPrice;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getСlassMultiplier() {
        return сlassMultiplier;
    }

    public void setСlassMultiplier(double сlassMultiplier) {
        this.сlassMultiplier = сlassMultiplier;
    }


    // toString() method

    @Override
    public String toString() {
        return "BusinessClass{" +
                "name='" + name + '\'' +
                ", kilometerPrice=" + kilometerPrice +
                ", distance=" + distance +
                ", сlassMultiplier=" + сlassMultiplier +
                '}';
    }


    // getCost() method for interface

    @Override
    public int getCost() {
        return (int) (this.getKilometerPrice() * this.getDistance() * this.getСlassMultiplier());
    }

}