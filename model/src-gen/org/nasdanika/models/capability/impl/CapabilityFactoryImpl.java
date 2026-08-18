/**
 */
package org.nasdanika.models.capability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.capability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityFactoryImpl extends EFactoryImpl implements CapabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapabilityFactory init() {
		try {
			CapabilityFactory theCapabilityFactory = (CapabilityFactory)EPackage.Registry.INSTANCE.getEFactory(CapabilityPackage.eNS_URI);
			if (theCapabilityFactory != null) {
				return theCapabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CapabilityPackage.CAPABILITY: return createCapability();
			case CapabilityPackage.COMPOSITE_CAPABILITY: return createCompositeCapability();
			case CapabilityPackage.CAPABILITY_REFERENCE: return createCapabilityReference();
			case CapabilityPackage.CAPABILITY_DOMAIN: return createCapabilityDomain();
			case CapabilityPackage.CAPABILITY_DEPENDENCY: return createCapabilityDependency();
			case CapabilityPackage.CAPABILITY_PROVIDER: return createCapabilityProvider();
			case CapabilityPackage.CAPABILITY_PROVIDER_DOMAIN: return createCapabilityProviderDomain();
			case CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE: return createCapabilityProviderReference();
			case CapabilityPackage.PROVIDED_CAPABILITY: return createProvidedCapability();
			case CapabilityPackage.EVIDENCE: return createEvidence();
			case CapabilityPackage.EVIDENCE_DOMAIN: return createEvidenceDomain();
			case CapabilityPackage.REQUIRED_CAPABILITY: return createRequiredCapability();
			case CapabilityPackage.VERSION: return createVersion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CapabilityPackage.DEPENDENCY_KIND:
				return createDependencyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CapabilityPackage.DEPENDENCY_KIND:
				return convertDependencyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeCapability createCompositeCapability() {
		CompositeCapabilityImpl compositeCapability = new CompositeCapabilityImpl();
		return compositeCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityReference createCapabilityReference() {
		CapabilityReferenceImpl capabilityReference = new CapabilityReferenceImpl();
		return capabilityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityDomain createCapabilityDomain() {
		CapabilityDomainImpl capabilityDomain = new CapabilityDomainImpl();
		return capabilityDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityDependency createCapabilityDependency() {
		CapabilityDependencyImpl capabilityDependency = new CapabilityDependencyImpl();
		return capabilityDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityProvider createCapabilityProvider() {
		CapabilityProviderImpl capabilityProvider = new CapabilityProviderImpl();
		return capabilityProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityProviderDomain createCapabilityProviderDomain() {
		CapabilityProviderDomainImpl capabilityProviderDomain = new CapabilityProviderDomainImpl();
		return capabilityProviderDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityProviderReference createCapabilityProviderReference() {
		CapabilityProviderReferenceImpl capabilityProviderReference = new CapabilityProviderReferenceImpl();
		return capabilityProviderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedCapability createProvidedCapability() {
		ProvidedCapabilityImpl providedCapability = new ProvidedCapabilityImpl();
		return providedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceDomain createEvidenceDomain() {
		EvidenceDomainImpl evidenceDomain = new EvidenceDomainImpl();
		return evidenceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredCapability createRequiredCapability() {
		RequiredCapabilityImpl requiredCapability = new RequiredCapabilityImpl();
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyKind createDependencyKindFromString(EDataType eDataType, String initialValue) {
		DependencyKind result = DependencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependencyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityPackage getCapabilityPackage() {
		return (CapabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapabilityPackage getPackage() {
		return CapabilityPackage.eINSTANCE;
	}

} //CapabilityFactoryImpl
