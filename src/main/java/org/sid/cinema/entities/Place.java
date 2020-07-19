package org.sid.cinema.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin("*")
public class Place {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private double longitude,latitude,altitude;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "place")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Ticket> tickets;
}
