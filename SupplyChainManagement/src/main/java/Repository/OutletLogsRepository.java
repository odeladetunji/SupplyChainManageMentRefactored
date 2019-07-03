package Repository;

import Models.OutletLogs;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OutletLogsRepository extends CrudRepository<OutletLogs, Long> {
    List<OutletLogs> findOutletLogsById(Long identity);
    List<OutletLogs> findOutletLogsByIdAndStatus(Long identity, String status);
    List<OutletLogs> findOutletLogsByStatus(String status);
}
