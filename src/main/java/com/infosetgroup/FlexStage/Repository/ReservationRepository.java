package com.infosetgroup.FlexStage.Repository;

import com.infosetgroup.FlexStage.Entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository <Reservation,Integer> {
}
