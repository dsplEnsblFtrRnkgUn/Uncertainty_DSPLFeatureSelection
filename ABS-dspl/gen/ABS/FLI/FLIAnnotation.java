package ABS.FLI;
// abs/lang/abslang.abs:744:0: 
public abstract class FLIAnnotation extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isForeign() { return this instanceof FLIAnnotation_Foreign; }
    public final FLIAnnotation_Foreign toForeign() { return (FLIAnnotation_Foreign) this; }
}
