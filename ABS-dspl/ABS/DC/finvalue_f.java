package ABS.DC;
// abs/lang/abslang.abs:777:27: 
public final class finvalue_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private finvalue_f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(ABS.DC.InfRat data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSRational of(final ABS.DC.InfRat data, final ABS.DC.InfRat __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.DC.InfRat_Fin.class,new org.abs_models.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSRational execute(final org.abs_models.backend.java.lib.types.ABSRational res) { return res; }
                }.execute((org.abs_models.backend.java.lib.types.ABSRational) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:777:27:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
