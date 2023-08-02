package ABS.StdLib;
// abs/lang/abslang.abs:554:17: 
public final class timeValue_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private timeValue_f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(ABS.StdLib.Time data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSRational of(final ABS.StdLib.Time data, final ABS.StdLib.Time __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Time_Time.class,new org.abs_models.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSRational execute(final org.abs_models.backend.java.lib.types.ABSRational res) { return res; }
                }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:554:17:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
