public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog(){
        super();
        this.breed="Mixed";
    }

    public Dog(String name){
        super(name);
        this.breed="Mixed";
    }

    public Dog(String name, int age, double weight, boolean withFur, String breed){
        super(name, age, weight, withFur);
        this.breed = breed;
    }

    public String getBreed(){return breed;}
    public void setBreed(String breed){this.breed=breed;}

    @Override
    public void eat(){
        System.out.println(name +  "  is eating only dog food ");
    }

    @Override
    public String getVoice(){
        return "Gaf!";
    }

    public void fetch(){
        System.out.println(name + " is fetching the ball");
    }

    @Override
    public String toString(){
        return super.toString()+ ", Breed:" + breed;
    }

    @Override
    public void sleep() {
        System.out.println(name + " the dog is sleeping in the dog bed");
    }

     @Override
    public void move() {
        System.out.println("Dog runs on four legs");
    }
    
}
