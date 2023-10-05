/**
 */
package org.nasdanika.models.capability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.capability.Capability;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.CapabilityProvider;
import org.nasdanika.models.capability.Requirement;

import org.nasdanika.models.capability.RequirementConsumer;
import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityProviderImpl extends DocumentedNamedElementImpl implements CapabilityProvider {
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
	public EList<Capability> getProvidedCapabilities() {
		return (EList<Capability>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES, CapabilityPackage.Literals.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Requirement> getRequirements() {
		return (EList<Requirement>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__REQUIREMENTS, CapabilityPackage.Literals.REQUIREMENT_CONSUMER__REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
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
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIREMENTS:
				return getRequirements();
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
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
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>)newValue);
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
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIREMENTS:
				getRequirements().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
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
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIREMENTS:
				return !getRequirements().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDED_CAPABILITIES:
				return !getProvidedCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RequirementConsumer.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_PROVIDER__REQUIREMENTS: return CapabilityPackage.REQUIREMENT_CONSUMER__REQUIREMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RequirementConsumer.class) {
			switch (baseFeatureID) {
				case CapabilityPackage.REQUIREMENT_CONSUMER__REQUIREMENTS: return CapabilityPackage.CAPABILITY_PROVIDER__REQUIREMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityProviderImpl
