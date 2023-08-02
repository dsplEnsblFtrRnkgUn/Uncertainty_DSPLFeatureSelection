/**
 */
package smartHome.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smartHome.Door;
import smartHome.Heater;
import smartHome.Light;
import smartHome.Room;
import smartHome.SmartHomePackage;
import smartHome.Window;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartHome.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link smartHome.impl.RoomImpl#getAlarm <em>Alarm</em>}</li>
 *   <li>{@link smartHome.impl.RoomImpl#getHighTemp <em>High Temp</em>}</li>
 *   <li>{@link smartHome.impl.RoomImpl#getHeaters <em>Heaters</em>}</li>
 *   <li>{@link smartHome.impl.RoomImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link smartHome.impl.RoomImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link smartHome.impl.RoomImpl#getLights <em>Lights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
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
	 * The default value of the '{@link #getAlarm() <em>Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarm()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALARM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlarm() <em>Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarm()
	 * @generated
	 * @ordered
	 */
	protected Boolean alarm = ALARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighTemp() <em>High Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighTemp()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal HIGH_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighTemp() <em>High Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighTemp()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal highTemp = HIGH_TEMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeaters() <em>Heaters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaters()
	 * @generated
	 * @ordered
	 */
	protected EList<Heater> heaters;

	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> doors;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> windows;

	/**
	 * The cached value of the '{@link #getLights() <em>Lights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights()
	 * @generated
	 * @ordered
	 */
	protected EList<Light> lights;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.ROOM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.ROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAlarm() {
		return alarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarm(Boolean newAlarm) {
		Boolean oldAlarm = alarm;
		alarm = newAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.ROOM__ALARM, oldAlarm, alarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getHighTemp() {
		return highTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighTemp(BigDecimal newHighTemp) {
		BigDecimal oldHighTemp = highTemp;
		highTemp = newHighTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.ROOM__HIGH_TEMP, oldHighTemp, highTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Heater> getHeaters() {
		if (heaters == null) {
			heaters = new EObjectContainmentWithInverseEList<Heater>(Heater.class, this, SmartHomePackage.ROOM__HEATERS, SmartHomePackage.HEATER__ROOM);
		}
		return heaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Door> getDoors() {
		if (doors == null) {
			doors = new EObjectContainmentWithInverseEList<Door>(Door.class, this, SmartHomePackage.ROOM__DOORS, SmartHomePackage.DOOR__ROOM);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindows() {
		if (windows == null) {
			windows = new EObjectContainmentWithInverseEList<Window>(Window.class, this, SmartHomePackage.ROOM__WINDOWS, SmartHomePackage.WINDOW__ROOM);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Light> getLights() {
		if (lights == null) {
			lights = new EObjectContainmentWithInverseEList<Light>(Light.class, this, SmartHomePackage.ROOM__LIGHTS, SmartHomePackage.LIGHT__ROOM);
		}
		return lights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartHomePackage.ROOM__HEATERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHeaters()).basicAdd(otherEnd, msgs);
			case SmartHomePackage.ROOM__DOORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDoors()).basicAdd(otherEnd, msgs);
			case SmartHomePackage.ROOM__WINDOWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindows()).basicAdd(otherEnd, msgs);
			case SmartHomePackage.ROOM__LIGHTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLights()).basicAdd(otherEnd, msgs);
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
			case SmartHomePackage.ROOM__HEATERS:
				return ((InternalEList<?>)getHeaters()).basicRemove(otherEnd, msgs);
			case SmartHomePackage.ROOM__DOORS:
				return ((InternalEList<?>)getDoors()).basicRemove(otherEnd, msgs);
			case SmartHomePackage.ROOM__WINDOWS:
				return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
			case SmartHomePackage.ROOM__LIGHTS:
				return ((InternalEList<?>)getLights()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartHomePackage.ROOM__NAME:
				return getName();
			case SmartHomePackage.ROOM__ALARM:
				return getAlarm();
			case SmartHomePackage.ROOM__HIGH_TEMP:
				return getHighTemp();
			case SmartHomePackage.ROOM__HEATERS:
				return getHeaters();
			case SmartHomePackage.ROOM__DOORS:
				return getDoors();
			case SmartHomePackage.ROOM__WINDOWS:
				return getWindows();
			case SmartHomePackage.ROOM__LIGHTS:
				return getLights();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartHomePackage.ROOM__NAME:
				setName((String)newValue);
				return;
			case SmartHomePackage.ROOM__ALARM:
				setAlarm((Boolean)newValue);
				return;
			case SmartHomePackage.ROOM__HIGH_TEMP:
				setHighTemp((BigDecimal)newValue);
				return;
			case SmartHomePackage.ROOM__HEATERS:
				getHeaters().clear();
				getHeaters().addAll((Collection<? extends Heater>)newValue);
				return;
			case SmartHomePackage.ROOM__DOORS:
				getDoors().clear();
				getDoors().addAll((Collection<? extends Door>)newValue);
				return;
			case SmartHomePackage.ROOM__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends Window>)newValue);
				return;
			case SmartHomePackage.ROOM__LIGHTS:
				getLights().clear();
				getLights().addAll((Collection<? extends Light>)newValue);
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
			case SmartHomePackage.ROOM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartHomePackage.ROOM__ALARM:
				setAlarm(ALARM_EDEFAULT);
				return;
			case SmartHomePackage.ROOM__HIGH_TEMP:
				setHighTemp(HIGH_TEMP_EDEFAULT);
				return;
			case SmartHomePackage.ROOM__HEATERS:
				getHeaters().clear();
				return;
			case SmartHomePackage.ROOM__DOORS:
				getDoors().clear();
				return;
			case SmartHomePackage.ROOM__WINDOWS:
				getWindows().clear();
				return;
			case SmartHomePackage.ROOM__LIGHTS:
				getLights().clear();
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
			case SmartHomePackage.ROOM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartHomePackage.ROOM__ALARM:
				return ALARM_EDEFAULT == null ? alarm != null : !ALARM_EDEFAULT.equals(alarm);
			case SmartHomePackage.ROOM__HIGH_TEMP:
				return HIGH_TEMP_EDEFAULT == null ? highTemp != null : !HIGH_TEMP_EDEFAULT.equals(highTemp);
			case SmartHomePackage.ROOM__HEATERS:
				return heaters != null && !heaters.isEmpty();
			case SmartHomePackage.ROOM__DOORS:
				return doors != null && !doors.isEmpty();
			case SmartHomePackage.ROOM__WINDOWS:
				return windows != null && !windows.isEmpty();
			case SmartHomePackage.ROOM__LIGHTS:
				return lights != null && !lights.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(", alarm: ");
		result.append(alarm);
		result.append(", highTemp: ");
		result.append(highTemp);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
