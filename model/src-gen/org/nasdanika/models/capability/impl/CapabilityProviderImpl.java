/**
 */
package org.nasdanika.models.capability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.CapabilityProvider;
import org.nasdanika.models.capability.ProvidedCapability;
import org.nasdanika.models.capability.RequiredCapability;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityProviderImpl extends NamedPeriodImpl implements CapabilityProvider {
	/**
	 * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected static final Object LIFECYCLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProvidedCapability> getProvides() {
		return (EList<ProvidedCapability>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES, CapabilityPackage.Literals.CAPABILITY_PROVIDER__PROVIDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RequiredCapability> getRequires() {
		return (EList<RequiredCapability>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES, CapabilityPackage.Literals.CAPABILITY_PROVIDER__REQUIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLifecycle() {
		return (Object)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLE, CapabilityPackage.Literals.CAPABILITY_PROVIDER__LIFECYCLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifecycle(Object newLifecycle) {
		eDynamicSet(CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLE, CapabilityPackage.Literals.CAPABILITY_PROVIDER__LIFECYCLE, newLifecycle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				return getProvides();
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				return getRequires();
			case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLE:
				return getLifecycle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends ProvidedCapability>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequiredCapability>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLE:
				setLifecycle(newValue);
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
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				getProvides().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				getRequires().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLE:
				setLifecycle(LIFECYCLE_EDEFAULT);
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
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				return !getProvides().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				return !getRequires().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLE:
				return LIFECYCLE_EDEFAULT == null ? getLifecycle() != null : !LIFECYCLE_EDEFAULT.equals(getLifecycle());
		}
		return super.eIsSet(featureID);
	}

} //CapabilityProviderImpl
