/**
 */
package org.nasdanika.models.capability.processors.doc;

import java.util.function.Function;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.html.model.app.graph.emf.EObjectNodeProcessor;
import org.nasdanika.models.capability.CapabilityProvider;

public class CapabilityProviderNodeProcessor<T extends CapabilityProvider> extends EObjectNodeProcessor<T> {

	public CapabilityProviderNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config,
			Context context, 
			Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}
	
	// RequirementConsumer
	//EList<Capability> getProvidedCapabilities();

} 
