package org.sid.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.cinema.entities.Cinema;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin("*")
public class Ville {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longitude,latitude,altitude;
    @OneToMany(mappedBy = "ville")
    private Collection<Cinema> cinemas;
}
