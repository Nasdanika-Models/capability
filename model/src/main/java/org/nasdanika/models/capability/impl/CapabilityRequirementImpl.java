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
import org.nasdanika.models.capability.CapabilityRequirement;
import org.nasdanika.models.capability.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityRequirementImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityRequirementImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityRequirementImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityRequirementImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityRequirementImpl extends RequirementImpl implements CapabilityRequirement {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMin() {
		return (Integer)eDynamicGet(CapabilityPackage.CAPABILITY_REQUIREMENT__MIN, CapabilityPackage.Literals.CAPABILITY_REQUIREMENT__MIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(int newMin) {
		eDynamicSet(CapabilityPackage.CAPABILITY_REQUIREMENT__MIN, CapabilityPackage.Literals.CAPABILITY_REQUIREMENT__MIN, newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax() {
		return (Integer)eDynamicGet(CapabilityPackage.CAPABILITY_REQUIREMENT__MAX, CapabilityPackage.Literals.CAPABILITY_REQUIREMENT__MAX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(int newMax) {
		eDynamicSet(CapabilityPackage.CAPABILITY_REQUIREMENT__MAX, CapabilityPackage.Literals.CAPABILITY_REQUIREMENT__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability getCapability() {
		return (Capability)eDynamicGet(CapabilityPackage.CAPABILITY_REQUIREMENT__CAPABILITY, CapabilityPackage.Literals.CAPABILITY_REQUIREMENT__CAPABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetCapability() {
		return (Capability)eDynamicGet(CapabilityPackage.CAPABILITY_REQUIREMENT__CAPABILITY, CapabilityPackage.Literals.CAPABILITY_REQUIREMENT__CAPABILITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability(Capability newCapability) {
		eDynamicSet(CapabilityPackage.CAPABILITY_REQUIREMENT__CAPABILITY, CapabilityPackage.Literals.CAPABILITY_REQUIREMENT__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VersionRange> getVersions() {
		return (EList<VersionRange>)eDynamicGet(CapabilityPackage.CAPABILITY_REQUIREMENT__VERSIONS, CapabilityPackage.Literals.CAPABILITY_REQUIREMENT__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_REQUIREMENT__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
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
			case CapabilityPackage.CAPABILITY_REQUIREMENT__MIN:
				return getMin();
			case CapabilityPackage.CAPABILITY_REQUIREMENT__MAX:
				return getMax();
			case CapabilityPackage.CAPABILITY_REQUIREMENT__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case CapabilityPackage.CAPABILITY_REQUIREMENT__VERSIONS:
				return getVersions();
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
			case CapabilityPackage.CAPABILITY_REQUIREMENT__MIN:
				setMin((Integer)newValue);
				return;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__MAX:
				setMax((Integer)newValue);
				return;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__CAPABILITY:
				setCapability((Capability)newValue);
				return;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends VersionRange>)newValue);
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
			case CapabilityPackage.CAPABILITY_REQUIREMENT__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__CAPABILITY:
				setCapability((Capability)null);
				return;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__VERSIONS:
				getVersions().clear();
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
			case CapabilityPackage.CAPABILITY_REQUIREMENT__MIN:
				return getMin() != MIN_EDEFAULT;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__MAX:
				return getMax() != MAX_EDEFAULT;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__CAPABILITY:
				return basicGetCapability() != null;
			case CapabilityPackage.CAPABILITY_REQUIREMENT__VERSIONS:
				return !getVersions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityRequirementImpl
