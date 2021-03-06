public class Position <T extends Creature>{

    private int x;
    private int y;
    private T holder;

    public T getHolder() {
        if (this.holder == null)
            return null;
        else
            return holder;
    }

    public void setHolder(T holder) {
        this.holder = holder;
       // holder.setPosition(this);
    }

    public void cleanHolder(){this.holder = null;}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setPositon(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void Move(int x,int y){
        this.x += x;
        this.y += y;
    }
    public Position(int x,int y){
        super();
        this.x = x;
        this.y = y;
        this.holder = null;
    }
}
