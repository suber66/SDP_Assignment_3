import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class WifiTest {
    private InternetPlan internet_plan;
    private Wifi wifi;
    @BeforeEach
    void setUp() {
        internet_plan = mock(InternetPlan.class);
        wifi = new Wifi(internet_plan);
    }
    @Test
    @DisplayName("Testing Wifi download")
    void download() {
        wifi.download();
        verify(internet_plan, times(1)).connect("Wireless");

    }
}