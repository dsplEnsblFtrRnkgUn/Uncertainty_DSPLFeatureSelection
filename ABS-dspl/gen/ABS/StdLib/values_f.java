package ABS.StdLib;
// abs/lang/abslang.abs:444:0: 
public final class values_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private values_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.List<B> apply(ABS.StdLib.Map<A,B> map) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.List<B> of(final ABS.StdLib.Map<A,B> map, final ABS.StdLib.Map<A,B> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_EmptyMap.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.List<B> execute() { return new ABS.StdLib.List_Nil<>(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_InsertAssoc.class,new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Pair_Pair.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("elem")),new org.abs_models.backend.java.lib.expr.PatternVariable("tail")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.List<B> execute(final B elem, final ABS.StdLib.Map<A,B> tail) { return new ABS.StdLib.List_Cons<>(elem, ABS.StdLib.values_f.apply(tail)); }
                }.execute((B) __ABS_binding1.getBinding(0),(ABS.StdLib.Map<A,B>) __ABS_binding1.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:445:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(map, map));
    }
}
