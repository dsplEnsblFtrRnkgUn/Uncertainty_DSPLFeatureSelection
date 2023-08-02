/**
 */
package smartHome;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smartHome.SmartHomeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface SmartHomePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smartHome";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdt/ocl/oclinecore/smartHome";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smartHome";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartHomePackage eINSTANCE = smartHome.impl.SmartHomePackageImpl.init();

	/**
	 * The meta object id for the '{@link smartHome.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.RoomImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ALARM = 1;

	/**
	 * The feature id for the '<em><b>High Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HIGH_TEMP = 2;

	/**
	 * The feature id for the '<em><b>Heaters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HEATERS = 3;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DOORS = 4;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WINDOWS = 5;

	/**
	 * The feature id for the '<em><b>Lights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LIGHTS = 6;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.Prob_FactorImpl <em>Prob Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.Prob_FactorImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getProb_Factor()
	 * @generated
	 */
	int PROB_FACTOR = 6;

	/**
	 * The feature id for the '<em><b>CF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_FACTOR__CF = 0;

	/**
	 * The number of structural features of the '<em>Prob Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_FACTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prob Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.HeaterImpl <em>Heater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.HeaterImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getHeater()
	 * @generated
	 */
	int HEATER = 1;

	/**
	 * The feature id for the '<em><b>CF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER__CF = PROB_FACTOR__CF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER__NAME = PROB_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER__TEMP = PROB_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER__UWEIGHT = PROB_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER__ROOM = PROB_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Heater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER_FEATURE_COUNT = PROB_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>High Temp Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER___HIGH_TEMP_ALARM__DIAGNOSTICCHAIN_MAP = PROB_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER_OPERATION_COUNT = PROB_FACTOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link smartHome.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.WindowImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 2;

	/**
	 * The feature id for the '<em><b>CF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CF = PROB_FACTOR__CF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = PROB_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IS_OPEN = PROB_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__UWEIGHT = PROB_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ROOM = PROB_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = PROB_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = PROB_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.DoorImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 3;

	/**
	 * The feature id for the '<em><b>CF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__CF = PROB_FACTOR__CF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__NAME = PROB_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__IS_OPEN = PROB_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__UWEIGHT = PROB_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__ROOM = PROB_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = PROB_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = PROB_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.HomeImpl <em>Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.HomeImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getHome()
	 * @generated
	 */
	int HOME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__ROOM = 1;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smartHome.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartHome.impl.LightImpl
	 * @see smartHome.impl.SmartHomePackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 5;

	/**
	 * The feature id for the '<em><b>CF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__CF = PROB_FACTOR__CF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__NAME = PROB_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__IS_ON = PROB_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__UWEIGHT = PROB_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__ROOM = PROB_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__DOOR = PROB_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = PROB_FACTOR_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Door Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT___DOOR_OPEN__DIAGNOSTICCHAIN_MAP = PROB_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = PROB_FACTOR_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link smartHome.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see smartHome.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Room#getAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm</em>'.
	 * @see smartHome.Room#getAlarm()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Alarm();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Room#getHighTemp <em>High Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Temp</em>'.
	 * @see smartHome.Room#getHighTemp()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_HighTemp();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.Room#getHeaters <em>Heaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Heaters</em>'.
	 * @see smartHome.Room#getHeaters()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Heaters();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.Room#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doors</em>'.
	 * @see smartHome.Room#getDoors()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Doors();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.Room#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see smartHome.Room#getWindows()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Windows();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.Room#getLights <em>Lights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lights</em>'.
	 * @see smartHome.Room#getLights()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Lights();

	/**
	 * Returns the meta object for class '{@link smartHome.Heater <em>Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heater</em>'.
	 * @see smartHome.Heater
	 * @generated
	 */
	EClass getHeater();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Heater#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.Heater#getName()
	 * @see #getHeater()
	 * @generated
	 */
	EAttribute getHeater_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Heater#getTemp <em>Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp</em>'.
	 * @see smartHome.Heater#getTemp()
	 * @see #getHeater()
	 * @generated
	 */
	EAttribute getHeater_Temp();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Heater#getUweight <em>Uweight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uweight</em>'.
	 * @see smartHome.Heater#getUweight()
	 * @see #getHeater()
	 * @generated
	 */
	EAttribute getHeater_Uweight();

	/**
	 * Returns the meta object for the container reference '{@link smartHome.Heater#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see smartHome.Heater#getRoom()
	 * @see #getHeater()
	 * @generated
	 */
	EReference getHeater_Room();

	/**
	 * Returns the meta object for the '{@link smartHome.Heater#highTempAlarm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>High Temp Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>High Temp Alarm</em>' operation.
	 * @see smartHome.Heater#highTempAlarm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHeater__HighTempAlarm__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartHome.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see smartHome.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Window#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.Window#getName()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Window#getIsOpen <em>Is Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Open</em>'.
	 * @see smartHome.Window#getIsOpen()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_IsOpen();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Window#getUweight <em>Uweight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uweight</em>'.
	 * @see smartHome.Window#getUweight()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Uweight();

	/**
	 * Returns the meta object for the container reference '{@link smartHome.Window#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see smartHome.Window#getRoom()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_Room();

	/**
	 * Returns the meta object for class '{@link smartHome.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see smartHome.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Door#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.Door#getName()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Door#getIsOpen <em>Is Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Open</em>'.
	 * @see smartHome.Door#getIsOpen()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_IsOpen();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Door#getUweight <em>Uweight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uweight</em>'.
	 * @see smartHome.Door#getUweight()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Uweight();

	/**
	 * Returns the meta object for the container reference '{@link smartHome.Door#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see smartHome.Door#getRoom()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_Room();

	/**
	 * Returns the meta object for class '{@link smartHome.Home <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home</em>'.
	 * @see smartHome.Home
	 * @generated
	 */
	EClass getHome();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Home#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.Home#getName()
	 * @see #getHome()
	 * @generated
	 */
	EAttribute getHome_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link smartHome.Home#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see smartHome.Home#getRoom()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_Room();

	/**
	 * Returns the meta object for class '{@link smartHome.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see smartHome.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Light#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartHome.Light#getName()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Name();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Light#getIsON <em>Is ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is ON</em>'.
	 * @see smartHome.Light#getIsON()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_IsON();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Light#getUweight <em>Uweight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uweight</em>'.
	 * @see smartHome.Light#getUweight()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Uweight();

	/**
	 * Returns the meta object for the container reference '{@link smartHome.Light#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see smartHome.Light#getRoom()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_Room();

	/**
	 * Returns the meta object for the reference '{@link smartHome.Light#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Door</em>'.
	 * @see smartHome.Light#getDoor()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_Door();

	/**
	 * Returns the meta object for the '{@link smartHome.Light#doorOpen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Door Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Door Open</em>' operation.
	 * @see smartHome.Light#doorOpen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLight__DoorOpen__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartHome.Prob_Factor <em>Prob Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prob Factor</em>'.
	 * @see smartHome.Prob_Factor
	 * @generated
	 */
	EClass getProb_Factor();

	/**
	 * Returns the meta object for the attribute '{@link smartHome.Prob_Factor#getCF <em>CF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CF</em>'.
	 * @see smartHome.Prob_Factor#getCF()
	 * @see #getProb_Factor()
	 * @generated
	 */
	EAttribute getProb_Factor_CF();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartHomeFactory getSmartHomeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smartHome.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.RoomImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Alarm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ALARM = eINSTANCE.getRoom_Alarm();

		/**
		 * The meta object literal for the '<em><b>High Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__HIGH_TEMP = eINSTANCE.getRoom_HighTemp();

		/**
		 * The meta object literal for the '<em><b>Heaters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HEATERS = eINSTANCE.getRoom_Heaters();

		/**
		 * The meta object literal for the '<em><b>Doors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DOORS = eINSTANCE.getRoom_Doors();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WINDOWS = eINSTANCE.getRoom_Windows();

		/**
		 * The meta object literal for the '<em><b>Lights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__LIGHTS = eINSTANCE.getRoom_Lights();

		/**
		 * The meta object literal for the '{@link smartHome.impl.HeaterImpl <em>Heater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.HeaterImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getHeater()
		 * @generated
		 */
		EClass HEATER = eINSTANCE.getHeater();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEATER__NAME = eINSTANCE.getHeater_Name();

		/**
		 * The meta object literal for the '<em><b>Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEATER__TEMP = eINSTANCE.getHeater_Temp();

		/**
		 * The meta object literal for the '<em><b>Uweight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEATER__UWEIGHT = eINSTANCE.getHeater_Uweight();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEATER__ROOM = eINSTANCE.getHeater_Room();

		/**
		 * The meta object literal for the '<em><b>High Temp Alarm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HEATER___HIGH_TEMP_ALARM__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHeater__HighTempAlarm__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartHome.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.WindowImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__NAME = eINSTANCE.getWindow_Name();

		/**
		 * The meta object literal for the '<em><b>Is Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__IS_OPEN = eINSTANCE.getWindow_IsOpen();

		/**
		 * The meta object literal for the '<em><b>Uweight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__UWEIGHT = eINSTANCE.getWindow_Uweight();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__ROOM = eINSTANCE.getWindow_Room();

		/**
		 * The meta object literal for the '{@link smartHome.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.DoorImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__NAME = eINSTANCE.getDoor_Name();

		/**
		 * The meta object literal for the '<em><b>Is Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__IS_OPEN = eINSTANCE.getDoor_IsOpen();

		/**
		 * The meta object literal for the '<em><b>Uweight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__UWEIGHT = eINSTANCE.getDoor_Uweight();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR__ROOM = eINSTANCE.getDoor_Room();

		/**
		 * The meta object literal for the '{@link smartHome.impl.HomeImpl <em>Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.HomeImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getHome()
		 * @generated
		 */
		EClass HOME = eINSTANCE.getHome();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME__NAME = eINSTANCE.getHome_Name();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__ROOM = eINSTANCE.getHome_Room();

		/**
		 * The meta object literal for the '{@link smartHome.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.LightImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__NAME = eINSTANCE.getLight_Name();

		/**
		 * The meta object literal for the '<em><b>Is ON</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__IS_ON = eINSTANCE.getLight_IsON();

		/**
		 * The meta object literal for the '<em><b>Uweight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__UWEIGHT = eINSTANCE.getLight_Uweight();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__ROOM = eINSTANCE.getLight_Room();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__DOOR = eINSTANCE.getLight_Door();

		/**
		 * The meta object literal for the '<em><b>Door Open</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIGHT___DOOR_OPEN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLight__DoorOpen__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartHome.impl.Prob_FactorImpl <em>Prob Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartHome.impl.Prob_FactorImpl
		 * @see smartHome.impl.SmartHomePackageImpl#getProb_Factor()
		 * @generated
		 */
		EClass PROB_FACTOR = eINSTANCE.getProb_Factor();

		/**
		 * The meta object literal for the '<em><b>CF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROB_FACTOR__CF = eINSTANCE.getProb_Factor_CF();

	}

} //SmartHomePackage
