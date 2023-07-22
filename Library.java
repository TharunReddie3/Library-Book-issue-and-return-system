import java.util.HashMap;

public class Library {
    private HashMap<String,Boolean> h;

    public Library(){
        h=new HashMap<>();
    }

    public void addBook(String Book){
        h.put(Book,true);
    }

    public void getBook(String Book){
        if(h.containsKey(Book) && h.get(Book))
            System.out.println(Book+" is available for reading");
        else
            System.out.println("Not Available");
    }

    public void issueBook(String Book){
        if(h.get(Book)){
            h.put(Book,false);
            System.out.println(Book+" issued");
        }
        else
            System.out.println("Not Available");
    }

    public void returnBook(String Book){
        h.put(Book,true);
    }

    public void displayBooks(){
        System.out.println(h.keySet());
    }
}
