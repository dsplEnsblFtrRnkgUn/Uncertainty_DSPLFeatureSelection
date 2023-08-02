/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /smartHome/model/smartHome.ecore
 * using:
 *   /smartHome/model/smartHome.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package smartHome;

import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import smartHome.SmartHomePackage;
// import smartHome.SmartHomeTables;

/**
 * SmartHomeTables provides the dispatch tables for the smartHome for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SmartHomeTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SmartHomePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_mdt_s_ocl_s_oclinecore_s_smartHome = IdManager.getNsURIPackageId("http://www.eclipse.org/mdt/ocl/oclinecore/smartHome", null, SmartHomePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Door = SmartHomeTables.PACKid_http_c_s_s_www_eclipse_org_s_mdt_s_ocl_s_oclinecore_s_smartHome.getClassId("Door", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Heater = SmartHomeTables.PACKid_http_c_s_s_www_eclipse_org_s_mdt_s_ocl_s_oclinecore_s_smartHome.getClassId("Heater", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Home = SmartHomeTables.PACKid_http_c_s_s_www_eclipse_org_s_mdt_s_ocl_s_oclinecore_s_smartHome.getClassId("Home", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Light = SmartHomeTables.PACKid_http_c_s_s_www_eclipse_org_s_mdt_s_ocl_s_oclinecore_s_smartHome.getClassId("Light", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Room = SmartHomeTables.PACKid_http_c_s_s_www_eclipse_org_s_mdt_s_ocl_s_oclinecore_s_smartHome.getClassId("Room", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Window = SmartHomeTables.PACKid_http_c_s_s_www_eclipse_org_s_mdt_s_ocl_s_oclinecore_s_smartHome.getClassId("Window", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Light = TypeId.BAG.getSpecializedId(SmartHomeTables.CLSSid_Light);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Door = TypeId.SET.getSpecializedId(SmartHomeTables.CLSSid_Door);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Heater = TypeId.SET.getSpecializedId(SmartHomeTables.CLSSid_Heater);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Light = TypeId.SET.getSpecializedId(SmartHomeTables.CLSSid_Light);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Room = TypeId.SET.getSpecializedId(SmartHomeTables.CLSSid_Room);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Window = TypeId.SET.getSpecializedId(SmartHomeTables.CLSSid_Window);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SmartHomeTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Door = new EcoreExecutorType(SmartHomePackage.Literals.DOOR, PACKAGE, 0);
		public static final EcoreExecutorType _Heater = new EcoreExecutorType(SmartHomePackage.Literals.HEATER, PACKAGE, 0);
		public static final EcoreExecutorType _Home = new EcoreExecutorType(SmartHomePackage.Literals.HOME, PACKAGE, 0);
		public static final EcoreExecutorType _Light = new EcoreExecutorType(SmartHomePackage.Literals.LIGHT, PACKAGE, 0);
		public static final EcoreExecutorType _Prob_Factor = new EcoreExecutorType(SmartHomePackage.Literals.PROB_FACTOR, PACKAGE, 0);
		public static final EcoreExecutorType _Room = new EcoreExecutorType(SmartHomePackage.Literals.ROOM, PACKAGE, 0);
		public static final EcoreExecutorType _Window = new EcoreExecutorType(SmartHomePackage.Literals.WINDOW, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Door,
			_Heater,
			_Home,
			_Light,
			_Prob_Factor,
			_Room,
			_Window
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Door__Door = new ExecutorFragment(Types._Door, SmartHomeTables.Types._Door);
		private static final ExecutorFragment _Door__OclAny = new ExecutorFragment(Types._Door, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Door__OclElement = new ExecutorFragment(Types._Door, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Door__Prob_Factor = new ExecutorFragment(Types._Door, SmartHomeTables.Types._Prob_Factor);

		private static final ExecutorFragment _Heater__Heater = new ExecutorFragment(Types._Heater, SmartHomeTables.Types._Heater);
		private static final ExecutorFragment _Heater__OclAny = new ExecutorFragment(Types._Heater, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Heater__OclElement = new ExecutorFragment(Types._Heater, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Heater__Prob_Factor = new ExecutorFragment(Types._Heater, SmartHomeTables.Types._Prob_Factor);

		private static final ExecutorFragment _Home__Home = new ExecutorFragment(Types._Home, SmartHomeTables.Types._Home);
		private static final ExecutorFragment _Home__OclAny = new ExecutorFragment(Types._Home, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Home__OclElement = new ExecutorFragment(Types._Home, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Light__Light = new ExecutorFragment(Types._Light, SmartHomeTables.Types._Light);
		private static final ExecutorFragment _Light__OclAny = new ExecutorFragment(Types._Light, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Light__OclElement = new ExecutorFragment(Types._Light, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Light__Prob_Factor = new ExecutorFragment(Types._Light, SmartHomeTables.Types._Prob_Factor);

		private static final ExecutorFragment _Prob_Factor__OclAny = new ExecutorFragment(Types._Prob_Factor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Prob_Factor__OclElement = new ExecutorFragment(Types._Prob_Factor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Prob_Factor__Prob_Factor = new ExecutorFragment(Types._Prob_Factor, SmartHomeTables.Types._Prob_Factor);

		private static final ExecutorFragment _Room__OclAny = new ExecutorFragment(Types._Room, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Room__OclElement = new ExecutorFragment(Types._Room, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Room__Room = new ExecutorFragment(Types._Room, SmartHomeTables.Types._Room);

		private static final ExecutorFragment _Window__OclAny = new ExecutorFragment(Types._Window, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Window__OclElement = new ExecutorFragment(Types._Window, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Window__Prob_Factor = new ExecutorFragment(Types._Window, SmartHomeTables.Types._Prob_Factor);
		private static final ExecutorFragment _Window__Window = new ExecutorFragment(Types._Window, SmartHomeTables.Types._Window);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Door__Uweight = new EcoreExecutorProperty(SmartHomePackage.Literals.DOOR__UWEIGHT, Types._Door, 0);
		public static final ExecutorProperty _Door__isOpen = new EcoreExecutorProperty(SmartHomePackage.Literals.DOOR__IS_OPEN, Types._Door, 1);
		public static final ExecutorProperty _Door__name = new EcoreExecutorProperty(SmartHomePackage.Literals.DOOR__NAME, Types._Door, 2);
		public static final ExecutorProperty _Door__room = new EcoreExecutorProperty(SmartHomePackage.Literals.DOOR__ROOM, Types._Door, 3);
		public static final ExecutorProperty _Door__Light__door = new ExecutorPropertyWithImplementation("Light", Types._Door, 4, new EcoreLibraryOppositeProperty(SmartHomePackage.Literals.LIGHT__DOOR));

		public static final ExecutorProperty _Heater__Uweight = new EcoreExecutorProperty(SmartHomePackage.Literals.HEATER__UWEIGHT, Types._Heater, 0);
		public static final ExecutorProperty _Heater__name = new EcoreExecutorProperty(SmartHomePackage.Literals.HEATER__NAME, Types._Heater, 1);
		public static final ExecutorProperty _Heater__room = new EcoreExecutorProperty(SmartHomePackage.Literals.HEATER__ROOM, Types._Heater, 2);
		public static final ExecutorProperty _Heater__temp = new EcoreExecutorProperty(SmartHomePackage.Literals.HEATER__TEMP, Types._Heater, 3);

		public static final ExecutorProperty _Home__name = new EcoreExecutorProperty(SmartHomePackage.Literals.HOME__NAME, Types._Home, 0);
		public static final ExecutorProperty _Home__room = new EcoreExecutorProperty(SmartHomePackage.Literals.HOME__ROOM, Types._Home, 1);

		public static final ExecutorProperty _Light__Uweight = new EcoreExecutorProperty(SmartHomePackage.Literals.LIGHT__UWEIGHT, Types._Light, 0);
		public static final ExecutorProperty _Light__door = new EcoreExecutorProperty(SmartHomePackage.Literals.LIGHT__DOOR, Types._Light, 1);
		public static final ExecutorProperty _Light__isON = new EcoreExecutorProperty(SmartHomePackage.Literals.LIGHT__IS_ON, Types._Light, 2);
		public static final ExecutorProperty _Light__name = new EcoreExecutorProperty(SmartHomePackage.Literals.LIGHT__NAME, Types._Light, 3);
		public static final ExecutorProperty _Light__room = new EcoreExecutorProperty(SmartHomePackage.Literals.LIGHT__ROOM, Types._Light, 4);

		public static final ExecutorProperty _Prob_Factor__CF = new EcoreExecutorProperty(SmartHomePackage.Literals.PROB_FACTOR__CF, Types._Prob_Factor, 0);

		public static final ExecutorProperty _Room__alarm = new EcoreExecutorProperty(SmartHomePackage.Literals.ROOM__ALARM, Types._Room, 0);
		public static final ExecutorProperty _Room__doors = new EcoreExecutorProperty(SmartHomePackage.Literals.ROOM__DOORS, Types._Room, 1);
		public static final ExecutorProperty _Room__heaters = new EcoreExecutorProperty(SmartHomePackage.Literals.ROOM__HEATERS, Types._Room, 2);
		public static final ExecutorProperty _Room__highTemp = new EcoreExecutorProperty(SmartHomePackage.Literals.ROOM__HIGH_TEMP, Types._Room, 3);
		public static final ExecutorProperty _Room__lights = new EcoreExecutorProperty(SmartHomePackage.Literals.ROOM__LIGHTS, Types._Room, 4);
		public static final ExecutorProperty _Room__name = new EcoreExecutorProperty(SmartHomePackage.Literals.ROOM__NAME, Types._Room, 5);
		public static final ExecutorProperty _Room__windows = new EcoreExecutorProperty(SmartHomePackage.Literals.ROOM__WINDOWS, Types._Room, 6);
		public static final ExecutorProperty _Room__Home__room = new ExecutorPropertyWithImplementation("Home", Types._Room, 7, new EcoreLibraryOppositeProperty(SmartHomePackage.Literals.HOME__ROOM));

		public static final ExecutorProperty _Window__Uweight = new EcoreExecutorProperty(SmartHomePackage.Literals.WINDOW__UWEIGHT, Types._Window, 0);
		public static final ExecutorProperty _Window__isOpen = new EcoreExecutorProperty(SmartHomePackage.Literals.WINDOW__IS_OPEN, Types._Window, 1);
		public static final ExecutorProperty _Window__name = new EcoreExecutorProperty(SmartHomePackage.Literals.WINDOW__NAME, Types._Window, 2);
		public static final ExecutorProperty _Window__room = new EcoreExecutorProperty(SmartHomePackage.Literals.WINDOW__ROOM, Types._Window, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Door =
			{
				Fragments._Door__OclAny /* 0 */,
				Fragments._Door__OclElement /* 1 */,
				Fragments._Door__Prob_Factor /* 2 */,
				Fragments._Door__Door /* 3 */
			};
		private static final int /*@NonNull*/ [] __Door = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Heater =
			{
				Fragments._Heater__OclAny /* 0 */,
				Fragments._Heater__OclElement /* 1 */,
				Fragments._Heater__Prob_Factor /* 2 */,
				Fragments._Heater__Heater /* 3 */
			};
		private static final int /*@NonNull*/ [] __Heater = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Home =
			{
				Fragments._Home__OclAny /* 0 */,
				Fragments._Home__OclElement /* 1 */,
				Fragments._Home__Home /* 2 */
			};
		private static final int /*@NonNull*/ [] __Home = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Light =
			{
				Fragments._Light__OclAny /* 0 */,
				Fragments._Light__OclElement /* 1 */,
				Fragments._Light__Prob_Factor /* 2 */,
				Fragments._Light__Light /* 3 */
			};
		private static final int /*@NonNull*/ [] __Light = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Prob_Factor =
			{
				Fragments._Prob_Factor__OclAny /* 0 */,
				Fragments._Prob_Factor__OclElement /* 1 */,
				Fragments._Prob_Factor__Prob_Factor /* 2 */
			};
		private static final int /*@NonNull*/ [] __Prob_Factor = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Room =
			{
				Fragments._Room__OclAny /* 0 */,
				Fragments._Room__OclElement /* 1 */,
				Fragments._Room__Room /* 2 */
			};
		private static final int /*@NonNull*/ [] __Room = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Window =
			{
				Fragments._Window__OclAny /* 0 */,
				Fragments._Window__OclElement /* 1 */,
				Fragments._Window__Prob_Factor /* 2 */,
				Fragments._Window__Window /* 3 */
			};
		private static final int /*@NonNull*/ [] __Window = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Door.initFragments(_Door, __Door);
			Types._Heater.initFragments(_Heater, __Heater);
			Types._Home.initFragments(_Home, __Home);
			Types._Light.initFragments(_Light, __Light);
			Types._Prob_Factor.initFragments(_Prob_Factor, __Prob_Factor);
			Types._Room.initFragments(_Room, __Room);
			Types._Window.initFragments(_Window, __Window);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Door__Door = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Door__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Door__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Door__Prob_Factor = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Heater__Heater = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Heater__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Heater__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Heater__Prob_Factor = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Home__Home = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Home__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Home__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Light__Light = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Light__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Light__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Light__Prob_Factor = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Prob_Factor__Prob_Factor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Prob_Factor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Prob_Factor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Room__Room = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Window__Window = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Window__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Window__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Window__Prob_Factor = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Door__Door.initOperations(_Door__Door);
			Fragments._Door__OclAny.initOperations(_Door__OclAny);
			Fragments._Door__OclElement.initOperations(_Door__OclElement);
			Fragments._Door__Prob_Factor.initOperations(_Door__Prob_Factor);

			Fragments._Heater__Heater.initOperations(_Heater__Heater);
			Fragments._Heater__OclAny.initOperations(_Heater__OclAny);
			Fragments._Heater__OclElement.initOperations(_Heater__OclElement);
			Fragments._Heater__Prob_Factor.initOperations(_Heater__Prob_Factor);

			Fragments._Home__Home.initOperations(_Home__Home);
			Fragments._Home__OclAny.initOperations(_Home__OclAny);
			Fragments._Home__OclElement.initOperations(_Home__OclElement);

			Fragments._Light__Light.initOperations(_Light__Light);
			Fragments._Light__OclAny.initOperations(_Light__OclAny);
			Fragments._Light__OclElement.initOperations(_Light__OclElement);
			Fragments._Light__Prob_Factor.initOperations(_Light__Prob_Factor);

			Fragments._Prob_Factor__OclAny.initOperations(_Prob_Factor__OclAny);
			Fragments._Prob_Factor__OclElement.initOperations(_Prob_Factor__OclElement);
			Fragments._Prob_Factor__Prob_Factor.initOperations(_Prob_Factor__Prob_Factor);

			Fragments._Room__OclAny.initOperations(_Room__OclAny);
			Fragments._Room__OclElement.initOperations(_Room__OclElement);
			Fragments._Room__Room.initOperations(_Room__Room);

			Fragments._Window__OclAny.initOperations(_Window__OclAny);
			Fragments._Window__OclElement.initOperations(_Window__OclElement);
			Fragments._Window__Prob_Factor.initOperations(_Window__Prob_Factor);
			Fragments._Window__Window.initOperations(_Window__Window);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Door = {
			SmartHomeTables.Properties._Prob_Factor__CF,
			SmartHomeTables.Properties._Door__Uweight,
			SmartHomeTables.Properties._Door__isOpen,
			SmartHomeTables.Properties._Door__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SmartHomeTables.Properties._Door__room
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Heater = {
			SmartHomeTables.Properties._Prob_Factor__CF,
			SmartHomeTables.Properties._Heater__Uweight,
			SmartHomeTables.Properties._Heater__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SmartHomeTables.Properties._Heater__room,
			SmartHomeTables.Properties._Heater__temp
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Home = {
			SmartHomeTables.Properties._Home__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SmartHomeTables.Properties._Home__room
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Light = {
			SmartHomeTables.Properties._Prob_Factor__CF,
			SmartHomeTables.Properties._Light__Uweight,
			SmartHomeTables.Properties._Light__door,
			SmartHomeTables.Properties._Light__isON,
			SmartHomeTables.Properties._Light__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SmartHomeTables.Properties._Light__room
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Prob_Factor = {
			SmartHomeTables.Properties._Prob_Factor__CF,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Room = {
			SmartHomeTables.Properties._Room__alarm,
			SmartHomeTables.Properties._Room__doors,
			SmartHomeTables.Properties._Room__heaters,
			SmartHomeTables.Properties._Room__highTemp,
			SmartHomeTables.Properties._Room__lights,
			SmartHomeTables.Properties._Room__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SmartHomeTables.Properties._Room__windows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Window = {
			SmartHomeTables.Properties._Prob_Factor__CF,
			SmartHomeTables.Properties._Window__Uweight,
			SmartHomeTables.Properties._Window__isOpen,
			SmartHomeTables.Properties._Window__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SmartHomeTables.Properties._Window__room
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Door__Door.initProperties(_Door);
			Fragments._Heater__Heater.initProperties(_Heater);
			Fragments._Home__Home.initProperties(_Home);
			Fragments._Light__Light.initProperties(_Light);
			Fragments._Prob_Factor__Prob_Factor.initProperties(_Prob_Factor);
			Fragments._Room__Room.initProperties(_Room);
			Fragments._Window__Window.initProperties(_Window);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartHomeTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new SmartHomeTables();
	}

	private SmartHomeTables() {
		super(SmartHomePackage.eNS_URI);
	}
}
