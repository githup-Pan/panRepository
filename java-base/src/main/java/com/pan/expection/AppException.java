package com.pan.expection;

/** 
 * @Package com.pan.expection 
 * @ClassName: AppException 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月16日 上午10:10:40 
 */
public class AppException extends Exception{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 1L;

	   public AppException() {
	        super();
	    }

	    public AppException(String message,
	            Throwable cause) {
	        super(message, cause);
	    }

	    public AppException(String message) {
	        super(message);
	    }

	    public AppException(Throwable cause) {
	        super(cause);
	    }
}
