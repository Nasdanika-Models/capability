/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of artifacts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.CapabilityDomain#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityDomain()
 * @model abstract="true"
 * @generated
 */
public interface CapabilityDomain extends CapabilityDomainElement {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.CapabilityDomainElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts used in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityDomain_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityDomainElement> getCapabilities();

} // CapabilityDomain
