/**
 */
package smartHome.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.RealValue;

import smartHome.Heater;
import smartHome.Room;
import smartHome.SmartHomePackage;
import smartHome.SmartHomeTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartHome.impl.HeaterImpl#getName <em>Name</em>}</li>
 *   <li>{@link smartHome.impl.HeaterImpl#getTemp <em>Temp</em>}</li>
 *   <li>{@link smartHome.impl.HeaterImpl#getUweight <em>Uweight</em>}</li>
 *   <li>{@link smartHome.impl.HeaterImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaterImpl extends Prob_FactorImpl implements Heater {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemp() <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal temp = TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUweight() <em>Uweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUweight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UWEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUweight() <em>Uweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUweight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal uweight = UWEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.HEATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.HEATER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTemp() {
		return temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemp(BigDecimal newTemp) {
		BigDecimal oldTemp = temp;
		temp = newTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.HEATER__TEMP, oldTemp, temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getUweight() {
		return uweight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUweight(BigDecimal newUweight) {
		BigDecimal oldUweight = uweight;
		uweight = newUweight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.HEATER__UWEIGHT, oldUweight, uweight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (eContainerFeatureID() != SmartHomePackage.HEATER__ROOM) return null;
		return (Room)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoom, SmartHomePackage.HEATER__ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		if (newRoom != eInternalContainer() || (eContainerFeatureID() != SmartHomePackage.HEATER__ROOM && newRoom != null)) {
			if (EcoreUtil.isAncestor(this, newRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoom != null)
				msgs = ((InternalEObject)newRoom).eInverseAdd(this, SmartHomePackage.ROOM__HEATERS, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.HEATER__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean highTempAlarm(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Heater::highTempAlarm";
		try {
			/**
			 *
			 * inv highTempAlarm:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = if self.temp >= room.highTemp
			 *         then room.alarm = true
			 *         else room.alarm = false
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SmartHomePackage.Literals.HEATER___HIGH_TEMP_ALARM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SmartHomeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Room room_0 = this.getRoom();
					if (room_0 == null) {
						throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/mdt/ocl/oclinecore/smartHome\'::Room::alarm\'");
					}
					final /*@Thrown*/ Boolean alarm_0 = room_0.getAlarm();
					final /*@NonInvalid*/ BigDecimal temp = this.getTemp();
					if (temp == null) {
						throw new InvalidValueException("Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ RealValue BOXED_temp = ValueUtil.realValueOf(temp);
					final /*@Thrown*/ BigDecimal highTemp = room_0.getHighTemp();
					if (highTemp == null) {
						throw new InvalidValueException("Null \'\'OclSelf\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ RealValue BOXED_highTemp = ValueUtil.realValueOf(highTemp);
					if (BOXED_highTemp instanceof InvalidValueException) {
						throw (InvalidValueException)BOXED_highTemp;
					}
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_temp, BOXED_highTemp).booleanValue();
					/*@Thrown*/ boolean result;
					if (ge) {
						final /*@Thrown*/ boolean eq = alarm_0 == Boolean.TRUE;
						result = eq;
					}
					else {
						final /*@Thrown*/ boolean eq_0 = alarm_0 == Boolean.FALSE;
						result = eq_0;
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, SmartHomeTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHomePackage.HEATER__ROOM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoom((Room)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHomePackage.HEATER__ROOM:
				return basicSetRoom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SmartHomePackage.HEATER__ROOM:
				return eInternalContainer().eInverseRemove(this, SmartHomePackage.ROOM__HEATERS, Room.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartHomePackage.HEATER__NAME:
				return getName();
			case SmartHomePackage.HEATER__TEMP:
				return getTemp();
			case SmartHomePackage.HEATER__UWEIGHT:
				return getUweight();
			case SmartHomePackage.HEATER__ROOM:
				return getRoom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartHomePackage.HEATER__NAME:
				setName((String)newValue);
				return;
			case SmartHomePackage.HEATER__TEMP:
				setTemp((BigDecimal)newValue);
				return;
			case SmartHomePackage.HEATER__UWEIGHT:
				setUweight((BigDecimal)newValue);
				return;
			case SmartHomePackage.HEATER__ROOM:
				setRoom((Room)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmartHomePackage.HEATER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartHomePackage.HEATER__TEMP:
				setTemp(TEMP_EDEFAULT);
				return;
			case SmartHomePackage.HEATER__UWEIGHT:
				setUweight(UWEIGHT_EDEFAULT);
				return;
			case SmartHomePackage.HEATER__ROOM:
				setRoom((Room)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmartHomePackage.HEATER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartHomePackage.HEATER__TEMP:
				return TEMP_EDEFAULT == null ? temp != null : !TEMP_EDEFAULT.equals(temp);
			case SmartHomePackage.HEATER__UWEIGHT:
				return UWEIGHT_EDEFAULT == null ? uweight != null : !UWEIGHT_EDEFAULT.equals(uweight);
			case SmartHomePackage.HEATER__ROOM:
				return getRoom() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SmartHomePackage.HEATER___HIGH_TEMP_ALARM__DIAGNOSTICCHAIN_MAP:
				return highTempAlarm((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", temp: ");
		result.append(temp);
		result.append(", Uweight: ");
		result.append(uweight);
		result.append(')');
		return result.toString();
	}

} //HeaterImpl
