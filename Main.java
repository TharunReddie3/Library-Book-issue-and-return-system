import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Take Book\n 2.Return Book\n 3.Read a Book\n 4.Display Books");
        Scanner sc=new Scanner(System.in);

        Library l=new Library();
        l.addBook("Java");
        l.addBook("Python");
        l.addBook("C");
        l.addBook("C++");
        l.addBook("DSA");

        boolean flag=true;
        while (flag) {
            System.out.println("Choose Option:");
            int n=sc.nextInt();
            switch (n) {
                case 1:
                    String Book = sc.next();
                    l.issueBook(Book);
                case 2:
                    String B = sc.next();
                    l.returnBook(B);
                case 3:
                    String Book1 = sc.next();
                    l.getBook(Book1);
                case 4:
                    l.displayBooks();
            }
            System.out.println("Do You Want to Continue:Yes/No");
            String d=sc.next();
            if(d.equals("No") || d.equals("no"))
                flag=!flag;
        }
    }
}