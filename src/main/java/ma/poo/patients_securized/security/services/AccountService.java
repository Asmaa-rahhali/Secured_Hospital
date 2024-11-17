package ma.poo.patients_securized.security.services;

import ma.poo.patients_securized.security.entities.AppRole;
import ma.poo.patients_securized.security.entities.AppUser;

public interface AccountService {
    AppUser addUser(String username, String password, String email, String confirmPassword);
    AppRole addRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);

    AppUser loadUserByUsername(String username);
}


