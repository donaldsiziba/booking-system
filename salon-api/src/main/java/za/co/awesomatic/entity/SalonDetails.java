package za.co.awesomatic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalonDetails {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phone;
}
