package iofilestest.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public void add(Book book) {
        List<Book> newBooks = new ArrayList<>();
        for ( Book b : books) {
            if (!b.getAuthor().equals(book.getAuthor()) && !b.getTitle().equals(book.getTitle())) {
                newBooks.add(book);
            }
        }
    }


    public void saveBooks(Path path) {
        try(PrintStream os = new PrintStream(Files.newOutputStream(path))){
            for(Book b : books) {
                os.println(b.getAuthor()+ "-" + b.getTitle());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!",e);
        }
    }
    public List<Book> loadBooks(Path path) {
        List<Book> result = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(path)))) {
            String line;
            while((line=br.readLine()) != null) {
                String[] parts = line.split("-");
                Book b = new Book(parts[0],parts[1]);
                result.add(b);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
        return result;
    }

    public List<Book> getBooks() {
        return books;
    }
}


