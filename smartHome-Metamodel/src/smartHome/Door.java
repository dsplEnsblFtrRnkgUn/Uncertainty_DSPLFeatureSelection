/**
 */
package smartHome;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.Door#getName <em>Name</em>}</li>
 *   <li>{@link smartHome.Door#getIsOpen <em>Is Open</em>}</li>
 *   <li>{@link smartHome.Door#getUweight <em>Uweight</em>}</li>
 *   <li>{@link smartHome.Door#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getDoor()
 * @model
 * @generated
 */
public interface Door extends Prob_Factor {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smartHome.SmartHomePackage#getDoor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smartHome.Door#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Open</em>' attribute.
	 * @see #setIsOpen(Boolean)
	 * @see smartHome.SmartHomePackage#getDoor_IsOpen()
	 * @model
	 * @generated
	 */
	Boolean getIsOpen();

	/**
	 * Sets the value of the '{@link smartHome.Door#getIsOpen <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Open</em>' attribute.
	 * @see #getIsOpen()
	 * @generated
	 */
	void setIsOpen(Boolean value);

	/**
	 * Returns the value of the '<em><b>Uweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uweight</em>' attribute.
	 * @see #setUweight(BigDecimal)
	 * @see smartHome.SmartHomePackage#getDoor_Uweight()
	 * @model
	 * @generated
	 */
	BigDecimal getUweight();

	/**
	 * Sets the value of the '{@link smartHome.Door#getUweight <em>Uweight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uweight</em>' attribute.
	 * @see #getUweight()
	 * @generated
	 */
	void setUweight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link smartHome.Room#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see smartHome.SmartHomePackage#getDoor_Room()
	 * @see smartHome.Room#getDoors
	 * @model opposite="doors" transient="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link smartHome.Door#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Door
