package ABS.DC;
// abs/lang/abslang.abs:777:23: 
public final class InfRat_Fin extends InfRat {
    public final org.abs_models.backend.java.lib.types.ABSRational arg0;
    public org.abs_models.backend.java.lib.types.ABSRational getArg0() { return arg0; }
    public InfRat_Fin(final org.abs_models.backend.java.lib.types.ABSRational arg0) {
        this.arg0 = arg0;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "Fin";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof InfRat_Fin)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        InfRat_Fin other = (InfRat_Fin) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
