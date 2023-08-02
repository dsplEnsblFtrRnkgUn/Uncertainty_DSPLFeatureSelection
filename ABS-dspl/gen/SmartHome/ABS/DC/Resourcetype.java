package ABS.DC;
// abs/lang/abslang.abs:764:0: 
public abstract class Resourcetype extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isSpeed() { return this instanceof Resourcetype_Speed; }
    public final Resourcetype_Speed toSpeed() { return (Resourcetype_Speed) this; }
    public final boolean isCores() { return this instanceof Resourcetype_Cores; }
    public final Resourcetype_Cores toCores() { return (Resourcetype_Cores) this; }
    public final boolean isBandwidth() { return this instanceof Resourcetype_Bandwidth; }
    public final Resourcetype_Bandwidth toBandwidth() { return (Resourcetype_Bandwidth) this; }
    public final boolean isMemory() { return this instanceof Resourcetype_Memory; }
    public final Resourcetype_Memory toMemory() { return (Resourcetype_Memory) this; }
    public final boolean isStartupduration() { return this instanceof Resourcetype_Startupduration; }
    public final Resourcetype_Startupduration toStartupduration() { return (Resourcetype_Startupduration) this; }
    public final boolean isShutdownduration() { return this instanceof Resourcetype_Shutdownduration; }
    public final Resourcetype_Shutdownduration toShutdownduration() { return (Resourcetype_Shutdownduration) this; }
    public final boolean isPaymentInterval() { return this instanceof Resourcetype_PaymentInterval; }
    public final Resourcetype_PaymentInterval toPaymentInterval() { return (Resourcetype_PaymentInterval) this; }
    public final boolean isCostPerInterval() { return this instanceof Resourcetype_CostPerInterval; }
    public final Resourcetype_CostPerInterval toCostPerInterval() { return (Resourcetype_CostPerInterval) this; }
}
