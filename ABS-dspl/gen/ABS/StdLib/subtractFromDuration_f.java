package ABS.StdLib;
// abs/lang/abslang.abs:596:0: 
public final class subtractFromDuration_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private subtractFromDuration_f() { }
    public static ABS.StdLib.Duration apply(ABS.StdLib.Duration d, org.abs_models.backend.java.lib.types.ABSRational v) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.Duration of(final ABS.StdLib.Duration d, final org.abs_models.backend.java.lib.types.ABSRational v, final ABS.StdLib.Duration __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Duration_InfDuration.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Duration execute() { return new ABS.StdLib.Duration_InfDuration(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Duration_Duration.class,new org.abs_models.backend.java.lib.expr.PatternVariable("x")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Duration execute(final org.abs_models.backend.java.lib.types.ABSRational x) { return new ABS.StdLib.Duration_Duration(x.subtract(v)); }
                }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:597:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(d, v, d));
    }
}
