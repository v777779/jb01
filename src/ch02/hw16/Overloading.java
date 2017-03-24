
//:   initialization/Overloading.java
package ch02.hw16;


/**
 * Class Tree Description
 * <br>Demonstration of both constructor
 * <br>and ordinary method overloading.
 *
*/
class Tree {
    /**
     * Class Tree fields
     * int height  field Description
     */
    int height;

    /**
     * Class Tree constructor
     * Tree()  default constructor Description
     * the continue of Description
     */
    Tree() {
        Print.print("Planting a seedling");
        height = 0;
    }

    /**
     * Class Tree constructor
     * Tree(int) constructor overloaded Description
     * @param initialHeight  Tree constructor parameter description
     */
     Tree(int initialHeight) {
        height = initialHeight;
        Print.print("Creating new Tree that is " +
                height + " feet tall");
    }

    /**
     * Class Tree methods
     * info() method description
     * continue of description
     */
    void info() {
        Print.print("Tree is " + height + " feet tall");
    }

    /**
     * Class Tree methods
     * info(String) method overloaded description
     * @param s  parameter of info(s) method description
     *
     */
    void info(String s) {
        Print.print(s + ": Tree is " + height + " feet tall");
    }
}
/**
 * <pre>
 * Class Overloading Description <br>
 * Demonstration of both constructor
 * and ordinary method overloading.
 *
 *</pre>
 */
public class Overloading {
    /**
     *  main() method description and parameters overview
      * @param args  input parameters array of String
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
}

/* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
