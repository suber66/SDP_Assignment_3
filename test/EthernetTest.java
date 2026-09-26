import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EthernetTest {
    private InternetPlan internet_plan;
    private Ethernet ethernet;
    @BeforeEach
    void setUp() {
        internet_plan = mock(InternetPlan.class);
        ethernet = new Ethernet(internet_plan);
    }

    @Test
    @DisplayName("Testing Ethernet download")
    void download() {
        ethernet.download();
        verify(internet_plan, times(1)).connect("Wired");

    }
}