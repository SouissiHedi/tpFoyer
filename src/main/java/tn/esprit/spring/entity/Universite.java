package tn.esprit.spring.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;


    @OneToMany(mappedBy = "universite", cascade = CascadeType.ALL)
    private Set<Foyer> foyers;
}
