package entities;

/**
 * @author raikh
 *
 */
public abstract class BaseEntity implements EntityInterface {
	
	/**
	 * 
	 */
	protected int _id;
	
	/**
	 * 
	 */
	protected String _label;
	
	/**
	 * 
	 */
	public BaseEntity() {
		
	}
	
	/**
	 * 
	 * @param label
	 */
	public BaseEntity(String label) {
		_label = label;
	}
	
	/**
	 * @return the _id
	 */
	public int getId() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void setId(int _id) {
		this._id = _id;
	}

	/**
	 * @return the _label
	 */
	public String getLabel() {
		return _label;
	}

	/**
	 * @param _label the _label to set
	 */
	public void setLabel(String _label) {
		this._label = _label;
	}
}
