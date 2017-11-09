package entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by usman on 09/11/2017.
 */
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String lastName;

    @Column(name = "prenom")
    private String firstName;

    @OneToMany(mappedBy = "userEntity")
    public Set<LivreEntity> livre;
}
