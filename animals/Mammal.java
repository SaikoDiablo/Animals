public abstract class Mammal extends Animal {
    protected boolean withFur;
    public Mammal(){
        super();
        this.withFur = true;
    }

    public Mammal(String name){
        super(name);
        this.withFur=true;
    }

    public Mammal(String name, int age, double weight, boolean withFur){
        super(name, age, weight);
        this.withFur=withFur;
    }

    public boolean isWithFur(){return withFur;}
    public void setWithFur(boolean withFur){this.withFur=withFur;}

    @Override
    public String toString(){
        return super.toString()+ ", With fur: "+withFur;

    }
    
}
