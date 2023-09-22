# Capability

Capability model inspired by [Equinox P2](https://eclipse.dev/equinox/p2/).

Key concepts:

* Capability - ability to do something. E.g. execute AI workloads.
* Capability provider ([IInstallableUnit](https://help.eclipse.org/latest/nftopic/org.eclipse.platform.doc.isv/reference/api/org/eclipse/equinox/p2/metadata/IInstallableUnit.html) in P2) - something that provides a capability. Capability provider may require other capabilities in turn. E.g. a server requires power and maintenance, a public cloud provider like Azure requires money and Internet connectivity. Power company requires money in exchange for power, and a technician requires money in exchange for server maintenance. So in both cases an ability to execute AI workloads may be translated to a requirement of money.
* Version - capabilities and providers can be of different versions. E.g. ChatGpt 4, Java 17.
* Provisioning plan - a directed graph of capability providers to obtain desired capability from other capabilities. There might be multiple provisioning plans for the same capability or a set of capabilities. 

Capabilities may have quality attributes. E.g. availability. Capability providers may have temporal and other "dimensional" aspects. E.g. "Shade" capability may be provided by planting a tree, but the capability will be delivered after some time.
Capability requirements may be binary as P2 or of other types, e.g. numeric. Essentially a capability provider is a translator of capabilities requested from it to lower-level capabilities. E.g.: A hours of compute with B CPU's, C Gb of RAM, D Gb of HDD -> X dollars.
Low-level capability requirements (dollars, skills, ...) can be computed from higher level requirements by building a graph of capability providers and passing capability requests.
Capability providers may be composed similarly to how a computer is assembled from CPU, RAM, Motherboard and hard drive. 
Translation functions may include probability distributions. They may be computed or retrieved from a lookup table/matrix. 
Provisioning plan may include dimensional aspects - "when" and "where" in addition to "who".
Capabilities may include other capabilities (composition) and extend (inheritance).

Capability models may be loaded from a multitude of sources. For example:

* Java module dependencies - binary capabilities without version specification
* Maven dependencies - specify version, optionality, and scope
* NPM dependencies
* Workflows, project plans

## Use Cases

### Educational

The model can be used to direct capability (outcome) thinking and thinking in terms of capability graphs/provisioning plans.
Operating on a higher level of abstraction may help to see and analyze as a whole things which appear as totally different at a first glance.

### Visualizations & reporting

* Load a capability model from some source including manually created sources such as Excel or YAML
* Generate visualizations and reports:
    * [Graph](https://echarts.apache.org/examples/en/index.html#chart-type-graph)
    * [Sankey](https://echarts.apache.org/examples/en/index.html#chart-type-sankey). E.g. visualize how compute requirement translates to money requirement through other requirements.

### Computational Graph

* Build a capability model (which is a graph)
* Build a computational graph from it - [Nasdanika Core Graph EMF](https://github.com/Nasdanika/core/tree/master/graph/src/main/java/org/nasdanika/graph/emf) can be used to build a graph of processors from a Ecore model.
* Perform computations. 
    * One form of computations might be building a graph or another data structure to use in further analysis, e.g. in Python.
    * For flows the computational graph may compute capability/resource requirements. E.g. in a workflow it may compute staffing levels to support, say, a technology upgrade initiative.

### Decision Analysis

Selection between different provisioning plans and capability providers. 
This model may be used together with the [Multiple-criteria Decision Analysis](https://github.com/Nasdanika-Models/multiple-criteria-decision-analysis) model. 
E.g. Provisioning plan and Capability Provider may extend Alternative and Quality Attribute may extend Criterion.

### Architecture 

Elaborates on the above. In TOGAF, ADM is essentially a method of coming up with, selecting, and then executing a provisioning plan. 

Building Blocks and Architectures may extend Capability Providers. 
Drivers and principles may extend or inter-relate with Quality Attributes.  
Architecture Repository may contain a registry of building blocks with "translation functions", quality attributes/criteria and decision analysis templates. Decision analysis templates may be created during technology evaluations.
"Translation functions" may be created during technology evaluations for new technlogies and from runtime metrics for deployed building blocks.
Provisioning plans may be created and then executed as [flows](https://github.com/Nasdanika-Models/flow). 

## Resources

* [Equinox P2](https://eclipse.dev/equinox/p2/):
    * [Concepts](https://wiki.eclipse.org/Equinox/p2/Concepts)
    * [Tutorial](https://eclipsesource.com/blogs/tutorials/eclipse-p2-tutorial-managing-metadata/)
    * [JavaDoc](https://help.eclipse.org/latest/nftopic/org.eclipse.platform.doc.isv/reference/api/org/eclipse/equinox/p2/metadata/package-summary.html):
        * [IInstallableUnit](https://help.eclipse.org/latest/nftopic/org.eclipse.platform.doc.isv/reference/api/org/eclipse/equinox/p2/metadata/IInstallableUnit.html)
        * [IRequirement](https://help.eclipse.org/latest/nftopic/org.eclipse.platform.doc.isv/reference/api/org/eclipse/equinox/p2/metadata/IRequirement.html)
        * [IProvidedCapability](https://help.eclipse.org/latest/nftopic/org.eclipse.platform.doc.isv/reference/api/org/eclipse/equinox/p2/metadata/IProvidedCapability.html)
* [TOGAF model](https://github.com/Nasdanika-Models/togaf)
* [Architecture model](https://github.com/Nasdanika-Models/architecture)