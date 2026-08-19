package Phase_2.APPLIED.Q05;

import java.util.ArrayList;

public class Library
{
    private ArrayList<String> bookList = new ArrayList<>();

    public String addBook(String bookName)
    {
        bookList.add(bookName);
        return "Book '" + bookName + "' is added inside the list!!";
    }
    public String removeBook(String bookName)
    {
        bookList.remove(bookName);
        return "Book '" + bookName + "' is removed from the list!!";
    }

}
