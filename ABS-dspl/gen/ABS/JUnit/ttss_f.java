package ABS.JUnit;
// abs/lang/abslang.abs:1355:53: 
public final class ttss_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private ttss_f() { }
    public static ABS.StdLib.List<ABS.JUnit.Testsuite> apply(ABS.JUnit.Testsuites data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.List<ABS.JUnit.Testsuite> of(final ABS.JUnit.Testsuites data, final ABS.JUnit.Testsuites __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Testsuites_Testsuites.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.List<ABS.JUnit.Testsuite> execute(final ABS.StdLib.List<ABS.JUnit.Testsuite> res) { return res; }
                }.execute((ABS.StdLib.List<ABS.JUnit.Testsuite>) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1355:53:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
