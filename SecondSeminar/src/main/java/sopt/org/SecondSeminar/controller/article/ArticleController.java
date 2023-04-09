package sopt.org.SecondSeminar.controller.article;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.controller.article.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.domain.article.Article;
import sopt.org.SecondSeminar.service.ArticleService;

import static sopt.org.SecondSeminar.SecondSeminarApplication.articleList;


@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;
    @PostMapping("/article")
    public String registerArticle(@RequestBody final RegisterRequestDto request) {

        // 서비스 계층에 게시물을 등록하는 메서드를 호출
        Long articleId = articleService.registerArticle(request);
        System.out.println(articleList.get(articleId.intValue() - 1).toString());

        return articleId + "번 게시물이 등록되었습니다!";
    }
    @GetMapping("/article/{articleId}")
    public String getOneById(@PathVariable final Long articleId) {
        System.out.println("게시물 번호: " + articleId);
        // 서비스 계층에서 게시물 아이디로 게시물을 찾는 메서드 호출
        return articleService.searchByArticleId(articleId);
    }

    @GetMapping("/article/search")
    public String searchOneByTitle(@RequestParam final String title) {
        System.out.println("게시물 이름 검색 인자: " + title);
        // 서비스 계층에서 게시물 제목으로 게시물을 찾는 메서드 호출
        return articleService.searchByArticleTitle(title);
    }
}
