package org.atmecs.falcongetmethods.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("report")
public class TestReportProperties {
	
	private String goMessage="Ready to deploy";
	private String noMessage="Not Ready for deployment";
	
	public String getGoMessage() {
		return goMessage;
	}

	public void setGoMessage(String message) {
		this.goMessage = message;
	}

	public String getNoMessage() {
		return noMessage;
	}

	public void setNoMessage(String noMessage) {
		this.noMessage = noMessage;
	}

}
