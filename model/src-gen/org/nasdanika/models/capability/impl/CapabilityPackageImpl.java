/**
 */
package org.nasdanika.models.capability.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.capability.AbstractCapability;
import org.nasdanika.models.capability.AbstractCapabilityProvider;
import org.nasdanika.models.capability.AbstractEvidence;
import org.nasdanika.models.capability.Capability;
import org.nasdanika.models.capability.CapabilityDependency;
import org.nasdanika.models.capability.CapabilityDomain;
import org.nasdanika.models.capability.CapabilityFactory;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.CapabilityProvider;
import org.nasdanika.models.capability.CapabilityProviderDomain;
import org.nasdanika.models.capability.CapabilityProviderReference;
import org.nasdanika.models.capability.CapabilityReference;
import org.nasdanika.models.capability.CompositeCapability;
import org.nasdanika.models.capability.DependencyKind;
import org.nasdanika.models.capability.Evidence;
import org.nasdanika.models.capability.EvidenceDomain;
import org.nasdanika.models.capability.ProvidedCapability;
import org.nasdanika.models.capability.RequiredCapability;
import org.nasdanika.models.capability.Version;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.LifecyclePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityPackageImpl extends EPackageImpl implements CapabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCapabilityProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityProviderDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityProviderReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependencyKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.capability.CapabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapabilityPackageImpl() {
		super(eNS_URI, CapabilityFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CapabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapabilityPackage init() {
		if (isInited) return (CapabilityPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCapabilityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CapabilityPackageImpl theCapabilityPackage = registeredCapabilityPackage instanceof CapabilityPackageImpl ? (CapabilityPackageImpl)registeredCapabilityPackage : new CapabilityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		LifecyclePackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		SealPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCapabilityPackage.createPackageContents();

		// Initialize created meta-data
		theCapabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapabilityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapabilityPackage.eNS_URI, theCapabilityPackage);
		return theCapabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractCapability() {
		return abstractCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Dependencies() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapability_Dependents() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeCapability() {
		return compositeCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityReference() {
		return capabilityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityReference_Target() {
		return (EReference)capabilityReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityDomain() {
		return capabilityDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityDomain_Capabilities() {
		return (EReference)capabilityDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityDomain_ResolvedCapabilities() {
		return (EReference)capabilityDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCapabilityDomain__ResolveCapabilityReference__AbstractCapability() {
		return capabilityDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityDependency() {
		return capabilityDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapabilityDependency_Kind() {
		return (EAttribute)capabilityDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapabilityDependency_Qualifier() {
		return (EAttribute)capabilityDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractCapabilityProvider() {
		return abstractCapabilityProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityProvider() {
		return capabilityProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProvider_Provides() {
		return (EReference)capabilityProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProvider_Requires() {
		return (EReference)capabilityProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityProviderDomain() {
		return capabilityProviderDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProviderDomain_CapabilityProviders() {
		return (EReference)capabilityProviderDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapabilityProviderReference() {
		return capabilityProviderReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCapabilityProviderReference_Target() {
		return (EReference)capabilityProviderReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedCapability() {
		return providedCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedCapability_Capability() {
		return (EReference)providedCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractEvidence() {
		return abstractEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvidence() {
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvidenceDomain() {
		return evidenceDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvidenceDomain_Evidence() {
		return (EReference)evidenceDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredCapability() {
		return requiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredCapability_Capability() {
		return (EReference)requiredCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDependencyKind() {
		return dependencyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityFactory getCapabilityFactory() {
		return (CapabilityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractCapabilityEClass = createEClass(ABSTRACT_CAPABILITY);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__DEPENDENCIES);
		createEReference(capabilityEClass, CAPABILITY__DEPENDENTS);

		compositeCapabilityEClass = createEClass(COMPOSITE_CAPABILITY);

		capabilityReferenceEClass = createEClass(CAPABILITY_REFERENCE);
		createEReference(capabilityReferenceEClass, CAPABILITY_REFERENCE__TARGET);

		capabilityDomainEClass = createEClass(CAPABILITY_DOMAIN);
		createEReference(capabilityDomainEClass, CAPABILITY_DOMAIN__CAPABILITIES);
		createEReference(capabilityDomainEClass, CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES);
		createEOperation(capabilityDomainEClass, CAPABILITY_DOMAIN___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY);

		capabilityDependencyEClass = createEClass(CAPABILITY_DEPENDENCY);
		createEAttribute(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__KIND);
		createEAttribute(capabilityDependencyEClass, CAPABILITY_DEPENDENCY__QUALIFIER);

		abstractCapabilityProviderEClass = createEClass(ABSTRACT_CAPABILITY_PROVIDER);

		capabilityProviderEClass = createEClass(CAPABILITY_PROVIDER);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__PROVIDES);
		createEReference(capabilityProviderEClass, CAPABILITY_PROVIDER__REQUIRES);

		capabilityProviderDomainEClass = createEClass(CAPABILITY_PROVIDER_DOMAIN);
		createEReference(capabilityProviderDomainEClass, CAPABILITY_PROVIDER_DOMAIN__CAPABILITY_PROVIDERS);

		capabilityProviderReferenceEClass = createEClass(CAPABILITY_PROVIDER_REFERENCE);
		createEReference(capabilityProviderReferenceEClass, CAPABILITY_PROVIDER_REFERENCE__TARGET);

		providedCapabilityEClass = createEClass(PROVIDED_CAPABILITY);
		createEReference(providedCapabilityEClass, PROVIDED_CAPABILITY__CAPABILITY);

		abstractEvidenceEClass = createEClass(ABSTRACT_EVIDENCE);

		evidenceEClass = createEClass(EVIDENCE);

		evidenceDomainEClass = createEClass(EVIDENCE_DOMAIN);
		createEReference(evidenceDomainEClass, EVIDENCE_DOMAIN__EVIDENCE);

		requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);
		createEReference(requiredCapabilityEClass, REQUIRED_CAPABILITY__CAPABILITY);

		versionEClass = createEClass(VERSION);

		// Create enums
		dependencyKindEEnum = createEEnum(DEPENDENCY_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		LifecyclePackage theLifecyclePackage = (LifecyclePackage)EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractCapabilityEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		capabilityEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		capabilityEClass.getESuperTypes().add(this.getAbstractCapability());
		capabilityEClass.getESuperTypes().add(this.getEvidenceDomain());
		capabilityEClass.getESuperTypes().add(theLifecyclePackage.getStaged());
		compositeCapabilityEClass.getESuperTypes().add(this.getCapability());
		compositeCapabilityEClass.getESuperTypes().add(this.getCapabilityDomain());
		capabilityReferenceEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		capabilityReferenceEClass.getESuperTypes().add(this.getAbstractCapability());
		capabilityDomainEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		capabilityDomainEClass.getESuperTypes().add(this.getAbstractCapability());
		capabilityDependencyEClass.getESuperTypes().add(this.getCapabilityReference());
		abstractCapabilityProviderEClass.getESuperTypes().add(theNxcorePackage.getStringIdentity());
		capabilityProviderEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		capabilityProviderEClass.getESuperTypes().add(this.getAbstractCapabilityProvider());
		capabilityProviderEClass.getESuperTypes().add(theLifecyclePackage.getStaged());
		capabilityProviderDomainEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		capabilityProviderDomainEClass.getESuperTypes().add(this.getAbstractCapabilityProvider());
		capabilityProviderReferenceEClass.getESuperTypes().add(this.getAbstractCapabilityProvider());
		providedCapabilityEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		providedCapabilityEClass.getESuperTypes().add(this.getEvidenceDomain());
		abstractEvidenceEClass.getESuperTypes().add(theNxcorePackage.getStringIdentity());
		evidenceEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		evidenceEClass.getESuperTypes().add(this.getAbstractEvidence());
		evidenceDomainEClass.getESuperTypes().add(theNxcorePackage.getNamedElement());
		evidenceDomainEClass.getESuperTypes().add(this.getAbstractEvidence());
		requiredCapabilityEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		versionEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractCapabilityEClass, AbstractCapability.class, "AbstractCapability", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_Dependencies(), this.getAbstractCapability(), null, "dependencies", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Dependents(), this.getCapabilityReference(), null, "dependents", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(compositeCapabilityEClass, CompositeCapability.class, "CompositeCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityReferenceEClass, CapabilityReference.class, "CapabilityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityReference_Target(), this.getCapability(), null, "target", null, 0, 1, CapabilityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityDomainEClass, CapabilityDomain.class, "CapabilityDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityDomain_Capabilities(), this.getAbstractCapability(), null, "capabilities", null, 0, -1, CapabilityDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityDomain_ResolvedCapabilities(), this.getAbstractCapability(), null, "resolvedCapabilities", null, 0, -1, CapabilityDomain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCapabilityDomain__ResolveCapabilityReference__AbstractCapability(), this.getAbstractCapability(), "resolveCapabilityReference", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractCapability(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(capabilityDependencyEClass, CapabilityDependency.class, "CapabilityDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapabilityDependency_Kind(), this.getDependencyKind(), "kind", null, 0, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapabilityDependency_Qualifier(), theEcorePackage.getEString(), "qualifier", null, 0, 1, CapabilityDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCapabilityProviderEClass, AbstractCapabilityProvider.class, "AbstractCapabilityProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityProviderEClass, CapabilityProvider.class, "CapabilityProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProvider_Provides(), this.getProvidedCapability(), null, "provides", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityProvider_Requires(), this.getRequiredCapability(), null, "requires", null, 0, -1, CapabilityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityProviderDomainEClass, CapabilityProviderDomain.class, "CapabilityProviderDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProviderDomain_CapabilityProviders(), this.getAbstractCapabilityProvider(), null, "capabilityProviders", null, 0, -1, CapabilityProviderDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityProviderReferenceEClass, CapabilityProviderReference.class, "CapabilityProviderReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProviderReference_Target(), this.getCapabilityProvider(), null, "target", null, 0, 1, CapabilityProviderReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedCapabilityEClass, ProvidedCapability.class, "ProvidedCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedCapability_Capability(), this.getAbstractCapability(), null, "capability", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEvidenceEClass, AbstractEvidence.class, "AbstractEvidence", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evidenceDomainEClass, EvidenceDomain.class, "EvidenceDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvidenceDomain_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, EvidenceDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredCapability_Capability(), this.getAbstractCapability(), null, "capability", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dependencyKindEEnum, DependencyKind.class, "DependencyKind");
		addEEnumLiteral(dependencyKindEEnum, DependencyKind.REQUIRES);
		addEEnumLiteral(dependencyKindEEnum, DependencyKind.ENHANCES);
		addEEnumLiteral(dependencyKindEEnum, DependencyKind.CONFLICTS);
		addEEnumLiteral(dependencyKindEEnum, DependencyKind.CUSTOM);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (getCapability_Dependencies(),
		   source,
		   new String[] {
			   "documentation", "*\nDependencies as an abstract capability allows to\nmodel self-contained capabilities with inline dependencies\nand even dependency domains.\nWhen federated, such inline capabilities can be\neither replaced with CapabilityReference or CapabilityDependency\nor use URIs to de-dup multiple definitions into one logical definition"
		   });
		addAnnotation
		  (getCapability_Dependents(),
		   source,
		   new String[] {
			   "documentation", "*\nCapabilities depending on this capability, excludes containment.\nReturns capability references, including capability dependencies, with target pointing\nto this capability and contained by the dependencies reference.",
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.CapabilityReference%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.CapabilityReference%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.CapabilityReference%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EObject%>> _referrers = this.getReferrers(<%org.nasdanika.models.capability.CapabilityPackage.Literals%>.CAPABILITY_REFERENCE__TARGET);\n\tfor (final <%org.eclipse.emf.ecore.EObject%> referrer : _referrers)\n\t{\n\t\t<%org.eclipse.emf.ecore.EReference%> _eContainmentFeature = referrer.eContainmentFeature();\n\t\tboolean _tripleEquals = (_eContainmentFeature == <%org.nasdanika.models.capability.CapabilityPackage.Literals%>.CAPABILITY__DEPENDENCIES);\n\t\tif (_tripleEquals)\n\t\t{\n\t\t\tif ((referrer instanceof <%org.nasdanika.models.capability.CapabilityReference%>))\n\t\t\t{\n\t\t\t\tresult.add(((<%org.nasdanika.models.capability.CapabilityReference%>)referrer));\n\t\t\t}\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (capabilityReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "*\nCapability reference extends ModelEment to allow adding documentation\nto addressedBy"
		   });
		addAnnotation
		  (getCapabilityDomain__ResolveCapabilityReference__AbstractCapability(),
		   source,
		   new String[] {
			   "body", "<%org.nasdanika.models.capability.AbstractCapability%> current = start;\nfinal <%java.util.HashSet%><<%org.nasdanika.models.capability.AbstractCapability%>> seen = new <%java.util.HashSet%><<%org.nasdanika.models.capability.AbstractCapability%>>();\nwhile ((current instanceof <%org.nasdanika.models.capability.CapabilityReference%>))\n{\n\t{\n\t\tboolean _add = seen.add(current);\n\t\tboolean _not = (!_add);\n\t\tif (_not)\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t\tcurrent = ((<%org.nasdanika.models.capability.CapabilityReference%>)current).getTarget();\n\t\tif ((current == null))\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t}\n}\nreturn current;"
		   });
		addAnnotation
		  (getCapabilityDomain_ResolvedCapabilities(),
		   source,
		   new String[] {
			   "get", "<%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.AbstractCapability%>> _xblockexpression = null;\n{\n\tfinal <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.AbstractCapability%>> result = new <%org.eclipse.emf.common.util.BasicEList%><<%org.nasdanika.models.capability.AbstractCapability%>>();\n\t<%org.eclipse.emf.common.util.EList%><<%org.nasdanika.models.capability.AbstractCapability%>> _capabilities = this.getCapabilities();\n\tfor (final <%org.nasdanika.models.capability.AbstractCapability%> capability : _capabilities)\n\t{\n\t\t{\n\t\t\tfinal <%org.nasdanika.models.capability.AbstractCapability%> resolved = this.resolveCapabilityReference(capability);\n\t\t\tif ((resolved != null))\n\t\t\t{\n\t\t\t\tresult.add(resolved);\n\t\t\t}\n\t\t}\n\t}\n\t_xblockexpression = result;\n}\nreturn _xblockexpression;"
		   });
		addAnnotation
		  (getCapabilityDependency_Qualifier(),
		   source,
		   new String[] {
			   "documentation", "*\nQualifier for the dependency kind, e.g. CUSTOM kind"
		   });
		addAnnotation
		  (dependencyKindEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nBuilt-in dependency types"
		   });
		addAnnotation
		  (dependencyKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "*\nI cannot function without this"
		   });
		addAnnotation
		  (dependencyKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "*\nI work better when this is also present"
		   });
		addAnnotation
		  (dependencyKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "*\nI cannot coexist with this"
		   });
		addAnnotation
		  (dependencyKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "*\nCustom dependency type"
		   });
		addAnnotation
		  (evidenceEClass,
		   source,
		   new String[] {
			   "documentation", "*\nEvidence of provided capability.\nE.g. for humans it can be a diploma or a certification or a project\nFor software products it might be a demo, recorded video, ..."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getCapabilityDomain_Capabilities(),
		   source,
		   new String[] {
			   "logicalContainment", "false"
		   });
		addAnnotation
		  (getCapabilityDomain_ResolvedCapabilities(),
		   source,
		   new String[] {
			   "logicalContainment", "true"
		   });
	}

} //CapabilityPackageImpl
