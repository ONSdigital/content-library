THIS IS A WORK IN PROCESS:


ONS Content Library
=========================== 

Content Library contains Java object representation of content types that is published by [Florence](https://github.com/ONSdigital/florence) and [Zebedee](https://github.com/Carboni/zebedee) and displayed on [Babbage (ONS Website to be)](https://github.com/ONSdigital/babbage). This flow happens by serialisation/deserialisation of these objects into json documents.

The library aims to centeralize object notation and allow these different ends use same object notation (either as a json document or java object). Which in turn should make manipulation of contents easier at all ends and compatible.

The library creates an object hiearchy, interlinking and referencing between different content types. For the most part generated json documents should be compatible with Alpha website json files (If no changes on wireframes)

Another benefit of a common content library is ( hopefully ), a common terminology and naming convention between different ends of the project (publishing, migrating, website, etc.)


#Naming convention

All content types are generically referred as content.

1. [Home Page](#home-page)
2. [Taxonomy](#taxonomy)
	2.1. [Taxonomy Home](#taxonomy-home)
 			[Taxonomy Landing Page](#taxonomy-landing)
 			[Product Page](#product-page)
 		[Statistic](#statistic)
 			[Statistical Bulletin](#bulletin)
 			[Article](#article)
 			[Dataset](#dataset)
 			[Compendium](#dataset)
 			[Statistical Data](#statistics)
 				[Time Series](#time-series)
 				[Data Slice](#data-slice)
3. [Methodology](#methodology)
4. [Abou Us Pages](#about-us)
 

##Home Page

Home page contains links and references to taxonomy nodes and  other non-statistic content types (static pages ?)

##Taxonomy

Taxonomy refers to taxonomy of periodic publications containing statistical information ( bulletins, articles, datasets, timeseries, data slices, compendium). There are two types of taxonomy nodes [Taxonomy Home](#taxonomy-home) and [Publication](#publication)

###Taxonomy Home

###Publication
