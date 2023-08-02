/**
 */
package smartHome;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prob Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smartHome.Prob_Factor#getCF <em>CF</em>}</li>
 * </ul>
 *
 * @see smartHome.SmartHomePackage#getProb_Factor()
 * @model
 * @generated
 */
public interface Prob_Factor extends EObject {
	/**
	 * Returns the value of the '<em><b>CF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CF</em>' attribute.
	 * @see #setCF(BigDecimal)
	 * @see smartHome.SmartHomePackage#getProb_Factor_CF()
	 * @model
	 * @generated
	 */
	BigDecimal getCF();

	/**
	 * Sets the value of the '{@link smartHome.Prob_Factor#getCF <em>CF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CF</em>' attribute.
	 * @see #getCF()
	 * @generated
	 */
	void setCF(BigDecimal value);

} // Prob_Factor
