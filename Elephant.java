public class Elephant extends Animal implements Sleeper, Eater, Mover{
    public Elephant(String name, int age){
        super(name, age);
    }

    @Override
    public void sleep(){
        System.out.println(getName()+" is sleep in jungle!");
    }

    @Override
    public void eat(){
        System.out.println(getName()+" is eating Vegetables!");
    }

    @Override
    public void move(){
        System.out.println(getName()+" is moving towards jungle!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Name: "+getName()+" Age: "+getAge());
    }
}