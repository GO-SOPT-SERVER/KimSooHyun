package sopt.org.SecondSeminar.domain.article;

import lombok.Getter;
import sopt.org.SecondSeminar.domain.user.User;

@Getter
public class Article {
    private Long id;
    private String title;
    private String text;
//    private User author;
//    private String author_name;

    public Article(String title, String text){
        this.title = title;
        this.text = text;
//        this.id = author.getId();
//        this.author_name = author.getName();

    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "gender: " + this.title + "\n" +
                "name: " + this.text + "\n";
    }

}
