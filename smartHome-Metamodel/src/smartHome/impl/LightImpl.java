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

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

import smartHome.Door;
import smartHome.Light;
import smartHome.Room;
import smartHome.SmartHomePackage;
import smartHome.SmartHomeTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartHome.impl.LightImpl#getName <em>Name</em>}</li>
 *   <li>{@link smartHome.impl.LightImpl#getIsON <em>Is ON</em>}</li>
 *   <li>{@link smartHome.impl.LightImpl#getUweight <em>Uweight</em>}</li>
 *   <li>{@link smartHome.impl.LightImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link smartHome.impl.LightImpl#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightImpl extends Prob_FactorImpl implements Light {
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
	 * The default value of the '{@link #getIsON() <em>Is ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsON()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsON() <em>Is ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsON()
	 * @generated
	 * @ordered
	 */
	protected Boolean isON = IS_ON_EDEFAULT;

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
	 * The cached value of the '{@link #getDoor() <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor()
	 * @generated
	 * @ordered
	 */
	protected Door door;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.LIGHT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.LIGHT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsON() {
		return isON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsON(Boolean newIsON) {
		Boolean oldIsON = isON;
		isON = newIsON;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.LIGHT__IS_ON, oldIsON, isON));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.LIGHT__UWEIGHT, oldUweight, uweight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (eContainerFeatureID() != SmartHomePackage.LIGHT__ROOM) return null;
		return (Room)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoom, SmartHomePackage.LIGHT__ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		if (newRoom != eInternalContainer() || (eContainerFeatureID() != SmartHomePackage.LIGHT__ROOM && newRoom != null)) {
			if (EcoreUtil.isAncestor(this, newRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoom != null)
				msgs = ((InternalEObject)newRoom).eInverseAdd(this, SmartHomePackage.ROOM__LIGHTS, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.LIGHT__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getDoor() {
		if (door != null && door.eIsProxy()) {
			InternalEObject oldDoor = (InternalEObject)door;
			door = (Door)eResolveProxy(oldDoor);
			if (door != oldDoor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartHomePackage.LIGHT__DOOR, oldDoor, door));
			}
		}
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door basicGetDoor() {
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoor(Door newDoor) {
		Door oldDoor = door;
		door = newDoor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.LIGHT__DOOR, oldDoor, door));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean doorOpen(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Light::doorOpen";
		try {
			/**
			 *
			 * inv doorOpen:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = if door.isOpen = true
			 *         then self.isON = true
			 *         else self.isON = false
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SmartHomePackage.Literals.LIGHT___DOOR_OPEN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SmartHomeTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ Boolean isON_0 = this.getIsON();
				final /*@NonInvalid*/ Door door = this.getDoor();
				if (door == null) {
					throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/mdt/ocl/oclinecore/smartHome\'::Door::isOpen\'");
				}
				final /*@Thrown*/ Boolean isOpen = door.getIsOpen();
				final /*@Thrown*/ boolean eq = isOpen == Boolean.TRUE;
				/*@NonInvalid*/ boolean result;
				if (eq) {
					final /*@NonInvalid*/ boolean eq_0 = isON_0 == Boolean.TRUE;
					result = eq_0;
				}
				else {
					final /*@NonInvalid*/ boolean eq_1 = isON_0 == Boolean.FALSE;
					result = eq_1;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SmartHomeTables.INT_0).booleanValue();
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
			case SmartHomePackage.LIGHT__ROOM:
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
			case SmartHomePackage.LIGHT__ROOM:
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
			case SmartHomePackage.LIGHT__ROOM:
				return eInternalContainer().eInverseRemove(this, SmartHomePackage.ROOM__LIGHTS, Room.class, msgs);
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
			case SmartHomePackage.LIGHT__NAME:
				return getName();
			case SmartHomePackage.LIGHT__IS_ON:
				return getIsON();
			case SmartHomePackage.LIGHT__UWEIGHT:
				return getUweight();
			case SmartHomePackage.LIGHT__ROOM:
				return getRoom();
			case SmartHomePackage.LIGHT__DOOR:
				if (resolve) return getDoor();
				return basicGetDoor();
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
			case SmartHomePackage.LIGHT__NAME:
				setName((String)newValue);
				return;
			case SmartHomePackage.LIGHT__IS_ON:
				setIsON((Boolean)newValue);
				return;
			case SmartHomePackage.LIGHT__UWEIGHT:
				setUweight((BigDecimal)newValue);
				return;
			case SmartHomePackage.LIGHT__ROOM:
				setRoom((Room)newValue);
				return;
			case SmartHomePackage.LIGHT__DOOR:
				setDoor((Door)newValue);
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
			case SmartHomePackage.LIGHT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartHomePackage.LIGHT__IS_ON:
				setIsON(IS_ON_EDEFAULT);
				return;
			case SmartHomePackage.LIGHT__UWEIGHT:
				setUweight(UWEIGHT_EDEFAULT);
				return;
			case SmartHomePackage.LIGHT__ROOM:
				setRoom((Room)null);
				return;
			case SmartHomePackage.LIGHT__DOOR:
				setDoor((Door)null);
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
			case SmartHomePackage.LIGHT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartHomePackage.LIGHT__IS_ON:
				return IS_ON_EDEFAULT == null ? isON != null : !IS_ON_EDEFAULT.equals(isON);
			case SmartHomePackage.LIGHT__UWEIGHT:
				return UWEIGHT_EDEFAULT == null ? uweight != null : !UWEIGHT_EDEFAULT.equals(uweight);
			case SmartHomePackage.LIGHT__ROOM:
				return getRoom() != null;
			case SmartHomePackage.LIGHT__DOOR:
				return door != null;
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
			case SmartHomePackage.LIGHT___DOOR_OPEN__DIAGNOSTICCHAIN_MAP:
				return doorOpen((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", isON: ");
		result.append(isON);
		result.append(", Uweight: ");
		result.append(uweight);
		result.append(')');
		return result.toString();
	}

} //LightImpl
