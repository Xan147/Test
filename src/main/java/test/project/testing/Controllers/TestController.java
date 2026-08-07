package test.project.testing.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import test.project.testing.Dtos.TestDto;
import test.project.testing.Dtos.TestResponseDto;
import test.project.testing.Services.TestService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestController {
    private final TestService testService;

    @PostMapping
    public ResponseEntity<TestResponseDto> realizarprueba(@RequestBody TestDto testDto) {
        TestResponseDto response = testService.prueba(testDto);
        return ResponseEntity.ok(response);
    }
}
