
/**
 * Write a description of Simulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulator {
    public static void main(String args[]){
        duck d1 = new HurtDuck();
        duck d2 = new toyDuck();
        
        d1.perform();
        d2.perform();
        
        // change the interface of d1 into FlyNoFly interface
        ((HurtDuck)d1).gotShot();
        d1.perform();
    }

}
