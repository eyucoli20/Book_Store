public class Main {

        public static void main(String[] args){

        BookInLibrary myLib = new BookInLibrary("Loard Of The Ring", 2);
        Book myBook = new Book("Mask of zoro", "Leonardo DaVenchi", 25.99 );
        // Person myPerson = new Person("Jack Mendez", 65.98);

        System.out.println(myLib.getname());
        System.out.println(myLib.getmaxBooks());
        System.out.println(myBook.getAuthor());
        myLib.addBook(myBook);
        // System.out.println(myPerson.getName());	
        // System.out.println(myPerson.getWallet());

        // was running late ill finsh and push to githup. 
    };
}
