package sunil.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sunil.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
