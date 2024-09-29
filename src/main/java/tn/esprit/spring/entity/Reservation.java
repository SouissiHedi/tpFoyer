package tn.esprit.spring.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;

    @PrePersist
    public void generateUUID() {
        if (idReservation == null) {
            idReservation = UUID.randomUUID().toString();  // Convert UUID to String
        }
    }
}
