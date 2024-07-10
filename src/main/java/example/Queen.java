package example;

public class Queen extends Bee{
    @Override
    protected void checkHealthStatus() {
        if(this.getHealth() < 20.0f){
            setDead(true);
        }
    }
}
