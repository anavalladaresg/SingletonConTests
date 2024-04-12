import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    @DisplayName("Comprueba que Singleton siempre devuelve la misma instancia")
    public void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertSame(instance1, instance2, "Las instancias no son las mismas");
        assertEquals(instance1.getClass(), Singleton.class);
    }
}