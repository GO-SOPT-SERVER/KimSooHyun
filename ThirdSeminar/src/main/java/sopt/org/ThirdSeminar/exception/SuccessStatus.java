package sopt.org.ThirdSeminar.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessStatus { //우리 밑에 만든 private변수애들을 대표하는 하나의 문자열 비슷한 걸로 만들어서 반환하는 enum 열거형

    /*
    user
     */
    SIGNUP_SUCCESS(HttpStatus.CREATED, "회원가입이 완료되었습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String message;
}