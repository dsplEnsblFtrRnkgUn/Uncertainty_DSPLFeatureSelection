package ABS.StdLib;
// abs/lang/abslang.abs:85:0: 
public abstract class Bool extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isTrue() { return this instanceof Bool_True; }
    public final Bool_True toTrue() { return (Bool_True) this; }
    public final boolean isFalse() { return this instanceof Bool_False; }
    public final Bool_False toFalse() { return (Bool_False) this; }
}
