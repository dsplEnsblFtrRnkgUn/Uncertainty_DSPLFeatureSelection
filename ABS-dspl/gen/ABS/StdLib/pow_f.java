package ABS.StdLib;
// abs/lang/abslang.abs:99:0: 
public final class pow_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private pow_f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(org.abs_models.backend.java.lib.types.ABSRational b, org.abs_models.backend.java.lib.types.ABSInteger n) {
        return (org.abs_models.backend.java.lib.expr.BinOp.lt(n,org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).toBoolean() ? org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L).divide(ABS.StdLib.pow_f.apply(b, n.negate())) : new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSRational of(final org.abs_models.backend.java.lib.types.ABSRational b, final org.abs_models.backend.java.lib.types.ABSInteger n, final org.abs_models.backend.java.lib.types.ABSInteger __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternValue(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSRational execute() { return org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.AnyPattern().match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSRational execute() { return b.multiply(ABS.StdLib.pow_f.apply(b, n.subtract(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L)))); }
                }.execute();
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:102:9:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(b, n, n));
    }
}
