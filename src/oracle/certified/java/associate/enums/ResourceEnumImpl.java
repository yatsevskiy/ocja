package oracle.certified.java.associate.enums;

public enum ResourceEnumImpl implements ResourceEnum<ResourceEnumImpl> {
	FIRST(Resource.id_0), SECOND(Resource.id_1), THIRD(Resource.id_2);

	public final int resourceId;

	ResourceEnumImpl(int resourceId) {
		this.resourceId = resourceId;
	}

	public int getResourceId() {
		return resourceId;
	}

	public ResourceEnumImpl[] getValues() {
		return values();
	}
}
