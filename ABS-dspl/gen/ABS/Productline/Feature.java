package ABS.Productline;
// abs/lang/abslang.abs:1337:0: 
public abstract class Feature extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isDoor() { return this instanceof Feature_Door; }
    public final Feature_Door toDoor() { return (Feature_Door) this; }
    public final boolean isClose() { return this instanceof Feature_Close; }
    public final Feature_Close toClose() { return (Feature_Close) this; }
    public final boolean isOpen() { return this instanceof Feature_Open; }
    public final Feature_Open toOpen() { return (Feature_Open) this; }
    public final boolean isLight() { return this instanceof Feature_Light; }
    public final Feature_Light toLight() { return (Feature_Light) this; }
    public final boolean isLighton() { return this instanceof Feature_Lighton; }
    public final Feature_Lighton toLighton() { return (Feature_Lighton) this; }
    public final boolean isLightoff() { return this instanceof Feature_Lightoff; }
    public final Feature_Lightoff toLightoff() { return (Feature_Lightoff) this; }
    public final boolean isWindow() { return this instanceof Feature_Window; }
    public final Feature_Window toWindow() { return (Feature_Window) this; }
    public final boolean isWopen() { return this instanceof Feature_Wopen; }
    public final Feature_Wopen toWopen() { return (Feature_Wopen) this; }
    public final boolean isWclose() { return this instanceof Feature_Wclose; }
    public final Feature_Wclose toWclose() { return (Feature_Wclose) this; }
    public final boolean isHeater() { return this instanceof Feature_Heater; }
    public final Feature_Heater toHeater() { return (Feature_Heater) this; }
    public final boolean isAlarm() { return this instanceof Feature_Alarm; }
    public final Feature_Alarm toAlarm() { return (Feature_Alarm) this; }
}
