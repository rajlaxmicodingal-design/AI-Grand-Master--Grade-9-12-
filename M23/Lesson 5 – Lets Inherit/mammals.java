//this activity is mainly to explain Hierarchical inheritance
//parent class
class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

// child class
class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion class ");
    }
}

// child
class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human");
    }
}

class mammals {
    public static void main(String args[]) {
        Lion obj = new Lion();// object of child of child class
        obj.roar();
        obj.mam();

        // 2. Create a Human object to access hum()
        Human humanObj = new Human();
        humanObj.hum(); // Works: method exists in Human
        humanObj.mam(); // Works: inherited from Mammals
    }
}
