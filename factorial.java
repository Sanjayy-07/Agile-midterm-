class Factorial {
    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + fact(num));
        System.out.println("Webhook test");
        System.out.println("Webhook test1");
        System.out.println("Webhook test2");
    }
}
