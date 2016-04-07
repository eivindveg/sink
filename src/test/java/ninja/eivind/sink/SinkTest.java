package ninja.eivind.sink;

import ninja.eivind.sink.Sink;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SinkTest {


    @Test
    public void testTitanicSinks() {
        int titanic = 1;

        assertTrue("Titanic sinks.", Sink.getFloatOrSink(titanic) instanceof Sink);
    }

    @Test
    public void testSpaceboatsDoNotSink() {
        float spaceboat = 1;

        assertFalse("Space boats cannot sink!", Sink.getFloatOrSink(spaceboat) instanceof Sink);
    }
}
