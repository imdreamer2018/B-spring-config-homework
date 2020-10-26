package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("mail")
public class MailConfig {

    private String hostname;
    private int port;
    private String from;
    private List<String> defaultRecipients;
    private Map<String,Boolean> additionalHeaders;
    private CredentialsProperties credentials;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }

    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    public Map<String, Boolean> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, Boolean> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    private static class CredentialsProperties {
        private String username;
        private String password;
        private String authMethod;

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getAuthMethod() {
            return authMethod;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
        }
    }

    public CredentialsProperties getCredentials() {
        return credentials;
    }

    public void setCredentials(CredentialsProperties credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ", defaultRecipients=['" +
                defaultRecipients.get(0) + "', '" +
                defaultRecipients.get(1) + "']" +
                ",additionalHeaders={" +
                "redelivery=" + additionalHeaders.get("redelivery") +
                ",secure=" + additionalHeaders.get("secure") +
                "}" +
                ",credentials={" +
                "username='" + credentials.username + '\'' +
                ",password='" + credentials.password + '\'' +
                ",authMethod='" + credentials.authMethod + '\'' +
                "}" +
                "}";
    }
}
