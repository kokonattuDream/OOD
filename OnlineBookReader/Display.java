package OnlineBookReader;

public class Display {
    private Book activeBook;
    private User activeUser;
    private int pageNumber = 0;

    public void displayUser(User user){
        activeUser = user;
    }

    public void displayBook(Book book){
        pageNumber = 0;
        activeBook = book;
    }

    public void turnPageForward(){
        pageNumber++;
        refreshPage();
    }

    public void turnPageBackward(){
        pageNumber--;
        refreshPage();
    }

    public void refreshPage(){

    }
    
}