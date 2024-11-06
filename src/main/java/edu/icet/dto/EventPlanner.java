package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventPlanner {
    private Integer id;
    private String name;
    private String address;
    private String email;
    private String contact;
}
