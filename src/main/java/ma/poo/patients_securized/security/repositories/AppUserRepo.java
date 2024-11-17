package ma.poo.patients_securized.security.repositories;

import ma.poo.patients_securized.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);
}
