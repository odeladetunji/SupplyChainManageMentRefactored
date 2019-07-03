package Repository;

import Models.Registration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistrationRepository extends CrudRepository<Registration, Long> {
    List<Registration> createCompany(String companyName,
                                     String companyEmail,
                                     Long telephone1,
                                     Long telephone2,
                                     Long telephone3,
                                     Long telephone4,
                                     String username,
                                     String password,
                                     String address,
                                     String city,
                                     String country,
                                     String adminEmail);

    List<Registration> findDistinctById(Long id);
    List<Registration> findDistinctByAdminEmail(String email);
}

