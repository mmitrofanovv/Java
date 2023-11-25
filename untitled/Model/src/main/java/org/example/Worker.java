package org.example;

public class Worker {
    private String name;
    private String post;
    private int ID;

    public Worker(String name, String post, int ID){
        this.name = name;
        this.post = post;
        this.ID = ID;
    }

    public String getName(){
        return name;
    }
    public String getPost(){
        return post;
    }
    public int getID(){ return ID; }

    public void setName(String name) { this.name = name; }
    public void setAdress(String adress) { this.post = adress; }
    public void setNumber(int number) { this.ID = number; }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", ID=" + ID +
                '}';
    }
}
