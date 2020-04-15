package OnlineBookReader;

public class OnlineReaderSystem {
    private Library library;
    private UserManager userManager;
    private Display display;
    private Book activeBook;
    private User activeUser;

    public OnlineReaderSystem(){
        userManager = new UserManager();
        library = new Library();
        display = new Display();
    }

    /**
     * @return Library return the library
     */
    public Library getLibrary() {
        return library;
    }

    /**
     * @param library the library to set
     */
    public void setLibrary(Library library) {
        this.library = library;
    }

    /**
     * @return UserManager return the userManager
     */
    public UserManager getUserManager() {
        return userManager;
    }

    /**
     * @param userManager the userManager to set
     */
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    /**
     * @return Display return the display
     */
    public Display getDisplay() {
        return display;
    }

    /**
     * @param display the display to set
     */
    public void setDisplay(Display display) {
        this.display = display;
    }

    /**
     * @return Book return the book
     */
    public Book getActiveBook() {
        return activeBook;
    }

    /**
     * @param book the book to set
     */
    public void setActiveBook(Book book) {
        this.activeBook = activeBook;
        display.displayBook(book);
    }

    /**
     * @return User return the user
     */
    public User getActiveUser() {
        return activeUser;
    }

    /**
     * @param user the user to set
     */
    public void setActiveUser(User user) {
        this.activeUser = user;
    }

}