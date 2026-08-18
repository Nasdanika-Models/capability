/**
 */
package org.nasdanika.models.capability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.CapabilityProviderReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProviderReference()
 * @model
 * @generated
 */
public interface CapabilityProviderReference extends AbstractCapabilityProvider {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CapabilityProvider)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProviderReference_Target()
	 * @model
	 * @generated
	 */
	CapabilityProvider getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.CapabilityProviderReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CapabilityProvider value);

} // CapabilityProviderReference
