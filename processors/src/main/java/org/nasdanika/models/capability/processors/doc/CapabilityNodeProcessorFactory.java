package org.nasdanika.models.capability.processors.doc;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessor;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.capability.Capability;
import org.nasdanika.models.capability.CapabilityDomain;
import org.nasdanika.models.capability.CapabilityDomainElement;
import org.nasdanika.models.capability.CapabilityProvider;
import org.nasdanika.models.capability.CapabilityRequirement;
import org.nasdanika.models.capability.Requirement;
import org.nasdanika.models.capability.RequirementConsumer;
import org.nasdanika.models.capability.Version;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate flow documentation.
 * @author Pavel
 *
 */
public class CapabilityNodeProcessorFactory {
			
	private Context context;
	private java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider;

	protected java.util.function.Function<ProgressMonitor, Action> getPrototypeProvider(NodeProcessorConfig<WidgetFactory, WidgetFactory> config) {
		return progressMonitor -> {
			if (prototypeProvider != null) {
				for (URI identifier: NcoreUtil.getIdentifiers(((EObjectNode) config.getElement()).get())) {
					Action prototype = prototypeProvider.apply(identifier, progressMonitor);
					if (prototype != null) {
						return prototype;
					}				
				}			
			}
			return AppFactory.eINSTANCE.createAction();
		};		
	}
	
	/**
	 * 
	 * @param context
	 * @param reflectiveFactories Objects with annotated methods for creating processors. 
	 */
	public CapabilityNodeProcessorFactory(
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider)  {
		this.context = context;
		this.prototypeProvider = prototypeProvider;
	}

	@EObjectNodeProcessor(type = org.nasdanika.models.capability.Capability.class)
	public Object createCapabilityNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CapabilityNodeProcessor<Capability>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.CapabilityDomain.class)
	public Object createCapabilityDomainNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CapabilityDomainNodeProcessor<CapabilityDomain>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.CapabilityDomainElement.class)
	public Object createCapabilityDomainElementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CapabilityDomainElementNodeProcessor<CapabilityDomainElement>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.CapabilityProvider.class)
	public Object createCapabilityProviderNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CapabilityProviderNodeProcessor<CapabilityProvider>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.CapabilityRequirement.class)
	public Object createCapabilityRequirementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CapabilityRequirementNodeProcessor<CapabilityRequirement>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.CapabilityVersion.class)
	public Object createCapabilityVersionNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CapabilityVersionNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.Requirement.class)
	public Object createRequirementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new RequirementNodeProcessor<Requirement>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.RequirementConsumer.class)
	public Object createRequirementConsumerNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new RequirementConsumerNodeProcessor<RequirementConsumer>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.Version.class)
	public Object createVersionNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new VersionNodeProcessor<Version>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.capability.VersionRange.class)
	public Object createVersionRangeNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new VersionRangeNodeProcessor(config, context, getPrototypeProvider(config));
	}	

}
