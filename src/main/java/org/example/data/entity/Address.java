package org.example.data.entity;



import java.io.Serializable;

import java.time.LocalDateTime;
import javax.persistence.*;
@Entity
@Table(name = "addresses")
public class Address extends BaseEntity {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
