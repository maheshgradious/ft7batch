public class SquareRoot {
    public static void main(String args[]){
        int n = 24;
        double i, precision = 0.00001;
        for(i = 1; i*i <=n; ++i);
        for(--i; i*i < n; i += precision);
        System.out.println("Square root of given number "+i);
        functionmdabu();
    }

    public static void functionmdabu(){
        System.out.println("I am mdabu");
    }
}

