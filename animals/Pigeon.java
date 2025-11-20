
public class Pigeon extends Bird implements AnimalBehavior{
    private String species;

    public Pigeon(){
        super();
        this.species="Wood pigeon";
    }

    public Pigeon(String name){
         super(name);
         this.species="Wood pigeon";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species){
        super(name, age, weight, featherColor);
        this.species=species;
    }

    public String getSpecies(){return species;}
    public void setspecies(String species){this.species=species;}

    @Override
    public void eat(){
        System.out.println(name +" is eating seeds");
    }

    @Override
    public String getVoice(){
        return "Coo";
    }

    public void fly(){
        System.out.println(name + " is flying through the city");
    }

    @Override
    public String toString(){
        return super.toString()+ ", species" + species;

    }

     @Override
    public void sleep() {
        System.out.println(name + " the pigeon is sleeping on a rooftop");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies through the sky");
    }
    
}
