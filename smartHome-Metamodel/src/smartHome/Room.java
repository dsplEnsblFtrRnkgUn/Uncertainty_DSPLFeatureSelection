/**
 */
package smartHome;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.Room#getName <em>Name</em>}</li>
 *   <li>{@link smartHome.Room#getAlarm <em>Alarm</em>}</li>
 *   <li>{@link smartHome.Room#getHighTemp <em>High Temp</em>}</li>
 *   <li>{@link smartHome.Room#getHeaters <em>Heaters</em>}</li>
 *   <li>{@link smartHome.Room#getDoors <em>Doors</em>}</li>
 *   <li>{@link smartHome.Room#getWindows <em>Windows</em>}</li>
 *   <li>{@link smartHome.Room#getLights <em>Lights</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartHome.SmartHomePackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartHome.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm</em>' attribute.
	 * @see #setAlarm(Boolean)
	 * @see smartHome.SmartHomePackage#getRoom_Alarm()
	 * @model
	 * @generated
	 */
	Boolean getAlarm();

	/**
	 * Sets the value of the '{@link smartHome.Room#getAlarm <em>Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm</em>' attribute.
	 * @see #getAlarm()
	 * @generated
	 */
	void setAlarm(Boolean value);

	/**
	 * Returns the value of the '<em><b>High Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Temp</em>' attribute.
	 * @see #setHighTemp(BigDecimal)
	 * @see smartHome.SmartHomePackage#getRoom_HighTemp()
	 * @model
	 * @generated
	 */
	BigDecimal getHighTemp();

	/**
	 * Sets the value of the '{@link smartHome.Room#getHighTemp <em>High Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Temp</em>' attribute.
	 * @see #getHighTemp()
	 * @generated
	 */
	void setHighTemp(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Heaters</b></em>' containment reference list.
	 * The list contents are of type {@link smartHome.Heater}.
	 * It is bidirectional and its opposite is '{@link smartHome.Heater#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heaters</em>' containment reference list.
	 * @see smartHome.SmartHomePackage#getRoom_Heaters()
	 * @see smartHome.Heater#getRoom
	 * @model opposite="room" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Heater> getHeaters();

	/**
	 * Returns the value of the '<em><b>Doors</b></em>' containment reference list.
	 * The list contents are of type {@link smartHome.Door}.
	 * It is bidirectional and its opposite is '{@link smartHome.Door#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' containment reference list.
	 * @see smartHome.SmartHomePackage#getRoom_Doors()
	 * @see smartHome.Door#getRoom
	 * @model opposite="room" containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Door> getDoors();

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link smartHome.Window}.
	 * It is bidirectional and its opposite is '{@link smartHome.Window#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see smartHome.SmartHomePackage#getRoom_Windows()
	 * @see smartHome.Window#getRoom
	 * @model opposite="room" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Window> getWindows();

	/**
	 * Returns the value of the '<em><b>Lights</b></em>' containment reference list.
	 * The list contents are of type {@link smartHome.Light}.
	 * It is bidirectional and its opposite is '{@link smartHome.Light#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights</em>' containment reference list.
	 * @see smartHome.SmartHomePackage#getRoom_Lights()
	 * @see smartHome.Light#getRoom
	 * @model opposite="room" containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Light> getLights();

} // Room
