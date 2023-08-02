package ABS.StdLib;
// abs/lang/abslang.abs:570:0: 
public final class isDurationInfinite_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private isDurationInfinite_f() { }
    public static org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Duration d) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSBool of(final ABS.StdLib.Duration d, final ABS.StdLib.Duration __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Duration_Duration.class,new org.abs_models.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.FALSE; }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Duration_InfDuration.class).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }
                }.execute();
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:571:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(d, d));
    }
}
