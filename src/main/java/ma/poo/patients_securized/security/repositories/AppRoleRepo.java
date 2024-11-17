package ma.poo.patients_securized.security.repositories;

import ma.poo.patients_securized.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepo extends JpaRepository<AppRole,String> {
}
