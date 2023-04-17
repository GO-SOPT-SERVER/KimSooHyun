package sopt.org.SecondSeminar.controller.article.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter()
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisterRequestDto {
    String title;
    String text;

}
