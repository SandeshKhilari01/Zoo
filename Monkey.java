public class Monkey extends Animal implements Sleeper, Eater, Mover{
    public Monkey(String name, int age){
        super(name, age);
    }

    @Override
    public void sleep(){
        System.out.println(getName()+" is sleeping on  tree!"); 
    }

    @Override
    public void eat(){
        System.out.println(getName()+" is eating banana!");
    }

    @Override
    public void move(){
        System.out.println(getName()+" is moving here to there!");
    }   

    @Override
    public void displayInfo(){
        System.out.println("Name "+getName()+" Age: "+getAge());
    }
}