public class CMOTrue extends CMOBoolean{
    public boolean value() {
        return true;
    }

    public boolean not() {
        return false;
    }

    public boolean and(CMOBoolean bool) {
        return value() && bool.value();
    }

    public boolean or(CMOBoolean bool) {
        return value() || bool.value();
    }


    public boolean xor(CMOBoolean bool) {
        return value() ^ bool.value();
    }


    public String toString() {
        System.out.println(value());
        return Boolean.toString(value());
    }


}
