package com.kemalgulpinar.boot.issuetr.issuetracker.github;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GithubClient {
    private static final String EVENT_ISSUES_URL = "https://api.github.com/repos/{owner}/{repo}/issues/events";

    private final RestTemplate restTemplate;

    public GithubClient(RestTemplateBuilder builder){
        this.restTemplate = builder.build();
    }

    public ResponseEntity<RepositoryEvents[]> fetchEvents(String orgName, String repoName){
        return this.restTemplate.getForEntity(EVENT_ISSUES_URL, RepositoryEvents[].class, orgName, repoName);
    }
}
