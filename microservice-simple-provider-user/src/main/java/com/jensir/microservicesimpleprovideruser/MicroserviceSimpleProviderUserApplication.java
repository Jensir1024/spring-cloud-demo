package com.jensir.microservicesimpleprovideruser;

import com.jensir.microservicesimpleprovideruser.dao.UserRepository;
import com.jensir.microservicesimpleprovideruser.domain.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
public class MicroserviceSimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleProviderUserApplication.class, args);
    }

    @Bean
    ApplicationRunner init(UserRepository repository){
        return args -> {
            User user1 = new User(1L,"jensir1","gcz1",18,new BigDecimal(100.00));
            User user2 = new User(2L,"jensir2","gcz2",18,new BigDecimal(100.00));
            User user3 = new User(3L,"jensir3","gcz3",18,new BigDecimal(100.00));
            User user4 = new User(4L,"jensir4","gcz4",18,new BigDecimal(100.00));
            Stream.of(user1,user2,user3,user4).forEach(repository::save);
        };
    }

}
