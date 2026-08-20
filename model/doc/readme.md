
```drawio-resource
../capability.drawio
```

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of capability supply and demand: what can be done, what it depends on, who provides it, what proves the claim, and for how long it holds. Defined in [`capability.xcore`](capability.xcore).

[TOC levels=6]

## Position in the tower

The aspect spine of the [Nasdanika model tower](https://nasdanika.com/models.html) runs

> [nxcore](https://nxcore.models.nasdanika.org/) < [role](https://role.models.nasdanika.org/) < [iam](https://iam.models.nasdanika.org/) < [seal](https://seal.models.nasdanika.org/) < [lifecycle](https://lifecycle.models.nasdanika.org/) < [decision analysis](https://analysis.decision.models.nasdanika.org/) < [decision binding](https://binding.decision.models.nasdanika.org/) < [governance](https://governance.models.nasdanika.org/) < [work](https://work.models.nasdanika.org/) < [requirements](https://requirements.models.nasdanika.org/) < [architecture](https://architecture.models.nasdanika.org/) < [threat](https://threat.models.nasdanika.org/)

and the enterprise branch begins here:

> … < threat < **capability** < [product management](https://product-management.models.nasdanika.org/) < [org design](https://org-design.models.nasdanika.org/)

This model was factored out of the [product management model](https://product-management.models.nasdanika.org/), which retains what is genuinely product management - personas, concerns, goals, needs, pain points, the pull pipeline - and delegates the supply side to this floor.
The split follows the rule the rest of the tower follows: a model sits at the lowest position consistent with its own dependencies.
Capability supply has consumers that have nothing to do with product strategy - a resume, a skill inventory, an MCP tool catalog, a package repository - and forcing them through personas and concerns was the tell that the floor was mis-sited.

`AbstractCapabilityProvider` lands on the threat model's `Asset`, and therefore on the architecture model's `Element`, requirements' `Satisfier`, work's `Workable`, governance's `Governed`, lifecycle's `Staged`, seal's `SealedElement`, IAM's `Subject` and `AccessControlled`, role's `Undergoer`, and nxcore's `NamedPeriod`.
`Capability` and `ProvidedCapability` land on the same spine.
So before this model says anything of its own, a capability and its provider already carry:

* **an owner, a steward, and an approver** - [role](https://role.models.nasdanika.org/) engagements with dated validity, not string attributes, which is generalized RACI rather than four fixed references;
* **access control** - a provider is an IAM `Subject` and an `AccessControlled` resource, so a partner-visible slice of a capability catalog is typed rather than a wiki permission;
* **signable claims** - a provider's assertion that it supplies a capability is a seal `Signature` on the `ProvidedCapability` record that needed it, which is what turns a claim into a commitment;
* **maturity and availability as a lifecycle** - proposed, in development, available, deprecated, retired are [lifecycle](https://lifecycle.models.nasdanika.org/) `Stage`s, and the dates a capability occupied each are `Sojourn`s that are never rewritten;
* **the decision that selected the provider** - a [decision analysis](https://analysis.decision.models.nasdanika.org/) `Alternative` with recorded expert judgments, committed through a [decision binding](https://binding.decision.models.nasdanika.org/) into the configuration that exists;
* **controls, risks, and waivers** - a provider is `Governed`, so third-party risk and key-person concentration attach to it in the same catalog the compliance program runs on;
* **work** - building, integrating, and retiring a capability is `Work` on the capability itself, because `Element` is `Workable`;
* **requirements** - a provider is a `Satisfier`, so "this provider satisfies that requirement" is a reified, verifiable claim rather than a sentence in a proposal;
* **a place in the estate** - a provider is an architecture `Element`, addressable from any model that needs to point at who supplies something;
* **threats** - a provider is an `Asset`, so supply-chain compromise and vendor concentration are threats promoted into the same risk register as everything else.

What this floor adds on top of that is small and specific: the supply/demand vocabulary, dependency semantics between capabilities, and evidence.
Everything else was inherited, which is the point of the tower.

## Competitive landscape

Four camps model capability. Three have the enterprise scope and none of the resolution semantics; the fourth has the semantics and none of the scope.

**Business capability modeling.** TOGAF business capabilities, BIZBOK capability maps, ArchiMate's `Capability` in the strategy layer, and the platforms that render them - LeanIX, Ardoq, Bizzdesign, MEGA HOPEX, Avolution ABACUS.
The unit of work is a levelled taxonomy (L1/L2/L3) painted with heat maps for maturity, cost, and strategic importance.
Decomposition is the only relationship the notation really has: there is no way to say that a capability *requires* another, is *enhanced* by it, or *conflicts* with it, so the map cannot answer a build-order question.
Claims are unevidenced by construction - a maturity rating is a color, not a record - and the map lives in a proprietary repository whose crosswalk to the architecture, the risk register, and the people is manual or absent.

**Skills and talent ontologies.** SFIA, ESCO, O\*NET, Lightcast Open Skills, and the talent marketplaces built on them - Workday Skills Cloud, Gloat, Eightfold.
Structurally the same shape as this model - a provider provides capabilities with evidence - and often better vocabularies than any enterprise architect will author.
The limits are that the provider is always a person, the taxonomy is closed and vendor-owned, and the prerequisites that actually determine whether someone can do the work - tooling, access, engagement model - are not expressible.
These are excellent catalogs to *load* as instance data, and poor places to keep a model.

**Service and tool catalogs.** Backstage, ServiceNow CSDM (which does carry a Business Capability class), Port, Cortex, and - newest and fastest-growing - MCP server registries.
Backstage is the most instructive: a tiny entity model as data in git, adopted precisely because it is small and federated.
The critique is the one the [architecture model](https://architecture.models.nasdanika.org/) makes of it - YAML conventions rather than a typed metamodel - plus a flat namespace that makes duplication a runtime incident rather than a structural fact.

**Package managers - the strongest structural prior art.** Debian's `Provides` / `Depends` / `Conflicts` / `Enhances`, RPM's virtual provides, and the OSGi Requirement-Capability model solved this problem several ecosystem generations ago: a provider declares abstract capabilities it supplies and requirements it needs, dependency kinds distinguish "cannot function without" from "works better with" from "cannot coexist", and a resolver does the rest.
`DependencyKind` here is that vocabulary, deliberately.
What package managers do not have is any of the enterprise scope: providers are software artifacts only, claims are machine-checkable and therefore never evidenced, and there is no time dimension, no authority, and no human in the graph.

**The real competitor, as always: the capability map in PowerPoint and the skills matrix in Excel.**
Both will remain cheaper than any model for producing one picture.
The wedge is everything that happens after the picture - dependency resolution, duplication as a query, evidence that survives the reorg, and a claim that can still be cited six months later.

The position this model takes is the diagonal none of the four occupy: **package-manager resolution semantics at enterprise capability scope, with evidence, time, and authority attached.**

## What a typed model adds

**Supply and demand are separate, reified, and dated.**
`ProvidedCapability` and `RequiredCapability` are records, not references - each a `NamedPeriod` with its own documentation, provenance, and validity interval.
This is the reification pattern the architecture model uses for `Relationship` and the requirements model uses for `Satisfaction`, and it buys the same things: the claim can be documented at the point of claiming, signed by whoever made it, and allowed to expire.
"This vendor provided this capability between these dates, under this authority, with this evidence" is a fact the model keeps after the vendor is gone.

**Evidence is structural, not rhetorical.**
`Capability` and `ProvidedCapability` are both `EvidenceDomain`s.
A claim is grounded or it is visibly ungrounded - a demo, a recorded evaluation, a case study, a certification, a completed project.
Nothing in the model prevents an unevidenced claim; the model makes it queryable, which is the mechanism by which "which of our capability claims are actually backed by anything?" stops being a rhetorical question.
This is the claim/proof separation the requirements model draws between `Satisfaction` and `Verification`, applied to supply.

**Dependency kinds carry contract semantics.**
`REQUIRES`, `ENHANCES`, `CONFLICTS`, and `CUSTOM` with a `qualifier` sit on `CapabilityDependency` at the *capability* level - what the contract needs - distinct from `CapabilityProvider.requires`, which is what a *particular implementation* needs.
A capability to author Xcore models requires modeling capability; the specific provider additionally requires an Eclipse installation.
Capability maps collapse the two and lose the second; package managers model the second and have no notion of the first.

**Federation is a gradient, not a switch.**
`Capability.dependencies` contains `AbstractCapability`, so a capability can be authored fully self-contained, with its dependencies - and even dependency domains - defined inline.
The same model federates later by one of three moves that require no restructuring: replace an inline definition with a `CapabilityReference` or `CapabilityDependency`, or leave it in place and let nxcore `uris` merge anchors de-duplicate several independent definitions into one logical element at assembly time.
Author locally without asking anyone's permission; federate when federation is worth it.
Central registries demand the opposite order, which is why they stay empty.

**Inverse navigation without opposite references.**
`Capability.dependents` is derived through nxcore's `Referrable`: it walks the referrers of `CapabilityReference.target` and keeps those contained in a `dependencies` reference.
There is no opposite reference to maintain, and therefore no requirement that a dependent's model be editable - or even owned by you - for the dependency to be visible once the models are assembled.
Blast radius is a query over the federation.

**Reference chains resolve safely.**
`CapabilityDomain.resolvedCapabilities` follows reference chains to their targets, returning nothing for cycles and dangling references rather than looping or throwing.
Federated graphs assembled from independently authored models will contain both; the model treats them as data conditions, not as errors.

**Composition as grammar.**
A capability like *document signing* is verb-shaped: it does something.
A capability like *audit logging* is adjective-shaped: it qualifies how something is done.
The model represents both as first-class capabilities and their composition as a structural relationship, so a consumer who needs *signed documents with audit and async delivery* composes three first-class elements rather than writing a paragraph about what they want.
Federation across teams becomes a shared vocabulary - one team owns *signing*, another *audit*, a third *async* - supporting expressions no single team had to author.
A federation that only enumerates capabilities flattens an expressible space into a finite list.

**Risk-informed capability selection.**
Because providers are `Governed` and are `Asset`s, a hand-rolled agentic loop and a full framework enter the model as two providers of the same capability with different risk profiles and different control obligations.
The comparison is structural rather than a slide.

## Applications

### Education and documentation generation

The house pattern: build and instantiate the model to learn the domain structurally, and generate the documentation site from it - capability catalogs, provider pages with their evidence, dependency trees, per-audience views.
The generated site is the deliverable; the model is what keeps it from rotting.

### Resumes, skill inventories, and staffing

A resume is structurally a list of capabilities with evidence: claims about what a person can do, grounded in projects, certifications, and prior employment.
The format converged on prose because humans tolerate informality, not because the information is prose-shaped.
A person or team is a `CapabilityProvider`; their skills, technologies, and methodologies are `ProvidedCapability`s; projects and certifications are `Evidence`.

Two things follow that the prose format cannot deliver.
*Prerequisites travel with the capability* - knowing X is not the same as knowing X with the tooling and access X requires, and staffing decisions routinely conflate them.
And *niche expertise becomes discoverable by query rather than by social network* - the people who know the legacy systems and the deprecated tools that still run production are tribal knowledge until their capabilities are published into the same federation that describes the products.
A team retiring a system nobody has touched in a decade can ask the model who has touched it.

This is also the model's best standalone entry point: it needs no personas, no concerns, and no other floor to be useful on day one.

### Agent tool catalogs and MCP

A tool is a capability, and the agent calling it is a consumer.
A tool's description is its claim; its parameters are its contract; its server is its provider; its version is a lifecycle coordinate.
MCP registries grow by aggregation rather than design, and the failure modes are documented: function-calling accuracy degrades as catalogs grow and semantically similar tools crowd each other, tool descriptions are unreliable at scale, and a flat namespace lets a rogue server shadow a trusted tool by adopting its name.

Loading many servers' tools as capability providers makes two tools that address the same need appear adjacent whether or not they share a name, gives neighborhoods owners and rules rather than mere embedding proximity, and makes the catalog a durable, attributable, version-controlled artifact rather than a vector index rebuilt per query.
It complements gateway curation and runtime retrieval rather than replacing them: the gateway decides what an agent is *allowed* to call, retrieval decides what is *surfaced* for a query, and the model decides what is *coherent* to expose in the first place.

### Portfolio duplication and the build-order frontier

Load many teams' capability domains together.
Capabilities providing the same thing - whether or not they share a name - appear adjacent in the merged graph, with lifecycle sojourns showing which are available, which are in development, and whose authority asserted what.
Duplication becomes visible structurally rather than discovered politically, and a consolidation decision can cite the model: which capabilities have evidence, which have providers, which have dependents.

The dependency graph then answers the question a spreadsheet cannot, because *frontier-of-a-table* is not a thing: which unbuilt capability sits closest to delivering the most value for the least cost, and which build sequence reaches it most cheaply.
`REQUIRES` edges give the ordering, `dependents` gives the unlock, and evidence plus provider presence gives the ground truth about what is actually available rather than merely claimed.

### Symmetric evaluation of vendors and internal offerings

A vendor product, an internal platform, and an early-stage internal proposal enter the model in the same shape, with the same evidence obligations and the same dependency declarations.
The political asymmetry that favors whichever narrative was packaged most insistently is removed at the input stage.
Composed with [decision analysis](https://analysis.decision.models.nasdanika.org/), provider selection becomes a recorded analysis over comparands the tower already holds, and the resulting choice is committed through a [binding](https://binding.decision.models.nasdanika.org/) that cites it.

### Design-time record for the Nasdanika Capability framework

The [Nasdanika Capability framework](https://docs.nasdanika.org/capability/) resolves capability requests against whichever providers can serve them, discovered at the point of need rather than wired in advance.
This model is the design-time counterpart of that runtime: the same supply-and-demand shape, kept as durable, evidenced, federated data.
What the framework resolves per request, the model records per estate - and that correspondence is what makes "which providers could satisfy this request, and what would it cost to build one" answerable before runtime rather than after.

### Proactive capability construction within a budget

The dependency graph plus provider presence is a standing work queue.
An agent with a bounded exploration budget watches the federation for capabilities whose requirements are articulated densely enough to build and whose provider does not yet exist, builds them, and attaches the result as a `CapabilityProvider` with provenance and a recorded spend.
Building one thing lowers the bar for its dependents, so the frontier is re-evaluated after every commit.
Where input is insufficient the agent does not guess: it identifies whose intent supplies the missing input and routes a request there - throttled by that person's declared capacity, and expiring rather than blocking the queue.

## Authoring and loading

Capability information is born in artifacts that already exist, and the loaders treat those as source rather than as export targets:

* **YAML and the Groovy DSL** for hand-authored catalogs, with git markers giving every element a permalink back to the exact line and commit it came from.
* **Draw.io** for capability maps drawn in a workshop: nodes as capabilities, edges as dependencies, containment as decomposition, via the [drawio model](https://drawio.models.nasdanika.org/).
* **Excel** for skill matrices and capability inventories - one row per provider-capability claim.
* **Package and registry metadata** - Maven, OSGi, MCP server manifests - loaded as providers with their declared provides and requires.

The workshop draws; the model accumulates.

## Model overview

| Area | Types |
|---|---|
| Extension point | `AbstractCapability` (extends threat `Asset` via the spine) |
| Capabilities | `Capability` (dated, evidenced, staged; contains `dependencies`, derives `dependents`), `CompositeCapability` |
| Federation | `CapabilityDomain` (root, keyed by `id`, cycle-safe `resolvedCapabilities`), `CapabilityReference` |
| Dependencies | `CapabilityDependency`, `DependencyKind` (`REQUIRES`, `ENHANCES`, `CONFLICTS`, `CUSTOM` + `qualifier`) |
| Providers | `AbstractCapabilityProvider`, `CapabilityProvider` (`provides`, `requires`), `CapabilityProviderDomain`, `CapabilityProviderReference` |
| Supply and demand | `ProvidedCapability` (reified, evidenced claim), `RequiredCapability` |
| Evidence | `AbstractEvidence`, `Evidence`, `EvidenceDomain` |
| Versioning | `Version` |
| Reused, not redefined | threat `Asset`, `Threat`; architecture `Element`, `Relationship`, `ElementReference`; requirements `Requirement`, `Satisfaction`; work `Work`; governance `Control`, `Risk`, `Waiver`; decision `Alternative`, `Analysis`; lifecycle `Lifecycle`, `Stage`, `Sojourn`; seal `Signature`; IAM `Subject`, `Permission`; role `Role`; nxcore `Temporal`, `Period`, `Marker` |

## What sits on top

The [product management model](https://product-management.models.nasdanika.org/) sits directly above and supplies the demand side: personas hold intent, concerns make it explicit, and capabilities are *pulled* by those concerns rather than pushed by their owners.
The pipeline `persona → concern → capability → capability provider` spans exactly two floors, and the seam between them is this model's top.

The [org design model](https://org-design.models.nasdanika.org/) sits above that: an `OrganizationalUnit` is a `CapabilityProvider`, a `Person` is a `CapabilityProvider`, and "which unit can actually do this, and what would it need first" becomes a query over the same graph that describes the products.

## Resources

* [Sources on GitHub](https://github.com/Nasdanika-Models/capability)
* [Nasdanika model tower](https://nasdanika.com/models.html)
* [Threat model](https://threat.models.nasdanika.org/) - the floor directly below
* [Product management model](https://product-management.models.nasdanika.org/) - the floor directly above, and where this model was factored out of
* [Architecture model](https://architecture.models.nasdanika.org/) - the tower ordering and the rules that govern it
* [Nasdanika Capability framework](https://docs.nasdanika.org/capability/) - the runtime counterpart
