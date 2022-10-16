public class Q4 {
    static class journey{
        void run() {
            System.out.println("i am in ohio");
        }
    }
    static class destination extends journey{
        @Override
        void run() {
            System.out.println("i will be at texas");
        }

    }

    public static void main(String[] args) {
        destination des=new destination();
        des.run();

    }
}