import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.ConnectException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

class ArchivedPlanAdapterTest {
    private ArchivedPlanAdapter archived_plan_adapter;
    private ArchivedPlan archived_plan;
    @BeforeEach
    void setUp() {
        archived_plan = mock(ArchivedPlan.class);
        archived_plan_adapter = new ArchivedPlanAdapter(archived_plan);
    }

    @Test
    @DisplayName("Verify failures are working")
    void connect() {
        doThrow(new RuntimeException("Packages lost")).when(archived_plan).transfer_packages();
        assertThrows(RuntimeException.class, () -> archived_plan_adapter.connect("Wired"));
    }
}