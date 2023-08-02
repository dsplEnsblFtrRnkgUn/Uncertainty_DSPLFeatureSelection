package ABS.StdLib;
// abs/lang/abslang.abs:606:37: 
public final class Spec_Overlaps extends Spec {
    public final ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSString> arg0;
    public ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSString> getArg0() { return arg0; }
    public Spec_Overlaps(final ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSString> arg0) {
        this.arg0 = arg0;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "Overlaps";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Spec_Overlaps)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Spec_Overlaps other = (Spec_Overlaps) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
