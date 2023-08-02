package ABS.DC;
// abs/lang/abslang.abs:777:14: 
public final class InfRat_InfRat extends InfRat {
    public InfRat_InfRat() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "InfRat";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof InfRat_InfRat)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        InfRat_InfRat other = (InfRat_InfRat) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
