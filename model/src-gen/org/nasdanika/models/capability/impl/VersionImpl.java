/**
 */
package org.nasdanika.models.capability.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.Version;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VersionImpl extends NamedPeriodImpl implements Version {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.VERSION;
	}

} //VersionImpl
