package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int bookId;
    String bookName;
    private String author;
    private double cost;
    
//    public Book(int bookId, String bookName, String author, double cost) {
//        this.bookId = bookId;
//        this.bookName = bookName;
//        this.author = author;
//        this.cost = cost;
//    }
//
//    public Book() {
//    }
//
//    public int getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public double getCost() {
//        return cost;
//    }
//
//    public void setCost(double cost) {
//        this.cost = cost;
//    }
//
//    @Override
//    public String toString() {
//        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", cost=" + cost + "]";
//    }
}
