package ABS.StdLib;
// abs/lang/abslang.abs:622:0: 
public abstract class NullableType extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isNonnull() { return this instanceof NullableType_Nonnull; }
    public final NullableType_Nonnull toNonnull() { return (NullableType_Nonnull) this; }
    public final boolean isNullable() { return this instanceof NullableType_Nullable; }
    public final NullableType_Nullable toNullable() { return (NullableType_Nullable) this; }
}
