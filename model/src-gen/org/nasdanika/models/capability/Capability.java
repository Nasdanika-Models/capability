/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.nxcore.NamedPeriod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.Capability#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.Capability#getDependents <em>Dependents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends NamedPeriod, AbstractCapability, EvidenceDomain, Staged {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Dependencies as an abstract capability allows to
	 * model self-contained capabilities with inline dependencies
	 * and even dependency domains.
	 * When federated, such inline capabilities can be
	 * either replaced with CapabilityReference or CapabilityDependency
	 * or use URIs to de-dup multiple definitions into one logical definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCapability> getDependencies();

	/**
	 * Returns the value of the '<em><b>Dependents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.CapabilityReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Capabilities depending on this capability, excludes containment.
	 * Returns capability references, including capability dependencies, with target pointing
	 * to this capability and contained by the dependencies reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependents</em>' reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability_Dependents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<CapabilityReference> getDependents();

} // Capability
