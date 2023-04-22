package sopt.org.ThirdSeminar.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponseDto {

    private Long userId;
    private String nickname;

    public static UserResponseDto of(Long userId, String nickname) { //of를 이용해서 dto끼리 서로 변환? 해준다.
        return new UserResponseDto(userId, nickname);
    }
}