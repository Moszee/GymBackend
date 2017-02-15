package org.szpax.brothers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.szpax.brothers.model.BodyPart;

import java.util.List;

/**
 * Created by Marcin on 12.02.2017.
 */
@Repository
public interface BodyPartRepository extends CrudRepository<BodyPart,String>{

    List<BodyPart> findAll();

}// ...String> bo twoim Kluczem (ID) jest String w tej tabeli :-)

