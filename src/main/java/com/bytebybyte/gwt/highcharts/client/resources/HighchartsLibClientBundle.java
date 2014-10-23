package com.bytebybyte.gwt.highcharts.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface HighchartsLibClientBundle extends ClientBundle {

	public final static HighchartsLibClientBundle INSTANCE = GWT.create(HighchartsLibClientBundle.class);

	@Source("highcharts/js/highcharts-all.js")
	TextResource highcharts();
}
