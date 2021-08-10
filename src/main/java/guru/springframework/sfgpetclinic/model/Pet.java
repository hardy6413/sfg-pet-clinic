package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthtime;

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

    public LocalDate getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(LocalDate birthtime) {
        this.birthtime = birthtime;
    }
}
