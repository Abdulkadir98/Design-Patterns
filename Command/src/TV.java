public class TV {
    String location;

    public TV(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("TV turned on in "+location);
    }

    public void off(){
        System.out.println("TV turned off in "+location);
    }
}
