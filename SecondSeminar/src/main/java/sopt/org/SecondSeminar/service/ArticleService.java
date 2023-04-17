package sopt.org.SecondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.article.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.domain.article.Article;
import java.util.Optional;

import static sopt.org.SecondSeminar.SecondSeminarApplication.articleList;

@Service
public class ArticleService {
    public Long registerArticle(RegisterRequestDto request) {

        // 받아온 request 데이터를 토대로 실제 Article 객체 생성
        Article newArticle = new Article(
                request.getTitle(),
                request.getText()
        );

        // 데이터베이스에 저장
        articleList.add(newArticle);
        newArticle.setId((long) articleList.size());

        // 저장한 게시물 아이디 값 반환
        return newArticle.getId();
    }
    public String searchByArticleTitle(String title){
        Optional<Article> article = articleList.stream()    //게시물 리스트를 stream으로 만들고 제목 같은 게시물 중 첫번째 값 저장
                .filter(wantPost -> wantPost.getTitle().equals(title))
                .findFirst();
                return article.map(wantPost->"id="+wantPost.getId()+"\ntitle="+wantPost.getTitle()+"\ntext="+wantPost.getText())  //map으로 스트림의 요소에 저장된 값 중 원하는 필드 뽑아내기
                        .orElse("게시물이 존재하지 않습니다."); //조건에 맞는게 없으면 이 문자열 리턴
            }

    public String searchByArticleId(Long articleId){
        Optional<Article> article = articleList.stream()    //게시물 리스트를 stream으로 만들고 아이디 같은 게시물 하나 뽑음.
                .filter(wantPost -> wantPost.getId().equals(articleId))
                .findFirst();       //근데 어차피 id값은 pk라 하나일텐데 그냥 findFirst 박아야되나?
        return article.map(wantPost->"id="+wantPost.getId()+"\ntitle="+wantPost.getTitle()+"\ntext="+wantPost.getText())  //map으로 스트림의 요소에 저장된 값 중 원하는 필드 뽑아내기
                .orElse("게시물이 존재하지 않습니다."); //조건에 맞는게 없으면 이 문자열 리턴
    }

}
