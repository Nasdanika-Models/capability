/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.nxcore.NamedPeriod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.CapabilityProvider#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.CapabilityProvider#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProvider()
 * @model
 * @generated
 */
public interface CapabilityProvider extends NamedPeriod, AbstractCapabilityProvider, Staged {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.ProvidedCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProvider_Provides()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedCapability> getProvides();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.capability.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see org.nasdanika.models.capability.CapabilityPackage#getCapabilityProvider_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredCapability> getRequires();

} // CapabilityProvider
