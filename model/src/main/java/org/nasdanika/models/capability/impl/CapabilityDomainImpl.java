/**
 */
package org.nasdanika.models.capability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.capability.CapabilityDomain;
import org.nasdanika.models.capability.CapabilityDomainElement;
import org.nasdanika.models.capability.CapabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilityDomainImpl extends CapabilityDomainElementImpl implements CapabilityDomain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityDomainElement> getCapabilities() {
		return (EList<CapabilityDomainElement>)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES, CapabilityPackage.Literals.CAPABILITY_DOMAIN__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				return getCapabilities();
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
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends CapabilityDomainElement>)newValue);
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
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				getCapabilities().clear();
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
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				return !getCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityDomainImpl
