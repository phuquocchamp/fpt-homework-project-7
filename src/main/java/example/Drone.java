package example;

public class Drone extends Bee{
    @Override
    protected void checkHealthStatus() {
        if(this.getHealth() < 50.0f){
            setDead(true);
        }
    }
}
