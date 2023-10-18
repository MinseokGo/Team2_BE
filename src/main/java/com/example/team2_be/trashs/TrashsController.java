package com.example.team2_be.trashs;

import com.example.team2_be.core.security.CustomUserDetails;
import com.example.team2_be.core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/albums/{albumId}/trashs")
public class TrashsController {

    //휴지통 조회 GET
    @GetMapping("/")
    public ResponseEntity<ApiUtils.ApiResult> findTrashs(@AuthenticationPrincipal CustomUserDetails userDetails){
        Long userId = userDetails.getUser().getId();

    }

}
