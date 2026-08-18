/**
 */
package org.nasdanika.models.capability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.capability.AbstractCapabilityProvider;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.CapabilityProvider;
import org.nasdanika.models.capability.ProvidedCapability;
import org.nasdanika.models.capability.RequiredCapability;

import org.nasdanika.models.iam.AccessControlEntry;
import org.nasdanika.models.iam.AccessControlled;
import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.Lifecycle;
import org.nasdanika.models.lifecycle.LifecyclePackage;
import org.nasdanika.models.lifecycle.Sojourn;
import org.nasdanika.models.lifecycle.Stage;
import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

import org.nasdanika.models.seal.EncryptedFeature;
import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.SealedElement;
import org.nasdanika.models.seal.Signature;
import org.nasdanika.models.seal.VariantFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getEncryptedFeatures <em>Encrypted Features</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getVariantFeatures <em>Variant Features</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getLifecycles <em>Lifecycles</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getSojourns <em>Sojourns</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityProviderImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityProviderImpl extends NamedPeriodImpl implements CapabilityProvider {
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
	public EList<AccessControlEntry> getAccessControl() {
		return (EList<AccessControlEntry>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__ACCESS_CONTROL, IamPackage.Literals.ACCESS_CONTROLLED__ACCESS_CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EncryptedFeature> getEncryptedFeatures() {
		return (EList<EncryptedFeature>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__ENCRYPTED_FEATURES, SealPackage.Literals.SEALED_ELEMENT__ENCRYPTED_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VariantFeature> getVariantFeatures() {
		return (EList<VariantFeature>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__VARIANT_FEATURES, SealPackage.Literals.SEALED_ELEMENT__VARIANT_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Signature> getSignatures() {
		return (EList<Signature>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__SIGNATURES, SealPackage.Literals.SEALED_ELEMENT__SIGNATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Lifecycle> getLifecycles() {
		return (EList<Lifecycle>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLES, LifecyclePackage.Literals.STAGED__LIFECYCLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Sojourn> getSojourns() {
		return (EList<Sojourn>)eDynamicGet(CapabilityPackage.CAPABILITY_PROVIDER__SOJOURNS, LifecyclePackage.Literals.STAGED__SOJOURNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stage> getCurrent() {
		return null;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_PROVIDER__ACCESS_CONTROL:
				return ((InternalEList<?>)getAccessControl()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_PROVIDER__ENCRYPTED_FEATURES:
				return ((InternalEList<?>)getEncryptedFeatures()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_PROVIDER__VARIANT_FEATURES:
				return ((InternalEList<?>)getVariantFeatures()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_PROVIDER__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_PROVIDER__SOJOURNS:
				return ((InternalEList<?>)getSojourns()).basicRemove(otherEnd, msgs);
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
			case CapabilityPackage.CAPABILITY_PROVIDER__ACCESS_CONTROL:
				return getAccessControl();
			case CapabilityPackage.CAPABILITY_PROVIDER__ENCRYPTED_FEATURES:
				return getEncryptedFeatures();
			case CapabilityPackage.CAPABILITY_PROVIDER__VARIANT_FEATURES:
				return getVariantFeatures();
			case CapabilityPackage.CAPABILITY_PROVIDER__SIGNATURES:
				return getSignatures();
			case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLES:
				return getLifecycles();
			case CapabilityPackage.CAPABILITY_PROVIDER__SOJOURNS:
				return getSojourns();
			case CapabilityPackage.CAPABILITY_PROVIDER__CURRENT:
				return getCurrent();
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				return getProvides();
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				return getRequires();
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
			case CapabilityPackage.CAPABILITY_PROVIDER__ACCESS_CONTROL:
				getAccessControl().clear();
				getAccessControl().addAll((Collection<? extends AccessControlEntry>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__ENCRYPTED_FEATURES:
				getEncryptedFeatures().clear();
				getEncryptedFeatures().addAll((Collection<? extends EncryptedFeature>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__VARIANT_FEATURES:
				getVariantFeatures().clear();
				getVariantFeatures().addAll((Collection<? extends VariantFeature>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLES:
				getLifecycles().clear();
				getLifecycles().addAll((Collection<? extends Lifecycle>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__SOJOURNS:
				getSojourns().clear();
				getSojourns().addAll((Collection<? extends Sojourn>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends ProvidedCapability>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequiredCapability>)newValue);
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
			case CapabilityPackage.CAPABILITY_PROVIDER__ACCESS_CONTROL:
				getAccessControl().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__ENCRYPTED_FEATURES:
				getEncryptedFeatures().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__VARIANT_FEATURES:
				getVariantFeatures().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__SIGNATURES:
				getSignatures().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLES:
				getLifecycles().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__SOJOURNS:
				getSojourns().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				getProvides().clear();
				return;
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				getRequires().clear();
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
			case CapabilityPackage.CAPABILITY_PROVIDER__ACCESS_CONTROL:
				return !getAccessControl().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__ENCRYPTED_FEATURES:
				return !getEncryptedFeatures().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__VARIANT_FEATURES:
				return !getVariantFeatures().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__SIGNATURES:
				return !getSignatures().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLES:
				return !getLifecycles().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__SOJOURNS:
				return !getSojourns().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__CURRENT:
				return !getCurrent().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__PROVIDES:
				return !getProvides().isEmpty();
			case CapabilityPackage.CAPABILITY_PROVIDER__REQUIRES:
				return !getRequires().isEmpty();
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
		if (baseClass == AbstractCapabilityProvider.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AccessControlled.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_PROVIDER__ACCESS_CONTROL: return IamPackage.ACCESS_CONTROLLED__ACCESS_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == SealedElement.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_PROVIDER__ENCRYPTED_FEATURES: return SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES;
				case CapabilityPackage.CAPABILITY_PROVIDER__VARIANT_FEATURES: return SealPackage.SEALED_ELEMENT__VARIANT_FEATURES;
				case CapabilityPackage.CAPABILITY_PROVIDER__SIGNATURES: return SealPackage.SEALED_ELEMENT__SIGNATURES;
				default: return -1;
			}
		}
		if (baseClass == Staged.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLES: return LifecyclePackage.STAGED__LIFECYCLES;
				case CapabilityPackage.CAPABILITY_PROVIDER__SOJOURNS: return LifecyclePackage.STAGED__SOJOURNS;
				case CapabilityPackage.CAPABILITY_PROVIDER__CURRENT: return LifecyclePackage.STAGED__CURRENT;
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
		if (baseClass == AbstractCapabilityProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AccessControlled.class) {
			switch (baseFeatureID) {
				case IamPackage.ACCESS_CONTROLLED__ACCESS_CONTROL: return CapabilityPackage.CAPABILITY_PROVIDER__ACCESS_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == SealedElement.class) {
			switch (baseFeatureID) {
				case SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES: return CapabilityPackage.CAPABILITY_PROVIDER__ENCRYPTED_FEATURES;
				case SealPackage.SEALED_ELEMENT__VARIANT_FEATURES: return CapabilityPackage.CAPABILITY_PROVIDER__VARIANT_FEATURES;
				case SealPackage.SEALED_ELEMENT__SIGNATURES: return CapabilityPackage.CAPABILITY_PROVIDER__SIGNATURES;
				default: return -1;
			}
		}
		if (baseClass == Staged.class) {
			switch (baseFeatureID) {
				case LifecyclePackage.STAGED__LIFECYCLES: return CapabilityPackage.CAPABILITY_PROVIDER__LIFECYCLES;
				case LifecyclePackage.STAGED__SOJOURNS: return CapabilityPackage.CAPABILITY_PROVIDER__SOJOURNS;
				case LifecyclePackage.STAGED__CURRENT: return CapabilityPackage.CAPABILITY_PROVIDER__CURRENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityProviderImpl
