import app.myoun.headsound.HeadSound;
import app.myoun.headsound.HeadSoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeadSoundTest {

    @Test
    public void transformChar() {
        Assertions.assertEquals('나', HeadSound.transform('라'));
    }

    @Test
    public void transformWord() throws HeadSoundException {
        Assertions.assertEquals("뇌전", HeadSound.transformWord("뢰전"));
    }

}
