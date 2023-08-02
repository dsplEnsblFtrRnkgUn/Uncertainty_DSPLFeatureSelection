package ABS.StdLib;
// abs/lang/abslang.abs:471:0: 
public final class lookup_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private lookup_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.Maybe<B> apply(ABS.StdLib.Map<A,B> ms, A k) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.Maybe<B> of(final ABS.StdLib.Map<A,B> ms, final A k, final ABS.StdLib.Map<A,B> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_InsertAssoc.class,new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Pair_Pair.class,new org.abs_models.backend.java.lib.expr.PatternValue(k),new org.abs_models.backend.java.lib.expr.PatternVariable("y")),new org.abs_models.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Maybe<B> execute(final B y) { return new ABS.StdLib.Maybe_Just<>(y); }
                }.execute((B) __ABS_binding0.getBinding(0));
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_InsertAssoc.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("tm")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Maybe<B> execute(final ABS.StdLib.Map<A,B> tm) { return ABS.StdLib.lookup_f.apply(tm, k); }
                }.execute((ABS.StdLib.Map<A,B>) __ABS_binding1.getBinding(0));
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding2 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_EmptyMap.class).match(__ABS_value);
                if (__ABS_binding2 != null) return new Object() {
                    public ABS.StdLib.Maybe<B> execute() { return new ABS.StdLib.Maybe_Nothing<>(); }
                }.execute();
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:472:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(ms, k, ms));
    }
}
