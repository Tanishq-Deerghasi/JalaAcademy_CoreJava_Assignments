abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Animal is eating");
    }
}


class Lion extends Animal {    
    @Override
    void sound() {
        System.out.println("Lion roars");
}

    public static void main(String[] args) {
        
        Animal A = new Lion();
        A.eat();

        Lion L = new Lion();
        L.sound();
        L.eat();
    }
}