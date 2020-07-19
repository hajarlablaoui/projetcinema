package org.sid.cinema.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin("*")
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private double prix;
    @Column(unique = false)
    private Integer codePaiement;
    private boolean reserve;
    @ManyToOne
    private Place place;
    @ManyToOne
    private  Projection projection;
}
