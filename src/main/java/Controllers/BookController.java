package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Book;
import services.BookService;

@RestController
//@RequestMapping("/api")
public class BookController 
{
	@Autowired
    private BookService bookService;
    
    @PostMapping("api/addbook")
    public Book addBook(@RequestBody Book b)
    {
    	return bookService.addBook(b);
    }
    
//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }
    
//    @GetMapping("/getAllBooks")
//    public List<Book> getAllBooks() {
//        return bookService.getAllData(); 
//    }
    
}
