package ABS.StdLib;
// abs/lang/abslang.abs:569:16: 
public final class Duration_Duration extends Duration {
    public final org.abs_models.backend.java.lib.types.ABSRational arg0;
    public org.abs_models.backend.java.lib.types.ABSRational getArg0() { return arg0; }
    public Duration_Duration(final org.abs_models.backend.java.lib.types.ABSRational arg0) {
        this.arg0 = arg0;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "Duration";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Duration_Duration)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Duration_Duration other = (Duration_Duration) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
