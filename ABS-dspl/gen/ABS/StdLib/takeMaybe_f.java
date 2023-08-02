package ABS.StdLib;
// abs/lang/abslang.abs:333:0: 
public final class takeMaybe_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private takeMaybe_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.Maybe<A> apply(ABS.StdLib.Set<A> ss) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.Maybe<A> of(final ABS.StdLib.Set<A> ss, final ABS.StdLib.Set<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_EmptySet.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Maybe<A> execute() { return new ABS.StdLib.Maybe_Nothing<>(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new org.abs_models.backend.java.lib.expr.PatternVariable("e"),new org.abs_models.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Maybe<A> execute(final A e) { return new ABS.StdLib.Maybe_Just<>(e); }
                }.execute((A) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:334:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(ss, ss));
    }
}
