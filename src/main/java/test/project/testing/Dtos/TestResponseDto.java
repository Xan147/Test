package test.project.testing.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestResponseDto {
    private String mensaje;
    private String timestamp;

}
