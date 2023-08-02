package ABS.StdLib;
// abs/lang/abslang.abs:175:0: 
public abstract class Either<A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue> extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isLeft() { return this instanceof Either_Left; }
    public final Either_Left<A,B> toLeft() { return (Either_Left) this; }
    public final boolean isRight() { return this instanceof Either_Right; }
    public final Either_Right<A,B> toRight() { return (Either_Right) this; }
}
