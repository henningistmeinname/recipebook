package name.henningistmein.data;


import org.springframework.data.annotation.Id;

public class Category {

    @Id
    private String id;

    private String name;
    private Integer rank;

    public Category() {

    }

    public Category(String name, Integer rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("Category[id=%s, name='%s', rank='%s']", id,
                name, rank);
    }

}
