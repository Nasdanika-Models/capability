/**
 */
package org.nasdanika.models.capability.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.capability.AbstractCapability;
import org.nasdanika.models.capability.CapabilityDomain;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.capability.CapabilityReference;

import org.nasdanika.models.nxcore.Content;
import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.Marker;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.Section;
import org.nasdanika.models.nxcore.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getDocRef <em>Doc Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getDocFormat <em>Doc Format</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getDocContents <em>Doc Contents</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getDocSections <em>Doc Sections</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getUris <em>Uris</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.capability.impl.CapabilityDomainImpl#getResolvedCapabilities <em>Resolved Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityDomainImpl extends EObjectImpl implements CapabilityDomain {
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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocRef() <em>Doc Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocFormat() <em>Doc Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__ID, NxcorePackage.Literals.STRING_IDENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CapabilityPackage.CAPABILITY_DOMAIN__ID, NxcorePackage.Literals.STRING_IDENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return (String)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__DOCUMENTATION, NxcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(CapabilityPackage.CAPABILITY_DOMAIN__DOCUMENTATION, NxcorePackage.Literals.DOCUMENTED__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocRef() {
		return (String)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__DOC_REF, NxcorePackage.Literals.DOCUMENTED__DOC_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocRef(String newDocRef) {
		eDynamicSet(CapabilityPackage.CAPABILITY_DOMAIN__DOC_REF, NxcorePackage.Literals.DOCUMENTED__DOC_REF, newDocRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocFormat() {
		return (String)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__DOC_FORMAT, NxcorePackage.Literals.DOCUMENTED__DOC_FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocFormat(String newDocFormat) {
		eDynamicSet(CapabilityPackage.CAPABILITY_DOMAIN__DOC_FORMAT, NxcorePackage.Literals.DOCUMENTED__DOC_FORMAT, newDocFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Content> getDocContents() {
		return (EList<Content>)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__DOC_CONTENTS, NxcorePackage.Literals.DOCUMENTED__DOC_CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Section> getDocSections() {
		return (EList<Section>)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__DOC_SECTIONS, NxcorePackage.Literals.DOCUMENTED__DOC_SECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__MARKERS, NxcorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return (String)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__ICON, NxcorePackage.Literals.MODEL_ELEMENT__ICON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		eDynamicSet(CapabilityPackage.CAPABILITY_DOMAIN__ICON, NxcorePackage.Literals.MODEL_ELEMENT__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getUris() {
		return (EList<String>)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__URIS, NxcorePackage.Literals.MODEL_ELEMENT__URIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractCapability> getCapabilities() {
		return (EList<AbstractCapability>)eDynamicGet(CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES, CapabilityPackage.Literals.CAPABILITY_DOMAIN__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCapability> getResolvedCapabilities() {
		BasicEList<AbstractCapability> _xblockexpression = null;
		{
			final BasicEList<AbstractCapability> result = new BasicEList<AbstractCapability>();
			EList<AbstractCapability> _capabilities = this.getCapabilities();
			for (final AbstractCapability capability : _capabilities) {
				{
					final AbstractCapability resolved = this.resolveCapabilityReference(capability);
					if ((resolved != null)) {
						result.add(resolved);
					}
				}
			}
			_xblockexpression = result;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCapability resolveCapabilityReference(final AbstractCapability start) {
		AbstractCapability current = start;
		final HashSet<AbstractCapability> seen = new HashSet<AbstractCapability>();
		while ((current instanceof CapabilityReference)) {
			{
				boolean _add = seen.add(current);
				boolean _not = (!_add);
				if (_not) {
					return null;
				}
				current = ((CapabilityReference)current).getTarget();
				if ((current == null)) {
					return null;
				}
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void collect(final Object source, final EReference eReference, final EList<EObject> accumulator) {
		boolean _isInstance = eReference.getEContainingClass().isInstance(source);
		if (_isInstance) {
			final Object value = ((EObject) source).eGet(eReference);
			boolean _isMany = eReference.isMany();
			if (_isMany) {
				boolean _contains = ((Collection<?>) value).contains(this);
				if (_contains) {
					accumulator.add(((EObject) source));
				}
			}
			else {
				if ((value == this)) {
					accumulator.add(((EObject) source));
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getReferrers(final EReference eReference) {
		final BasicEList<EObject> ret = new BasicEList<EObject>();
		final Resource res = this.eResource();
		TreeIterator<?> cit = null;
		if ((res == null)) {
			EObject root = this;
			EObject rc = null;
			while (((rc = root.eContainer()) != null)) {
				root = rc;
			}
			if ((root != null)) {
				this.collect(root, eReference, ret);
				cit = root.eAllContents();
			}
		}
		else {
			final ResourceSet rSet = res.getResourceSet();
			TreeIterator<? extends Notifier> _xifexpression = null;
			if ((rSet == null)) {
				_xifexpression = res.getAllContents();
			}
			else {
				_xifexpression = rSet.getAllContents();
			}
			cit = _xifexpression;
		}
		if ((cit != null)) {
			while (cit.hasNext()) {
				this.collect(cit.next(), eReference, ret);
			}
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_CONTENTS:
				return ((InternalEList<?>)getDocContents()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_SECTIONS:
				return ((InternalEList<?>)getDocSections()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_DOMAIN__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case CapabilityPackage.CAPABILITY_DOMAIN__ID:
				return getId();
			case CapabilityPackage.CAPABILITY_DOMAIN__DOCUMENTATION:
				return getDocumentation();
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_REF:
				return getDocRef();
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_FORMAT:
				return getDocFormat();
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_CONTENTS:
				return getDocContents();
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_SECTIONS:
				return getDocSections();
			case CapabilityPackage.CAPABILITY_DOMAIN__MARKERS:
				return getMarkers();
			case CapabilityPackage.CAPABILITY_DOMAIN__ICON:
				return getIcon();
			case CapabilityPackage.CAPABILITY_DOMAIN__URIS:
				return getUris();
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				return getCapabilities();
			case CapabilityPackage.CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES:
				return getResolvedCapabilities();
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
			case CapabilityPackage.CAPABILITY_DOMAIN__ID:
				setId((String)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_REF:
				setDocRef((String)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_FORMAT:
				setDocFormat((String)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_CONTENTS:
				getDocContents().clear();
				getDocContents().addAll((Collection<? extends Content>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_SECTIONS:
				getDocSections().clear();
				getDocSections().addAll((Collection<? extends Section>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__ICON:
				setIcon((String)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__URIS:
				getUris().clear();
				getUris().addAll((Collection<? extends String>)newValue);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends AbstractCapability>)newValue);
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
			case CapabilityPackage.CAPABILITY_DOMAIN__ID:
				setId(ID_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_REF:
				setDocRef(DOC_REF_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_FORMAT:
				setDocFormat(DOC_FORMAT_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_CONTENTS:
				getDocContents().clear();
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_SECTIONS:
				getDocSections().clear();
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__MARKERS:
				getMarkers().clear();
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__URIS:
				getUris().clear();
				return;
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				getCapabilities().clear();
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
			case CapabilityPackage.CAPABILITY_DOMAIN__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CapabilityPackage.CAPABILITY_DOMAIN__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_REF:
				return DOC_REF_EDEFAULT == null ? getDocRef() != null : !DOC_REF_EDEFAULT.equals(getDocRef());
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_FORMAT:
				return DOC_FORMAT_EDEFAULT == null ? getDocFormat() != null : !DOC_FORMAT_EDEFAULT.equals(getDocFormat());
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_CONTENTS:
				return !getDocContents().isEmpty();
			case CapabilityPackage.CAPABILITY_DOMAIN__DOC_SECTIONS:
				return !getDocSections().isEmpty();
			case CapabilityPackage.CAPABILITY_DOMAIN__MARKERS:
				return !getMarkers().isEmpty();
			case CapabilityPackage.CAPABILITY_DOMAIN__ICON:
				return ICON_EDEFAULT == null ? getIcon() != null : !ICON_EDEFAULT.equals(getIcon());
			case CapabilityPackage.CAPABILITY_DOMAIN__URIS:
				return !getUris().isEmpty();
			case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case CapabilityPackage.CAPABILITY_DOMAIN__RESOLVED_CAPABILITIES:
				return !getResolvedCapabilities().isEmpty();
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
		if (baseClass == Referrable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StringIdentity.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_DOMAIN__ID: return NxcorePackage.STRING_IDENTITY__ID;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_DOMAIN__DOCUMENTATION: return NxcorePackage.DOCUMENTED__DOCUMENTATION;
				case CapabilityPackage.CAPABILITY_DOMAIN__DOC_REF: return NxcorePackage.DOCUMENTED__DOC_REF;
				case CapabilityPackage.CAPABILITY_DOMAIN__DOC_FORMAT: return NxcorePackage.DOCUMENTED__DOC_FORMAT;
				case CapabilityPackage.CAPABILITY_DOMAIN__DOC_CONTENTS: return NxcorePackage.DOCUMENTED__DOC_CONTENTS;
				case CapabilityPackage.CAPABILITY_DOMAIN__DOC_SECTIONS: return NxcorePackage.DOCUMENTED__DOC_SECTIONS;
				default: return -1;
			}
		}
		if (baseClass == Marked.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_DOMAIN__MARKERS: return NxcorePackage.MARKED__MARKERS;
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case CapabilityPackage.CAPABILITY_DOMAIN__ICON: return NxcorePackage.MODEL_ELEMENT__ICON;
				case CapabilityPackage.CAPABILITY_DOMAIN__URIS: return NxcorePackage.MODEL_ELEMENT__URIS;
				default: return -1;
			}
		}
		if (baseClass == AbstractCapability.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Referrable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StringIdentity.class) {
			switch (baseFeatureID) {
				case NxcorePackage.STRING_IDENTITY__ID: return CapabilityPackage.CAPABILITY_DOMAIN__ID;
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case NxcorePackage.DOCUMENTED__DOCUMENTATION: return CapabilityPackage.CAPABILITY_DOMAIN__DOCUMENTATION;
				case NxcorePackage.DOCUMENTED__DOC_REF: return CapabilityPackage.CAPABILITY_DOMAIN__DOC_REF;
				case NxcorePackage.DOCUMENTED__DOC_FORMAT: return CapabilityPackage.CAPABILITY_DOMAIN__DOC_FORMAT;
				case NxcorePackage.DOCUMENTED__DOC_CONTENTS: return CapabilityPackage.CAPABILITY_DOMAIN__DOC_CONTENTS;
				case NxcorePackage.DOCUMENTED__DOC_SECTIONS: return CapabilityPackage.CAPABILITY_DOMAIN__DOC_SECTIONS;
				default: return -1;
			}
		}
		if (baseClass == Marked.class) {
			switch (baseFeatureID) {
				case NxcorePackage.MARKED__MARKERS: return CapabilityPackage.CAPABILITY_DOMAIN__MARKERS;
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case NxcorePackage.MODEL_ELEMENT__ICON: return CapabilityPackage.CAPABILITY_DOMAIN__ICON;
				case NxcorePackage.MODEL_ELEMENT__URIS: return CapabilityPackage.CAPABILITY_DOMAIN__URIS;
				default: return -1;
			}
		}
		if (baseClass == AbstractCapability.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Referrable.class) {
			switch (baseOperationID) {
				case NxcorePackage.REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST: return CapabilityPackage.CAPABILITY_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST;
				case NxcorePackage.REFERRABLE___GET_REFERRERS__EREFERENCE: return CapabilityPackage.CAPABILITY_DOMAIN___GET_REFERRERS__EREFERENCE;
				default: return -1;
			}
		}
		if (baseClass == StringIdentity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Documented.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Marked.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractCapability.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CapabilityPackage.CAPABILITY_DOMAIN___RESOLVE_CAPABILITY_REFERENCE__ABSTRACTCAPABILITY:
				return resolveCapabilityReference((AbstractCapability)arguments.get(0));
			case CapabilityPackage.CAPABILITY_DOMAIN___COLLECT__OBJECT_EREFERENCE_ELIST:
				collect(arguments.get(0), (EReference)arguments.get(1), (EList<EObject>)arguments.get(2));
				return null;
			case CapabilityPackage.CAPABILITY_DOMAIN___GET_REFERRERS__EREFERENCE:
				return getReferrers((EReference)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CapabilityDomainImpl
