package za.co.awesomatic.dao;

import org.springframework.data.repository.CrudRepository;
import za.co.awesomatic.entity.Slot;

public interface SlotRepository extends CrudRepository<Slot, Long> {
}
