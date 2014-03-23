package org.usesoft.gwtrestapp.shared.domain;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class Hello {
	private final String id;
	private final String name;
	
	@JsonCreator
	public Hello(@JsonProperty("id") String id, @JsonProperty("name") String name) {
		this.id = id;
		this.name = name;
		
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
