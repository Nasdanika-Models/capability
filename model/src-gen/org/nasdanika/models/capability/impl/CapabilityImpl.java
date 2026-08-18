/**
 */
package org.nasdanika.models.capability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.capability.AbstractCapability;
import org.nasdanika.models.capability.AbstractEvidence;
import org.nasdanika.models.capability.Capability;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.CapabilityReference;
import org.nasdanika.models.capability.Evidence;
import org.nasdanika.models.capability.EvidenceDomain;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getAllAddresses <em>All Addresses</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getDependents <em>Dependents</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends NamedPeriodImpl implements Capability {
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
	public EList<Object> getAddresses() {
		return (EList<Object>)eDynamicGet(CapabilityPackage.CAPABILITY__ADDRESSES, CapabilityPackage.Literals.CAPABILITY__ADDRESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAllAddresses() {
		throw new Error("Unresolved compilation problems: AbstractConcern cannot be resolved to a type.");
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
		throw new Error("Unresolved compilation problems: The method or field ProductmanagementPackage is undefined");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getLifecycle() {
		return (Object)eDynamicGet(CapabilityPackage.CAPABILITY__LIFECYCLE, CapabilityPackage.Literals.CAPABILITY__LIFECYCLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifecycle(Object newLifecycle) {
		eDynamicSet(CapabilityPackage.CAPABILITY__LIFECYCLE, CapabilityPackage.Literals.CAPABILITY__LIFECYCLE, newLifecycle);
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
			case CapabilityPackage.CAPABILITY__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
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
			case CapabilityPackage.CAPABILITY__ADDRESSES:
				return getAddresses();
			case CapabilityPackage.CAPABILITY__ALL_ADDRESSES:
				return getAllAddresses();
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				return getDependencies();
			case CapabilityPackage.CAPABILITY__DEPENDENTS:
				return getDependents();
			case CapabilityPackage.CAPABILITY__LIFECYCLE:
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
			case CapabilityPackage.CAPABILITY__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Object>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends AbstractCapability>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__LIFECYCLE:
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
			case CapabilityPackage.CAPABILITY__EVIDENCE:
				getEvidence().clear();
				return;
			case CapabilityPackage.CAPABILITY__ADDRESSES:
				getAddresses().clear();
				return;
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				getDependencies().clear();
				return;
			case CapabilityPackage.CAPABILITY__LIFECYCLE:
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
			case CapabilityPackage.CAPABILITY__EVIDENCE:
				return !getEvidence().isEmpty();
			case CapabilityPackage.CAPABILITY__ADDRESSES:
				return !getAddresses().isEmpty();
			case CapabilityPackage.CAPABILITY__ALL_ADDRESSES:
				return !getAllAddresses().isEmpty();
			case CapabilityPackage.CAPABILITY__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case CapabilityPackage.CAPABILITY__DEPENDENTS:
				return !getDependents().isEmpty();
			case CapabilityPackage.CAPABILITY__LIFECYCLE:
				return LIFECYCLE_EDEFAULT == null ? getLifecycle() != null : !LIFECYCLE_EDEFAULT.equals(getLifecycle());
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
		if (baseClass == EObject.class) {
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
		if (baseClass == EObject.class) {
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
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityImpl
