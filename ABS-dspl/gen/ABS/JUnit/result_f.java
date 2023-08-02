package ABS.JUnit;
// abs/lang/abslang.abs:1358:63: 
public final class result_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private result_f() { }
    public static ABS.JUnit.Result apply(ABS.JUnit.Testcase data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.JUnit.Result of(final ABS.JUnit.Testcase data, final ABS.JUnit.Testcase __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Testcase_Testcase.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("res"),new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.JUnit.Result execute(final ABS.JUnit.Result res) { return res; }
                }.execute((ABS.JUnit.Result) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1358:63:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
