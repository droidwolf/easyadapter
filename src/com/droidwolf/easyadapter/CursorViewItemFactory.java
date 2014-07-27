package com.droidwolf.easyadapter;

import android.database.Cursor;

/**
 * �α���ͼ(ViewItem)��������ViewItem�ӿڣ�����EasyCusorAdapter
 */
public interface CursorViewItemFactory {
	/**
	 * ����һ���µ�ViewItem
	 * @param c �α�
	 * @param position ��ǰ�α�λ��
	 * @return ViewItem
	 */
	ViewItem<Cursor> newViewItem(Cursor c, int position);
	
	/**
	 * �ο�{@link android.widget.Adapter} getItemViewType����
	 * @param data �α�
	 * @param position ��ǰ�α�λ��
	 * @return
	 */
	int getItemViewType(Cursor data, int position);
	
	
	/**
	 * �ο�{@link android.widget.Adapter} getViewTypeCount����
	 * @return
	 */
	int getViewTypeCount();
}
