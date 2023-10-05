/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ability to do something. Skill, authorization, software component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.Capability#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.Capability#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.Capability#getIncludedIn <em>Included In</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends DocumentedNamedElement {

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.CapabilityVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityVersion> getVersions();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.Capability}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.capability.Capability#getIncludedIn <em>Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities included in this capability
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability_Includes()
	 * @see org.nasdanika.models.capability.Capability#getIncludedIn
	 * @model opposite="includedIn"
	 * @generated
	 */
	EList<Capability> getIncludes();

	/**
	 * Returns the value of the '<em><b>Included In</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.Capability}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.capability.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included In</em>' reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapability_IncludedIn()
	 * @see org.nasdanika.models.capability.Capability#getIncludes
	 * @model opposite="includes"
	 * @generated
	 */
	EList<Capability> getIncludedIn();
} // Capability
