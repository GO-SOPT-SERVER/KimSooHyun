package sopt.org.fourthSeminar.config.resolver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //어노테이션 생성될 수 있는 위치 지정하는 어노테이션
@Retention(RetentionPolicy.RUNTIME) //해당 어노테이션이 얼마나 유효할지
public @interface UserId {
}