package sopt.org.fourthSeminar.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sopt.org.fourthSeminar.common.dto.ApiResponse;
import sopt.org.fourthSeminar.config.resolver.UserId;
import sopt.org.fourthSeminar.controller.dto.request.BoardRequestDto;
import sopt.org.fourthSeminar.exception.Success;

import javax.validation.Valid;

@SecurityRequirement(name = "JWT Auth")
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class ImageController {

//    @PostMapping(value = "/delete")
//    @ResponseStatus(HttpStatus.OK)
//    public ApiResponse delete(
//            Long ImageId,
//            @ModelAttribute @Valid final BoardRequestDto request){
//        s3Service.deleteFile(request.getThumbnail().get);
//        return ApiResponse.success(Success.DELETE_BOARD_SUCCESS);
//    }
}
