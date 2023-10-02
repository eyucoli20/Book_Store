public class BookInLibrary {

    private String name;
    private int maxBooks;
    private int booksInStock;
    private double revenue;
    private Book[] books;

    public BookInLibrary(String name, int maxBooks){
        this.name = name;
        this.maxBooks = maxBooks;
        this.booksInStock = 0;
        this.revenue = 0;
        this.books = new Book[maxBooks];
    };

    public String getname() {
        return name;
    }

    public int getmaxBooks() {
        return maxBooks;
    }

    public double getRevenue() {
        return revenue;
    }

    public int getBooksInStock(){
        return booksInStock;
    }

    public void addBook(Book book) {
        if (booksInStock < maxBooks) {
            books[booksInStock] = book;
            booksInStock++;
        } else {
            System.out.println("The bookstore is full");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < booksInStock; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i] = null;
                shiftBooksArray(i);
                booksInStock--;
                break;
            }
        }
    }

    public void sellBook(String title, Person customer) {
        for (int i = 0; i < booksInStock; i++) {
            if (books[i].getTitle().equals(title)) {
                if(!books[i].isSold()) {
                    customer.buyBook(books[i]);
                    books[i].setSold(true);
                    revenue += books[i].getPrice();
                } else {
                    System.out.println("Sorry, The book '" + title + "' is already sold.");
                } break;
            }
        }
    }

    private void shiftBooksArray(int indexToRemove) {
        for (int i = indexToRemove; i < booksInStock -1; i++) {
            books[i] = books[i + 1];
        }
    }

    public void listBooks() {
        System.out.println(" Books in " + name + ":");
        for (int i = 0; i < booksInStock; i++) {
            System.out.println(books[i].getTitle() + " by " + books[i].getAuthor());
        }
    }

}

    






