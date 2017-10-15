package com.github.oxygenPlugins.common.oxygen.pages;

import javax.swing.JComponent;

import ro.sync.exml.workspace.api.editor.WSEditor;
import ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage;
import ro.sync.exml.workspace.api.editor.page.text.xml.XPathException;

public class WSXMLTextPageAdapter extends WSPageAdapter {
	
	private WSXMLTextEditorPage page;

	public WSXMLTextPageAdapter(WSXMLTextEditorPage page){
		super(page);
		this.page = page;
		
	}
	
	@Override
	public Object[] evaluateXPath(String xpath) {
		try {
			return page.evaluateXPath(xpath);
		} catch (XPathException e) {
			return new Object[]{};
		}
	}

	@Override
	public int getPageType() {
		// TODO Auto-generated method stub
		return XML_PAGE;
	}

	@Override
	public void addPopUpMenuCustomizer(PopupMenuCustomizer customizer) {
		page.addPopUpMenuCustomizer(customizer);
	}

	@Override
	public void removePopUpMenuCustomizer(PopupMenuCustomizer customizer) {
		page.removePopUpMenuCustomizer(customizer);
	}

	

	@Override
	public JComponent getComponent() {
		return (JComponent) page.getTextComponent();
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
