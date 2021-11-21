package author;

public class AuthorStorage {
    private Author[] authors = new Author[10];
    private int size = 0;


    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;

    }

    // public void getByIndex(int index) {
    //   if (index < 0 || index > array.length) {
    //     System.err.println("invalid index");
    // return null;
    //}
    //}

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        tmp = authors;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(authors[i]);
        }
    }


    public void searchAuthor(String keyword) {
        for (int i = 0; i <size ; i++) {
            if (authors[i].getName().contains(keyword)||
                    authors[i].getSurname().contains(keyword)){
                System.out.println(authors[i]);
            }
        }
    }

    public void searchAuthorByAge(int minAge, int maxAge) {
        for (int i = 0; i <size ; i++) {
            if (authors[i].getAge()>=minAge && authors[i].getAge()<=maxAge){
                System.out.println(authors[i]);
            }

        }
    }
}