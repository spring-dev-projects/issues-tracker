package com.kemalgulpinar.boot.issuetr.issuetracker.github;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;

@ConfigurationProperties("github")
@Validated
public class GithubProperties {


    /**
     * Github API token ("user:sampletoken")
     */
    @Pattern(regexp = "\\w+:\\w+") // "word:word"
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
