public class AreaofTriangle {

    static void sneha(int num) {
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even");
        } else {
            System.out.println("Number " + num + " is odd");
        }
    }

    static void kaveri(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }

    static void ajay() {
        System.out.println("THIS IS AJAY");
    }

    public static void main(String[] args) {
        double b = 5.8;
        double h = 8.6;
        double area;
        int num = 100;

        area = (b * h) / 2;

        // System.out.print("Area of Triangle is: ",area);

        ajay();
        sneha(num);
        kaveri(1,2);
    }
}

