package models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Created by usman on 09/11/2017.
 */
@Data
@Builder
@ToString
public class LivreDto {
    private String type;
    private boolean state;
    private CategorieDto categorie;
    private String titre;
}
