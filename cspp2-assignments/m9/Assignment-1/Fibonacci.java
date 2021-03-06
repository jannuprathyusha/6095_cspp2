import java.util.Scanner;

/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 *
 */
/**
*main class.
*/
final class Fibonacci {
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     * Look for the hint.txt if some of the testcases fail.
     */
    /**
    Fibnocci class.
    */
    private Fibonacci() {
    /**
    *This is a constructor
    */
    }
    /**
    method for fibonacci.
    *@return array
    /**parameters
    *@param numberRange int
    */
    public static List fib(final int numberRange) {
        List list = new List(numberRange);
        list.add(0);
        list.add(1);
        int fibNum1 = 0;
        int fibNum2 = 1;
        int nextFib = 0;
        for (int i = 2; i < numberRange; i++) {
        nextFib = fibNum1;
        fibNum1 = fibNum2;
        fibNum2 = nextFib + fibNum2;
        list.add(fibNum2);
         }
         return list;
     }
     /**
     main function.
     *@param args String
     */
     public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int numRange = s.nextInt();
        System.out.println(fib(numRange));
    }
}




