class constructor {
    int x;

    // Constructor
    constructor() {
        this(1);
        x = 10;
        System.out.println("Constructor called, x initialized to " + x);
    }

    constructor(int value) {
        this("Hello");
        x = value;
        System.out.println("Constructor called with parameter, x initialized to " + x);
    }
    constructor(String message) {
//        this();
        System.out.println("Constructor called with message: " + message);
    }
}
public class Main {
    public static void main(String[] args) {
        constructor obj = new constructor();
        System.out.println("Final value of x: " + obj.x);
    }
}