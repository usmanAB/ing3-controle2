package services;

import models.LivreDto;

import java.util.Optional;

/**
 * Created by usman on 09/11/2017.
 */
public interface IUserService {
    Optional<LivreDto> createLivre(LivreDto livreDto);

    LivreDto empruntLivre(String id);
}
