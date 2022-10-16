
public class Q9 implements Q8{
public void printme(){
    System.out.println("printme");
    }
    public void printmeaswell(){
        System.out.println("printme as well");
    }

    public static void main(String[] args) {
        Q9 q9=new Q9();
        q9.printme();
        q9.printmeaswell();
    }
}
