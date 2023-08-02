package ABS.StdLib;
// abs/lang/abslang.abs:367:0: 
public final class isEmpty_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private isEmpty_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.List<A> list) {
        return (org.abs_models.backend.java.lib.expr.BinOp.eq(list,new ABS.StdLib.List_Nil<>()));
    }
}
