package entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by usman on 09/11/2017.
 */
@Data
@Entity(name = "live")
public class LivreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "titre")
    private String titre;
}
