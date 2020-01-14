package com.kemalgulpinar.boot.issuetr.issuetracker;

import com.kemalgulpinar.boot.issuetr.issuetracker.github.GithubProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
public class IssueTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssueTrackerApplication.class, args);
	}

}
