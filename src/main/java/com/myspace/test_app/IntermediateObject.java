package com.myspace.test_app;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IntermediateObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Total Members")
	private long totalMembers;

	public IntermediateObject() {
	}

	public long getTotalMembers() {
		return this.totalMembers;
	}

	public void setTotalMembers(long totalMembers) {
		this.totalMembers = totalMembers;
	}

	public IntermediateObject(long totalMembers) {
		this.totalMembers = totalMembers;
	}

}