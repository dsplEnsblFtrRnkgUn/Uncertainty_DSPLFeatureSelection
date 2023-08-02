package ABS.SmartDeploy;
// abs/lang/abslang.abs:1222:0: 
public abstract class DeployParamSpecification extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isReq() { return this instanceof DeployParamSpecification_Req; }
    public final DeployParamSpecification_Req toReq() { return (DeployParamSpecification_Req) this; }
    public final boolean isList() { return this instanceof DeployParamSpecification_List; }
    public final DeployParamSpecification_List toList() { return (DeployParamSpecification_List) this; }
    public final boolean isDefault() { return this instanceof DeployParamSpecification_Default; }
    public final DeployParamSpecification_Default toDefault() { return (DeployParamSpecification_Default) this; }
    public final boolean isUser() { return this instanceof DeployParamSpecification_User; }
    public final DeployParamSpecification_User toUser() { return (DeployParamSpecification_User) this; }
    public final boolean isOptList() { return this instanceof DeployParamSpecification_OptList; }
    public final DeployParamSpecification_OptList toOptList() { return (DeployParamSpecification_OptList) this; }
}
