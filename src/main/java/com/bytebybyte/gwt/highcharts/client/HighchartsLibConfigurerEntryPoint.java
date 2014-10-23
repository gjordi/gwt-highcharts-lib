package com.bytebybyte.gwt.highcharts.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.bytebybyte.gwt.highcharts.client.resources.HighchartsLibClientBundle;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

public class HighchartsLibConfigurerEntryPoint implements EntryPoint {

	protected Logger logger = Logger.getLogger(HighchartsLibConfigurerEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {

		HighchartsLibClientBundle bundle = HighchartsLibClientBundle.INSTANCE;

		logger.log(Level.INFO, "Injecting highcharts javascript script element.");

		ScriptInjector.fromString(bundle.highcharts().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
