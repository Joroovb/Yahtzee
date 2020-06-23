import java.util.Random;

public class Dobbelsteen {
    int laatsteWorp;

    int werpen() {
        Random die = new Random();
        int i = die.nextInt(6)+1;
        return i;
    }
    void setLaatsteWorp(int i) {
        laatsteWorp = i;
    }
}
