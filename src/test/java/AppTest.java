import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

public class AppTest{
    App app = new App();
    @Test
    void testCancel(){
        assertEquals(true,App.cancel("order1", 10.0));
    }
    @Test 
    void refund(){
        assertEquals(true,App.refund("order1", 10.0));
    }
}
