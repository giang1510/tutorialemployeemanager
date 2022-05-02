package com.fixeo.tutorialemployeemanager;

import com.fixeo.tutorialemployeemanager.enumeration.Status;
import com.fixeo.tutorialemployeemanager.model.Server;
import com.fixeo.tutorialemployeemanager.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Arrays;

import static com.fixeo.tutorialemployeemanager.enumeration.Status.SERVER_DOWN;
import static com.fixeo.tutorialemployeemanager.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class TutorialemployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialemployeemanagerApplication.class, args);
	}

	@Bean
	public CorsFilter corsFilter(){
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList(
				"http://localhost:4200"
		));
		corsConfiguration.setAllowedHeaders(Arrays.asList(
				"Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"
		));
		corsConfiguration.setExposedHeaders(Arrays.asList(
				"Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"
		));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
//			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/img/server1.png", SERVER_UP));
//			serverRepo.save(new Server(null, "192.168.1.58", "Fedora Linux", "16 GB", "Dell Tower","http://localhost:8080/server/img/server2.png", SERVER_DOWN));
//			serverRepo.save(new Server(null, "192.168.1.21", "MS 2008", "32 GB", "Web Server", "http://localhost:8080/server/img/server3.png", SERVER_UP));
//			serverRepo.save(new Server(null, "192.168.1.14", "Red Hat Enterprise Linux", "64 GB", "Mail Server", "http://localhost:8080/server/img/server4.png", SERVER_DOWN));
		};
	}
}
