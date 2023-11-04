package com.example.team2_be.trash;

import com.example.team2_be.core.utils.ApiUtils;
import com.example.team2_be.trash.dto.TrashesFindResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/albums/{albumId}/trashes")
public class TrashController {

    private final TrashService trashService;

    //휴지통 조회 GET
    @GetMapping
    public ResponseEntity<ApiUtils.ApiResult<TrashesFindResponseDTO>> findTrashes (@PathVariable Long albumId){
        TrashesFindResponseDTO findDTO = trashService.findTrashes(albumId);

        return ResponseEntity.ok(ApiUtils.success(findDTO));
    }

    @PostMapping("/{trashId}")
    public ResponseEntity<ApiUtils.ApiResult<Void>> restoreTrash(@PathVariable String albumId, @PathVariable Long trashId){
        trashService.restoreTrash(trashId);

        return ResponseEntity.ok(ApiUtils.success(null));
    }
}