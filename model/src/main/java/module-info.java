import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.capability.capability.CapabilityArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.capability.capability.CapabilityEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.capability.capability.CapabilityResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.capability.capability.CapabilityResourceFactoryCapabilityFactory;

module org.nasdanika.models.capability.Capability {
	
	exports org.nasdanika.models.capability;
	exports org.nasdanika.models.capability.impl;
	exports org.nasdanika.models.capability.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.threat;
		
	provides CapabilityFactory with 
		CapabilityEPackageResourceSetCapabilityFactory;
	
}