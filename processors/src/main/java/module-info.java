module org.nasdanika.models.capability.processors {
		
	requires transitive org.nasdanika.models.capability;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.capability.processors;
	opens org.nasdanika.models.capability.processors; // For loading resources
	
}
