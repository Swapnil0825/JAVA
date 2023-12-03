import java.util.Scanner;

class Animal {
    public void Hello () {
        System.out.println("Hello");
    }
}

class Dog extends Animal {
    public void World () {
        System.out.println("World");
    }
}
public class ALL_Practice {  

    public static void main(String[] args) { 
        Animal sp1 = new Animal();
        //sp.Hello();
        
        Dog sp2 = new Dog();
        //sp1.Hello();
        //sp1.World();

    }
}
