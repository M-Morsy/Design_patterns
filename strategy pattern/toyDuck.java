
/**
 * Write a description of toyDuck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toyDuck extends duck {
    toyDuck()
    {
        super();
        this.myFlyBehaviour = new FlyNoFly();
    }
    
    @Override
    protected String display(){
        return "I'm a toy";
    }

}
