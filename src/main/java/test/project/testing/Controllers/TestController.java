package test.project.testing.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import test.project.testing.Dtos.TestResponseDto;
import test.project.testing.Services.TestService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestController {
    private final TestService testService;

    @GetMapping
    public ResponseEntity<TestResponseDto> realizarprueba() {
        TestResponseDto response = testService.prueba();
        return ResponseEntity.ok(response);
    }
}
