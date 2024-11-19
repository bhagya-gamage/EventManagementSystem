package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Event {
    private Integer id;
    private Integer eventPlannerId;
    private String eventName;
    private String eventCategory;
    private String venue;
    private int noOfTickets;
    private double ticketPrice;
    private String date;
    private byte[] image;
}
