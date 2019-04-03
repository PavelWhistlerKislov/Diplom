package root;

import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import root.domain.model.User;
import root.domain.repo.UserRepository;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner loadData(UserRepository repository) {
        return (args) -> {
            // save a couple of Users
            repository.save(new User());
            repository.save(new User());
            repository.save(new User());
            repository.save(new User());
            repository.save(new User());

            // fetch all Users
            log.info("Users found with findAll():");
            log.info("-------------------------------");
            for (User User : repository.findAll()) {
                log.info(User.toString());
            }
            log.info("");

            // fetch an individual User by ID
            User User = repository.findAll().get(2);
            log.info("User found with findOne(1L):");
            log.info("--------------------------------");
            log.info(User.toString());
            log.info("");

            // fetch Users by last name
            log.info("User found with findByLastNameStartsWithIgnoreCase('Bauer'):");
            log.info("--------------------------------------------");
            for (User bauer : repository
                    .findByLastNameStartsWithIgnoreCase("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }
}
