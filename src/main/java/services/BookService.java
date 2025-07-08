package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.repo.BookRepo;
import Entity.Book;

@Service
public class BookService 
{
	@Autowired
    private BookRepo bookRepository;


    public List<Book> getAllData() {
        return (List<Book>) bookRepository.findAll();
    }
    public Book addBook(Book b)
    {
    	return bookRepository.save(b);
    }
}
