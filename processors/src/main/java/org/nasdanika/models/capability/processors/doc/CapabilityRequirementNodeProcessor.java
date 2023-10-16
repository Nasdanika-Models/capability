/**
 */
package org.nasdanika.models.capability.processors.doc;

import java.util.function.Function;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.capability.CapabilityRequirement;

public class CapabilityRequirementNodeProcessor<T extends CapabilityRequirement> extends RequirementNodeProcessor<T> {
	
	public CapabilityRequirementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config,
			Context context, 
			Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}
	
//	int getMin();
//	int getMax();
//	Capability getCapability();
//	EList<VersionRange> getVersions();

} // CapabilityRequirement
