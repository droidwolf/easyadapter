package com.droidwolf.easyadapter;

/**
 * ������ͼ(ViewItem)��,��ViewItem�ӿ�ʵ�֣�������{@link ViewItemFactory}
 */
public abstract class AbsViewItem<T> implements ViewItem<T> {
	private int mPosition;
	public boolean isEnabled(T data, int position) {
		return true;
	}
	
	public void setPosition(int pos){
		mPosition=pos;
	 }
	public int getPosition(){
		return mPosition;
	}
}
