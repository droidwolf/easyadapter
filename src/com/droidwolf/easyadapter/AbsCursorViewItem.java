package com.droidwolf.easyadapter;

import android.database.Cursor;

/**
 * �����α���ͼ(ViewItem)��,��ViewItem�ӿ�ʵ�֣�����{@link CursorViewItemFactory}
 */
public abstract class AbsCursorViewItem implements ViewItem<Cursor> {
	private int mPosition;
	public boolean isEnabled(Cursor c, int position) {
		return true;
	}
	
	@Deprecated
	public void setPosition(int pos){
		mPosition=pos;
	 }
	@Deprecated
	public int getPosition(){
		return mPosition;
	}
}
