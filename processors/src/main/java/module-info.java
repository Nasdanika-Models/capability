module org.nasdanika.models.capability.processors {
		
	requires transitive org.nasdanika.models.capability;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.capability.processors.ecore;
	opens org.nasdanika.models.capability.processors.ecore; // For loading resources
	
	exports org.nasdanika.models.capability.processors.doc;
	opens org.nasdanika.models.capability.processors.doc; // For loading resources
	
}
