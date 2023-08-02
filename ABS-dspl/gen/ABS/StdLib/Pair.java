package ABS.StdLib;
// abs/lang/abslang.abs:183:0: 
public abstract class Pair<A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue> extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isPair() { return this instanceof Pair_Pair; }
    public final Pair_Pair<A,B> toPair() { return (Pair_Pair) this; }
}
