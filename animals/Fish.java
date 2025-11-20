

public  abstract class Fish extends Animal {
    protected boolean isInOcean;

    public Fish(){
        super();
        this.isInOcean = false;
    }

    public Fish(String name){
        super(name);
        this.isInOcean = false;
    }

    public Fish(String name, int age, double weight, boolean isInOcean){
        super(name, age, weight);
        this.isInOcean =isInOcean;
    }
    public boolean isInOcean(){return isInOcean;}
    public void setInOcean(boolean inocean){isInOcean=inocean;}

    @Override
    public String toString(){
        return super.toString()+ ", In Ocean:" + isInOcean;
    }
}
