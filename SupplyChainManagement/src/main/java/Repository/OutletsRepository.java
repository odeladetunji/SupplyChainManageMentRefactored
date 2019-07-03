package Repository;


import Models.Outlets;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OutletsRepository extends CrudRepository<Outlets, Long> {
   List<Outlets> findStoreById(String Identity);
   List<Outlets> findOutletsByBranchIdentity(String param);
}
