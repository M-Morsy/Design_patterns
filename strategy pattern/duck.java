
/**
 * Write a description of duck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class duck {
    private int id;
    private String name;
    private static int counter = 0;
    
    protected FlyBehaviour myFlyBehaviour;
    duck()
    {
        this.id = counter++;
        this.name = "duck#" + this.id;
        this.myFlyBehaviour = new FlyWithWings();
    }
    public String swim()
    {
        return "Hey, I'm swimming";
    }
    
    protected abstract String display();
    
    public void perform()
    {
        System.out.println("Hi I'm " + this.name);
        System.out.println(this.swim());
        System.out.println(display());
        System.out.println(this.myFlyBehaviour.fly());
    }
    

}
