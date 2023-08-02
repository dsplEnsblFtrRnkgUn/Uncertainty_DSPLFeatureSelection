package ABS.JUnit;
// abs/lang/abslang.abs:1355:18: 
public final class Testsuites_Testsuites extends Testsuites {
    public final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> arg0;
    public ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> getArg0() { return arg0; }
    public final ABS.StdLib.List<ABS.JUnit.Testsuite> arg1;
    public ABS.StdLib.List<ABS.JUnit.Testsuite> getArg1() { return arg1; }
    public Testsuites_Testsuites(final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> arg0, final ABS.StdLib.List<ABS.JUnit.Testsuite> arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0, this.arg1 }; }
    public java.lang.String getConstructorName() { return "Testsuites";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Testsuites_Testsuites)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Testsuites_Testsuites other = (Testsuites_Testsuites) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        if (!this.arg1.eq(other.arg1).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        if (!c.subpattern[1].match(this.arg1, b)) return false;
        return true;
    }
}
