package com.droidwolf.easyadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * ListView��GridView��ͼ���������½ӿڡ�
 */
public interface ViewItem <T>{
	/**
	 * ������ͼ,�ɲο�{@link android.widget.CursorAdapter} newView
	 * @param context
	 * @param data
	 * @param parent
	 * @return
	 */
	 View newView(Context context, T data, ViewGroup parent);

	 /**
	  * ������ͼ,�ɲο�{@link android.widget.CursorAdapter} bindView
	  * @param convertView
	  * @param context
	  * @param data
	  * @param ScrollState �ο�{@link android.widget.AbsListView.OnScrollListener} SCROLL_XX
	  */
	 void bindView(View convertView,Context context,T data ,int scrollState);

	 /**
	  * �ο�{@link android.widget.ListAdapter} isEnabled
	  * @param data
	  * @param position
	  * @return
	  */
	 boolean isEnabled(T data, int position);
	 
	 /**
	  * ���õ�ǰ����listview��position,��EasyXXAdapter����
	  * @param pos
	  */
	 void setPosition(int pos);
	 
	 /**
	  * ��ȡ��ǰPosition ��listview��position
	  * @param pos
	  */
	 int getPosition();
}
