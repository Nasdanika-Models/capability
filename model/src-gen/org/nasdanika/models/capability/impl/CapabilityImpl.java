/**
 */
package org.nasdanika.models.capability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.capability.AbstractCapability;
import org.nasdanika.models.capability.AbstractEvidence;
import org.nasdanika.models.capability.Capability;
import org.nasdanika.models.capability.CapabilityPackage;

import org.nasdanika.models.capability.CapabilityPackage.Literals;

import org.nasdanika.models.capability.CapabilityReference;
import org.nasdanika.models.capability.Evidence;
import org.nasdanika.models.capability.EvidenceDomain;

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
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getEncryptedFeatures <em>Encrypted Features</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getVariantFeatures <em>Variant Features</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getLifecycles <em>Lifecycles</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getSojourns <em>Sojourns</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getDependents <em>Dependents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends NamedPeriodImpl implements Capability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Evidence> getEvidence() {
		return (EList<Evidence>)eDynamicGet(CapabilityPackage.CAPABILITY__EVIDENCE, CapabilityPackage.Literals.EVIDENCE_DOMAIN__EVIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AccessControlEntry> getAccessControl() {
		return (EList<AccessControlEntry>)eDynamicGet(CapabilityPackage.CAPABILITY__ACCESS_CONTROL, IamPackage.Literals.ACCESS_CONTROLLED__ACCESS_CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EncryptedFeature> getEncryptedFeatures() {
		return (EList<EncryptedFeature>)eDynamicGet(CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES, SealPackage.Literals.SEALED_ELEMENT__ENCRYPTED_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VariantFeature> getVariantFeatures() {
		return (EList<VariantFeature>)eDynamicGet(CapabilityPackage.CAPABILITY__VARIANT_FEATURES, SealPackage.Literals.SEALED_ELEMENT__VARIANT_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Signature> getSignatures() {
		return (EList<Signature>)eDynamicGet(CapabilityPackage.CAPABILITY__SIGNATURES, SealPackage.Literals.SEALED_ELEMENT__SIGNATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Lifecycle> getLifecycles() {
		return (EList<Lifecycle>)eDynamicGet(CapabilityPackage.CAPABILITY__LIFECYCLES, LifecyclePackage.Literals.STAGED__LIFECYCLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Sojourn> getSojourns() {
		return (EList<Sojourn>)eDynamicGet(CapabilityPackage.CAPABILITY__SOJOURNS, LifecyclePackage.Literals.STAGED__SOJOURNS, true, true);
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
	public EList<AbstractCapability> getDependencies() {
		return (EList<AbstractCapability>)eDynamicGet(CapabilityPackage.CAPABILITY__DEPENDENCIES, CapabilityPackage.Literals.CAPABILITY__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CapabilityReference> getDependents() {
		BasicEList<CapabilityReference> _xblockexpression = null;
		{
			final BasicEList<CapabilityReference> result = new BasicEList<CapabilityReference>();
			EList<EObject> _referrers = this.getReferrers(Literals.CAPABILITY_REFERENCE__TARGET);
			for (final EObject referrer : _referrers) {
				EReference _eContainmentFeature = referrer.eContainmentFeature();
				boolean _tripleEquals = (_eContainmentFeature == Literals.CAPABILITY__DEPENDENCIES);
				if (_tripleEquals) {
					if ((referrer instanceof CapabilityReference)) {
						result.add(((CapabilityReference)referrer));
					}
				}
			}
			_xblockexpression = result;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__ACCESS_CONTROL:
				return ((InternalEList<?>)getAccessControl()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES:
				return ((InternalEList<?>)getEncryptedFeatures()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__VARIANT_FEATURES:
				return ((InternalEList<?>)getVariantFeatures()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__SOJOURNS:
				return ((InternalEList<?>)getSojourns()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case CapabilityPackage.CAPABILITY__EVIDENCE:
				return getEvidence();
			case CapabilityPackage.CAPABILITY__ACCESS_CONTROL:
				return getAccessControl();
			case CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES:
				return getEncryptedFeatures();
			case CapabilityPackage.CAPABILITY__VARIANT_FEATURES:
				return getVariantFeatures();
			case CapabilityPackage.CAPABILITY__SIGNATURES:
				return getSignatures();
			case CapabilityPackage.CAPABILITY__LIFECYCLES:
				return getLifecycles();
			case CapabilityPackage.CAPABILITY__SOJOURNS:
				return getSojourns();
			case CapabilityPackage.CAPABILITY__CURRENT:
				return getCurrent();
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				return getDependencies();
			case CapabilityPackage.CAPABILITY__DEPENDENTS:
				return getDependents();
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
			case CapabilityPackage.CAPABILITY__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__ACCESS_CONTROL:
				getAccessControl().clear();
				getAccessControl().addAll((Collection<? extends AccessControlEntry>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES:
				getEncryptedFeatures().clear();
				getEncryptedFeatures().addAll((Collection<? extends EncryptedFeature>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__VARIANT_FEATURES:
				getVariantFeatures().clear();
				getVariantFeatures().addAll((Collection<? extends VariantFeature>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__LIFECYCLES:
				getLifecycles().clear();
				getLifecycles().addAll((Collection<? extends Lifecycle>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__SOJOURNS:
				getSojourns().clear();
				getSojourns().addAll((Collection<? extends Sojourn>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends AbstractCapability>)newValue);
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
			case CapabilityPackage.CAPABILITY__EVIDENCE:
				getEvidence().clear();
				return;
			case CapabilityPackage.CAPABILITY__ACCESS_CONTROL:
				getAccessControl().clear();
				return;
			case CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES:
				getEncryptedFeatures().clear();
				return;
			case CapabilityPackage.CAPABILITY__VARIANT_FEATURES:
				getVariantFeatures().clear();
				return;
			case CapabilityPackage.CAPABILITY__SIGNATURES:
				getSignatures().clear();
				return;
			case CapabilityPackage.CAPABILITY__LIFECYCLES:
				getLifecycles().clear();
				return;
			case CapabilityPackage.CAPABILITY__SOJOURNS:
				getSojourns().clear();
				return;
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				getDependencies().clear();
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
			case CapabilityPackage.CAPABILITY__EVIDENCE:
				return !getEvidence().isEmpty();
			case CapabilityPackage.CAPABILITY__ACCESS_CONTROL:
				return !getAccessControl().isEmpty();
			case CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES:
				return !getEncryptedFeatures().isEmpty();
			case CapabilityPackage.CAPABILITY__VARIANT_FEATURES:
				return !getVariantFeatures().isEmpty();
			case CapabilityPackage.CAPABILITY__SIGNATURES:
				return !getSignatures().isEmpty();
			case CapabilityPackage.CAPABILITY__LIFECYCLES:
				return !getLifecycles().isEmpty();
			case CapabilityPackage.CAPABILITY__SOJOURNS:
				return !getSojourns().isEmpty();
			case CapabilityPackage.CAPABILITY__CURRENT:
				return !getCurrent().isEmpty();
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case CapabilityPackage.CAPABILITY__DEPENDENTS:
				return !getDependents().isEmpty();
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
		if (baseClass == AbstractCapability.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEvidence.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvidenceDomain.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY__EVIDENCE: return CapabilityPackage.EVIDENCE_DOMAIN__EVIDENCE;
				default: return -1;
			}
		}
		if (baseClass == AccessControlled.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY__ACCESS_CONTROL: return IamPackage.ACCESS_CONTROLLED__ACCESS_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == SealedElement.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES: return SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES;
				case CapabilityPackage.CAPABILITY__VARIANT_FEATURES: return SealPackage.SEALED_ELEMENT__VARIANT_FEATURES;
				case CapabilityPackage.CAPABILITY__SIGNATURES: return SealPackage.SEALED_ELEMENT__SIGNATURES;
				default: return -1;
			}
		}
		if (baseClass == Staged.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY__LIFECYCLES: return LifecyclePackage.STAGED__LIFECYCLES;
				case CapabilityPackage.CAPABILITY__SOJOURNS: return LifecyclePackage.STAGED__SOJOURNS;
				case CapabilityPackage.CAPABILITY__CURRENT: return LifecyclePackage.STAGED__CURRENT;
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
		if (baseClass == AbstractCapability.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEvidence.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EvidenceDomain.class) {
			switch (baseFeatureID) {
				case CapabilityPackage.EVIDENCE_DOMAIN__EVIDENCE: return CapabilityPackage.CAPABILITY__EVIDENCE;
				default: return -1;
			}
		}
		if (baseClass == AccessControlled.class) {
			switch (baseFeatureID) {
				case IamPackage.ACCESS_CONTROLLED__ACCESS_CONTROL: return CapabilityPackage.CAPABILITY__ACCESS_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == SealedElement.class) {
			switch (baseFeatureID) {
				case SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES: return CapabilityPackage.CAPABILITY__ENCRYPTED_FEATURES;
				case SealPackage.SEALED_ELEMENT__VARIANT_FEATURES: return CapabilityPackage.CAPABILITY__VARIANT_FEATURES;
				case SealPackage.SEALED_ELEMENT__SIGNATURES: return CapabilityPackage.CAPABILITY__SIGNATURES;
				default: return -1;
			}
		}
		if (baseClass == Staged.class) {
			switch (baseFeatureID) {
				case LifecyclePackage.STAGED__LIFECYCLES: return CapabilityPackage.CAPABILITY__LIFECYCLES;
				case LifecyclePackage.STAGED__SOJOURNS: return CapabilityPackage.CAPABILITY__SOJOURNS;
				case LifecyclePackage.STAGED__CURRENT: return CapabilityPackage.CAPABILITY__CURRENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityImpl
