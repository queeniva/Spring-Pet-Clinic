package com.springpetclinic.services;
import com.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
Owner findByLastName(String lastName);
}
