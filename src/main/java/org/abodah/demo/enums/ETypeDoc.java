package org.abodah.demo.enums;

public enum ETypeDoc {
	TYPE_1("900"), TYPE_2("1800");

	String code;

	ETypeDoc(String code) {
		this.code = code;
	}

//	BEING_CREATED, PAID_FOR, FULFILLED, CANCELLED;
//
//	/**
//	 * Verify the transition between {@link ETypeDoc} is valid.
//	 *
//	 * NOTE: This is where any/all rules for state transitions should be kept and
//	 * enforced.
//	 */
//	static boolean valid(ETypeDoc currentStatus, ETypeDoc newStatus) {
//
//		if (currentStatus == BEING_CREATED) {
//			return newStatus == PAID_FOR || newStatus == CANCELLED;
//		} else if (currentStatus == PAID_FOR) {
//			return newStatus == FULFILLED;
//		} else if (currentStatus == FULFILLED) {
//			return false;
//		} else if (currentStatus == CANCELLED) {
//			return false;
//		} else {
//			throw new RuntimeException("Unrecognized situation.");
//		}
//	}
}
