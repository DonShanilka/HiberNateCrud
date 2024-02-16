package lk.ijse.Dto;

import lk.ijse.Dto.Factory.SupperDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class StudentDto implements SupperDto {
    private String id;
    private String name;


}
