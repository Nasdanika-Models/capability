/**
 */
package org.nasdanika.models.capability.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.capability.CapabilityDependency;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.DependencyKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDependencyImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDependencyImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityDependencyImpl extends CapabilityReferenceImpl implements CapabilityDependency {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DependencyKind KIND_EDEFAULT = DependencyKind.REQUIRES;

	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyKind getKind() {
		return (DependencyKind)eDynamicGet(CapabilityPackage.CAPABILITY_DEPENDENCY__KIND, CapabilityPackage.Literals.CAPABILITY_DEPENDENCY__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(DependencyKind newKind) {
		eDynamicSet(CapabilityPackage.CAPABILITY_DEPENDENCY__KIND, CapabilityPackage.Literals.CAPABILITY_DEPENDENCY__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifier() {
		return (String)eDynamicGet(CapabilityPackage.CAPABILITY_DEPENDENCY__QUALIFIER, CapabilityPackage.Literals.CAPABILITY_DEPENDENCY__QUALIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifier(String newQualifier) {
		eDynamicSet(CapabilityPackage.CAPABILITY_DEPENDENCY__QUALIFIER, CapabilityPackage.Literals.CAPABILITY_DEPENDENCY__QUALIFIER, newQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_DEPENDENCY__KIND:
				return getKind();
			case CapabilityPackage.CAPABILITY_DEPENDENCY__QUALIFIER:
				return getQualifier();
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
			case CapabilityPackage.CAPABILITY_DEPENDENCY__KIND:
				setKind((DependencyKind)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DEPENDENCY__QUALIFIER:
				setQualifier((String)newValue);
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
			case CapabilityPackage.CAPABILITY_DEPENDENCY__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_DEPENDENCY__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
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
			case CapabilityPackage.CAPABILITY_DEPENDENCY__KIND:
				return getKind() != KIND_EDEFAULT;
			case CapabilityPackage.CAPABILITY_DEPENDENCY__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? getQualifier() != null : !QUALIFIER_EDEFAULT.equals(getQualifier());
		}
		return super.eIsSet(featureID);
	}

} //CapabilityDependencyImpl
