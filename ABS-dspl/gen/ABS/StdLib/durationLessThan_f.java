package ABS.StdLib;
// abs/lang/abslang.abs:579:0: 
public final class durationLessThan_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private durationLessThan_f() { }
    public static org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Duration d1, ABS.StdLib.Duration d2) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSBool of(final ABS.StdLib.Duration d1, final ABS.StdLib.Duration d2, final ABS.StdLib.Duration __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Duration_Duration.class,new org.abs_models.backend.java.lib.expr.PatternVariable("v1")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute(final org.abs_models.backend.java.lib.types.ABSRational v1) { return new org.abs_models.backend.java.lib.expr.Case() {
                        public org.abs_models.backend.java.lib.types.ABSBool of(final org.abs_models.backend.java.lib.types.ABSRational v1, final ABS.StdLib.Duration d2, final ABS.StdLib.Duration __ABS_value) {
                            final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Duration_Duration.class,new org.abs_models.backend.java.lib.expr.PatternVariable("v2")).match(__ABS_value);
                            if (__ABS_binding0 != null) return new Object() {
                                public org.abs_models.backend.java.lib.types.ABSBool execute(final org.abs_models.backend.java.lib.types.ABSRational v2) { return org.abs_models.backend.java.lib.expr.BinOp.lt(v1,v2); }
                            }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding0.getBinding(0));
                            final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Duration_InfDuration.class).match(__ABS_value);
                            if (__ABS_binding1 != null) return new Object() {
                                public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }
                            }.execute();
                            throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:581:22:  value " + __ABS_value + " did not match any pattern.");
                        }
                    }.of(v1, d2, d2); }
                }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding0.getBinding(0));
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Duration_InfDuration.class).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.FALSE; }
                }.execute();
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:580:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(d1, d2, d1));
    }
}
