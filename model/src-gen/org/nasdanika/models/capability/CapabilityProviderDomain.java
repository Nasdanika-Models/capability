/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.CapabilityProviderDomain#getCapabilityProviders <em>Capability Providers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProviderDomain()
 * @model
 * @generated
 */
public interface CapabilityProviderDomain extends NamedElement, AbstractCapabilityProvider {
	/**
	 * Returns the value of the '<em><b>Capability Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.AbstractCapabilityProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Providers</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProviderDomain_CapabilityProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCapabilityProvider> getCapabilityProviders();

} // CapabilityProviderDomain
