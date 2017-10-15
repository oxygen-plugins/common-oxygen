package com.github.oxygenPlugins.common.oxygen.pages;

import javax.swing.JComponent;

import ro.sync.ecss.extensions.api.AuthorOperationException;
import ro.sync.exml.workspace.api.editor.WSEditor;
import ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage;

public class WSAuthorPageAdapter extends WSPageAdapter {

	private final WSAuthorEditorPage page;

	public WSAuthorPageAdapter(WSAuthorEditorPage page){
		super(page);
		this.page = page;
	}
	
	@Override
	public Object[] evaluateXPath(String xpath) {
		// TODO Auto-generated method stub
		try {
			return page.getAuthorAccess().evaluateXPath(xpath, true, true, true);
		} catch (AuthorOperationException e) {
			return new Object[]{};
		}
	}

	@Override
	public int getPageType() {
		// TODO Auto-generated method stub
		return AUTHOR_PAGE;
	}


	@Override
	public void removePopUpMenuCustomizer(PopupMenuCustomizer customizer) {
		page.removePopUpMenuCustomizer(customizer);
	}
	
	public JComponent getComponent(){
		return (JComponent) page.getAuthorComponent();
	}

	@Override
	public void addPopUpMenuCustomizer(PopupMenuCustomizer customizer) {
		page.addPopUpMenuCustomizer(customizer);
	}

	@Override
	public void scrollCaretToVisible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WSEditor getParentEditor() {
		// TODO Auto-generated method stub
		return page.getParentEditor();
	}

	@Override
	public void setReadOnly(String arg0) {
		// TODO Auto-generated method stub
		
	}


	
	
}
