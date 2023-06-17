package org.example.data.entity;

import java.io.Serializable;

import java.time.LocalDateTime;
import javax.persistence.*;




@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,updatable = false)
    public LocalDateTime insertDateTime;

    @Column(nullable = false,updatable = false)
    public Long insertUserId;

    @Column(nullable = false)
    public LocalDateTime lastUpdateDateTime;

    @Column(nullable = false)
    public Long lastUpdateUserId;

    private Boolean isDeleted = false;
}
