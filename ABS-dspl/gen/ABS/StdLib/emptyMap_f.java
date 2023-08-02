package ABS.StdLib;
// abs/lang/abslang.abs:434:0: 
public final class emptyMap_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private emptyMap_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Map<A,B> map) {
        return (org.abs_models.backend.java.lib.expr.BinOp.eq(map,new ABS.StdLib.Map_EmptyMap<>()));
    }
}
