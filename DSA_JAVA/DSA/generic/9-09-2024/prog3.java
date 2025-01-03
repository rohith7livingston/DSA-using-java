package DSA.generic;

class prog3 {

    static <T> void varargsMethod1(T[] v) {
        System.out.print("Number of elements: " + v.length + " Elements: ");
        for (T x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        // Following arrays are created for testing
        int x[] = {1, 2, 3, 4};
        int y[] = {1, 4};
        int z[] = {};
        prog3 <Integer> p = new <>prog3()
        p.varargsMethod1(x); // Passed 4 values to the method
        p.varargsMethod1(y); // Passed 2 values to the method
        p.varargsMethod1(z); // Passed no argument to the method
    }
}
