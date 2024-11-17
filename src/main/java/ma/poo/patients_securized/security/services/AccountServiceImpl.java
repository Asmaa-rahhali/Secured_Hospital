package ma.poo.patients_securized.security.services;

import lombok.AllArgsConstructor;
import ma.poo.patients_securized.security.entities.AppRole;
import ma.poo.patients_securized.security.entities.AppUser;
import ma.poo.patients_securized.security.repositories.AppRoleRepo;
import ma.poo.patients_securized.security.repositories.AppUserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService{
    private AppUserRepo appUserRepo;
    private AppRoleRepo appRoleRepo;
    private PasswordEncoder passwordEncoder;

    @Override
    public AppUser addUser(String username, String password, String email, String confirmPassword) {
        AppUser appUser=appUserRepo.findByUsername(username);
        if(appUser!=null) throw new RuntimeException("User already exists");
        if(!password.equals(confirmPassword)) throw new RuntimeException("Passwords don't match");
        appUser= AppUser.builder()
                .userId(UUID.randomUUID().toString())
                .username(username)
                .password(passwordEncoder.encode(password))
                .email(email)
                .build();
        AppUser savedAppUser=appUserRepo.save(appUser);
        return savedAppUser;
    }

    @Override
    public AppRole addRole(String role) {
        AppRole appRole=appRoleRepo.findById(role).orElse(null);
        if(appRole!=null) throw new RuntimeException("Role already exists");
        appRole= AppRole.builder().role(role).build();
        return appRoleRepo.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String role) {
        AppUser appUser=appUserRepo.findByUsername(username);
        AppRole appRole=appRoleRepo.findById(role).get();
        appUser.getRoles().add(appRole);
    }

    @Override
    public void removeRoleFromUser(String username, String role) {
        AppUser appUser=appUserRepo.findByUsername(username);
        AppRole appRole=appRoleRepo.findById(role).get();
        appUser.getRoles().remove(appRole);
    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return appUserRepo.findByUsername(username);
    }
}
