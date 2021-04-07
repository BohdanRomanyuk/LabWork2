package rom.edu;/*
  @author   Romanyuk Bohdan
  @project   LabWork2
  @class  LowCost
  @version  1.0.0 
  @since 07.04.2021 - 17.38
*/

public class LowCost implements ICosting {


    // parameters for LowCost class

    private String name;              // name of flight
    private double kilometerPrice; // price for one kilometer
    private double distance;          // number of kilometers


    // empty constructor

    public LowCost() {
    }


    // full constructor

    public LowCost(String name, double kilometerPrice, double distance) {
        this.name = name;
        this.kilometerPrice = kilometerPrice;
        this.distance = distance;
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


    // toString() method

    @Override
    public String toString() {
        return "LowCost{" +
                "name='" + name + '\'' +
                ", kilometerPrice=" + kilometerPrice +
                ", distance=" + distance +
                '}';
    }


    // getCost() method for interface

    @Override
    public int getCost() {
        return (int) (this.getKilometerPrice() * this.getDistance());
    }

}
