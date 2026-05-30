package Pojo.PracticePojo1;

import java.util.List;

public class GetLibrary {
    private String name;
    private String location;
    private List<Books> books;
    private List<Librarians> librarians;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public List<Librarians> getLibrarians() {
        return librarians;
    }

    public void setLibrarians(List<Librarians> librarians) {
        this.librarians = librarians;
    }


}

