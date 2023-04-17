package sopt.org.SecondSeminar;
import sopt.org.SecondSeminar.domain.user.User;
import sopt.org.SecondSeminar.domain.article.Article;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
@SpringBootApplication
public class SecondSeminarApplication {
	public static ArrayList<User> userList;
	public static ArrayList<Article> articleList;

	public static void main(String[] args) {
		SpringApplication.run(SecondSeminarApplication.class, args);
		userList = new ArrayList<>();
		articleList = new ArrayList<>();
	}

}
