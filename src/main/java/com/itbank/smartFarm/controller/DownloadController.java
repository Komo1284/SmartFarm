package com.itbank.smartFarm.controller;

import com.itbank.smartFarm.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/download")
public class DownloadController {

    @Autowired
    private DownloadService ds;

    @GetMapping
    public String downloadPage(Model model) {
        // 파일 이름 설정
        model.addAttribute("filename", "IoT.apk");
        return "download";
    }

    // 파일 다운로드 메서드
    @GetMapping("/{filename}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String filename) {
        try {
            // DownloadService를 사용하여 파일을 Resource 객체로 가져옴
            Resource resource = ds.loadFileAsResource(filename);
            if (resource == null || !resource.exists()) {
                // 파일을 찾을 수 없거나 리소스가 존재하지 않는 경우 404 응답 반환
                System.out.println("File not found: " + filename);
                return ResponseEntity.notFound().build();
            }
            // 파일 다운로드 응답 생성
            return ResponseEntity.ok()
                    // Content-Disposition 헤더를 설정하여 파일 다운로드를 브라우저에게 지시
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                    .body(resource);
        } catch (IOException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
