package Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProcurementRequestRepository extends CrudRepository<ProcurementRequestRepository, Long> {
    List<ProcurementRequestRepository> getAllProcurementRequest();
}
