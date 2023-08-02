/**
 */
package smartHome;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.Light#getName <em>Name</em>}</li>
 *   <li>{@link smartHome.Light#getIsON <em>Is ON</em>}</li>
 *   <li>{@link smartHome.Light#getUweight <em>Uweight</em>}</li>
 *   <li>{@link smartHome.Light#getRoom <em>Room</em>}</li>
 *   <li>{@link smartHome.Light#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getLight()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='doorOpen'"
 * @generated
 */
public interface Light extends Prob_Factor {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartHome.SmartHomePackage#getLight_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartHome.Light#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ON</em>' attribute.
	 * @see #setIsON(Boolean)
	 * @see smartHome.SmartHomePackage#getLight_IsON()
	 * @model
	 * @generated
	 */
	Boolean getIsON();

	/**
	 * Sets the value of the '{@link smartHome.Light#getIsON <em>Is ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ON</em>' attribute.
	 * @see #getIsON()
	 * @generated
	 */
	void setIsON(Boolean value);

	/**
	 * Returns the value of the '<em><b>Uweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uweight</em>' attribute.
	 * @see #setUweight(BigDecimal)
	 * @see smartHome.SmartHomePackage#getLight_Uweight()
	 * @model
	 * @generated
	 */
	BigDecimal getUweight();

	/**
	 * Sets the value of the '{@link smartHome.Light#getUweight <em>Uweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uweight</em>' attribute.
	 * @see #getUweight()
	 * @generated
	 */
	void setUweight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartHome.Room#getLights <em>Lights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see smartHome.SmartHomePackage#getLight_Room()
	 * @see smartHome.Room#getLights
	 * @model opposite="lights" transient="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link smartHome.Light#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' reference.
	 * @see #setDoor(Door)
	 * @see smartHome.SmartHomePackage#getLight_Door()
	 * @model
	 * @generated
	 */
	Door getDoor();

	/**
	 * Sets the value of the '{@link smartHome.Light#getDoor <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(Door value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\tif door.isOpen=true then self.isON=true else self.isON=false endif'"
	 * @generated
	 */
	boolean doorOpen(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Light
