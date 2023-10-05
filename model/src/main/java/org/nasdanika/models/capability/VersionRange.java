/**
 */
package org.nasdanika.models.capability;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.VersionRange#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.VersionRange#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.VersionRange#isIncludeMinimum <em>Include Minimum</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.VersionRange#isIncludeMaximum <em>Include Maximum</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.capability.CapabilityPackage#getVersionRange()
 * @model
 * @generated
 */
public interface VersionRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' reference.
	 * @see #setMinimum(Version)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getVersionRange_Minimum()
	 * @model
	 * @generated
	 */
	Version getMinimum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.VersionRange#getMinimum <em>Minimum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Version value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' reference.
	 * @see #setMaximum(Version)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getVersionRange_Maximum()
	 * @model
	 * @generated
	 */
	Version getMaximum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.VersionRange#getMaximum <em>Maximum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Version value);

	/**
	 * Returns the value of the '<em><b>Include Minimum</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Minimum</em>' attribute.
	 * @see #setIncludeMinimum(boolean)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getVersionRange_IncludeMinimum()
	 * @model default="true"
	 * @generated
	 */
	boolean isIncludeMinimum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.VersionRange#isIncludeMinimum <em>Include Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Minimum</em>' attribute.
	 * @see #isIncludeMinimum()
	 * @generated
	 */
	void setIncludeMinimum(boolean value);

	/**
	 * Returns the value of the '<em><b>Include Maximum</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Maximum</em>' attribute.
	 * @see #setIncludeMaximum(boolean)
	 * @see org.nasdanika.models.capability.CapabilityPackage#getVersionRange_IncludeMaximum()
	 * @model default="false"
	 * @generated
	 */
	boolean isIncludeMaximum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.capability.VersionRange#isIncludeMaximum <em>Include Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Maximum</em>' attribute.
	 * @see #isIncludeMaximum()
	 * @generated
	 */
	void setIncludeMaximum(boolean value);

} // VersionRange
