package example;

public class Worker extends Bee{
    @Override
    protected void checkHealthStatus() {
        if(this.getHealth() < 70.0f){
            setDead(true);
        }
    }
}
