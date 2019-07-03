package Repository;

import Models.Login;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoginRepository extends CrudRepository<Login, Long> {
    List<Login> checkCredentials(String username, String password);
}
