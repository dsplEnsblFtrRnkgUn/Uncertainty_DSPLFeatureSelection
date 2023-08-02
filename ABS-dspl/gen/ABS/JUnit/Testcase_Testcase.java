package ABS.JUnit;
// abs/lang/abslang.abs:1358:18: 
public final class Testcase_Testcase extends Testcase {
    public final org.abs_models.backend.java.lib.types.ABSString arg0;
    public org.abs_models.backend.java.lib.types.ABSString getArg0() { return arg0; }
    public final org.abs_models.backend.java.lib.types.ABSString arg1;
    public org.abs_models.backend.java.lib.types.ABSString getArg1() { return arg1; }
    public final ABS.JUnit.Result arg2;
    public ABS.JUnit.Result getArg2() { return arg2; }
    public final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> arg3;
    public ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> getArg3() { return arg3; }
    public final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> arg4;
    public ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> getArg4() { return arg4; }
    public Testcase_Testcase(final org.abs_models.backend.java.lib.types.ABSString arg0, final org.abs_models.backend.java.lib.types.ABSString arg1, final ABS.JUnit.Result arg2, final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> arg3, final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> arg4) {
        this.arg0 = arg0;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] { this.arg0, this.arg1, this.arg2, this.arg3, this.arg4 }; }
    public java.lang.String getConstructorName() { return "Testcase";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Testcase_Testcase)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Testcase_Testcase other = (Testcase_Testcase) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        if (!this.arg1.eq(other.arg1).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        if (!this.arg2.eq(other.arg2).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        if (!this.arg3.eq(other.arg3).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        if (!this.arg4.eq(other.arg4).toBoolean()) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        if (!c.subpattern[1].match(this.arg1, b)) return false;
        if (!c.subpattern[2].match(this.arg2, b)) return false;
        if (!c.subpattern[3].match(this.arg3, b)) return false;
        if (!c.subpattern[4].match(this.arg4, b)) return false;
        return true;
    }
}
