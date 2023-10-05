/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.CapabilityProvider#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProvider()
 * @model
 * @generated
 */
public interface CapabilityProvider extends DocumentedNamedElement, RequirementConsumer {
	/**
	 * Returns the value of the '<em><b>Provided Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Capabilities</em>' reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProvider_ProvidedCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capability> getProvidedCapabilities();

} // CapabilityProvider
