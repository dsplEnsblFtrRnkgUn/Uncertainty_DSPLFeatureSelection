package ABS.JUnit;
// abs/lang/abslang.abs:1356:29: 
public final class name_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private name_f() { }
    public static org.abs_models.backend.java.lib.types.ABSString apply(ABS.JUnit.Testsuite data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSString of(final ABS.JUnit.Testsuite data, final ABS.JUnit.Testsuite __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.JUnit.Testsuite_Testsuite.class,new org.abs_models.backend.java.lib.expr.PatternVariable("res"),new org.abs_models.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute(final org.abs_models.backend.java.lib.types.ABSString res) { return res; }
                }.execute((org.abs_models.backend.java.lib.types.ABSString) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1356:29:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
