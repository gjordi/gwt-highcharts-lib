gwt-highcharts-lib
==================

[Highcharts](http://www.highcharts.com) library for GWT projects.

# Usage

Add the dependencies to your Maven POM:

```xml
<dependency>
	<groupId>com.bytebybyte.gwt</groupId>
	<artifactId>jquery-lib</artifactId>
	<version>2.1.3</version>
	<scope>provided</scope>
</dependency>
<dependency>
	<groupId>com.bytebybyte.gwt</groupId>
	<artifactId>highcharts-lib</artifactId>
	<version>4.0.4</version>
	<scope>provided</scope>
</dependency>
```

And to your .gwt.xml file:

```xml
<module>
	...
	<inherits name="com.bytebybyte.gwt.highcharts.HighchartsLib" />
	...
</module>
```
