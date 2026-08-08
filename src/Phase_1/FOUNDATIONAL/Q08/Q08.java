//Create an array of Book objects, initializing each through a parameterized constructor.
package Phase_1.Foundation.Q08;

import java.util.Arrays;

public class Q08
{
    public static void main(String[] args)
    {
        Books[] book = new Books[3];
        book[0] = new Books(4);
        book[1] = new Books(5);
        book[2] = new Books(6);

        for (int i = 0; i < book.length; i++)
        {
            System.out.println(book[i].num);
        }
    }

}
