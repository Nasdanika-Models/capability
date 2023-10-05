/**
 */
package org.nasdanika.models.capability.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.Version;
import org.nasdanika.models.capability.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.VersionRangeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.VersionRangeImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.VersionRangeImpl#isIncludeMinimum <em>Include Minimum</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.VersionRangeImpl#isIncludeMaximum <em>Include Maximum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionRangeImpl extends MinimalEObjectImpl.Container implements VersionRange {
	/**
	 * The default value of the '{@link #isIncludeMinimum() <em>Include Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_MINIMUM_EDEFAULT = true;

	/**
	 * The default value of the '{@link #isIncludeMaximum() <em>Include Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_MAXIMUM_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.VERSION_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version getMinimum() {
		return (Version)eDynamicGet(CapabilityPackage.VERSION_RANGE__MINIMUM, CapabilityPackage.Literals.VERSION_RANGE__MINIMUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetMinimum() {
		return (Version)eDynamicGet(CapabilityPackage.VERSION_RANGE__MINIMUM, CapabilityPackage.Literals.VERSION_RANGE__MINIMUM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum(Version newMinimum) {
		eDynamicSet(CapabilityPackage.VERSION_RANGE__MINIMUM, CapabilityPackage.Literals.VERSION_RANGE__MINIMUM, newMinimum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version getMaximum() {
		return (Version)eDynamicGet(CapabilityPackage.VERSION_RANGE__MAXIMUM, CapabilityPackage.Literals.VERSION_RANGE__MAXIMUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetMaximum() {
		return (Version)eDynamicGet(CapabilityPackage.VERSION_RANGE__MAXIMUM, CapabilityPackage.Literals.VERSION_RANGE__MAXIMUM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum(Version newMaximum) {
		eDynamicSet(CapabilityPackage.VERSION_RANGE__MAXIMUM, CapabilityPackage.Literals.VERSION_RANGE__MAXIMUM, newMaximum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeMinimum() {
		return (Boolean)eDynamicGet(CapabilityPackage.VERSION_RANGE__INCLUDE_MINIMUM, CapabilityPackage.Literals.VERSION_RANGE__INCLUDE_MINIMUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMinimum(boolean newIncludeMinimum) {
		eDynamicSet(CapabilityPackage.VERSION_RANGE__INCLUDE_MINIMUM, CapabilityPackage.Literals.VERSION_RANGE__INCLUDE_MINIMUM, newIncludeMinimum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeMaximum() {
		return (Boolean)eDynamicGet(CapabilityPackage.VERSION_RANGE__INCLUDE_MAXIMUM, CapabilityPackage.Literals.VERSION_RANGE__INCLUDE_MAXIMUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMaximum(boolean newIncludeMaximum) {
		eDynamicSet(CapabilityPackage.VERSION_RANGE__INCLUDE_MAXIMUM, CapabilityPackage.Literals.VERSION_RANGE__INCLUDE_MAXIMUM, newIncludeMaximum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.VERSION_RANGE__MINIMUM:
				if (resolve) return getMinimum();
				return basicGetMinimum();
			case CapabilityPackage.VERSION_RANGE__MAXIMUM:
				if (resolve) return getMaximum();
				return basicGetMaximum();
			case CapabilityPackage.VERSION_RANGE__INCLUDE_MINIMUM:
				return isIncludeMinimum();
			case CapabilityPackage.VERSION_RANGE__INCLUDE_MAXIMUM:
				return isIncludeMaximum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CapabilityPackage.VERSION_RANGE__MINIMUM:
				setMinimum((Version)newValue);
				return;
			case CapabilityPackage.VERSION_RANGE__MAXIMUM:
				setMaximum((Version)newValue);
				return;
			case CapabilityPackage.VERSION_RANGE__INCLUDE_MINIMUM:
				setIncludeMinimum((Boolean)newValue);
				return;
			case CapabilityPackage.VERSION_RANGE__INCLUDE_MAXIMUM:
				setIncludeMaximum((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CapabilityPackage.VERSION_RANGE__MINIMUM:
				setMinimum((Version)null);
				return;
			case CapabilityPackage.VERSION_RANGE__MAXIMUM:
				setMaximum((Version)null);
				return;
			case CapabilityPackage.VERSION_RANGE__INCLUDE_MINIMUM:
				setIncludeMinimum(INCLUDE_MINIMUM_EDEFAULT);
				return;
			case CapabilityPackage.VERSION_RANGE__INCLUDE_MAXIMUM:
				setIncludeMaximum(INCLUDE_MAXIMUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CapabilityPackage.VERSION_RANGE__MINIMUM:
				return basicGetMinimum() != null;
			case CapabilityPackage.VERSION_RANGE__MAXIMUM:
				return basicGetMaximum() != null;
			case CapabilityPackage.VERSION_RANGE__INCLUDE_MINIMUM:
				return isIncludeMinimum() != INCLUDE_MINIMUM_EDEFAULT;
			case CapabilityPackage.VERSION_RANGE__INCLUDE_MAXIMUM:
				return isIncludeMaximum() != INCLUDE_MAXIMUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //VersionRangeImpl
