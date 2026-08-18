/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.CapabilityDomain#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.CapabilityDomain#getResolvedCapabilities <em>Resolved Capabilities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityDomain()
 * @model
 * @generated
 */
public interface CapabilityDomain extends NamedElement, AbstractCapability {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityDomain_Capabilities()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika logicalContainment='false'"
	 * @generated
	 */
	EList<AbstractCapability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Resolved Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Capabilities</em>' reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityDomain_ResolvedCapabilities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="urn:org.nasdanika logicalContainment='true'"
	 * @generated
	 */
	EList<AbstractCapability> getResolvedCapabilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" startUnique="false"
	 * @generated
	 */
	AbstractCapability resolveCapabilityReference(AbstractCapability start);

} // CapabilityDomain
