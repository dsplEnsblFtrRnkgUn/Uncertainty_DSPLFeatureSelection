package ABS.StdLib;
// abs/lang/abslang.abs:170:0: 
public abstract class Maybe<A extends org.abs_models.backend.java.lib.types.ABSValue> extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isNothing() { return this instanceof Maybe_Nothing; }
    public final Maybe_Nothing<A> toNothing() { return (Maybe_Nothing) this; }
    public final boolean isJust() { return this instanceof Maybe_Just; }
    public final Maybe_Just<A> toJust() { return (Maybe_Just) this; }
}
