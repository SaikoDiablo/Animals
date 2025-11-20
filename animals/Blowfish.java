public class Blowfish extends Fish implements AnimalBehavior{
    private boolean isPuffed;

    public Blowfish(){
        super();
        this.isPuffed=false;
    }

    public Blowfish(String name){
        super(name);
        this.isPuffed=false;
    }

    public Blowfish(String name, int age, double weight, boolean isInOcean,boolean isPuffed){
        super(name, age, weight, isInOcean);
        this.isPuffed=isPuffed;
    }

    public boolean isPuffed(){return isPuffed;}
    public void setPuffed(boolean puffed){isPuffed=puffed;}

    @Override
    public void eat(){
        System.out.println(name+ " is eating small invertebrates");
    }

    @Override
    public String getVoice(){
        return "Bulll...";
    }

    public void puffUp(){
        isPuffed=true;
        System.out.println(name+ " puffed up to scare");
    }

    @Override
    public String toString(){
        return super.toString()+ ", Puffed:" + isPuffed;
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " the blowfish is sleeping in coral.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims slowly in the water.");
    }
}
