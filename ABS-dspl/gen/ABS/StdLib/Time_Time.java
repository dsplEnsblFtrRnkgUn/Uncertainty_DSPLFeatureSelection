package ABS.StdLib;
// abs/lang/abslang.abs:554:12: 
public final class Time_Time extends Time {
    public final org.abs_models.backend.java.lib.types.ABSRational arg0;
    public org.abs_models.backend.java.lib.types.ABSRational getArg0() { return arg0; }
    public Time_Time(final org.abs_models.backend.java.lib.types.ABSRational arg0) {
        this.arg0 = arg0;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "Time";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Time_Time)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Time_Time other = (Time_Time) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
