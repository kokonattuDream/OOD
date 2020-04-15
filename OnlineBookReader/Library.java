package OnlineBookReader;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> books;

    public Library(){
        books = new HashMap<>();
    }

    public Book addBook(int id, Book book){
        if(books.containsKey(id)){
            return null;
        }
        books.put(id, book);

        return book;
    }

    public boolean removeBook(Book book){
        return books.remove(book.getId()) != null;
    }

    public Book find(int id){
        return books.get(id);
    }
    
}