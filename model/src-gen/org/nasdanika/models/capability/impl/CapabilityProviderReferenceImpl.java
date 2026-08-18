/**
 */
package org.nasdanika.models.capability.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.CapabilityProvider;
import org.nasdanika.models.capability.CapabilityProviderReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityProviderReferenceImpl extends EObjectImpl implements CapabilityProviderReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityProviderReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_PROVIDER_REFERENCE;
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
	public CapabilityProvider getTarget() {
		return (CapabilityProvider)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET, CapabilityPackage.Literals.CAPABILITY_PROVIDER_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityProvider basicGetTarget() {
		return (CapabilityProvider)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET, CapabilityPackage.Literals.CAPABILITY_PROVIDER_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(CapabilityProvider newTarget) {
		eDynamicSet(CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET, CapabilityPackage.Literals.CAPABILITY_PROVIDER_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET:
				setTarget((CapabilityProvider)newValue);
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
			case CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET:
				setTarget((CapabilityProvider)null);
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
			case CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityProviderReferenceImpl
