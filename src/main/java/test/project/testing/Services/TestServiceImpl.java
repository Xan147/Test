package test.project.testing.Services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import test.project.testing.Dtos.TestResponseDto;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{
    
    @Override
    public TestResponseDto prueba() {
        return new TestResponseDto(
            "Prueba realizada",
            LocalDateTime.now().toString()
        );
    }
}
