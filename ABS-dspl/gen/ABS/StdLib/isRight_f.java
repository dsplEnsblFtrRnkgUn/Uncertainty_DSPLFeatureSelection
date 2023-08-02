package ABS.StdLib;
// abs/lang/abslang.abs:180:0: 
public final class isRight_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private isRight_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Either<A,B> val) {
        return (ABS.StdLib.isLeft_f.apply(val).negate());
    }
}
