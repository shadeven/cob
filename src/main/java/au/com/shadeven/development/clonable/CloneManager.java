//package au.com.shadeven.development.clonable;
//
//import org.apache.commons.beanutils.BeanUtilsBean;
//import org.apache.commons.lang3.SerializationUtils;
//
//import java.io.Serializable;
//import java.lang.reflect.InvocationTargetException;
//
///**
// * @author Steven
// *
// */
//public final class CloneManager {
//
//	/**
//	 *
//	 */
//	private CloneManager() {}
//
//	public static <T extends Serializable> T deepClone(T object) {
//		return SerializationUtils.clone(object);
//	}
//
//	public static <T> T shallowClone(T object) {
//		BeanUtilsBean utilsBean = new BeanUtilsBean();
//		try {
//			return (T) utilsBean.cloneBean(object);
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return object;
//	}
//}
