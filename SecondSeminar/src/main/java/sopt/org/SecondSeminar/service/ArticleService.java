package sopt.org.SecondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.article.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.domain.article.Article;
import static sopt.org.SecondSeminar.SecondSeminarApplication.articleList;

@Service
public class ArticleService {
    public Long registerArticle(RegisterRequestDto request) {

        // 받아온 request 데이터를 토대로 실제 User 객체 생성
        Article newArticle = new Article(
                request.getTitle(),
                request.getText()
        );

        // 데이터베이스에 저장
        articleList.add(newArticle);
        newArticle.setId((long) articleList.size());

        // 저장한 유저 아이디 값 반환
        return newArticle.getId();
    }
    public String searchByArticleTitle(String title){
        for (Article wantArticle: articleList){
            if (wantArticle.getTitle().equals(title)){
                Long num = wantArticle.getId();
                String temp_title = wantArticle.getTitle();
                String temp_text = wantArticle.getText();
                return "id="+num+"\n title="+temp_title+"\n text="+temp_text;
            }
        }
        return "게시물이 존재하지 않습니다.";

    }
    public String searchByArticleId(Long article_id){
        for (Article wantArticle: articleList){
            if (wantArticle.getId()==article_id){
                Long num = wantArticle.getId();
                String temp_title = wantArticle.getTitle();
                String temp_text = wantArticle.getText();
                return "id="+num+"\n title="+temp_title+"\n text="+temp_text;
            }
        }
        return "게시물을 찾을 수 없습니다.";

    }
}
