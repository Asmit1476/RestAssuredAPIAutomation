package Pojo.PracticePojo1;

import java.util.ArrayList;
import java.util.List;

public class LibrarySerialize {

    public static void main(String[] args) {

        GetLibrary gl = new GetLibrary();
        gl.setName("Bangalore Library");
        gl.setLocation("Kormangala");

        List<Books> books = new ArrayList<>();
        Books b1 = new Books();
        b1.setTitle("Advanced Java");
        b1.setAuthor("Harper Lee Stan");
        b1.setYear(10);
        List<String> genres = new ArrayList<>();
        genres.add("Fiction");
        genres.add("Coding");
        b1.setGenres(genres);
        books.add(b1);

        Books b2 = new Books();
        b2.setTitle("Advanced Java");
        b2.setAuthor("Harper Lee Stan");
        b2.setYear(10);
        List<String> genres1 = new ArrayList<>();
        genres1.add("Fiction");
        genres1.add("Coding");
        b2.setGenres(genres1);
        books.add(b2);

        gl.setBooks(books);

        List<Librarians> librariansList = new ArrayList<>();
        Librarians librarians1 = new Librarians();
        librarians1.setName("Whitefield");
        librarians1.setPosition("Right");
        librarians1.setYear_of_experience(10);

        librariansList.add(librarians1);

        Librarians librarians2 = new Librarians();
        librarians2.setName("Whitefield");
        librarians2.setPosition("Right");
        librarians2.setYear_of_experience(10);

        librariansList.add(librarians2);

        gl.setLibrarians(librariansList);
        //gl.setLibrarians(Arrays.asList(librarians1,librarians2));



    }
}
