package ABS.StdLib;
// abs/lang/abslang.abs:453:0: 
public final class keys_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private keys_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.Set<A> apply(ABS.StdLib.Map<A,B> map) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.Set<A> of(final ABS.StdLib.Map<A,B> map, final ABS.StdLib.Map<A,B> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_EmptyMap.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute() { return new ABS.StdLib.Set_EmptySet<>(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_InsertAssoc.class,new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Pair_Pair.class,new org.abs_models.backend.java.lib.expr.PatternVariable("a"),new org.abs_models.backend.java.lib.expr.AnyPattern()),new org.abs_models.backend.java.lib.expr.PatternVariable("tail")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute(final A a, final ABS.StdLib.Map<A,B> tail) { return ABS.StdLib.insertElement_f.apply(ABS.StdLib.keys_f.apply(tail), a); }
                }.execute((A) __ABS_binding1.getBinding(0),(ABS.StdLib.Map<A,B>) __ABS_binding1.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:454:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(map, map));
    }
}
