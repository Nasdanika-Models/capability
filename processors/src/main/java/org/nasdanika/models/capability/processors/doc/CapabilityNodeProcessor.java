/**
 */
package org.nasdanika.models.capability.processors.doc;

import java.util.function.Function;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.capability.Capability;

public class CapabilityNodeProcessor<T extends Capability> extends CapabilityDomainElementNodeProcessor<T> {	

	public CapabilityNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config,
			Context context, 
			Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}
	
//	EList<CapabilityVersion> getVersions();
//	EList<Capability> getIncludes();
//	EList<Capability> getIncludedIn();
	
} 
