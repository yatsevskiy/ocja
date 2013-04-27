package oracle.certified.java.associate.enums;

public class ResourceClient {
	public ResourceClient(ResourceEnum<?> resourceId) {
		System.out.println("id = " + resourceId.getResourceId());
		System.out.println("id = " + resourceId.ordinal());
	}

	public static void main(String[] args) {
		new ResourceClient(ResourceEnumImpl.SECOND);
	}
}
