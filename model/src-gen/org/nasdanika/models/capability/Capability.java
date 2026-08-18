/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.nasdanika.models.capability.Capability#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.Capability#getAllAddresses <em>All Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.Capability#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.Capability#getDependents <em>Dependents</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.Capability#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends NamedPeriod, AbstractCapability, EvidenceDomain {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability_Addresses()
	 * @model type="org.eclipse.emf.ecore.EJavaObject" containment="true"
	 * @generated
	 */
	EList<Object> getAddresses();

	/**
	 * Returns the value of the '<em><b>All Addresses</b></em>' reference list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Addressed concerns from this capability plus addressedBy from concerns
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Addresses</em>' reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability_AllAddresses()
	 * @model type="org.eclipse.emf.ecore.EJavaObject" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Object> getAllAddresses();

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

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' attribute.
	 * @see #setLifecycle(Object)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability_Lifecycle()
	 * @model unique="false"
	 * @generated
	 */
	Object getLifecycle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.Capability#getLifecycle <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' attribute.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(Object value);

} // Capability
