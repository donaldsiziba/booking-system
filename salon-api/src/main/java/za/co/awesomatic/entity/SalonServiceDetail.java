package za.co.awesomatic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SalonServiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salon_service_detail_id_seq")
    private Long id;
    private String description;
    private String name;
    private Long price;
    private Integer timeInMinutes;
}
