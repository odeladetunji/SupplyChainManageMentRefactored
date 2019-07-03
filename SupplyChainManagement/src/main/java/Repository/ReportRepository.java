package Repository;

import Models.Reports;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReportRepository extends CrudRepository<Reports, Long> {
    List<Reports> findReportsByStatus(String param);
    List<Reports> findReportsByIdLessThan(int param);
    List<Reports> findReportsByDateIsBetween(Date date0, Date date1);
    List<Reports> findReportsByDateIsLessThan(Date date);
    List<Reports> findReportsByDate(Date date);
    List<Reports> findReportsByDateIsGreaterThan(Date date);

    List<Reports> findReportsByBranchIdentityAndDate(String identity, Date date);
}
