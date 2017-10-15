package com.github.oxygenPlugins.common.oxygen.pages;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JPopupMenu;

import ro.sync.ecss.extensions.api.AuthorAccess;
import ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer;
import ro.sync.exml.workspace.api.editor.page.WSTextBasedEditorPage;
import ro.sync.exml.workspace.api.editor.page.text.TextPopupMenuCustomizer;
import ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage;

public abstract class PopupMenuCustomizer extends TextPopupMenuCustomizer implements
		AuthorPopupMenuCustomizer, Action {

	public PopupMenuCustomizer(){
		
	}
	public abstract void customizePopUpMenu(JPopupMenu menu, WSTextBasedEditorPage page,
			boolean forcePopup);

	@Override
	public void customizePopUpMenu(Object menuObj, AuthorAccess page) {
		if(menuObj instanceof JPopupMenu){
			customizePopUpMenu((JPopupMenu) menuObj, page.getEditorAccess(), false);
		}
	}

	@Override
	public void customizePopUpMenu(Object menuObj, WSTextEditorPage page) {
		if(menuObj instanceof JPopupMenu){
			customizePopUpMenu((JPopupMenu) menuObj, (WSTextBasedEditorPage) page, false);
		}
	}

	@Override
	public abstract void actionPerformed(ActionEvent arg0);

	@Override
	public void addPropertyChangeListener(PropertyChangeListener arg0) {
	}

	@Override
	public Object getValue(String arg0) {
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public void putValue(String arg0, Object arg1) {

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener arg0) {

	}

	@Override
	public void setEnabled(boolean arg0) {
	}

}