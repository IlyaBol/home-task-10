package tests.properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

@Tag("properties")
public class OwnerTests {
    public CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

    @Test
    void readCredentialTest() {
        String username = credentials.username();
        String password = credentials.password();
        String Url = System.getProperty("Url", "selenoid.autotests.cloud/wd/hub/");


        System.out.println(username);
        System.out.println(password);
        String message = format("https://%s:%s@%s", username, password, Url);
        System.out.println(message);
    }
}
