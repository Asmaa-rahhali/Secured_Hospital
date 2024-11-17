package ma.poo.patients_securized;

import lombok.AllArgsConstructor;
import ma.poo.patients_securized.security.repositories.AppRoleRepo;
import ma.poo.patients_securized.security.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ma.poo.patients_securized.repositories.PatientRepo;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication
@AllArgsConstructor
public class PatientsSecurizedApplication implements CommandLineRunner {
//    JdbcUserDetailsManager jdbcUserDetailsManager;
//    private PasswordEncoder passwordEncoder;

    private AccountService accountService;
    public static void main(String[] args) {
        SpringApplication.run(PatientsSecurizedApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        //**********JDBC AUTH*************
//        if(!jdbcUserDetailsManager.userExists("user3")){
//            jdbcUserDetailsManager.createUser(
//                    User.withUsername("user3")
//                            .password(passwordEncoder.encode("1234"))
//                            .roles("USER")
//                            .build()
//            );
//        }
//        if(!jdbcUserDetailsManager.userExists("user4")){
//            jdbcUserDetailsManager.createUser(
//                    User.withUsername("user4")
//                            .password(passwordEncoder.encode("1234"))
//                            .roles("USER")
//                            .build()
//            );
//        }
//        if(!jdbcUserDetailsManager.userExists("admin2")){
//            jdbcUserDetailsManager.createUser(
//                    User.withUsername("admin2")
//                            .password(passwordEncoder.encode("1234"))
//                            .roles("USER", "ADMIN")
//                            .build()
//            );
//        }
        //**********UserDetailsService AUTH***************
//        accountService.addRole("USER");
//        accountService.addRole("ADMIN");

//        accountService.addUser("user5","1234","user5@gmail.com","1234");
//        accountService.addUser("user6","1234","user6@gmail.com","1234");
//        accountService.addUser("admin3","1234","admin3@gmail.com","1234");

//        accountService.addRoleToUser("user5","USER");
//        accountService.addRoleToUser("user6","USER");
//        accountService.addRoleToUser("admin3","ADMIN");
//        accountService.addRoleToUser("admin3","USER");


    }
}
