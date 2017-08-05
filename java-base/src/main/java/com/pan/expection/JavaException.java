package com.pan.expection;

/** 
 * @Package com.pan.expection 
 * @ClassName: JavaException 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author panht 
 * @date 2017年7月16日 上午8:42:35 
 */
public class JavaException {
	   @SuppressWarnings("finally")
	public static void main(String[] args) throws Exception {
		   args = new String[]{"e"};
	        if(args.length<1){
	            System.out.println("请输入数字");
	            return;
	        }
	        try {
	        	int num = Integer.parseInt(args[0]);
	        	System.out.println(num);		
			} catch (NumberFormatException  e) {
				
				System.out.println("格式不正确");
				throw new AppException("请输入正确格式",e);
			}catch (Exception e) {
				e.getCause();
				e.printStackTrace();
			}finally {
				return;
			}
	    }
}
