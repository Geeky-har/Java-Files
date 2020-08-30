public class Sup_method {
    void message(){ System.out.println("This is base class, hello");}


static class derived extends Sup_method{
    void message(){
        System.out.println("This is dervide class, hello");
    }

    void display(){
        message();  // will print the message function of the derived class
        super.message();  // will print the message function of the base class
    }
}

public static void main(String[] args) {
    derived d = new derived();
    d.display();
}}