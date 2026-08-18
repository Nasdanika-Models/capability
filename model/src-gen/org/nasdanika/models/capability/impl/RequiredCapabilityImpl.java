/**
 */
package org.nasdanika.models.capability.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.capability.AbstractCapability;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.RequiredCapability;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.RequiredCapabilityImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredCapabilityImpl extends NamedPeriodImpl implements RequiredCapability {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.REQUIRED_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapability getCapability() {
		return (AbstractCapability)eDynamicGet(CapabilityPackage.REQUIRED_CAPABILITY__CAPABILITY, CapabilityPackage.Literals.REQUIRED_CAPABILITY__CAPABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapability(AbstractCapability newCapability, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCapability, CapabilityPackage.REQUIRED_CAPABILITY__CAPABILITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability(AbstractCapability newCapability) {
		eDynamicSet(CapabilityPackage.REQUIRED_CAPABILITY__CAPABILITY, CapabilityPackage.Literals.REQUIRED_CAPABILITY__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.REQUIRED_CAPABILITY__CAPABILITY:
				return basicSetCapability(null, msgs);
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
			case CapabilityPackage.REQUIRED_CAPABILITY__CAPABILITY:
				return getCapability();
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
			case CapabilityPackage.REQUIRED_CAPABILITY__CAPABILITY:
				setCapability((AbstractCapability)newValue);
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
			case CapabilityPackage.REQUIRED_CAPABILITY__CAPABILITY:
				setCapability((AbstractCapability)null);
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
			case CapabilityPackage.REQUIRED_CAPABILITY__CAPABILITY:
				return getCapability() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredCapabilityImpl
