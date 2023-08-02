/**
 */
package smartHome.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import smartHome.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see smartHome.SmartHomePackage
 * @generated
 */
public class SmartHomeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SmartHomeValidator INSTANCE = new SmartHomeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "smartHome";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'High Temp Alarm' of 'Heater'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEATER__HIGH_TEMP_ALARM = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Door Open' of 'Light'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIGHT__DOOR_OPEN = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHomeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SmartHomePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SmartHomePackage.ROOM:
				return validateRoom((Room)value, diagnostics, context);
			case SmartHomePackage.HEATER:
				return validateHeater((Heater)value, diagnostics, context);
			case SmartHomePackage.WINDOW:
				return validateWindow((Window)value, diagnostics, context);
			case SmartHomePackage.DOOR:
				return validateDoor((Door)value, diagnostics, context);
			case SmartHomePackage.HOME:
				return validateHome((Home)value, diagnostics, context);
			case SmartHomePackage.LIGHT:
				return validateLight((Light)value, diagnostics, context);
			case SmartHomePackage.PROB_FACTOR:
				return validateProb_Factor((Prob_Factor)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(room, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeater(Heater heater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(heater, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(heater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(heater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(heater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(heater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(heater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(heater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(heater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(heater, diagnostics, context);
		if (result || diagnostics != null) result &= validateHeater_highTempAlarm(heater, diagnostics, context);
		return result;
	}

	/**
	 * Validates the highTempAlarm constraint of '<em>Heater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeater_highTempAlarm(Heater heater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return heater.highTempAlarm(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow(Window window, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(window, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoor(Door door, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(door, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHome(Home home, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(home, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLight(Light light, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(light, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(light, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(light, diagnostics, context);
		if (result || diagnostics != null) result &= validateLight_doorOpen(light, diagnostics, context);
		return result;
	}

	/**
	 * Validates the doorOpen constraint of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLight_doorOpen(Light light, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return light.doorOpen(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProb_Factor(Prob_Factor prob_Factor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prob_Factor, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SmartHomeValidator
