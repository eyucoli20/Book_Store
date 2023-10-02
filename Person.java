public class Person {

    private String name;
    private double wallet;
    private Book[] ownedBooks;

    public Person(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.ownedBooks = new Book[10]; //Maximum 10 books a person can own
    }

    public String getName() {
        return name;
    }
    public double getWallet() {
        return wallet;
    }

    public void buyBook(Book book) {
        if(wallet >= book.getPrice()) {
            for (int i = 0; i < ownedBooks.length; i++) {
                if (ownedBooks[i] == null) {
                    ownedBooks[i] = book;
                    wallet -= book.getPrice();
                    break;
                }
            }
        } else {
            System.out.println("Sorry, you don't have money to buy " + book.getTitle());
        }
    }

    public void listOwnedBooks() {
        System.out.println(name + "'s Owned Books: ");
        for (Book book : ownedBooks) {
            if (book != null) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

}
