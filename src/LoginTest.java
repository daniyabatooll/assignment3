import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    @Test
    public void testValidLogin() {
        Login login = new Login();
        assertTrue(login.authenticate("John Doe", "password123"), "Expected login to succeed with valid credentials");
    }

    @Test
    public void testInvalidUsername() {
        Login login = new Login();
        assertFalse(login.authenticate("invalidUsername", "password123"), "Expected login to fail with an invalid username");
    }

    @Test
    public void testInvalidPassword() {
        Login login = new Login();
        assertFalse(login.authenticate("John Doe", "invalidPassword"), "Expected login to fail with an invalid password");
    }
    @Test
    public void testEmptyUsernameAndPassword() {
        Login login = new Login();
        assertFalse(login.authenticate("", ""), "Expected login to fail with empty username and password");
    }

    @Test
    public void testEmptyUsername() {
        Login login = new Login();
        assertFalse(login.authenticate("", "password123"), "Expected login to fail with empty username");
    }

    @Test
    public void testEmptyPassword() {
        Login login = new Login();
        assertFalse(login.authenticate("John Doe", ""), "Expected login to fail with empty password");
    }

    @Test
    public void testSQLInjectionAttempt() {
        Login login = new Login();
        assertFalse(login.authenticate("'; DROP TABLE users; --", "password123"), "Expected login to fail with SQL injection attempt");
    }

    @Test
    public void testNonexistentUser() {
        Login login = new Login();
        assertFalse(login.authenticate("Nonexistent User", "password999"), "Expected login to fail with a nonexistent user");
    }

}
