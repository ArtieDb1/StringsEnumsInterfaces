package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //hashcode for an object stays the same for the time a program runs
        String hello = "hello";
        String hello1 = new String("hello");
        String hello2 = "hello";
        String hello3 = new String("hello");

        //when we run the following, we are saying that the hashcode
        //is the same as
        // we override the

        //
///ALL THE SAME HASH CODE BECAUSE OF THE CONTENT WITHIN THE STRING

        System.out.println(hello.hashCode());
        System.out.println(hello1.hashCode());
        System.out.println(hello2.hashCode());
        System.out.println(hello3.hashCode());

        //DIFFERENT BECAUSE THEY ARE DIFFERENT OBJECT
        //hello AND hello2 are the same because java looks at the content and creates one object that
        //points to the content
        //the keyword new looks outside of that string pool

        //When we don't override the hashcode notice that hello 1 and hello3 are different
        //This is because they have the new keyword and in system they
        System.out.println(System.identityHashCode(hello));
        System.out.println(System.identityHashCode(hello1));
        System.out.println(System.identityHashCode(hello2));
        System.out.println(System.identityHashCode(hello3));

        StringBuilder a = new StringBuilder("HelloArtie ");
        System.out.println(a);

    }
}
