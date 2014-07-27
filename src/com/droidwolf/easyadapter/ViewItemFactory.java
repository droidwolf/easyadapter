package com.droidwolf.easyadapter;

/**
 * ��ͼ(ViewItem)��������ViewItem�ӿڣ�����EasyAdapter
 */
public interface ViewItemFactory {
    	/**
    	 * ����һ���µ�ViewItem
    	 * @param data ��ǰ������
    	 * @param position data���������е�position
    	 * @return ViewItem
    	 */
	<T> ViewItem<?> newViewItem(T data, int position);
	
	/**
	 * �ο�{@link android.widget.Adapter} getItemViewType����
	 * @param data ��ǰ������
	 * @param position data���������е�position
	 * @return 
	 */
	<T> int getItemViewType(T data, int position);
	
	/**
	 * �ο�{@link android.widget.Adapter} getViewTypeCount����
	 * @return
	 */
	int getViewTypeCount();
}
