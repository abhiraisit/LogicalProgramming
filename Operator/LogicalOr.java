class LogicalOr {

    public static void main(String[] args) {
        int n = 14;

        if(n/5 == 0){
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not Divisible by 5");
        }

        int p = main();
        System.out.println(p);
    }

    public static int main() {
        int n = 10;

        if(n/5 == 0){
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not Divisible by 5");
        }
        return n;
    }

}