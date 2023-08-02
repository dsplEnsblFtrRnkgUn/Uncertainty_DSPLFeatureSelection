package ABS.JUnit;
// abs/lang/abslang.abs:1357:0: 
public abstract class Result extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isPassed() { return this instanceof Result_Passed; }
    public final Result_Passed toPassed() { return (Result_Passed) this; }
    public final boolean isSkipped() { return this instanceof Result_Skipped; }
    public final Result_Skipped toSkipped() { return (Result_Skipped) this; }
    public final boolean isError() { return this instanceof Result_Error; }
    public final Result_Error toError() { return (Result_Error) this; }
    public final boolean isFailure() { return this instanceof Result_Failure; }
    public final Result_Failure toFailure() { return (Result_Failure) this; }
}
