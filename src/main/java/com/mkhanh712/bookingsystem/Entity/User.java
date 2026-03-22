package com.mkhanh712.bookingsystem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


}
