package test.project.testing.Services;

import test.project.testing.Dtos.TestDto;
import test.project.testing.Dtos.TestResponseDto;

public interface TestService {
    TestResponseDto prueba(TestDto testDto);
}
