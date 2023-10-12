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
import org.nasdanika.models.capability.CapabilityDomainElement;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.CapabilityVersion;
import org.nasdanika.ncore.DocumentedNamedElementWithID;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityVersionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityVersionImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityVersionImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityVersionImpl#getIncludedIn <em>Included In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityVersionImpl extends VersionImpl implements CapabilityVersion {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CapabilityPackage.CAPABILITY_VERSION__ID, NcorePackage.Literals.DOCUMENTED_NAMED_ELEMENT_WITH_ID__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CapabilityPackage.CAPABILITY_VERSION__ID, NcorePackage.Literals.DOCUMENTED_NAMED_ELEMENT_WITH_ID__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityVersion> getVersions() {
		return (EList<CapabilityVersion>)eDynamicGet(CapabilityPackage.CAPABILITY_VERSION__VERSIONS, CapabilityPackage.Literals.CAPABILITY__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getIncludes() {
		return (EList<Capability>)eDynamicGet(CapabilityPackage.CAPABILITY_VERSION__INCLUDES, CapabilityPackage.Literals.CAPABILITY__INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getIncludedIn() {
		return (EList<Capability>)eDynamicGet(CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN, CapabilityPackage.Literals.CAPABILITY__INCLUDED_IN, true, true);
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
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN:
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
			case CapabilityPackage.CAPABILITY_VERSION__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN:
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
			case CapabilityPackage.CAPABILITY_VERSION__ID:
				return getId();
			case CapabilityPackage.CAPABILITY_VERSION__VERSIONS:
				return getVersions();
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDES:
				return getIncludes();
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN:
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
			case CapabilityPackage.CAPABILITY_VERSION__ID:
				setId((String)newValue);
				return;
			case CapabilityPackage.CAPABILITY_VERSION__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends CapabilityVersion>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Capability>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN:
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
			case CapabilityPackage.CAPABILITY_VERSION__ID:
				setId(ID_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_VERSION__VERSIONS:
				getVersions().clear();
				return;
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDES:
				getIncludes().clear();
				return;
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN:
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
			case CapabilityPackage.CAPABILITY_VERSION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CapabilityPackage.CAPABILITY_VERSION__VERSIONS:
				return !getVersions().isEmpty();
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDES:
				return !getIncludes().isEmpty();
			case CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN:
				return !getIncludedIn().isEmpty();
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
		if (baseClass == DocumentedNamedElementWithID.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_VERSION__ID: return NcorePackage.DOCUMENTED_NAMED_ELEMENT_WITH_ID__ID;
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomainElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Capability.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_VERSION__VERSIONS: return CapabilityPackage.CAPABILITY__VERSIONS;
				case CapabilityPackage.CAPABILITY_VERSION__INCLUDES: return CapabilityPackage.CAPABILITY__INCLUDES;
				case CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN: return CapabilityPackage.CAPABILITY__INCLUDED_IN;
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
		if (baseClass == DocumentedNamedElementWithID.class) {
			switch (baseFeatureID) {
				case NcorePackage.DOCUMENTED_NAMED_ELEMENT_WITH_ID__ID: return CapabilityPackage.CAPABILITY_VERSION__ID;
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomainElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Capability.class) {
			switch (baseFeatureID) {
				case CapabilityPackage.CAPABILITY__VERSIONS: return CapabilityPackage.CAPABILITY_VERSION__VERSIONS;
				case CapabilityPackage.CAPABILITY__INCLUDES: return CapabilityPackage.CAPABILITY_VERSION__INCLUDES;
				case CapabilityPackage.CAPABILITY__INCLUDED_IN: return CapabilityPackage.CAPABILITY_VERSION__INCLUDED_IN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CapabilityVersionImpl
