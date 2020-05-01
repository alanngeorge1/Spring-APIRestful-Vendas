package github.com.alanngeorge1;

import github.com.alanngeorge1.domain.entity.Cliente;
import github.com.alanngeorge1.domain.repository.Clientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendasApplication {



    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            System.out.println("Salvando clientes");
            clientes.save(new Cliente("Alan George"));
            clientes.save(new Cliente("Outro Cliente"));

         List <Cliente> result = clientes.encontrarPorNome("Alan George");
            result.forEach(System.out::println);


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}