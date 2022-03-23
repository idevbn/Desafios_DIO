package entities;

public class Client {
    private String holder;

    public String getHolder() {
        return holder.substring(0, 1).toUpperCase() + holder.substring(1);
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
}
