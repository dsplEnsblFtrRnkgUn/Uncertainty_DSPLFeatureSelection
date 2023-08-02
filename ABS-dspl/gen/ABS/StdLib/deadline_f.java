package ABS.StdLib;
// abs/lang/abslang.abs:590:0: 
public final class deadline_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private deadline_f() { }
    public static ABS.StdLib.Duration apply() {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.Duration of(final org.abs_models.backend.java.lib.types.ABSBool __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Bool_True.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Duration execute() { return new ABS.StdLib.Duration_InfDuration(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Bool_False.class).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Duration execute() { return new ABS.StdLib.Duration_Duration(org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.lowlevelDeadline()); }
                }.execute();
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:591:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(org.abs_models.backend.java.lib.expr.BinOp.lt(org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.lowlevelDeadline(),org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L))));
    }
}
