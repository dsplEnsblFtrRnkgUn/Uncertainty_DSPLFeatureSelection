/**
 */
package smartHome;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.Heater#getName <em>Name</em>}</li>
 *   <li>{@link smartHome.Heater#getTemp <em>Temp</em>}</li>
 *   <li>{@link smartHome.Heater#getUweight <em>Uweight</em>}</li>
 *   <li>{@link smartHome.Heater#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getHeater()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='highTempAlarm'"
 * @generated
 */
public interface Heater extends Prob_Factor {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartHome.SmartHomePackage#getHeater_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartHome.Heater#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp</em>' attribute.
	 * @see #setTemp(BigDecimal)
	 * @see smartHome.SmartHomePackage#getHeater_Temp()
	 * @model
	 * @generated
	 */
	BigDecimal getTemp();

	/**
	 * Sets the value of the '{@link smartHome.Heater#getTemp <em>Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp</em>' attribute.
	 * @see #getTemp()
	 * @generated
	 */
	void setTemp(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Uweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uweight</em>' attribute.
	 * @see #setUweight(BigDecimal)
	 * @see smartHome.SmartHomePackage#getHeater_Uweight()
	 * @model
	 * @generated
	 */
	BigDecimal getUweight();

	/**
	 * Sets the value of the '{@link smartHome.Heater#getUweight <em>Uweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uweight</em>' attribute.
	 * @see #getUweight()
	 * @generated
	 */
	void setUweight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartHome.Room#getHeaters <em>Heaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see smartHome.SmartHomePackage#getHeater_Room()
	 * @see smartHome.Room#getHeaters
	 * @model opposite="heaters" transient="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link smartHome.Heater#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\tif self.temp&gt;=room.highTemp then\n\t\troom.alarm=true \n\t\telse room.alarm=false \n\t\tendif'"
	 * @generated
	 */
	boolean highTempAlarm(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Heater
