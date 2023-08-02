package ABS.JUnit;
// abs/lang/abslang.abs:1358:78: 
public final class stdout_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private stdout_f() { }
    public static ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> apply(ABS.JUnit.Testcase data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> of(final ABS.JUnit.Testcase data, final ABS.JUnit.Testcase __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Testcase_Testcase.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("res"),new org.abs_models.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> execute(final ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString> res) { return res; }
                }.execute((ABS.StdLib.Maybe<org.abs_models.backend.java.lib.types.ABSString>) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1358:78:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
