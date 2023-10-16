/**
 */
package org.nasdanika.models.capability.processors.doc;

import org.nasdanika.models.capability.CapabilityDomainElement;
import org.nasdanika.ncore.DocumentedNamedElementWithID;

import java.util.function.Function;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.html.model.app.graph.emf.EObjectNodeProcessor;

public class CapabilityDomainElementNodeProcessor<T extends CapabilityDomainElement> extends EObjectNodeProcessor<T> {

	public CapabilityDomainElementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config,
			Context context, 
			Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}

} 
