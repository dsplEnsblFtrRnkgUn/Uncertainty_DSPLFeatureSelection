package ABS.StdLib;
// abs/lang/abslang.abs:401:0: 
public final class appendright_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private appendright_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.List<A> apply(ABS.StdLib.List<A> list, A p) {
        return (ABS.StdLib.concatenate_f.apply(list, new ABS.StdLib.List_Cons<>(p, new ABS.StdLib.List_Nil<>())));
    }
}
