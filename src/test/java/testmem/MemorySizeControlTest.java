package testmem;

import com.example.impossiblecoveragetemp.MemorySizeControl;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemorySizeControlTest {
    @Test
    public void memorySizeControl(){
        String resultA = MemorySizeControl.memorySize();
        assertEquals("You can start the application",resultA);
    }
}
