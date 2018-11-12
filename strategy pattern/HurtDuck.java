
/**
 * Write a description of HurtDuck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HurtDuck extends duck {
    HurtDuck()
    {
        super();    // call duck()  >> default
        this.myFlyBehaviour = new FlyWithWings();   // default
    }
    @Override
    protected String display() {
        return "I'm a hurted duck";
    }
    
    public void gotShot()
    {
        // change the behaviour of this duck to FlyNoFly
        // This happens at the duck gets shot :D 
        this.myFlyBehaviour = new FlyNoFly();
    }

}
