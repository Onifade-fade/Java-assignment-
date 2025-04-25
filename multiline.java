class Animal{
    public void display(){
        System.out.println("Animals");


    }
}

public class Mammals extends Animal {
    public void details() {
        System.out.println("Mammals");

    }
}

public class Dog extends Mammals {
    public void show() {
        System.out.println("Dogs");

    }
    public static void main(String[] args) {
        Dog input=new Dog();
        input.display();
        input.details();
        input.show();

    }
}
