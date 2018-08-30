public class CeilingFan {
    String location;
    int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }
    public void on(){
        System.out.println(location+" Ceiling fan is on ");
    }

    public void off(){
        System.out.println(location+" Ceiling fan is off!");
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println("Ceiling fan is on high!");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println("Ceiling fan is on medium!");

    }
    public void low(){
        speed = LOW;
        System.out.println("Ceiling fan is on low!");

    }

    public int getSpeed(){
        return speed;
    }

}
