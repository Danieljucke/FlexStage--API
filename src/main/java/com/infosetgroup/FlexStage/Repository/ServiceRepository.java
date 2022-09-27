package com.infosetgroup.FlexStage.Repository;

import com.infosetgroup.FlexStage.Entity.Service;
import org.springframework.data.repository.CrudRepository;

//CrudRepository permet de dire que ce repository fera la création, la lecture, la mise a jour et la suppression
public interface ServiceRepository extends CrudRepository<Service,Integer> {

}
