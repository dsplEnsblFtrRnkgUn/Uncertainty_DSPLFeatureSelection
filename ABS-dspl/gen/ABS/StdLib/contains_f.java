package ABS.StdLib;
// abs/lang/abslang.abs:209:0: 
public final class contains_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private contains_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Set<A> ss, A e) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSBool of(final ABS.StdLib.Set<A> ss, final A e, final ABS.StdLib.Set<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_EmptySet.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.FALSE; }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new org.abs_models.backend.java.lib.expr.PatternValue(e),new org.abs_models.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding2 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new org.abs_models.backend.java.lib.expr.PatternVariable("x"),new org.abs_models.backend.java.lib.expr.PatternVariable("xs")).match(__ABS_value);
                if (__ABS_binding2 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute(final A x, final ABS.StdLib.Set<A> xs) { return org.abs_models.backend.java.lib.expr.BinOp.gt(x,e).toBoolean() ? org.abs_models.backend.java.lib.types.ABSBool.FALSE : ABS.StdLib.contains_f.apply(xs, e); }
                }.execute((A) __ABS_binding2.getBinding(0),(ABS.StdLib.Set<A>) __ABS_binding2.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:210:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(ss, e, ss));
    }
}
