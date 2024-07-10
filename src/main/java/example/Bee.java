package example;

abstract class Bee {
    private float health;
    private boolean dead;

    public Bee(){
        this.health = 100.0f;
        this.dead = false;
    }

    public float getHealth() {
        return health;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void damage(int percentage){
        if(!dead && percentage >= 0 && percentage <= 100){
            health = health - health*percentage/100;
        }
        checkHealthStatus();
    }

    protected abstract void checkHealthStatus();
}
