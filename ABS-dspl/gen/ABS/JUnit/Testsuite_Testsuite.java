package ABS.JUnit;
// abs/lang/abslang.abs:1356:18: 
public final class Testsuite_Testsuite extends Testsuite {
    public final org.abs_models.backend.java.lib.types.ABSString arg0;
    public org.abs_models.backend.java.lib.types.ABSString getArg0() { return arg0; }
    public final ABS.StdLib.List<ABS.JUnit.Testcase> arg1;
    public ABS.StdLib.List<ABS.JUnit.Testcase> getArg1() { return arg1; }
    public Testsuite_Testsuite(final org.abs_models.backend.java.lib.types.ABSString arg0, final ABS.StdLib.List<ABS.JUnit.Testcase> arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0, this.arg1 }; }
    public java.lang.String getConstructorName() { return "Testsuite";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Testsuite_Testsuite)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Testsuite_Testsuite other = (Testsuite_Testsuite) o;
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
