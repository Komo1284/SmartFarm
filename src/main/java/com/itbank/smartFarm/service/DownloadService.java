package com.itbank.smartFarm.service;

import org.springframework.stereotype.Service;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DownloadService {
    private final Path rootLocation = Paths.get("src/main/resources/static/download");

    public Resource loadFileAsResource(String filename) throws IOException {
        Path file = rootLocation.resolve(filename);
        if (!Files.exists(file)) {
            // 파일이 존재하지 않는 경우
            System.out.println("File does not exist: " + file.toString());
            return null;
        }
        // 파일의 URL을 사용하여 UrlResource 객체를 생성하여 반환
        return new UrlResource(file.toUri());
    }
}
