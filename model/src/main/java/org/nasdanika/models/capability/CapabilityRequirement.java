/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.CapabilityRequirement#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.CapabilityRequirement#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.CapabilityRequirement#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.CapabilityRequirement#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityRequirement()
 * @model
 * @generated
 */
public interface CapabilityRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimal cardinality. 0 means that the requirement is optional
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityRequirement_Min()
	 * @model
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.CapabilityRequirement#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum cardinality. -1 means "all available"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityRequirement_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.CapabilityRequirement#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(Capability)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityRequirement_Capability()
	 * @model required="true"
	 * @generated
	 */
	Capability getCapability();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.CapabilityRequirement#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Capability value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.VersionRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityRequirement_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VersionRange> getVersions();

} // CapabilityRequirement
