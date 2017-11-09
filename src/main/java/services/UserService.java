package services;

import entities.LivreEntity;
import models.LivreDto;
import org.springframework.stereotype.Service;
import repositories.LivreRepository;

import java.util.Optional;

/**
 * Created by usman on 09/11/2017.
 */
@Service
public class UserService implements IUserService {
    private final LivreRepository livreRepository;

    public UserService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    public Optional<LivreDto> createLivre(LivreDto livreDto){

            LivreEntity livre = new LivreEntity();
        livre.setTitre(livreDto.getTitre());
            LivreEntity livreE= livreRepository.save(livre);
            return (livreE!= null) ?
                    Optional.of(
                            LivreDto.builder()
                                    .state(true)
                                    .titre(livreE.getTitre())
                                    .build()
                    )
                    : Optional.empty();
        }

    @Override
    public LivreDto empruntLivre(String id) {
        return null;
    }

}
