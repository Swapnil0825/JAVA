package Practice;

interface bicycle {
    int a = 45;

    void applybrake(int decrement);

    void speedup(int increment);

}

interface HornBicycle {
    void blowHornK3g();

    void blogHornmhn();
}

class Avoncycle implements bicycle, HornBicycle {
    int speed = 7;

    public void applybrake(int decrement) {
        speed = speed - decrement;
        System.out.println(speed);
    }

    public void speedup(int increment) {
        int speed1 = speed + increment;
        System.out.println(speed1);
    }

    public void blowHornK3g() {
        System.out.println("kabhi khushi kabhi gum pee pee pee pee");
    }

    public void blogHornmhn() {
        System.out.println("main hoon naa po po po po");

    }

}

public class CWH_55_interface {
    public static void main(String[] args) {
        Avoncycle sp = new Avoncycle();
        //sp.applybrake(2);
        //sp.speedup(2);
        //System.out.println(sp.a);
        sp.blogHornmhn();
        sp.blowHornK3g();
    }

}