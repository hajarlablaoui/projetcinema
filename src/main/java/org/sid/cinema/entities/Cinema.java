package org.sid.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@CrossOrigin("*")
public class Cinema implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longitude,latitude,altitude;
    private int nombreSalles;
    @OneToMany(mappedBy = "cinema")
    private Collection<Salle> salles;
    @ManyToOne
    private Ville ville;
}
