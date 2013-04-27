package oracle.certified.java.associate.enums;

public interface ResourceEnum<E extends Enum<?>> {
	int ordinal();

	String name();

	int getResourceId();

	/**
	 * <b>MUST BE IMPLEMENTED AS SHOWN!</b><br>
	 * 
	 * <pre>
	 * public <b>E</b>[] getValues()
	 * {
	 *     return values();
	 * }
	 * </pre>
	 * 
	 * @return
	 */
	E[] getValues();
}
