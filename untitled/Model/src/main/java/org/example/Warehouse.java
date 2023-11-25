package org.example;

public class Warehouse {
    private String name;
    private String adress;
    private int number;

    public Warehouse(String name, String adress, int number){
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
    public int getNumber(){ return number; }

    public void setName(String name) { this.name = name; }
    public void setAdress(String adress) { this.adress = adress; }
    public void setNumber(int number) { this.number = number; }

    @Override
    public String toString() {
        return "Warehouse{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", number=" + number +
                '}';
    }
}
