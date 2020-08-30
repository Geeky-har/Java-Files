public class counter{
    static int count = 0;

    counter(){
        count++;
        System.out.println(count + " object created");
    }

    public static void main(String[] args) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        counter c4 = new counter();
        counter c5 = new counter();
        counter c6 = new counter();
        counter c7 = new counter();
    }
}