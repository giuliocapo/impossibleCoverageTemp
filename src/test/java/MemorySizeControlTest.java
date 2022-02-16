import com.example.impossiblecoveragetemp.MemorySizeControl;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemorySizeControlTest {
    @Test
    public void MemorySizeControl(){
        String resultA = MemorySizeControl.MemorySize();
        assertEquals("You can start the application",resultA);
    }
}
