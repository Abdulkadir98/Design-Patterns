public class Stereo {
    String location;

    public Stereo(String location){
        this.location = location;
    }
    public void on(){
        System.out.println("Stereo in " + location +" is tuned on!");
    }

    public void off(){
    System.out.println("Stereo in " + location + " is turned off");
    }

    public void setCD(){
        System.out.println("CD inserted in stereo!");
    }

    public void setDVD(){

    }

    public void setVolume(int volume){
        System.out.println("Stereo volume set to "+volume);
    }
}
