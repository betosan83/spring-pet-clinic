package rbf.springframework.rbfpetclinic.services;

import rbf.springframework.rbfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
