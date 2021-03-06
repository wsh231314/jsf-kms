package org.feuyeux.air.jsf.kms.dao.exceptions;

import java.util.ArrayList;
import java.util.List;
/**
 * @author feuyeux@gmail.com
 * @version 2.0
 */
public class IllegalOrphanException extends Exception {

	private static final long serialVersionUID = -3400023837132006672L;
	private List<String> messages;

	public IllegalOrphanException(List<String> messages) {
		super(messages != null && messages.size() > 0 ? messages.get(0) : null);
		if (messages == null) {
			this.messages = new ArrayList<String>();
		} else {
			this.messages = messages;
		}
	}

	public List<String> getMessages() {
		return messages;
	}
}
