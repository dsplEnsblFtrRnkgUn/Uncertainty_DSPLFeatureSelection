package ABS.StdLib;
// abs/lang/abslang.abs:436:0: 
public final class removeKey_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private removeKey_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.Map<A,B> apply(ABS.StdLib.Map<A,B> map, A key) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.Map<A,B> of(final ABS.StdLib.Map<A,B> map, final A key, final ABS.StdLib.Map<A,B> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_EmptyMap.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Map<A,B> execute() { return map; }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_InsertAssoc.class,new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Pair_Pair.class,new org.abs_models.backend.java.lib.expr.PatternValue(key),new org.abs_models.backend.java.lib.expr.AnyPattern()),new org.abs_models.backend.java.lib.expr.PatternVariable("m")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Map<A,B> execute(final ABS.StdLib.Map<A,B> m) { return m; }
                }.execute((ABS.StdLib.Map<A,B>) __ABS_binding1.getBinding(0));
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding2 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Map_InsertAssoc.class,new org.abs_models.backend.java.lib.expr.PatternVariable("pair"),new org.abs_models.backend.java.lib.expr.PatternVariable("tail")).match(__ABS_value);
                if (__ABS_binding2 != null) return new Object() {
                    public ABS.StdLib.Map<A,B> execute(final ABS.StdLib.Pair<A,B> pair, final ABS.StdLib.Map<A,B> tail) { return new ABS.StdLib.Map_InsertAssoc<>(pair, ABS.StdLib.removeKey_f.apply(tail, key)); }
                }.execute((ABS.StdLib.Pair<A,B>) __ABS_binding2.getBinding(0),(ABS.StdLib.Map<A,B>) __ABS_binding2.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:437:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(map, key, map));
    }
}
