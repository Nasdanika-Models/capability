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
import org.nasdanika.models.capability.CapabilityVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityImpl#getIncludedIn <em>Included In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends CapabilityDomainElementImpl implements Capability {
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
	public EList<CapabilityVersion> getVersions() {
		return (EList<CapabilityVersion>)eDynamicGet(CapabilityPackage.CAPABILITY__VERSIONS, CapabilityPackage.Literals.CAPABILITY__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getIncludes() {
		return (EList<Capability>)eDynamicGet(CapabilityPackage.CAPABILITY__INCLUDES, CapabilityPackage.Literals.CAPABILITY__INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getIncludedIn() {
		return (EList<Capability>)eDynamicGet(CapabilityPackage.CAPABILITY__INCLUDED_IN, CapabilityPackage.Literals.CAPABILITY__INCLUDED_IN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__INCLUDED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludedIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY__INCLUDED_IN:
				return ((InternalEList<?>)getIncludedIn()).basicRemove(otherEnd, msgs);
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
			case CapabilityPackage.CAPABILITY__VERSIONS:
				return getVersions();
			case CapabilityPackage.CAPABILITY__INCLUDES:
				return getIncludes();
			case CapabilityPackage.CAPABILITY__INCLUDED_IN:
				return getIncludedIn();
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
			case CapabilityPackage.CAPABILITY__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends CapabilityVersion>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Capability>)newValue);
				return;
			case CapabilityPackage.CAPABILITY__INCLUDED_IN:
				getIncludedIn().clear();
				getIncludedIn().addAll((Collection<? extends Capability>)newValue);
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
			case CapabilityPackage.CAPABILITY__VERSIONS:
				getVersions().clear();
				return;
			case CapabilityPackage.CAPABILITY__INCLUDES:
				getIncludes().clear();
				return;
			case CapabilityPackage.CAPABILITY__INCLUDED_IN:
				getIncludedIn().clear();
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
			case CapabilityPackage.CAPABILITY__VERSIONS:
				return !getVersions().isEmpty();
			case CapabilityPackage.CAPABILITY__INCLUDES:
				return !getIncludes().isEmpty();
			case CapabilityPackage.CAPABILITY__INCLUDED_IN:
				return !getIncludedIn().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
