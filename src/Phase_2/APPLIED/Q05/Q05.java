//Create a class Library where the book list is private, and only controlled methods (addBook, removeBook) can modify it — no direct getter for the raw list.
package Phase_2.APPLIED.Q05;

public class Q05
{
    public static void main(String[] args)
    {
        Library library = new Library();

        System.out.println(library.addBook("paras"));
        System.out.println(library.addBook("surti"));
        System.out.println(library.addBook("pranay"));

//        System.out.println(library.bookList);
    }
}
