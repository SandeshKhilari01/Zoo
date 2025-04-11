public class Zoo{
    public static void main(String args[]){
        Animal lion = new Lion("Simbha", 12);
        Animal monkey = new Monkey("Jaggu", 3);
        Animal elephant = new Elephant("Ganesh", 20);

        Animal[] animals = {lion, monkey, elephant};

        for(Animal animal : animals){
            System.out.println("=====================================================");
            animal.displayInfo();

            if(animal instanceof Eater eater){
                eater.eat();
            }

            if(animal instanceof Sleeper sleeper){
                sleeper.sleep();
            }

            if(animal instanceof Mover mover){
                mover.move();
            }
        }
    }
}