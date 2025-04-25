class Animal{
    public void display(){
        System.out.println("An Animal");


    }
}

public class Lion extends Animal{
    public void details() {
        System.out.println("Lion is an Animal");

    }
}

public class Tiger extends Animal {
    public void show() {
        System.out.println("Tiger is an Animal ");

    }
    public static void main(String[] args) {
        Lion input=new Lion();
        input.display();
        input.details();


        Tiger done=new Tiger();
        done.show();
        done.display();


    }
}
