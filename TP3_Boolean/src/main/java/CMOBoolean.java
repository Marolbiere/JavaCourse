public abstract class CMOBoolean {
    public abstract boolean value();
    public abstract boolean not();
    public abstract boolean and(CMOBoolean bool);
    public abstract boolean or(CMOBoolean bool);
    public abstract boolean xor(CMOBoolean bool);
    public abstract String toString();
}
