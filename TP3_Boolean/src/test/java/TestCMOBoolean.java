import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TestCMOBoolean {

    @Test
    public void TestCMOBoolean() {
        CMOTrue t = new CMOTrue();
        CMOFalse f = new CMOFalse();

        Assertions.assertEquals(t.value(), true);
        Assertions.assertEquals(f.value(), false);

        Assertions.assertEquals(t.not(), false);
        Assertions.assertEquals(f.not(), true);

        Assertions.assertEquals(t.and(f), false);
        Assertions.assertEquals(t.and(t), true);

        Assertions.assertEquals(f.and(t), false);
        Assertions.assertEquals(f.and(f), false);

        Assertions.assertEquals(t.or(f), true);
        Assertions.assertEquals(t.or(t), true);

        Assertions.assertEquals(f.or(t), true);
        Assertions.assertEquals(f.or(f), false);

        Assertions.assertEquals(t.xor(f), true);
        Assertions.assertEquals(t.xor(t), false);

        Assertions.assertEquals(f.xor(t), true);
        Assertions.assertEquals(f.xor(f), false);

    }
}
