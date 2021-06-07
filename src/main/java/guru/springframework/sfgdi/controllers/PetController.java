package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.stereotype.Controller;

import static java.util.Objects.requireNonNull;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(final PetService petService) {
        this.petService = requireNonNull(petService, "PetService is required");
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
