package ABS.StdLib;
// abs/lang/abslang.abs:185:0: 
public abstract class Triple<A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue,C extends org.abs_models.backend.java.lib.types.ABSValue> extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isTriple() { return this instanceof Triple_Triple; }
    public final Triple_Triple<A,B,C> toTriple() { return (Triple_Triple) this; }
}
