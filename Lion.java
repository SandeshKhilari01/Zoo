public class Lion extends Animal implements Eater, Sleeper, Mover{
    public Lion(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println(getName()+" eat meet!");
    }

    @Override
    public void sleep(){
        System.out.println(getName()+" sleep in jungle!");
    }

    @Override 
    public void move(){
        System.out.println(getName()+" move from here to there!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Name: "+getName()+" Age: "+getAge());
    }
}