package controllers;

import models.LivreDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.UserService;

import java.util.Optional;

/**
 * Created by usman on 09/11/2017.
 */

@RestController
@RequestMapping(path = "/bu")
public class UserController{

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/createLivre/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> createLivre(@RequestBody LivreDto livreDto) {

        final Optional<LivreDto> dtoOpt = userService.createLivre(livreDto);
        System.out.println("ID recu : "+livreDto.getTitre()+"......"+dtoOpt.get().toString());
        return (dtoOpt.isPresent()) ?
                new ResponseEntity<>(dtoOpt.get(), HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
