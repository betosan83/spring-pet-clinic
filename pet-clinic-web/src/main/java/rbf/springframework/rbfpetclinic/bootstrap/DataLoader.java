package rbf.springframework.rbfpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rbf.springframework.rbfpetclinic.model.Owner;
import rbf.springframework.rbfpetclinic.model.Vet;
import rbf.springframework.rbfpetclinic.services.OwnerService;
import rbf.springframework.rbfpetclinic.services.VetService;
import rbf.springframework.rbfpetclinic.services.map.OwnerServiceMap;
import rbf.springframework.rbfpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glen");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Max");
        vet2.setLastName("Rex");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}