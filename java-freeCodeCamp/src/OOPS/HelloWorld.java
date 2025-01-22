package OOPS;
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        User user = new User();

        user.name = "Gaurav";
        user.birthDay = LocalDate.parse("2004-07-29");

        Book book = new Book();

        book.title = "Carnilla";
        book.author = "Sheridan Le Faun";

        user.borrow(book);

        System.out.printf("%s was born back in %s and he is now %d years old.\n", user.name,
                user.birthDay.toString(), user.age());

        System.out.printf("%s has borrowed these book: %s", user.name, user.books.toString());

//        User olderUser = new User();
//        olderUser.name = "Saurabh";
//        olderUser.birthDay = LocalDate.parse("2005-11-08");
//
//        System.out.printf("%s was born back in %s, he is now %d years old.\n", olderUser.name,
//                olderUser.birthDay.toString(), olderUser.age());

    }
}
