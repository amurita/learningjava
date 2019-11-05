/**
 * Thirty-Fourth Java example program.
 *
 * @version 1.0 23 July, 2019
 * @author Amurita
 */

package de.amurita.chaptertwo;

// Class for showing some scope examples.
public class Scope {

    // Showing differnt scope variants and their possible problems.
    public static void main(String[] args) {
        int foo = 0;
        {
            int bar = 0; // bar is only valid in this block
            System.out.println(bar);
            System.out.println(foo);
            double foob = 0.0; //  Error: Duplicate local variable foo
        }
        System.out.println(foo);
        //System.out.println(bar); //  Error: bar cannot be resolved
    }

    static void qux() {
        int foo, baz; // foo has nothing to do with foo from main().
        {
            //int baz; //  Error: Duplicate local variable baz
            int bazzWord;
        }
    }
}