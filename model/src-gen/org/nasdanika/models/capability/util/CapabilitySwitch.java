/**
 */
package org.nasdanika.models.capability.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.capability.*;

import org.nasdanika.models.iam.AccessControlled;

import org.nasdanika.models.lifecycle.Staged;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.NamedElement;
import org.nasdanika.models.nxcore.NamedPeriod;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

import org.nasdanika.models.seal.SealedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.capability.CapabilityPackage
 * @generated
 */
public class CapabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CapabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = CapabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CapabilityPackage.ABSTRACT_CAPABILITY: {
				AbstractCapability abstractCapability = (AbstractCapability)theEObject;
				T result = caseAbstractCapability(abstractCapability);
				if (result == null) result = caseModelElement(abstractCapability);
				if (result == null) result = caseStringIdentity(abstractCapability);
				if (result == null) result = caseDocumented(abstractCapability);
				if (result == null) result = caseMarked(abstractCapability);
				if (result == null) result = caseReferrable(abstractCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseNamedPeriod(capability);
				if (result == null) result = caseAbstractCapability(capability);
				if (result == null) result = caseEvidenceDomain(capability);
				if (result == null) result = caseStaged(capability);
				if (result == null) result = caseNamedElement(capability);
				if (result == null) result = casePeriod(capability);
				if (result == null) result = caseAbstractEvidence(capability);
				if (result == null) result = caseSealedElement(capability);
				if (result == null) result = caseModelElement(capability);
				if (result == null) result = caseAccessControlled(capability);
				if (result == null) result = caseStringIdentity(capability);
				if (result == null) result = caseDocumented(capability);
				if (result == null) result = caseMarked(capability);
				if (result == null) result = caseReferrable(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.COMPOSITE_CAPABILITY: {
				CompositeCapability compositeCapability = (CompositeCapability)theEObject;
				T result = caseCompositeCapability(compositeCapability);
				if (result == null) result = caseCapability(compositeCapability);
				if (result == null) result = caseCapabilityDomain(compositeCapability);
				if (result == null) result = caseNamedPeriod(compositeCapability);
				if (result == null) result = caseAbstractCapability(compositeCapability);
				if (result == null) result = caseEvidenceDomain(compositeCapability);
				if (result == null) result = caseStaged(compositeCapability);
				if (result == null) result = caseNamedElement(compositeCapability);
				if (result == null) result = casePeriod(compositeCapability);
				if (result == null) result = caseAbstractEvidence(compositeCapability);
				if (result == null) result = caseSealedElement(compositeCapability);
				if (result == null) result = caseModelElement(compositeCapability);
				if (result == null) result = caseAccessControlled(compositeCapability);
				if (result == null) result = caseStringIdentity(compositeCapability);
				if (result == null) result = caseDocumented(compositeCapability);
				if (result == null) result = caseMarked(compositeCapability);
				if (result == null) result = caseReferrable(compositeCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY_REFERENCE: {
				CapabilityReference capabilityReference = (CapabilityReference)theEObject;
				T result = caseCapabilityReference(capabilityReference);
				if (result == null) result = caseAbstractCapability(capabilityReference);
				if (result == null) result = caseModelElement(capabilityReference);
				if (result == null) result = caseStringIdentity(capabilityReference);
				if (result == null) result = caseDocumented(capabilityReference);
				if (result == null) result = caseMarked(capabilityReference);
				if (result == null) result = caseReferrable(capabilityReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY_DOMAIN: {
				CapabilityDomain capabilityDomain = (CapabilityDomain)theEObject;
				T result = caseCapabilityDomain(capabilityDomain);
				if (result == null) result = caseNamedElement(capabilityDomain);
				if (result == null) result = caseAbstractCapability(capabilityDomain);
				if (result == null) result = caseModelElement(capabilityDomain);
				if (result == null) result = caseStringIdentity(capabilityDomain);
				if (result == null) result = caseDocumented(capabilityDomain);
				if (result == null) result = caseMarked(capabilityDomain);
				if (result == null) result = caseReferrable(capabilityDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY_DEPENDENCY: {
				CapabilityDependency capabilityDependency = (CapabilityDependency)theEObject;
				T result = caseCapabilityDependency(capabilityDependency);
				if (result == null) result = caseCapabilityReference(capabilityDependency);
				if (result == null) result = caseAbstractCapability(capabilityDependency);
				if (result == null) result = caseModelElement(capabilityDependency);
				if (result == null) result = caseStringIdentity(capabilityDependency);
				if (result == null) result = caseDocumented(capabilityDependency);
				if (result == null) result = caseMarked(capabilityDependency);
				if (result == null) result = caseReferrable(capabilityDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.ABSTRACT_CAPABILITY_PROVIDER: {
				AbstractCapabilityProvider abstractCapabilityProvider = (AbstractCapabilityProvider)theEObject;
				T result = caseAbstractCapabilityProvider(abstractCapabilityProvider);
				if (result == null) result = caseStringIdentity(abstractCapabilityProvider);
				if (result == null) result = caseReferrable(abstractCapabilityProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY_PROVIDER: {
				CapabilityProvider capabilityProvider = (CapabilityProvider)theEObject;
				T result = caseCapabilityProvider(capabilityProvider);
				if (result == null) result = caseNamedPeriod(capabilityProvider);
				if (result == null) result = caseAbstractCapabilityProvider(capabilityProvider);
				if (result == null) result = caseStaged(capabilityProvider);
				if (result == null) result = caseNamedElement(capabilityProvider);
				if (result == null) result = casePeriod(capabilityProvider);
				if (result == null) result = caseSealedElement(capabilityProvider);
				if (result == null) result = caseModelElement(capabilityProvider);
				if (result == null) result = caseAccessControlled(capabilityProvider);
				if (result == null) result = caseStringIdentity(capabilityProvider);
				if (result == null) result = caseDocumented(capabilityProvider);
				if (result == null) result = caseMarked(capabilityProvider);
				if (result == null) result = caseReferrable(capabilityProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY_PROVIDER_DOMAIN: {
				CapabilityProviderDomain capabilityProviderDomain = (CapabilityProviderDomain)theEObject;
				T result = caseCapabilityProviderDomain(capabilityProviderDomain);
				if (result == null) result = caseNamedElement(capabilityProviderDomain);
				if (result == null) result = caseAbstractCapabilityProvider(capabilityProviderDomain);
				if (result == null) result = caseModelElement(capabilityProviderDomain);
				if (result == null) result = caseStringIdentity(capabilityProviderDomain);
				if (result == null) result = caseDocumented(capabilityProviderDomain);
				if (result == null) result = caseMarked(capabilityProviderDomain);
				if (result == null) result = caseReferrable(capabilityProviderDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.CAPABILITY_PROVIDER_REFERENCE: {
				CapabilityProviderReference capabilityProviderReference = (CapabilityProviderReference)theEObject;
				T result = caseCapabilityProviderReference(capabilityProviderReference);
				if (result == null) result = caseAbstractCapabilityProvider(capabilityProviderReference);
				if (result == null) result = caseStringIdentity(capabilityProviderReference);
				if (result == null) result = caseReferrable(capabilityProviderReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.PROVIDED_CAPABILITY: {
				ProvidedCapability providedCapability = (ProvidedCapability)theEObject;
				T result = caseProvidedCapability(providedCapability);
				if (result == null) result = caseNamedPeriod(providedCapability);
				if (result == null) result = caseEvidenceDomain(providedCapability);
				if (result == null) result = caseNamedElement(providedCapability);
				if (result == null) result = casePeriod(providedCapability);
				if (result == null) result = caseAbstractEvidence(providedCapability);
				if (result == null) result = caseModelElement(providedCapability);
				if (result == null) result = caseStringIdentity(providedCapability);
				if (result == null) result = caseDocumented(providedCapability);
				if (result == null) result = caseMarked(providedCapability);
				if (result == null) result = caseReferrable(providedCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.ABSTRACT_EVIDENCE: {
				AbstractEvidence abstractEvidence = (AbstractEvidence)theEObject;
				T result = caseAbstractEvidence(abstractEvidence);
				if (result == null) result = caseStringIdentity(abstractEvidence);
				if (result == null) result = caseReferrable(abstractEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = caseNamedPeriod(evidence);
				if (result == null) result = caseAbstractEvidence(evidence);
				if (result == null) result = caseNamedElement(evidence);
				if (result == null) result = casePeriod(evidence);
				if (result == null) result = caseModelElement(evidence);
				if (result == null) result = caseStringIdentity(evidence);
				if (result == null) result = caseDocumented(evidence);
				if (result == null) result = caseMarked(evidence);
				if (result == null) result = caseReferrable(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.EVIDENCE_DOMAIN: {
				EvidenceDomain evidenceDomain = (EvidenceDomain)theEObject;
				T result = caseEvidenceDomain(evidenceDomain);
				if (result == null) result = caseNamedElement(evidenceDomain);
				if (result == null) result = caseAbstractEvidence(evidenceDomain);
				if (result == null) result = caseModelElement(evidenceDomain);
				if (result == null) result = caseStringIdentity(evidenceDomain);
				if (result == null) result = caseDocumented(evidenceDomain);
				if (result == null) result = caseMarked(evidenceDomain);
				if (result == null) result = caseReferrable(evidenceDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.REQUIRED_CAPABILITY: {
				RequiredCapability requiredCapability = (RequiredCapability)theEObject;
				T result = caseRequiredCapability(requiredCapability);
				if (result == null) result = caseNamedPeriod(requiredCapability);
				if (result == null) result = caseNamedElement(requiredCapability);
				if (result == null) result = casePeriod(requiredCapability);
				if (result == null) result = caseModelElement(requiredCapability);
				if (result == null) result = caseStringIdentity(requiredCapability);
				if (result == null) result = caseDocumented(requiredCapability);
				if (result == null) result = caseMarked(requiredCapability);
				if (result == null) result = caseReferrable(requiredCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CapabilityPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = caseNamedPeriod(version);
				if (result == null) result = caseNamedElement(version);
				if (result == null) result = casePeriod(version);
				if (result == null) result = caseModelElement(version);
				if (result == null) result = caseStringIdentity(version);
				if (result == null) result = caseDocumented(version);
				if (result == null) result = caseMarked(version);
				if (result == null) result = caseReferrable(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCapability(AbstractCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeCapability(CompositeCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityReference(CapabilityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityDomain(CapabilityDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityDependency(CapabilityDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Capability Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Capability Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCapabilityProvider(AbstractCapabilityProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityProvider(CapabilityProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityProviderDomain(CapabilityProviderDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityProviderReference(CapabilityProviderReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedCapability(ProvidedCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEvidence(AbstractEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceDomain(EvidenceDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredCapability(RequiredCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedPeriod(NamedPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Controlled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Controlled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlled(AccessControlled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sealed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sealed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSealedElement(SealedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staged</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staged</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaged(Staged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CapabilitySwitch
