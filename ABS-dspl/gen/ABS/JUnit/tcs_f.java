package ABS.JUnit;
// abs/lang/abslang.abs:1356:42: 
public final class tcs_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private tcs_f() { }
    public static ABS.StdLib.List<ABS.JUnit.Testcase> apply(ABS.JUnit.Testsuite data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.List<ABS.JUnit.Testcase> of(final ABS.JUnit.Testsuite data, final ABS.JUnit.Testsuite __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Testsuite_Testsuite.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.List<ABS.JUnit.Testcase> execute(final ABS.StdLib.List<ABS.JUnit.Testcase> res) { return res; }
                }.execute((ABS.StdLib.List<ABS.JUnit.Testcase>) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1356:42:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
