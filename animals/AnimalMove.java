public interface AnimalMove {
    default void move(){
        String className =this.getClass().getSimpleName();
        System.out.println(className + " moves in its own way");
    }

}
