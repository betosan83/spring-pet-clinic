package rbf.springframework.rbfpetclinic.model;

import java.time.LocalDate;

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
    private String race;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
