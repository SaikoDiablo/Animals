public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Dog();
        animals[1] = new Dog("Richy");
        animals[2] = new Dog("Fluff",5, 35.5,true,"Siberian husky");
        animals [3] = new Pigeon("Sky");
        animals[4] = new Blowfish("Buble", 1, 1.2, true, false);
        animals[5] = new Blowfish();

        for (int i =0; i < animals.length; i ++) {
           System.out.println("Animal " + (i + 1));
           System.out.println(animals[i].toString());
           animals[i].eat();
           System.out.println("Sound: " + animals[i].getVoice()); 
        }

        System.out.println("Special Skills");
        ((Dog) animals[2]).fetch();
        ((Pigeon) animals[3]).fly();
        ((Blowfish)animals[4]).puffUp();

        System.out.println("*** Animal Movement ***");
        for (Animal animal : animals) {
            animal.move(); 
        }

        System.out.println("\n*** Animal Names ***");
        for (Animal animal : animals) {
            AnimalName.name(animal.getName()); 
        }

        AnimalBehavior[] behaviors = {
            new Dog("Sam"),
            new Pigeon("Lin"),
            new Blowfish("Spike")
        };

        System.out.println("\n*** Animal Sleep Behavior ***");
        for (int i = 0; i < behaviors.length; i++) {
            System.out.println(" Behavior " + (i + 1) );
            behaviors[i].sleep(); 
        }


    }
}
