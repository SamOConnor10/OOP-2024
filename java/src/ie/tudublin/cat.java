package ie.tudublin;

public class cat {
    private int numLives;

    public cat() {
        numLives = 9;
    }

    public Integer getNumLives() {
        return numLives;
    }

    public void kill() {
        if (numLives > 0) {
            numLives--;
            System.out.println("Ouch!");
            if (numLives < 1) {
                System.out.println("Dead");
            }
        } 
    }
}
